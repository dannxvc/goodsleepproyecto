package modelo;

public class usuarioAdmi {
    private String usuario;
    private String password;
    private String id_admi;
    

    public usuarioAdmi(String usuario, String password, String id_admi) {
        this.usuario = usuario;
        this.password = password;
        this.id_admi = id_admi;
    }
    
    public usuarioAdmi(){
        
    }
    
    public String getId_admi() {
        return id_admi;
    }

    public void setId_admi(String id_admi) {
        this.id_admi = id_admi;
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
    
}
