package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.*;

import util.MySQLConexion;

public class crearCuentaDAO {
    
    public void crearCuenta(Cliente c, usuarioCliente u){
        Connection cn =MySQLConexion.getConexion();
        try {
            String sql="insert into cliente(id_cliente,tipoDoc,nombre,apellido, celular,correo) values(?,?,?,?,?,?)";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setInt(1, c.getId_cliente());
            st.setString(2, c.getTipoDoc());
            st.setString(3, c.getNombre());
            st.setString(4, c.getApellido());
            st.setString(5, c.getCelular());
            st.setString(6, c.getCorreo());
            String sql2="insert into usuariocliente (usuario,password,id_cliente) values(?,?,?)";
            PreparedStatement st2=cn.prepareStatement(sql2);
            st2.setString(1, u.getUsuario());
            st2.setString(2, u.getPassword());
            st2.setInt(3, c.getId_cliente());
            st.executeUpdate();
            st2.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
