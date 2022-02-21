<%-- 
    Document   : search
    Created on : Feb 17, 2022, 11:48:43 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
    </head>
    <body>


        <style>
            body{
                font-family: 'Roboto', sans-serif;
                background-image: url('https://webgradients.com/public/webgradients_png/008%20Rainy%20Ashville.png');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: cover;
            }
            
        </style>

        <div class="col-10 bg-white border rounded shadow mx-auto my-3 p-3">
            <h1>Hello ${sessionScope.FULLNAME}</h1>
            <form action="LogoutController" method="POST">
                <button class="btn btn-primary" type="submit" name="Logout"><i class="fas fa-sign-out-alt"></i>&nbsp;&nbsp;Logout</button>
            </form>
        </div>



        <c:forEach var="s" items="${sessionScope.students}">
            <div class="col-10 bg-white border rounded shadow mx-auto my-3 p-3">
                <div class="row" style="height: 15em;">
                    <div class="col-3">
                        <img src="https://kenh14cdn.com/203336854389633024/2021/8/21/13-16295096762751822279755.jpg" alt="Basic avatar" class=" shadow rounded" style="height: 14em;">
                    </div>
                    <div class="col-8">
                        <h3>${s.fullname}</h3>
                        <h5 class="text-primary">${s.classes}</h5>
                        <c:choose>
                            <c:when test="${s.sex == '0'}">
                                <h5>Male</h5>
                            </c:when>
                            <c:otherwise>
                                <h5>feMale</h5>
                            </c:otherwise>
                        </c:choose>
                        <h5>Address: ${s.address}</h5>
                        <c:choose>
                            <c:when test="${s.status == 'studying'}">
                                <label class="px-2 pt-1 rounded bg-success text-white">
                                    <h5>${s.status}</h5>
                                </label>
                            </c:when>
                            <c:when test="${s.status == 'break'}">
                                <label class="px-2 pt-1 rounded bg-warning text-white">
                                    <h5>${s.status}</h5>
                                </label>
                            </c:when>
                            <c:otherwise>
                                <label class="px-2 pt-1 rounded bg-secondary text-white">
                                    <h5>${s.status}</h5>
                                </label>
                            </c:otherwise>
                        </c:choose>
                    </div>
                </div>
            </div>
        </c:forEach>




        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
