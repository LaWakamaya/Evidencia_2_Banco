

<%@page import="Datos.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    List<Usuario> users = (List<Usuario>) request.getAttribute("users");
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        
        
        <title>DetallesCliente</title>
    </head>
    <body background="olis.jpg">
    <center><h1>DETALLES DEL CLIENTE </h1></center>
        
         <div class="container col-lg-9">
      
        <form action="BancoServlet.do " method= "post">
           <div class=" form-group text-center">
            <img src="iconoo.png" height="180" width="180"  >
            
            <table border="1" align="center">
            <tr>
                <th style="width: 9%;">Id Usuario</th>
                <th style="width: 9%;">Nombre</th>
                <th style="width: 9%;">Apellido</th>
                <th style="width: 9%;">Direccion</th>
                <th style="width: 9%;">CP</th>
                <th style="width: 9%;">Ciudad</th>
                <th style="width: 9%;">Estado</th>
                <th style="width: 9%;">Pais</th>
                <th style="width: 9%;">Telefono</th>
                <th style="width: 9%;">Fecha de Nacimiento</th>
                <th style="width: 9%;">Correo electronico</th>
            </tr>
            
            <%
                for (int i = 0; i < users.size(); i++) {
                %>
                        
                <tr>
                    <td><%=users.get(i).getIdUsuario()%></td>
                    <td><%=users.get(i).getNombre()%></td>
                    <td><%=users.get(i).getApellido()%></td>
                    <td><%=users.get(i).getDireccion()%></td>
                    <td><%=users.get(i).getCP()%></td>
                    <td><%=users.get(i).getCiudad()%></td>
                    <td><%=users.get(i).getEstado()%></td>
                    <td><%=users.get(i).getPais()%></td>
                    <td><%=users.get(i).getTelefono()%></td>
                    <td><%=users.get(i).getFechaNacimiento()%></td>
                    <td><%=users.get(i).getCorreoElectronico()%></td>
                </tr>
                        
            <%
                    }
                %>
            </table>
        </div>
        <br>
         <a href="PrincipalAdministrador.jsp">
            <input class="btn  btn-danger btn-block" type="button" value ="Pagina Principal">
            <br>
    </body>
</html>
