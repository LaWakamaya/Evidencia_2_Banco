
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="Estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body  background="olis.jpg">
    
    <center><h1>BANCO BACEL </h1></center>
         <div class="container col-lg-3">
           <form action="BancoServlet.do" method="post">
            <div class=" form-group text-center">
                 <img src="bacel.jpg" height="180" width="210">
                 <p><strong>Bienvenido al Banco Bacel </strong></p>
            </div>
               
            <div class="form-group">
                 <label>Numero del cliente:</label>
                 <input class ="form-group" type ="number" name="numCliente">
            </div>
               
            <div class="form-group">
                   <label>Clave de acceso:</label>
                   <input type="password" maxlength="10" name="claveAcceso" value="">
            </div>
           <input class="btn  btn-danger btn-block" type="submit" name="Entrar" value="Entrar">
           <input class="btn  btn-danger btn-block" type="submit" name="Registrar" value="Registrarse">
          
        </form>

        
    </body>
</html>
