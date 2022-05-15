
package modelo;


public class Admi {
      String id_admi;
      String nombre;
      String apellido;
      String celular;
      String correo;
      String rol;
      String id_empresa;

    public Admi() {
    id_admi="";
    nombre="";
    apellido="";
    celular="";
    correo="";
    rol="";
    id_empresa="";
    }

    public String getId_admi() {
        return id_admi;
    }

    public void setId_admi(String id_admi) {
        this.id_admi = id_admi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(String id_empresa) {
        this.id_empresa = id_empresa;
    }
     
   
      
      
     
}
