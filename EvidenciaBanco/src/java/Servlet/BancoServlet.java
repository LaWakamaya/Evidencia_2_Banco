/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Conexion.Banco.ConexionBD;
import Datos.Cuenta;
import Datos.Transferencia;
import Datos.Usuario;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Alan Franco
 */
public class BancoServlet extends HttpServlet {

    
    List<Usuario> users = new ArrayList<>();
    List<Cuenta> cuentas = new ArrayList<>();
    List<Transferencia> trans = new ArrayList<>();
    ConexionBD con = null;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BancoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BancoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        try {
            //processRequest(request, response);
            con = new ConexionBD();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        
        if(con!=null){
            obtenerDatos();
            String accion = request.getParameter("accion");
            
            switch(accion){
                case "Iniciar sesion":{
                    boolean flagSesion = false;
                    boolean flagAdmin = false;
                    String correo = request.getParameter("correo");
                    String pass = request.getParameter("pass");
                    
                    for (int i = 0; i < users.size(); i++) {
                        if(correo.equals(users.get(i).getCorreoElectronico()) && 
                            pass.equals(users.get(i).getContraseña())){
                            flagSesion = true;
                            HttpSession sesion = request.getSession(true);
                            sesion.setAttribute("userSesion", users.get(i));
                            if(users.get(i).getAdmin()==1)
                                flagAdmin = true;
                            break;
                        }
                    }
                    
                    if(flagSesion){
                        if(flagAdmin){
                            RequestDispatcher view = request.getRequestDispatcher("PrincipalAdministrador.jsp");
                            view.forward(request, response);
                        }else{
                            RequestDispatcher view = request.getRequestDispatcher("PrincipalCliente.jsp");
                            view.forward(request, response);
                        }
                    }else{
                        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
                        view.forward(request, response);
                    }
                }
                
                case "Guardar cliente":{
                    String nombre = request.getParameter("nombreCliente");
                    String apellido = request.getParameter("apellidoCliente");
                    String direccion = request.getParameter("direccionCliente");
                    String cp = request.getParameter("cpCliente");
                    String ciudad = request.getParameter("ciudad");
                    String estado = request.getParameter("estado");
                    String pais = request.getParameter("pais");
                    String telefono = request.getParameter("telefono");
                    String fechaNacimiento = request.getParameter("fechaNacimiento");
                    String correo = request.getParameter("correo");
                    String password = request.getParameter("password");
                    int admin = Integer.parseInt(request.getParameter("admin"));
                    
                    Usuario nuevoU = new Usuario(nombre, apellido, direccion, cp, ciudad,
                    estado, pais, telefono, fechaNacimiento, correo, password, admin);
                try {
                    con.AltaCliente(nuevoU);
                } catch (SQLException ex) {
                    Logger.getLogger(BancoServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                obtenerDatos();
                RequestDispatcher view = request.getRequestDispatcher("PrincipalAdministrador.jsp");
                view.forward(request, response);
                }
                
                case "Guardar cuenta":{
                    int IdUsuario = Integer.parseInt(request.getParameter("numeroCliente"));
                    String TipoCuenta = request.getParameter("TipoCuenta");
                    double Monto = Double.parseDouble(request.getParameter("monto"));
                    
                    Cuenta nuevaC = new Cuenta(IdUsuario, TipoCuenta, Monto);
                try {
                    con.AltaCuenta(nuevaC);
                } catch (SQLException ex) {
                    Logger.getLogger(BancoServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                obtenerDatos();
                RequestDispatcher view = request.getRequestDispatcher("PrincipalAdministrador.jsp");
                view.forward(request, response);
                }
                
                case "Cuentas":{
                    obtenerDatos();
                    request.setAttribute("cuentas", cuentas);
                    RequestDispatcher view = request.getRequestDispatcher("DetallesCuentaCliente.jsp");
                    view.forward(request, response);
                }
                
                case "Transferencia":{
                    RequestDispatcher view = request.getRequestDispatcher("transferencia.jsp");
                    view.forward(request, response);
                }
                
                case "Transferir":{
                    obtenerDatos();
                    int origen = Integer.parseInt(request.getParameter("cuentaOrigen"));
                    int destino = Integer.parseInt(request.getParameter("cuentaDestino"));
                    double monto = Double.parseDouble(request.getParameter("monto"));
                    HttpSession sesion = request.getSession(true);
                    Usuario user = (Usuario) sesion.getAttribute("userSesion");
                    int idUser = user.getIdUsuario();
                    if(cuentas.get(origen - 1).getIdUsuario()==idUser && 
                            cuentas.get(origen - 1).getMonto() >= monto){
                        
                        Transferencia nuevaT = new Transferencia(idUser, origen, destino, monto);
                        
                        try {
                            con.UpdateMonto(nuevaT);
                        } catch (SQLException ex) {
                            Logger.getLogger(BancoServlet.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        obtenerDatos();
                        request.setAttribute("transferencias", trans);
                        
                        RequestDispatcher view = request.getRequestDispatcher("ListaTransferencia.jsp");
                        view.forward(request, response);
                    }
                    RequestDispatcher view = request.getRequestDispatcher("PrincipalCliente.jsp");
                    view.forward(request, response);
                }
                
                case "Lista de Transferencias":{
                    obtenerDatos();
                    request.setAttribute("transferencias", trans);

                    RequestDispatcher view = request.getRequestDispatcher("ListaTransferencia.jsp");
                    view.forward(request, response);
                }
                
                case "Detalles de clientes":{
                    obtenerDatos();
                    request.setAttribute("users", users);
                    RequestDispatcher view = request.getRequestDispatcher("DetallesCliente.jsp");
                    view.forward(request, response);
                }
                
                case "Detalles de cuentas":{
                    obtenerDatos();
                    request.setAttribute("cuentas", cuentas);
                    RequestDispatcher view = request.getRequestDispatcher("DetallesCuenta.jsp");
                    view.forward(request, response);
                }
            }
        }
        //RequestDispatcher view = request.getRequestDispatcher(redir);
        //view.forward(request, response);
    }
    
    private void obtenerDatos(){
        try {
                users = con.obtenerUsuarios();
                cuentas = con.obtenerCuentas();
                trans = con.obtenerTransferencias();
            } catch (SQLException ex) {
                Logger.getLogger(BancoServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
