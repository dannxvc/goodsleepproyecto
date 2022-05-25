
package modelo;


public class usuarioCliente {
    String usuario;
    String password;
    private Cliente id_cliente;

    public usuarioCliente() {
    }

    public usuarioCliente(String usuario, String password, Cliente id_cliente) {
        this.usuario = usuario;
        this.password = password;
        this.id_cliente = id_cliente;
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

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    

}
