
package modelo;


public class Categoria {
   String catcategoria;
   String nombreCat;
    String descripcion;
    String precio;

    public Categoria() {
    catcategoria="";
     nombreCat="";
     descripcion="";
     precio="";
    }

    public String getCatcategoria() {
        return catcategoria;
    }

    public void setCatcategoria(String catcategoria) {
        this.catcategoria = catcategoria;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

   

   
    
    
    
    
}
