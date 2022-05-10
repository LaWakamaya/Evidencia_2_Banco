

<%@page import="java.util.List"%>
<%@page import="Datos.Cuenta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    List<Cuenta> cuentas = (List<Cuenta>) request.getAttribute("cuentas");
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos.css" rel="stylesheet" type="text/css"/>
          <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        
        <title>DetallesCuenta</title>
    </head>
    <body background="olis.jpg">
    <center>
        <h1>Detalles de Cuenta</h1>
    </center>
    
         <div class="container col-lg-3">
        <form action="BancoServlet.do "method= "post" >
           <div class=" form-group text-center">
        <img src="cuenta.PNG" height="180" width="180">
        
        <table border="1" align="center">
            <tr>
                <th style="width: 25%;">Id Cuenta</th>
                <th style="width: 25%;">Id Usuario</th>
                <th style="width: 25%;">Tipo de cuenta</th>
                <th style="width: 25%;">Monto</th>
            </tr>
            <%
                for (int i = 0; i < cuentas.size(); i++) {
                %>
                        
                <tr>
                    <td><%=cuentas.get(i).getIdCuenta()%></td>
                    <td><%=cuentas.get(i).getIdUsuario()%></td>
                    <td><%=cuentas.get(i).getTipoCuenta()%></td>
                    <td><%=cuentas.get(i).getMonto()%></td>
                </tr> 
                        
            <%
                    }
                %>
           </div>
            
        <br>
         <a href="PrincipalAdministrador.jsp">
            <input class="btn  btn-danger btn-block" type="button" value ="Pagina Principal">
            <br>
            
    </body>
</html>
