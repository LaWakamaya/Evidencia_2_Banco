

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        
        <title>ADMINISTRADOR</title>
    </head>
    <body background="olis.jpg"   >
    <center>
    <h1>BIENVENIDO ADMINISTRADOR </h1>
    
    <div class="container col-lg-3">
        <form action="BancoServlet.do "method= "post" >
             <div class=" form-group text-center">
                 <img src="bacel.jpg" height="180" width="180">
                <p><strong>Eliga la opcion correspondiente dependiendo de la accion que requiera hacer </strong></p>
            </div>
            <br>  
         <a href="AltadeCliente.jsp">
        <input class="btn  btn-danger btn-block" type="button"  value="Alta de Cliente">
        </a>
            
            <br>
        <a href="AltadeCuenta.jsp">
            <input class="btn  btn-danger btn-block" type="button" value ="Alta de Cuenta">
            <br>
            
            <a href="DetallesCliente.jsp">
                <input class="btn  btn-danger btn-block" type="button" value="Detalles del cliente ">
            </a>
            <br>
            <a href="DetallesCuenta.jsp">
                <input class="btn  btn-danger btn-block" type="Button" value="Detalles de la Cuenta " >
            </a>
            
        </form>
    </center>
    </body>
</html>
