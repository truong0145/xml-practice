/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongnhh.controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import truongnhh.models.Student;
import truongnhh.sax.StudentHandler;
import truongnhh.sax.StudentListHandler;
import truongnhh.utils.XMLUtil;

/**
 *
 * @author ADMIN
 */
public class LoginSAXController extends HttpServlet {

    private static final String XMLFILE = "/WEB-INF/StudentAccounts.xml";
    private static final String SUCCESS = "search.jsp";
    private static final String ERROR = "login.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String username = request.getParameter("txtUsername");
            String password = request.getParameter("txtPassword");
            String realPath = getServletContext().getRealPath("/");
            String filePath = realPath + XMLFILE;
            StudentHandler handler = new StudentHandler(username, password);
            XMLUtil.parseFileWithSAX(filePath, handler);
            if (handler.isFound()) {
                HttpSession session = request.getSession();
                session.setAttribute("FULLNAME", handler.getFullname());
                
                //add
                StudentListHandler slhandler = new StudentListHandler();
                XMLUtil.parseFileWithSAX(filePath, slhandler);
                session.setAttribute("students", slhandler.getStudents());
                url = SUCCESS;
            } else if (handler.isDropoutStatus()) {
                request.setAttribute("LOGIN_MESSAGE", "Dropout account cannot login into system.");
            } else {
                request.setAttribute("LOGIN_MESSAGE", "Incorrect username or password.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
