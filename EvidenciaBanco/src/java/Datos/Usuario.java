
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
    
    private int IdUsuario;
    private String Nombre, Apellido, Direccion, CP, Ciudad, Estado, Pais,Telefono, FechaNacimiento, CorreoElectronico, Contraseña;
    private int Admin;

    public Usuario(int IdUsuario, String Nombre, String Apellido, String Direccion, String CP, String Ciudad, String Estado, String Pais, String Telefono, String FechaNacimiento, String CorreoElectronico, String Contraseña, int Admin) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.CP = CP;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
        this.Pais = Pais;
        this.Telefono = Telefono;
        this.FechaNacimiento = FechaNacimiento;
        this.CorreoElectronico = CorreoElectronico;
        this.Contraseña = Contraseña;
        this.Admin = Admin;
    }

    public Usuario(String Nombre, String Apellido, String Direccion, String CP, String Ciudad, String Estado, String Pais, String Telefono, String FechaNacimiento, String CorreoElectronico, String Contraseña, int Admin) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.CP = CP;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
        this.Pais = Pais;
        this.Telefono = Telefono;
        this.FechaNacimiento = FechaNacimiento;
        this.CorreoElectronico = CorreoElectronico;
        this.Contraseña = Contraseña;
        this.Admin = Admin;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
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

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContrasena(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getAdmin() {
        return Admin;
    }

    public void setAdmin(int Admin) {
        this.Admin = Admin;
    }
    
}
    

    
