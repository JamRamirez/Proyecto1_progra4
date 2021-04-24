<%-- 
    Document   : logginpage
    Created on : Apr 22, 2021, 5:14:46 PM
    Author     : jamca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Loggin</title>
    </head>
    
     <%@include file ="navbar.jsp"%>
    <body>
    
        <h1>Loggin</h1>
        <form action="Login" method="POST">
            <div class="mb-3">
               <label for="cedula" class="form-label">Identificacion</label>
               <input type="text" class="form-control" id="cedula" name ="cedula" >
            </div>
            
            <div class="mb-3">
              <label for="contra" class="form-label">Contrseña</label>
              <input type="password" class="form-control" id="contrasena" name="contrasena" aria-describedby="logginhelp">
              <div id="logginhelp" class="form-text">Nunca se compartira la informacion con nadie mas</div>
            </div>
      
            
            <button type="submit" class="btn btn-primary">Iniciar sesion</button>
        </form>
        
    </body>
    <%@include file ="footer.jsp"%>
</html>
