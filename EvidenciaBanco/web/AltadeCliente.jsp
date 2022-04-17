<%-- 
    Document   : AltadeCliente
    Created on : 13 abr. 2022, 21:04:23
    Author     : tania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="Estilos.css" rel="stylesheet" type="text/css"/>
                <title>Alta de Cliente </title>
    </head>
     <body  background="olis.jpg">
         
    <center><h1>ALTA DE CLIENTE </h1></center>
    
      <div class="container col-lg-3">
      
        <form action="Principal">
           <div class=" form-group text-center">
            <img src="iconoo.png" height="180" width="180"  >
            <p><strong>Por favor ingrese los datos correspondientes<strong></p>
        </div>
            
        <div class="form-group">
        <label>Nombre:</label>
        <input  class ="form-group" type ="text" name="nombre">
        </div>
        
        <div class="form-group">
        <label>Apellido:</label>
        <input class ="form-group" type ="text" name="apellido">
        </div>
        
        <div class="form-group">
        <label>Direccion:</label>
        <input class ="form-group" type ="text" name="direccion">
        </div>
        
        <div class="form-group">
        <label>C.P:</label>
        <input class ="form-group" type ="text" name="cp">
        </div>
        
        <div class="form-group">
        <label>Ciudad:</label>
        <input class ="form-group"  type ="text" name="ciudad">
        </div>
        
       <div class="form-group">
        <label>Estado:</label>
        <input class ="form-group" type ="text" name="estado">
       </div>
       
       <div class="form-group">
        <label>Pais:</label>
        <input class ="form-group" type ="text" name="pais">
       </div>
            
        <div class="form-group">
        <label>Telefono:</label>
        <input class ="form-group" type ="text" name="telefono">
        </div>
        
        <div class="form-group">
        <label>Fecha de Nacimiento:</label>
        <input class ="form-group"  type ="date" name="fechaNacimiento">
        </div>
        
        <div class="form-group">
        <label>Correo Electronico:</label>
        <input class ="form-group"  type ="e-mail"  size="40" name="correo">
        </div>
        
        <div class="form-group">
        <label>Password:</label>
        <input class ="form-group" type="password" maxlength="10" name="password" value="">
        </div>
             <input class="btn  btn-danger btn-block" type="submit" name="Guardar" value="Entrar">
             <br>
              <a href="PrincipalAdministrador.jsp">
            <input class="btn  btn-danger btn-block" type="button" value ="Pagina Principal">
            <br>
</body>
</html>
