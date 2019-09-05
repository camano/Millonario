<%-- 
    Document   : Login
    Created on : 13/08/2019, 09:51:00 AM
    Author     : 57313
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h2>probando git</h2>
        <h2>probando</h2>
            <div>
                <label>correo</label>    
            </div>
            <div>
                <input type="text" name="correo" id="correo" >
            </div>
        
            <div>
                <label>Clave</label>
            </div>
        
            <div>
                <input type="password" name="clave" id="clave">
            </div>
        <div>
            <input type="submit" id="btnconsultar" name="btnconsultar" value="Ingresar">
            <button onclick="formuario()">Consultar</button>
        </div>
        <div>
            <input type="submit" id="btnconsultar" name="btnconsultar" value="Ingresar">
            <button onclick="formuario()">Consultar</button>
        </div>
        
        
        <div id="respuesta"></div>
    </body>
    <script src="js/index.js" type="text/javascript"></script>
    <script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
</html>
