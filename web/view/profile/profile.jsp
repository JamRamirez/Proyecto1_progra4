<%-- 
    Document   : profile
    Created on : Apr 22, 2021, 4:49:35 PM
    Author     : jamca
--%>
<%@page import="model.usuario.ModelLogin"%>
<%@page import="logic.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%  ModelLogin model =( ModelLogin)request.getAttribute("ModelLogin");
    Usuario u = model.getCurrent_user();
%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/Proyecto1p4/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="/Proyecto1p4/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Profile</title>
    </head>
    <body>
         <%@include file="../../navbar.jsp" %>
        <h1><%out.print(u.getNombre());%></h1>
        <h1>Hello World!</h1>
        <%@include file="../../footer.jsp" %>
    </body>
</html>
