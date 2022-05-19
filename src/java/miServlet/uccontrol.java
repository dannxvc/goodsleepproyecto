package miServlet;

import dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.usuarioCliente;

@WebServlet(name="uccontrol",urlPatterns={"/uccontrol"})
public class uccontrol extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            String accion = request.getParameter("accion");
            try{
                if(accion != null){
                    switch(accion){
                        case "verificar":
                            verificar(request,response);
                            break;
                        case "cerrar":
                            cerrarsesion(request,response);
                        default:
                            response.sendRedirect("login_cliente.jsp");
                    }
                }else{
                    response.sendRedirect("login_cliente.jsp");
                }
            }catch(Exception e){
                try{
                    this.getServletConfig().getServletContext().getRequestDispatcher("/mensaje.jsp").forward(request, response);
                }catch(Exception ex){
                        System.out.println("Error"+e.getMessage());
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
    
    private void verificar(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession sesion;
        usuarioClienteDAO dao;
        usuarioCliente usuarioC;
        usuarioC = this.obtenerUsuario(request);
        dao = new usuarioClienteDAO();
        usuarioC = dao.identificar(usuarioC);
        if(usuarioC!=null){
            sesion = request.getSession();
            sesion.setAttribute("usuarioC", usuarioC);
            request.setAttribute("msje", "Bienvenido/a al sistema");
            this.getServletConfig().getServletContext().getRequestDispatcher("/perfil.jsp").forward(request, response);
        }else{
            request.setAttribute("msje", "Usuario o password incorrecto");
            request.getRequestDispatcher("login_cliente.jsp").forward(request, response);
        }
    }

    private void cerrarsesion(HttpServletRequest request, HttpServletResponse response) throws Exception{
          HttpSession sesion = request.getSession();
        sesion.setAttribute("usuarioC", null);
        sesion.invalidate();
        response.sendRedirect("login_cliente.jsp");

    }

    private usuarioCliente obtenerUsuario(HttpServletRequest request) throws Exception{
        usuarioCliente u = new usuarioCliente();
        u.setUsuario(request.getParameter("usuario"));
        u.setPassword(request.getParameter("password"));
        return u;
    }
    

}
