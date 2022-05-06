

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="Estilos.css" rel="stylesheet" type="text/css"/>
        
        <title> Alta de Cuenta</title>
    </head>
    <body  background="olis.jpg" >
    <center><h1>ALTA DE CUENTA </h1></center>
        
    <div class="container col-lg-3">
        <form action="BancoServlet.do"  method="post">
           <div class=" form-group text-center">
        <img src="cuenta.PNG" height="180" width="180">
         <p><strong>Por favor ingrese los datos correspondientes<strong></p>
        </div>
            
          <div class="form-group">
        <label>Numero de Cliente:</label>
        <input  class ="form-group" type ="number" name="numeroCliente">
        </div>
        
          <div class="form-group">
        <label>Numero de Cuenta:</label>
        <input  class ="form-group" type ="number" name="numeroCuenta">
        
          <div class="form-group">
        <label>Tipo de Cuenta:</label>
        <input  class ="form-group" type ="text" name="TipoCuenta">
          </div>
          
            <div class="form-group">
        <label>Monto:</label>
        <input  class ="form-group" type ="number" name="monto">
        </div>
          
            <div class="form-group">
        <label>Fecha:</label>
        <input  class ="form-group" type ="date" name="fecha">
        </div>
           <input class="btn  btn-danger btn-block" type="submit" name="Guardarcuenta" value="Guardar">
              <br>
        <a href="PrincipalAdministrador.jsp">
            <input class="btn  btn-danger btn-block" type="button" value ="Pagina Principal">
            <br>
        </div>
    </body>
</html>
