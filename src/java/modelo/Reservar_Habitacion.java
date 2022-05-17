package modelo;

import java.sql.Date;

public class Reservar_Habitacion{ 
         private String id_reserva;
         private int id_cliente;
         private Date fechaInicio;
         private Date fechaFinal;
         private String codHabita;
         private double subtotal;
         private String cod_servA;
         private int cant_personas;
         private double precioTotal;
         private String estado;

    public Reservar_Habitacion() {
    }

    public Reservar_Habitacion(String id_reserva, int id_cliente, Date fechaInicio, Date fechaFinal, String codHabita, double subtotal, String cod_servA, int cant_personas, double precioTotal, String estado) {
        this.id_reserva = id_reserva;
        this.id_cliente = id_cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.codHabita = codHabita;
        this.subtotal = subtotal;
        this.cod_servA = cod_servA;
        this.cant_personas = cant_personas;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(String id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCodHabita() {
        return codHabita;
    }

    public void setCodHabita(String codHabita) {
        this.codHabita = codHabita;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getCod_servA() {
        return cod_servA;
    }

    public void setCod_servA(String cod_servA) {
        this.cod_servA = cod_servA;
    }

    public int getCant_personas() {
        return cant_personas;
    }

    public void setCant_personas(int cant_personas) {
        this.cant_personas = cant_personas;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    
    
    
    
}
