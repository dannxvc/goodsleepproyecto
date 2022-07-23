package modelo;
public class FacturaPorMes {
    private int mes;     
    private int cantidad; 

    
    public String Lmes(){
        String m[]={"","Ene","Feb","Mar","Abr","May","Jun","Jul","Ago",
      "Set","Oct","Nov","Dic"};
        return m[mes];
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
   
}
