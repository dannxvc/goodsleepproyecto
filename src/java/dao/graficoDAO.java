package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.FacturaPorMes;
import util.MySQLConexion;

public class graficoDAO {
   public List<FacturaPorMes> lisFacPorMes(){
        List<FacturaPorMes> lis = new ArrayList();
        Connection cn =MySQLConexion.getConexion();
        try{
            //cant de facturas segun el anio
            String sql="select month(fechaInicio) as mes, count(*) as cantidad FROM reservahabitacion GROUP by mes;";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                FacturaPorMes p=new FacturaPorMes();
                p.setMes(rs.getInt(1));                
                p.setCantidad(rs.getInt(2));
                lis.add(p);
            }
        }catch(Exception ex){
         ex.printStackTrace();
        }
        return lis;
    }

}
