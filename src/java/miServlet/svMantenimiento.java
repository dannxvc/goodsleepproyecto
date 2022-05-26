
package miServlet;

import dao.mantenimientoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Habitacion;


public class svMantenimiento extends HttpServlet {
    
    mantenimientoDAO obj=new mantenimientoDAO();

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
        if(op==1)adicionHabitacion(request,response);
        if(op==2)eliminarHabitacion(request,response);
    }
    
    
    protected void adicionHabitacion(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        Habitacion h=new Habitacion();
           h.setCodHabitacion(request.getParameter("idhabitacion"));
           h.setCatcategoria(request.getParameter("idcategoria"));
           h.setPiso(request.getParameter("piso"));
           h.setId_empresa(request.getParameter("idempresa"));
           h.setEstado(request.getParameter("estadoh"));
            obj.agregarHabitacion(h);
        String pag="/pagHabitaciones.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
 }
    
    
    protected void eliminarHabitacion(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String nro=request.getParameter("cod");
        obj.eliminarHabitacion(nro);
        String pag="/pagHabitaciones.jsp";
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
