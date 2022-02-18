<%-- 
    Document   : search
    Created on : Feb 17, 2022, 11:48:43 PM
    Author     : ADMIN
--%>

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


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
