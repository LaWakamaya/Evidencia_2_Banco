

<%@page import="Datos.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="Datos.Cuenta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    List<Cuenta> cuentas = (List<Cuenta>) request.getAttribute("cuentas");
    HttpSession sesion = request.getSession(true);
    Usuario user = (Usuario) sesion.getAttribute("userSesion");
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
    
    
         <div class="container col-lg-3">
        <form action="BancoServlet.do "method= "post" >
           <div class=" form-group text-center">
        <img src="cuenta.PNG" height="180" width="180"><br/><br/>
        
        <table border="1" align="center">
            <tr>
                <th style="width: 33%;">No. Cuenta</th>
                <th style="width: 33%;">Tipo Cuenta</th>
                <th style="width: 33%;">Saldo</th>
            </tr>
            <%
                for (int i = 0; i < cuentas.size(); i++) {
                    
                        if(cuentas.get(i).getIdUsuario()==user.getIdUsuario()){
                %>
                
                <tr>
                    <td style="width: 33%;"><%=cuentas.get(i).getIdCuenta()%></td>
                    <td style="width: 33%;"><%=cuentas.get(i).getTipoCuenta()%></td>
                    <td style="width: 33%;"><%=cuentas.get(i).getMonto()%></td>
                </tr>
                
                <%
                        }
                    }
                    %>
        </table>
           </div>
            
        <br>
         <a href="PrincipalCliente.jsp">
            <input class="btn  btn-danger btn-block" type="button" value ="Pagina Principal">
            <br>
        </center>
    </body>
</html>