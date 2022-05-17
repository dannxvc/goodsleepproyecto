
package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.*;

import util.MySQLConexion;

public class reservaDAO {
    
    public void reservaHabitacion(Reservar_Habitacion r){
        try {
            Connection cn=MySQLConexion.getConexion();
            String sql="{call spAddReserva(?,?,?,?,?,?,?,?,?)}";
            CallableStatement st=cn.prepareCall(sql);
            st.setInt(1, r.getId_cliente());
            st.setDate(2, r.getFechaInicio());
            st.setDate(3, r.getFechaFinal());
            st.setString(4, r.getCodHabita());
            st.setDouble(5, r.getSubtotal());
            st.setString(6, r.getCod_servA());
            st.setInt(7, r.getCant_personas());
            st.setDouble(8, r.getPrecioTotal());
            st.setString(9, r.getEstado());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    public void agregarCliente(Cliente c){
        try {
            Connection cn =MySQLConexion.getConexion();
            String sql="insert into cliente values(?,?,?,?,?,?)";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setInt(1, c.getId_cliente());
            st.setString(2, c.getTipoDoc());
            st.setString(3, c.getNombre());
            st.setString(4, c.getApellido());
            st.setString(5, c.getCelular());
            st.setString(6, c.getCorreo());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
