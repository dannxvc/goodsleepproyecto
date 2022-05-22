
package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
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
    
    
    public Cliente consultaCliente(int nro){
        Cliente c=null; 
        try{
        Connection cn=MySQLConexion.getConexion();
        String sql="select id_cliente, tipoDoc, nombre, apellido, celular, correo from cliente where id_cliente=?";
        PreparedStatement st=cn.prepareStatement(sql);
            st.setInt(1, nro);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                c=new Cliente();
                c.setId_cliente(rs.getInt(1));
                c.setTipoDoc(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setCelular(rs.getString(5));
                c.setCorreo(rs.getString(6));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        } 
       return c;    
       } 
    
    
    
    
    public void editarCliente(Cliente c){
       try{ 
            Connection cn=MySQLConexion.getConexion(); 
            String sql="update cliente set id_cliente=?, tipoDoc=?, nombre=?, apellido=?, celular=?, correo=? where id_cliente=?"; 
            PreparedStatement st=cn.prepareStatement(sql); 
            st.setInt(1, c.getId_cliente());
            st.setString(2, c.getTipoDoc());
            st.setString(3, c.getNombre());
            st.setString(4, c.getApellido());
            st.setString(5, c.getCelular());
            st.setString(6, c.getCorreo());
            st.setInt(7, c.getId_cliente());
            st.executeUpdate(); 
          }catch(Exception ex){ 
              ex.printStackTrace(); 
        } 
    }
    
    public void eliminarCliente(int id){
     try{ 
        Connection cn=MySQLConexion.getConexion(); 
        String sql="delete from cliente where id_cliente=?"; 
        PreparedStatement st=cn.prepareStatement(sql); 
        st.setInt(1, id); 
        st.executeUpdate(); 
      }catch(Exception ex){ 
          ex.printStackTrace(); 
      }        
    }
}
