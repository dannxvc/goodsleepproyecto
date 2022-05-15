package modelo;
public class Reservar_Habitacion { 
         String id_reserva;
         String id_cliente;
         String fechaInicio;
         String fechaFinal;
         String codHabita;
         String subtotal;
         String cod_servA;
         String cant_personas;
         String precioTotal;
         String estado;
         
public Reservar_Habitacion() {
        id_reserva="";
        id_cliente="";
        fechaInicio="";
        fechaFinal="";
        codHabita="";
        subtotal="";
        cod_servA="";
        cant_personas="";
        precioTotal="";
        estado="";
    }

    public String getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(String id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getCodHabita() {
        return codHabita;
    }

    public void setCodHabita(String codHabita) {
        this.codHabita = codHabita;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getCod_servA() {
        return cod_servA;
    }

    public void setCod_servA(String cod_servA) {
        this.cod_servA = cod_servA;
    }

    public String getCant_personas() {
        return cant_personas;
    }

    public void setCant_personas(String cant_personas) {
        this.cant_personas = cant_personas;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
