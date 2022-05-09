

<%@page import="java.util.List"%>
<%@page import="Datos.Transferencia"%>
<%@page import="Datos.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    List<Transferencia> trans = (List<Transferencia>) request.getAttribute("transferencias");
    HttpSession sesion = request.getSession(true);
    Usuario user = (Usuario) sesion.getAttribute("userSesion");
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        
        <title>ListaTransferencia</title>
    </head>
    <body background="olis.jpg" >
    <center> <h1>LISTA DE TRANSFERENCIA</h1></center>
    
     <div class="container col-lg-3">
        <form action="BancoServlet.do "method= "post" >
           <div class=" form-group text-center">
               <img src="transferen.PNG" height="180" width="180"><br/><br/>
               
               <table border="1" align="center">
                <tr>
                    <th style="width: 20%;">Id. Transferencia</th>
                    <th style="width: 20%;">Cuenta origen</th>
                    <th style="width: 20%;">Cuenta destino</th>
                    <th style="width: 20%;">Monto</th>
                    <th style="width: 20%;">Fecha</th>
                </tr>
                <%
                    for (int i = 0; i < trans.size(); i++) {
                            if(trans.get(i).getIdUsuario()==user.getIdUsuario()){
                    %>
                    
                    <tr>
                        <td><%=trans.get(i).getIdTransferencia()%></td>
                        <td><%=trans.get(i).getIdOrigen()%></td>
                        <td><%=trans.get(i).getIdDestino()%></td>
                        <td><%=trans.get(i).getMonto()%></td>
                        <td><%=trans.get(i).getFecha()%></td>
                    </tr>
                    
                <%
                            }
                        }
                    %>
               </table>
           </div>
        
       <br>
        <a href="PrincipalCliente.jsp">
        <input class="btn  btn-danger btn-block" type="button"  value=" Pagina Principal">
        </a>
    </body>
</html>
