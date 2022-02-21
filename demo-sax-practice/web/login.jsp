<%-- 
    Document   : login
    Created on : Feb 18, 2022, 12:19:09 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <style>
            body{
                font-family: 'Roboto', sans-serif;
                background-image: url('https://wallpaperaccess.com/full/203564.jpg');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: cover;
            }
        </style>

        <div class="col-6 border rounded mt-5 mx-auto p-3 bg-white">
            <h3 class="mb-3">Login</h3>
            <form action="LoginSAXController" method="POST">
                <div class="mb-3">
                    <label>Username </label>
                    <input class="form-control" type="text" name="txtUsername" value="truong"/>
                </div>
                <div class="mb-3">
                    <label>Password </label>
                    <input class="form-control" type="password" name="txtPassword" value="1"/>
                    <label id="err-mess" class="text-danger">${requestScope.LOGIN_MESSAGE}</label>
                </div>
                <div>
                    <input class="btn btn-primary px-5" type="submit" name="Login" value="Login"/>
                </div>
            </form>
        </div>
        <!--        BOOTSTRAP JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </body>
</html>
