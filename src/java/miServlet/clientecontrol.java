package miServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;
import dao.clienteCuentaDAO;
public class clientecontrol extends HttpServlet {

   clienteCuentaDAO obj=new clienteCuentaDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int op=Integer.parseInt(request.getParameter("opc"));
        if(op==1)busca(request,response);        
        if(op==2)editaPerfil(request,response);

            
    }
    
    protected void busca(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String cod=request.getParameter("cod");
      //almacenar temporalmente la lista de alumnos y llamar a la pagAlumno
      request.setAttribute("dato", obj.BusCliente(cod));
      String pag="/editarPerfil.jsp";
      request.getRequestDispatcher(pag).forward(request, response);
        
    }
    
    protected void editaPerfil(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente a=new Cliente();
      //  usuarioCliente u=new usuarioCliente();
        a.setId_cliente(Integer.parseInt(request.getParameter("id_cliente")));        
        a.setTipoDoc(request.getParameter("tipoDoc"));        
        a.setNombre(request.getParameter("nombre"));
        a.setApellido(request.getParameter("apellido"));        
        a.setCelular(request.getParameter("celular")); 
        a.setCorreo(request.getParameter("correo"));     
    //  u.setId_cliente(Integer.parseInt(request.getParameter("id_cliente"))); 
    //    u.setUsuario(request.getParameter("usuario"));        
    //    u.setPassword(request.getParameter("password"));
       obj.editaPerfil(a);
      String pag="/login_cliente.jsp";
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
