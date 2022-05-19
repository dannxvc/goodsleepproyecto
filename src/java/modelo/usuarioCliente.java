
package modelo;


public class usuarioCliente {
    String usuario;
    String password;
    private int id_cliente;

    public usuarioCliente() {
        usuario="";
        password="";
        id_cliente=0;
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

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }


}
