
package modelo;

public class Servicio_Adicional {
         private String cod_servA;
         private String descripcion;
         private double precio;
         private int cantServicios;
         
         
    public Servicio_Adicional() {
    }

    public Servicio_Adicional(String cod_servA, String descripcion, double precio) {
        this.cod_servA = cod_servA;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public String getCod_servA() {
        return cod_servA;
    }

    public void setCod_servA(String cod_servA) {
        this.cod_servA = cod_servA;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantServicios() {
        return cantServicios;
    }

    public void setCantServicios(int cantServicios) {
        this.cantServicios = cantServicios;
    }
}
