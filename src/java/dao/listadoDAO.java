
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
                c.setPrecio(rs.getString(4));
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
                sa.setPrecio(rs.getString(3));
                lis.add(sa);
            }
        }catch(Exception ex){
         ex.printStackTrace();
        }
        return lis;
    }    
}
