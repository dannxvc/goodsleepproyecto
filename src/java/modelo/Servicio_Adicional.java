
package modelo;


public class Servicio_Adicional {
         String cod_servA;
         String descripcion;
         String precio;
        
public Servicio_Adicional() {
        
        cod_servA="";
        descripcion="";
        precio="";
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }


}
