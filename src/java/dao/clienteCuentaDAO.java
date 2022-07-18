package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Consulta;
import modelo.Habitacion;
import modelo.Reservar_Habitacion;
import modelo.usuarioCliente;
import util.MySQLConexion;

public class clienteCuentaDAO {
    
    public Cliente BusCliente(String id){
    Cliente p=null;
    Connection cn=MySQLConexion.getConexion();
    try{
      String sql="select id_cliente,tipoDoc,nombre,apellido,celular,correo from cliente where id_cliente=?";  
        PreparedStatement st=cn.prepareStatement(sql);
        st.setString(1, id);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            p=new Cliente();
            p.setId_cliente(rs.getInt(1));
            p.setTipoDoc(rs.getString(2));
            p.setNombre(rs.getString(3));
            p.setApellido(rs.getString(4));
            p.setCelular(rs.getString(5));
            p.setCorreo(rs.getString(6));
        }
    }catch(Exception ex){
        ex.printStackTrace();
    }
       return p;
   }
    public void editaPerfil(Cliente c){
     Connection cn=MySQLConexion.getConexion();
     try{
         String sql="{call spModiCli(?,?,?,?,?,?)}";  
       CallableStatement st=cn.prepareCall(sql);
            st.setInt(1, c.getId_cliente());
            st.setString(2, c.getTipoDoc());
            st.setString(3, c.getNombre());
            st.setString(4, c.getApellido());
            st.setString(5, c.getCelular());
            st.setString(6, c.getCorreo());
           /* String sql2="insert into usuariocliente (usuario,password,id_cliente) values(?,?,?)";
            PreparedStatement st2=cn.prepareStatement(sql2);
            st2.setString(1, u.getUsuario());
            st2.setString(2, u.getPassword());
            st2.setInt(3, c.getId_cliente());*/
        st.executeUpdate();
        //st2.executeUpdate();
     }catch(Exception ex){
         ex.printStackTrace();
     }
     }
    
     public List<Reservar_Habitacion> lisMisReservaciones(int id){
        List<Reservar_Habitacion> lis = new ArrayList();
        Connection cn =MySQLConexion.getConexion();
        try{
            String sql="select id_reserva,fechaInicio,fechaFinal,codHabitacion,subTotal,codServA,cant_personas,precioTotal,estado from reservaHabitacion where id_cliente=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Reservar_Habitacion v=new Reservar_Habitacion();
                v.setId_reserva(rs.getString(1));  
                v.setFechaInicio(rs.getDate(2));
                v.setFechaFinal(rs.getDate(3));
                v.setCodHabita(rs.getString(4));
                v.setSubtotal(rs.getDouble(5));
                v.setCod_servA(rs.getString(6));
                v.setCant_personas(rs.getInt(7));
                v.setPrecioTotal(rs.getDouble(8));
                v.setEstado(rs.getString(9));;
                lis.add(v);
            }
        }catch(Exception ex){
         ex.printStackTrace();
        }
        return lis;
    }
     
     public void reservaHabitacion(Reservar_Habitacion r, Habitacion h){
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
            String sql2="update habitacion set estado=?  where codHabitacion=?"; 
            PreparedStatement st2=cn.prepareStatement(sql2);
            st2.setString(1, h.getEstado());
            st2.setString(2, h.getCodHabitacion());
            st.executeUpdate();
            st2.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     
     public List<Consulta> filtra(String cod){ 
    List<Consulta> lis=new ArrayList(); 
    Connection cn=MySQLConexion.getConexion(); 
    try{ 
      String sql="select codHabitacion, nombreCat,piso from habitacion JOIN categoria ON habitacion.codCategoria=categoria.codCategoria WHERE habitacion.codHabitacion=?";
        PreparedStatement st=cn.prepareStatement(sql);  
        st.setString(1, cod); 
        ResultSet rs=st.executeQuery(); 
        while(rs.next()){//leer cada fila de la tabla 
            Consulta p=new Consulta(); 
            p.setCodHabitacion(rs.getString(1)); 
            p.setDescripcionCategoria(rs.getString(2)); 
            p.setPiso(rs.getInt(3)); 
            lis.add(p); //el objeto prestamo de un cliente pasar a la lista 
        } 
    }catch(Exception ex){ 
        ex.printStackTrace(); 
    } 
       return lis; 
   }    
}
