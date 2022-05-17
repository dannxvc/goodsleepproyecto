
package modelo;

public class Habitacion {
    private String codHabitacion;
    private String catcategoria;
    private String piso;
    private String id_empresa;
    private String estado;
        
    public Habitacion() {
    }
    
    public Habitacion(String codHabitacion, String catcategoria, String piso, String id_empresa, String estado) {
        this.codHabitacion = codHabitacion;
        this.catcategoria = catcategoria;
        this.piso = piso;
        this.id_empresa = id_empresa;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodHabitacion() {
        return codHabitacion;
    }

    public void setCodHabitacion(String codHabitacion) {
        this.codHabitacion = codHabitacion;
    }

    public String getCatcategoria() {
        return catcategoria;
    }

    public void setCatcategoria(String catcategoria) {
        this.catcategoria = catcategoria;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(String id_empresa) {
        this.id_empresa = id_empresa;
    }
    
    
    
    
    
    
    
}
