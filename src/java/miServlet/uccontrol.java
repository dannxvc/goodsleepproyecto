package miServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import modelo.*;
import util.*;
import java.util.*;
import javax.servlet.http.HttpSession;
public class uccontrol extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            String op=request.getParameter("op");
            if(op.equals("login")){
                String usu=request.getParameter("usuario");
                String pas=request.getParameter("password");
                try{
                    PreparedStatement psta=MySQLConexion.getConexion().prepareStatement("select * from "
                            + "usuariocliente where usuario=? and password=?");
                    psta.setString(1, usu);
                    psta.setString(2, pas);
                    ResultSet rs=psta.executeQuery();
                    
                    if(rs.next()){
                        System.out.println("reconocio usuario");
                        HttpSession sesionOk=request.getSession();
                        sesionOk.setAttribute("usuario", rs.getString(1).toString());
                        request.getRequestDispatcher("cliente/perfil.html").forward(request, response);
                    }else{
                          System.out.println("no reconocio usuario");
                        request.setAttribute("msq", "error de usuario o password");
                        request.getRequestDispatcher("login_cliente.jsp").forward(request, response);
                    }
                    
                }catch(Exception e){
                    System.out.println("Error: "+e);
                    
                }
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
