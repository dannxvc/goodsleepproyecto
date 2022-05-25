
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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {     
        int op=Integer.parseInt(request.getParameter("opc"));
        if(op==1)adicionCliente(request,response);
        if(op==2)eliminarCliente(request,response);
        if(op==3)consultaCliente(request,response);
        if(op==4)modificarCliente(request,response);
        if(op==5)Reserva(request,response);
        if(op==6)eliminarReserva(request,response);
    }
    
     protected void Reserva(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        Reservar_Habitacion rev=new Reservar_Habitacion();
        Habitacion h=new Habitacion();
            rev.setId_cliente(Integer.parseInt(request.getParameter("idcliente")));
            rev.setFechaInicio(Date.valueOf(request.getParameter("fcheckin")));
            rev.setFechaFinal(Date.valueOf(request.getParameter("fcheckout")));
            rev.setCodHabita(request.getParameter("habitacion"));
            rev.setSubtotal(Double.parseDouble(request.getParameter("subtotal")));
            rev.setCod_servA(request.getParameter("servicioad"));
            rev.setCant_personas(Integer.parseInt(request.getParameter("npersonas")));
            rev.setPrecioTotal(Double.parseDouble(request.getParameter("monto")));
            rev.setEstado(request.getParameter("estadoh"));
            h.setEstado(request.getParameter("codupdateh"));
            h.setCodHabitacion(request.getParameter("updateh"));
           obj.reservaHabitacion(rev,h);
            String pag="/pagListaReservas.jsp";
            request.getRequestDispatcher(pag).forward(request, response);
 }
     protected void eliminarReserva(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String nro1=request.getParameter("cod");
        String nro2=request.getParameter("cod2");
        obj.eliminarReserva(nro1, nro2);
        String pag="/pagListaReservas.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
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
    
    
    protected void eliminarCliente(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        int nro=Integer.parseInt(request.getParameter("cod"));
        obj.eliminarCliente(nro);
        String pag="/pagListaClientes.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
 }
    
    
    protected void consultaCliente(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        int nro=Integer.parseInt(request.getParameter("cod"));
        Cliente c=obj.consultaCliente(nro);
        request.setAttribute("dato", c);
        String pag="/pagEditarCliente.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
 }
    
    protected void modificarCliente(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        Cliente c=new Cliente();
            c.setId_cliente(Integer.parseInt(request.getParameter("idcliente")));
            c.setTipoDoc(request.getParameter("documento"));
            c.setNombre(request.getParameter("nombre"));
            c.setApellido(request.getParameter("apellido"));
            c.setCelular(request.getParameter("telefono"));
            c.setCorreo(request.getParameter("email"));
            obj.editarCliente(c);
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
