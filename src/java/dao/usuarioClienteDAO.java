package dao;
import util.MySQLConexion;
import java.sql.*;
import modelo.Cliente;
import modelo.usuarioCliente;

public class usuarioClienteDAO extends MySQLConexion{
    public usuarioCliente identificar(usuarioCliente user) throws Exception{
        usuarioCliente usu=null;
        MySQLConexion con;
        Connection cn=null;
        Statement st=null;
        ResultSet rs=null;
        String sql="select usuario,password,id_cliente from usuariocliente where usuario='"+user.getUsuario()+"' and password='"+user.getPassword()+"'";
        /* String sql="select u.ussuario,u.password,a.nombre"
                + " from usuarioadmi u inner join admi a on u.id_admi=a.id_admi "
                + "where u.usuario='"+user.getUsuario()+"'"
                + "and u.password='"+user.getPassword()+"'";*/
        con=new MySQLConexion();
        try{
            cn=con.getConexion();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next() == true){
                usu=new usuarioCliente();
                usu.setId_cliente(rs.getInt("id_cliente"));
                usu.setUsuario(user.getUsuario()); 
                usu.setPassword(user.getPassword());
              //  cli =new Cliente();
               // cli.setNombre(rs.getString("nombre"));
                //usu.setId_cliente(new Cliente());
              //  usu.getId_cliente().setNombre(rs.getString("nombre"));
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
