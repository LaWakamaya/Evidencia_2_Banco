<%-- 
    Document   : transferencia
    Created on : 14 abr. 2022, 17:30:45
    Author     : tania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
         <link href="Estilos.css" rel="stylesheet" type="text/css"/>
        
         <title>Transferencia</title>
    </head>
    <body background="olis.jpg"   >
        
    <center> <h1>TRANSFERENCIA</h1></center>
    
    
     <div class="container col-lg-3">
        <form action="Principal">
           <div class=" form-group text-center">
               <img src="transferen.PNG" height="180" width="180">
              
        <p><strong>Por favor ingrese los datos correspondientes<strong></p>
        </div>
        
         <div class="form-group">
        <label>Numero de Cuenta:</label>
        <input  class ="form-group" type ="number" name="numeroCuentaa">
        </div>
        
     <div class="form-group">
        <label>Numero de Cuenta a depositar:</label>
        <input  class ="form-group" type ="number" name="CuentaDepositar">
        </div>
    
     <div class="form-group">
        <label>Monton:</label>
        <input  class ="form-group" type ="number" name="montonn">
        </div>
             <input class="btn  btn-danger btn-block" type="submit" name="guardartrans" value="Transferir">
             
             <br>
        <a href="PrincipalCliente.jsp">
        <input class="btn  btn-danger btn-block" type="button"  value=" Pagina Principal">
        </a>
             
           
    </body>
</html>
