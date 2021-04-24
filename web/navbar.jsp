<%-- 
    Document   : navigation_bar
    Created on : 16/04/2021, 01:16:15 PM
    Author     : jamca
--%>
<%@page import="model.usuario.ModelLogin"%>
<%@page import="logic.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <nav class ="navbar navbar-dark bg-primary navbar-expand-lg">
            <%Usuario u = (Usuario)session.getAttribute("Usuario");%>
            <div class="navbar-nav">
                <a class="navbar-brand text-center text-white" href=".">NombreWeb</a>
            </div>
            <%if (u==null){%>
                <div class="navbar-nav">
                    <a class="nav-link text-white" href="logginpage.jsp">Iniciar Sesion</a>

                </div>
            <%}%>
        </nav>
    </body>
</html>
