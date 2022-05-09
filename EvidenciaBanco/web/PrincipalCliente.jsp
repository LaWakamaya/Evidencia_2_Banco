
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        
        <title>CLIENTE</title>
    </head>
    <body background="olis.jpg" >
        
    <center><h1>BIENVENIDO CLIENTE </h1></center>
         <div class="container col-lg-3">
        <form action="BancoServlet.do "method= "post" >
             <div class=" form-group text-center">
                 <img src="bacel.jpg" height="180" width="180">
                <p><strong>Eliga la opcion correspondiente dependiendo de la accion que requiera hacer </strong></p>
            </div>
            
         <br>  
         <a href="DetallesCuentaCliente.jsp">
        <input class="btn  btn-danger btn-block" type="button"  value="Detalles de la Cuenta">
         </a>
         <br>  
         <a href="Transferencia.jsp">
        <input class="btn  btn-danger btn-block" type="button"  value="Transferencia">
        </a>
         <br>
         <a href="ListaTransferencia.jsp">
        <input class="btn  btn-danger btn-block" type="button"  value=" Lista de Transferencia">
        </a>
         
            
    </body>
</html>
