
package miServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;
import dao.reservaDAO;
import java.sql.Date;
    
public class svReserva extends HttpServlet {
    
    reservaDAO obj=new reservaDAO();
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {     
        int op=Integer.parseInt(request.getParameter("opc"));
        if(op==1)adicionCliente(request,response);
    }
    
    protected void adicionCliente(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        Cliente c=new Cliente();
            c.setTipoDoc(request.getParameter("documento"));
            c.setId_cliente(Integer.parseInt(request.getParameter("idcliente")));
            c.setNombre(request.getParameter("nombre"));
            c.setApellido(request.getParameter("apellido"));
            c.setCelular(request.getParameter("telefono"));
            c.setCorreo(request.getParameter("email"));   
            obj.agregarCliente(c);
        String pag="/pagListaClientes.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
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
