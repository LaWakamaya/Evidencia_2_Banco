/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Alan Franco
 */
public class Cuenta {
    
    private int IdCuenta = 0;
    private int IdUsuario;
    private String TipoCuenta;
    private double Monto;

    public Cuenta(int IdCuenta, int IdUsuario, String TipoCuenta, double Monto) {
        this.IdCuenta = IdCuenta;
        this.IdUsuario = IdUsuario;
        this.TipoCuenta = TipoCuenta;
        this.Monto = Monto;
    }
    
    public Cuenta(int IdUsuario, String TipoCuenta, double Monto) {
        this.IdUsuario = IdUsuario;
        this.TipoCuenta = TipoCuenta;
        this.Monto = Monto;
    }

    public int getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(int IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
    
    
    
}
