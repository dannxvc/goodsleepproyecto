
package modelo;


public class Consulta {
    
    private String codCategoria;
    private String nombreCategoria;
    private String descripcionCategoria;
    private double precioCategoria;
    private String codHabitacion;
    private int piso;
    private String estado;

    public Consulta() {
    }

    public Consulta(String codCategoria, String nombreCategoria, String descripcionCategoria, double precioCategoria, String codHabitacion, int piso, String estado) {
        this.codCategoria = codCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.precioCategoria = precioCategoria;
        this.codHabitacion = codHabitacion;
        this.piso = piso;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public double getPrecioCategoria() {
        return precioCategoria;
    }

    public void setPrecioCategoria(double precioCategoria) {
        this.precioCategoria = precioCategoria;
    }

    public String getCodHabitacion() {
        return codHabitacion;
    }

    public void setCodHabitacion(String codHabitacion) {
        this.codHabitacion = codHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    
    
}
