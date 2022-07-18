
package modelo;
public class CantPorEstado {
    private String estado;
    private int cant;

    public CantPorEstado(String estado, int cant) {
        this.estado = estado;
        this.cant = cant;
    }

    public CantPorEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
