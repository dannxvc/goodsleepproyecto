
package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Habitacion;
import modelo.Servicio_Adicional;
import util.MySQLConexion;


public class mantenimientoDAO {
    
    public void agregarHabitacion(Habitacion h){
        try {
            Connection cn =MySQLConexion.getConexion();
            String sql="insert into habitacion values(?,?,?,?,?)";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, h.getCodHabitacion());
            st.setString(2, h.getCatcategoria());
            st.setString(3, h.getPiso());
            st.setString(4, h.getId_empresa());
            st.setString(5, h.getEstado()); 
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    public void eliminarHabitacion(String id){
     try{ 
        Connection cn=MySQLConexion.getConexion(); 
        String sql="delete from habitacion where codHabitacion=?"; 
        PreparedStatement st=cn.prepareStatement(sql); 
        st.setString(1, id); 
        st.executeUpdate(); 
      }catch(Exception ex){ 
          ex.printStackTrace(); 
      }        
    }
     public void agregarServicio(Servicio_Adicional r){
        try {
            Connection cn=MySQLConexion.getConexion();
            String sql="{call spAddServicio(?,?)}";
            CallableStatement st=cn.prepareCall(sql);
            st.setString(1, r.getDescripcion());
            st.setDouble(2, r.getPrecio());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
