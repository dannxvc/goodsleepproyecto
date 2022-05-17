
package modelo;


public class Categoria {
    private String codCategoria;
    private String nombreCat;
    private String descripcion;
    private String precio;

    public Categoria() {
    }

    public Categoria(String codCategoria, String nombreCat, String descripcion, String precio) {
        this.codCategoria = codCategoria;
        this.nombreCat = nombreCat;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
