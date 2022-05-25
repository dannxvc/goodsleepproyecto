package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Cliente;
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
        while(rs.next()){//leer cada fila de la tabla
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
}
