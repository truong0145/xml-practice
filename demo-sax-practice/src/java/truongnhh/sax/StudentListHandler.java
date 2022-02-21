/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongnhh.sax;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import truongnhh.models.Student;

/**
 *
 * @author ADMIN
 */
public class StudentListHandler extends DefaultHandler {

    private List<Student> students;
    private Student currentStudent;
    private String currentTagName;

    public StudentListHandler() {
        students = new ArrayList<>();
        currentStudent = new Student();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
        if (qName.equals("student")) {
            currentStudent.setId(attributes.getValue("id"));
            currentStudent.setClasses(attributes.getValue("class"));
        }
        currentTagName = qName;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
        String str = new String(ch, start, length);
        switch (currentTagName) {
            case "username":
                currentStudent.setUsername(str.trim());
                break;
            case "lastname":
                currentStudent.setLastname(str.trim());
                break;
            case "middlename":
                currentStudent.setMiddlename(str.trim());
                break;
            case "firstname":
                currentStudent.setFirstname(str.trim());
                break;
            case "sex":
                currentStudent.setSex(str.trim());
                break;
            case "password":
                currentStudent.setPassword(str.trim());
                break;
            case "address":
                currentStudent.setAddress(str.trim());
                break;
            case "status":
                currentStudent.setStatus(str.trim());
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName); //To change body of generated methods, choose Tools | Templates.
        currentTagName = "";
        if (qName.equals("student")) {
            students.add(currentStudent);
            currentStudent = new Student();
        }
    }

    public List<Student> getStudents() {
        return students;
    }

}
