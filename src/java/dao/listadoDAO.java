
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.*;
import util.MySQLConexion;

        
public class listadoDAO {
    
    public List<Categoria> lisCategoria(){
        List<Categoria> lis = new ArrayList();
        Connection cn =MySQLConexion.getConexion();
        try{
            String sql="select codCategoria, nombreCat, descripcion, precio from categoria";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Categoria c=new Categoria();
                c.setCodCategoria(rs.getString(1));                
                c.setNombreCat(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecio(rs.getDouble(4));
                lis.add(c);
            }
        }catch(Exception ex){
         ex.printStackTrace();
        }
        return lis;
    }
    
    public List<Cliente> lisCliente(){
        List<Cliente> lis=new ArrayList();
        Connection cn=MySQLConexion.getConexion();
        try{
            String sql="select id_cliente, tipoDoc, nombre, apellido, celular, correo from cliente";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Cliente c=new Cliente();
                c.setId_cliente(rs.getInt(1));                
                c.setTipoDoc(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setCelular(rs.getString(5));
                c.setCorreo(rs.getString(6));
                lis.add(c);
            }
        }catch(Exception ex){
         ex.printStackTrace();
        }
        return lis;
    }
    
    
    public List<Servicio_Adicional> lisServicioAdicional(){
        List<Servicio_Adicional> lis = new ArrayList();
        Connection cn =MySQLConexion.getConexion();
        try{
            String sql="select codServA, descripcion, precio from servicioadicional";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Servicio_Adicional sa=new Servicio_Adicional();
                sa.setCod_servA(rs.getString(1));                
                sa.setDescripcion(rs.getString(2));
                sa.setPrecio(rs.getDouble(3));
                lis.add(sa);
            }
        }catch(Exception ex){
         ex.printStackTrace();
        }
        return lis;
    }    
    
   public List<Habitacion> lisHabitacion(String id){
       List<Habitacion> lis=new ArrayList();
       Connection cn=MySQLConexion.getConexion();
       try{
           String sql="select codHabitacion, codCategoria, piso, id_empresa, estado from habitacion where codCategoria=?";
           //String sql="select nombreCat, categoria.codCategoria,codHabitacion, piso, id_empresa, estado from habitacion join categoria on habitacion.codCategoria=categoria.codCategoria";
           PreparedStatement st=cn.prepareStatement(sql);
           st.setString(1, id);
           ResultSet rs=st.executeQuery();
           while(rs.next()){
                Habitacion h=new Habitacion();
                h.setCodHabitacion(rs.getString(1));
                h.setCatcategoria(rs.getString(2));
                h.setPiso(rs.getString(3));
                h.setId_empresa(rs.getString(4));
                h.setEstado(rs.getString(5));
                lis.add(h);
            }
       }catch(Exception ex){
           ex.printStackTrace();
       }
       return lis;
   }
   
        public List<Consulta> lisConsulta(){
        List<Consulta> lis = new ArrayList();
        Connection cn =MySQLConexion.getConexion();
        try{
            String sql="select categoria.codCategoria, categoria.nombreCat, categoria.descripcion, categoria.precio, habitacion.codHabitacion, habitacion.piso , habitacion.estado from categoria JOIN habitacion ON habitacion.codCategoria=categoria.codCategoria WHERE habitacion.estado='DISPONIBLE'";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Consulta c=new Consulta();
                c.setCodCategoria(rs.getString(1));
                c.setNombreCategoria(rs.getString(2));
                c.setDescripcionCategoria(rs.getString(3));
                c.setPrecioCategoria(rs.getDouble(4));
                c.setCodHabitacion(rs.getString(5));
                c.setPiso(rs.getInt(6));
                c.setEstado(rs.getString(7));
                lis.add(c);
            }
        }catch(Exception ex){
         ex.printStackTrace();
        }
        return lis;
        }
    
    
   
   
   
}
