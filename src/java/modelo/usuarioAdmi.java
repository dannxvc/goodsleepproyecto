package modelo;

public class usuarioAdmi {
   private String usuario;
    private String password;
    private Admi id_admi;

    public usuarioAdmi(String usuario, String password, Admi id_admi) {
        this.usuario = usuario;
        this.password = password;
        this.id_admi = id_admi;
    }
    public usuarioAdmi(){
        
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admi getId_admi() {
        return id_admi;
    }

    public void setId_admi(Admi id_admi) {
        this.id_admi = id_admi;
    }
    
}
