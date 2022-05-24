package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Consulta;
import java.util.List;
import modelo.Reservar_Habitacion;
import modelo.Habitacion;
import modelo.Cliente;
import modelo.Servicio_Adicional;
import modelo.Categoria;
import dao.listadoDAO;

public final class pagReservaAdmi2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/navAdmi.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/clienteAdmi.css\">\n");
      out.write("    <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"infoUsuario\">\n");
      out.write("                <img src=\"img/admi/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".svg\" alt=\"\">\n");
      out.write("                <p> Hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!</p>\n");
      out.write("            </div>\n");
      out.write("                <li><a href=\"#\"><span><i class=\"fa-regular fa-address-card\"></i></span> Registro</a></li>\n");
      out.write("                <li><a href=\"pagListaClientes.jsp\"><span><i class=\"fa-solid fa-user\"></i></span> Clientes</a></li>\n");
      out.write("                <li><a href=\"#\"><span><i class=\"fa-solid fa-bed\"></i></span> Lista Habitaciones</a></li>\n");
      out.write("                <li><a href=\"#\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span> Mantenimiento</a></li>\n");
      out.write("                <li><a href=\"uacontrol?accion=cerrar\"><span><i class=\"fa-solid fa-right-from-bracket\"></i></span> Cerrar sesion</a></li>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("        <main>\n");
      out.write("        <h2 class=\"text-center mt-5 text-black\">Registrar Reserva</h2>\n");
      out.write("        <form class=\"mt-5\" id=\"form\" action=\"\"> \n");
      out.write("            <div class=\"row g-3 p-5\">\n");
      out.write("                <input type=\"hidden\" name=\"opc\" value=\"1\">\n");
      out.write("              \n");
      out.write("                ");

                     listadoDAO obj=new listadoDAO();
                
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Datos del cliente :</label>\n");
      out.write("                    <select class=\"form-select\"  name=\"idcliente\" required>\n");
      out.write("                            <option disabled selected>Seleccione Huesped</option>\n");
      out.write("                            ");
 
                                for (Cliente x: obj.lisCliente()){
                                String nombre = x.getId_cliente()+ " - " + x.getNombre()+" "+x.getApellido();
                                out.print("<option value="+x.getId_cliente()+">"+nombre);
                             }  
                           
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Categoria de la habitacion :</label>\n");
      out.write("                    <select type=\"button\" class=\"form-select\" name=\"cbe\" data-bs-toggle=\"dropdown\"  id=\"categoria\">\n");
      out.write("                        <option class=\"dropdown-item\" disabled selected>Elegir</option>\n");
      out.write("                            ");
      
                                String code="";
                                if(request.getParameter("cbe")!=null)
                                code=request.getParameter("cbe");

                            for(Categoria x:obj.lisCategoria()){
                                    out.print("<option value="+x.getCodCategoria()+" data-precioh="+x.getPrecio()+" data-code="+x.getCodCategoria()+"  selected>"+x.getNombreCat());
                              }
                              
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>                    \n");
      out.write("                 \n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Habitacion :</label>\n");
      out.write("                    <select class=\"form-select\" data-bs-toggle=\"dropdown\" name=\"habitacion\" id=\"habitacion\">\n");
      out.write("                        <option disabled selected>Elegir habitacion</option>\n");
      out.write("                           ");

                               for(Consulta c:obj.lisConsulta()){
                                   String dato=c.getCodHabitacion()+" - "+c.getNombreCategoria();
                                   out.print("<option value="+c.getCodHabitacion()+">"+dato);
                               }                           
                           
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("               <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Servicio adicional :</label>\n");
      out.write("                    <select class=\"form-select\" name=\"servicioad\" id=\"servicio\" >\n");
      out.write("                        <option disabled selected>Elegir</option>\n");
      out.write("                        ");
                        
                             for(Servicio_Adicional x:obj.lisServicioAdicional()){
                                    out.print("<option value="+x.getCod_servA()+" data-precioServicio="+x.getPrecio()+" selected>"+x.getDescripcion());      
                              }
                         
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"npersonas\" class=\"form-label\">Numero de personas :</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"npersonas\" name=\"npersonas\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label class=\"form-label\">Checkin</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"fcheckin\" name=\"fcheckin\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label class=\"form-label\">Checkout</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"fcheckout\" name=\"fcheckout\">\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Subtotal</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\"\" name=\"subtotal\" id=\"subtotal\" readonly>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Precio Servicio Adicional :</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\"\" name=\"precio\" id=\"precioServicio\" readonly>   \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                 <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Precio Servicio Adicional :</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\"\" name=\"precio\" id=\"precioServicio\" readonly>   \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12 d-flex justify-content-center\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary col-md-2\">Registrar</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>               \n");
      out.write("    </main>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("          \n");
      out.write("          $(function(){\n");
      out.write("             \n");
      out.write("             $('#categoria').on('change',function() {\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 var dias = $('#ndias').val();\n");
      out.write("                    \n");
      out.write("                    let codcategoria =$(this).find(':selected').attr('data-code');\n");
      out.write("                    let precio = $(this).find(':selected').attr('data-precioh');\n");
      out.write("                    $('#subtotal').val(precio);\n");
      out.write("             });\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             $('#servicio').on('change',function() {\n");
      out.write("                 \n");
      out.write("                 let precioServicio= $(this).find(':selected').attr('data-precioServicio');\n");
      out.write("                 $('#precioServicio').val(precioServicio);\n");
      out.write("             })\n");
      out.write("             \n");
      out.write("             $('#fcheckin').on('change',function() {\n");
      out.write("                $('#fcheckout').val('');\n");
      out.write("                $('#ndias').val('');\n");
      out.write("                $('#monto').val('');\n");
      out.write("             });\n");
      out.write("             \n");
      out.write("             $('#fcheckin').blur(function() {\n");
      out.write("                $('#fcheckout').attr('min',$(this).val());\n");
      out.write("             });\n");
      out.write("             \n");
      out.write("             $('#fcheckout').on('change',function() {\n");
      out.write("                 if($('#idHabitacion').val() === null) {\n");
      out.write("                     alert('Seleccione una Habitacion');\n");
      out.write("                     $('#fcheckout').val('');\n");
      out.write("                     return false;\n");
      out.write("                 }\n");
      out.write("                 let firstDate = $('#fcheckin').val();\n");
      out.write("                 let secondDate = $('#fcheckout').val();\n");
      out.write("                 let dias = diasEntreFechas(firstDate,secondDate) + 1;\n");
      out.write("                \n");
      out.write("                //calculo total\n");
      out.write("                if(dias > 0) {\n");
      out.write("                    $('#ndias').val(dias);\n");
      out.write("                    let precio = $('#idHabitacion').find(':selected').attr('data-precioh');\n");
      out.write("                    let total = parseInt(dias) * parseFloat(precio);\n");
      out.write("                    $('#monto').val(total);\n");
      out.write("                }   \n");
      out.write("             });\n");
      out.write("             \n");
      out.write("          });\n");
      out.write("      </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
