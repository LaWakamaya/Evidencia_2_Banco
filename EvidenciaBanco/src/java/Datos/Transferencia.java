/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Alan Franco
 */
public class Transferencia {
    
    private int IdTransferencia, IdUsuario, IdOrigen, IdDestino;
    private double Monto;
    private String fecha;

    public Transferencia(int IdTransferencia, int IdUsuario, int IdOrigen, int IdDestino, double Monto, String fecha) {
        this.IdTransferencia = IdTransferencia;
        this.IdUsuario = IdUsuario;
        this.IdOrigen = IdOrigen;
        this.IdDestino = IdDestino;
        this.Monto = Monto;
        this.fecha = fecha;
    }

    public Transferencia(int IdUsuario, int IdOrigen, int IdDestino, double Monto) {
        this.IdUsuario = IdUsuario;
        this.IdOrigen = IdOrigen;
        this.IdDestino = IdDestino;
        this.Monto = Monto;
        this.fecha = fechaTransferencia();
    }

    public int getIdTransferencia() {
        return IdTransferencia;
    }

    public void setIdTransferencia(int IdTransferencia) {
        this.IdTransferencia = IdTransferencia;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public int getIdOrigen() {
        return IdOrigen;
    }

    public void setIdOrigen(int IdOrigen) {
        this.IdOrigen = IdOrigen;
    }

    public int getIdDestino() {
        return IdDestino;
    }

    public void setIdDestino(int IdDestino) {
        this.IdDestino = IdDestino;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    private String fechaTransferencia(){
        Date date = (Date) Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        return strDate;
    }
}
