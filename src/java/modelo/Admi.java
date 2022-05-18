
package modelo;
public class Admi {
    private String id_admi;
      private String nombre;
      private String apellido;
      private String celular;
      private String correo;
      private String rol;
      private String id_empresa;
      
   
    public Admi(String id_admi, String nombre, String apellido, String celular, String correo, String rol, String id_empresa) {
        this.id_admi = id_admi;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.rol = rol;
        this.id_empresa = id_empresa;
    }
 public Admi(){}

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
