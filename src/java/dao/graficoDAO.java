package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.CantPorEstado;
import util.MySQLConexion;

public class graficoDAO {
    public List<CantPorEstado> lisCantPorEstado(){
       List<CantPorEstado> lis=new ArrayList();
       Connection cn=MySQLConexion.getConexion();
       try{
           String sql="select estado, count(*) as cantidad from habitacion GROUP BY estado;";
            //String sql="select nombreCat, categoria.codCategoria,codHabitacion, piso, id_empresa, estado from habitacion join categoria on habitacion.codCategoria=categoria.codCategoria";
           PreparedStatement st=cn.prepareStatement(sql);
           ResultSet rs=st.executeQuery();
           while(rs.next()){
                CantPorEstado h=new CantPorEstado();
                h.setEstado(rs.getString(1));
                h.setCant(rs.getInt(2));
                lis.add(h);
            }
       }catch(Exception ex){
           ex.printStackTrace();
       }
       return lis;
   }
}
