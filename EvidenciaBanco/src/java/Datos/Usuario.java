
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author alexa
 */
public class Usuario {
    
    private int idUsuario,CP,Telefono,IdNumerocuenta,TipoCuenta;
    private String Nombre,Apellido,Direccion,Ciudad,Estado,Pais,FechaNacimiento,CorreoEletronico,Contrasena;
    private boolean Administrador; 
    private Double Monto;
    
    public Usuario(int idUsuario, int CP, int Telefono ,int IdNumerocuenta , int TipoCuenta, String Nombre, 
            String Apellido,String Direccion,String Ciudad, String Estado, String Pais, String FechaNacimiento,
            String CorreoEletronico,String Contrasena, boolean Administrador , Double Monto){
        
         this.idUsuario = idUsuario;
         this.CP = CP;
         this.Telefono = Telefono;
         this.IdNumerocuenta = IdNumerocuenta;
         this.TipoCuenta = TipoCuenta;
         this.Nombre = Nombre;
         this.Apellido = Apellido;
         this.Direccion = Direccion;
         this.Ciudad = Ciudad;
         this.Estado = Estado;
         this.Pais = Pais;
         this.FechaNacimiento = FechaNacimiento;
         this.CorreoEletronico = CorreoEletronico;
         this.Contrasena = Contrasena;
         this.Administrador = Administrador;
         this.Monto = Monto;
         

    }

    Usuario(int idUsuario, int CP, int Telefono, int IdNumerocuenta, int TipoCuenta, String Nombre, String Apellido, String Direccion, String Ciudad, String Estado, String Pais, String FechaNacimiento, String CorreoEletronico, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Usuario(int idUsuario, int CP, int Telefono, int IdNumerocuenta, int TipoCuenta, String Nombre, String Apellido, String Direccion, String Ciudad, String Estado, String Pais, String FechaNacimiento, String CorreoEletronico, String Contrasena, boolean Administrador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
       

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getIdNumerocuenta() {
        return IdNumerocuenta;
    }

    public void setIdNumerocuenta(int IdNumerocuenta) {
        this.IdNumerocuenta = IdNumerocuenta;
    }

    public int getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(int TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getCorreoEletronico() {
        return CorreoEletronico;
    }

    public void setCorreoEletronico(String CorreoEletronico) {
        this.CorreoEletronico = CorreoEletronico;
    }

    public String getConstrasena() {
        return Contrasena;
    }

    public void setConstrasena(String Constrasena) {
        this.Contrasena = Constrasena;
    }

    public boolean isAdministrador() {
        return Administrador;
    }

    public void setAdministrador(boolean Administrador) {
        this.Administrador = Administrador;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }
}
