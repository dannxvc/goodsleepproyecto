package dao;
import util.MySQLConexion;
import java.sql.*;
import modelo.usuarioCliente;
import modelo.Cliente;


public class usuarioClienteDAO extends MySQLConexion{
    public usuarioCliente identificar(usuarioCliente user) throws Exception{
        usuarioCliente usu=null;
        MySQLConexion con;
        Connection cn=null;
        Statement st=null;
        ResultSet rs=null;
        /*String sql="select usuario,password,id_cliente from usuariocliente where usuario='"+user.getUsuario()+"' and password='"+user.getPassword()+"'";
      */
        
        String sql="select u.usuario,u.password,u.id_cliente,c.nombre, c.tipoDoc, c.apellido, c.celular, c.correo"
                + " from usuariocliente u inner join cliente c on u.id_cliente=c.id_cliente "
                + "where u.usuario='"+user.getUsuario()+"'"
                + "and u.password='"+user.getPassword()+"'";
        con=new MySQLConexion();
        try{
            cn=con.getConexion();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next() == true){
                usu=new usuarioCliente();
                usu.setUsuario(user.getUsuario()); 
                usu.setPassword(user.getPassword());
               // cli.setNombre(rs.getString("nombre"));
                usu.setId_cliente(new Cliente());
              usu.getId_cliente().setNombre(rs.getString("nombre"));              
             usu.getId_cliente().setId_cliente(rs.getInt("id_cliente"));             
             usu.getId_cliente().setTipoDoc(rs.getString("tipoDoc"));
             usu.getId_cliente().setApellido(rs.getString("apellido"));          
             usu.getId_cliente().setCelular(rs.getString("celular"));          
             usu.getId_cliente().setCorreo(rs.getString("correo"));     
             

            }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }finally{
           if (rs !=null && rs.isClosed() == false){
                rs.close();
            }
            rs = null;
            if(st!= null && st.isClosed() == false){
                st.close();
                
            }
            st = null;
            if(cn != null & cn.isClosed() == false){
                cn.close();
                
            }
            cn = null;
        }
        return usu;
    }
}
