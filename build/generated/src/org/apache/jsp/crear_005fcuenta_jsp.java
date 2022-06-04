package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;
import dao.crearCuentaDAO;

public final class crear_005fcuenta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"icon\" href=\"/img/logo.png\" type=\"image/png\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-theme.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrapValidator.css\">\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrapValidator.js\"></script>\r\n");
      out.write("    <title>Good Sleep | Crear Cuenta</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"pink\">\r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <a href=\"login_cliente.jsp\" class=\"btn btn-login\">\r\n");
      out.write("           <img class=\"login-icon\"src=\"img/profile.svg\" alt=\"log in\">\r\n");
      out.write("           LOG IN\r\n");
      out.write("        </a>\r\n");
      out.write("        <h1>crear cuenta</h1>\r\n");
      out.write("    </header>\r\n");
      out.write("    <nav id=\"navbar\">\r\n");
      out.write("        <a href=\"login_cliente.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon icon-active\" src=\"img/flecha.svg\" alt=\"go back\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <main id=\"crear-cuenta\">\r\n");
      out.write("        <section class=\"section-form\">\r\n");
      out.write("            <form id=\"id_form\" class=\"form form-crear-cuenta\" action=\"cccontrol\">\r\n");
      out.write("                <p>Registra tus datos</p>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" placeholder=\"Nombre\" name=\"nombre\" required>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" placeholder=\"Apellido\" name=\"apellido\" required>\r\n");
      out.write("                <select class=\"input input-gray\" name=\"tipoDoc\" id=\"tipoDoc\" required>\r\n");
      out.write("                    <option disabled selected value>Tipo de Documento</option>\r\n");
      out.write("                    <option value=\"DNI\">DNI</option>\r\n");
      out.write("                    <option value=\"Pasaporte\">Pasaporte</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" placeholder=\"Nro Documento\" name=\"id_cliente\" required>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"tel\" placeholder=\"Celular\" name=\"celular\" required>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"email\" placeholder=\"Correo\" name=\"correo\" required>\r\n");
      out.write("                <p>Usuario & Contraseña</p>\r\n");
      out.write("                <input class=\"input input-pink-dark\" type=\"text\" placeholder=\"Usuario\" name=\"usuario\" required>\r\n");
      out.write("                <input class=\"input input-pink-dark\" type=\"password\" placeholder=\"Password\" name=\"password\" required>\r\n");
      out.write("                <input type=\"submit\" class=\"btn btn-white\" value=\"CREAR CUENTA\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("    </main>\r\n");
      out.write("  \r\n");
      out.write("</body>  <script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    $('#id_form').bootstrapValidator({\r\n");
      out.write("        message: 'This value is not valid',\r\n");
      out.write("        feedbackIcons: {\r\n");
      out.write("            valid: 'glyphicon glyphicon-ok',\r\n");
      out.write("            invalid: 'glyphicon glyphicon-remove',\r\n");
      out.write("            validating: 'glyphicon glyphicon-refresh'\r\n");
      out.write("        },\r\n");
      out.write("        fields: {\r\n");
      out.write("        \tnombre: {\r\n");
      out.write("                validators: {\r\n");
      out.write("                    notEmpty: {\r\n");
      out.write("                        message: 'El nombre es un campo obligatorio'\r\n");
      out.write("                    },\r\n");
      out.write("              regexp:{\r\n");
      out.write("            \t  regexp: /^[A-Za-z ñÑ]+$/,\r\n");
      out.write("            \t message: 'Solo letras o espacios'\r\n");
      out.write("            \t  \r\n");
      out.write("                  }\r\n");
      out.write("                }//validators\r\n");
      out.write("            }, \r\n");
      out.write("        \tapellido: {\r\n");
      out.write("                validators: {\r\n");
      out.write("                    notEmpty: {\r\n");
      out.write("                        message: 'El apellido es un campo obligatorio'\r\n");
      out.write("                    },\r\n");
      out.write("                 regexp:{\r\n");
      out.write("            \t  regexp: /^[A-Za-z ñÑ]+$/,\r\n");
      out.write("            \t message: 'Solo letras o espacios'\r\n");
      out.write("            \t  \r\n");
      out.write("                  } \r\n");
      out.write("                }//validatos\r\n");
      out.write("            },\r\n");
      out.write("        \tedad: {\r\n");
      out.write("                validators: {\r\n");
      out.write("                    notEmpty: {\r\n");
      out.write("                        message: 'La edad es un campo obligatorio'\r\n");
      out.write("                    },\r\n");
      out.write("\t\t            lessThan: {\r\n");
      out.write("\t\t                value: 45,\r\n");
      out.write("\t\t                inclusive: true,\r\n");
      out.write("\t\t                message: 'La edad es menor a 45'\r\n");
      out.write("\t\t            },\r\n");
      out.write("\t\t            greaterThan: {\r\n");
      out.write("\t\t                value: 18,\r\n");
      out.write("\t\t                inclusive: true,\r\n");
      out.write("\t\t                message: 'La edad es mayor a 18'\r\n");
      out.write("\t\t            }\r\n");
      out.write("                }\r\n");
      out.write("            },            \r\n");
      out.write("        }   \r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // Validate the form manually\r\n");
      out.write("    $('#validateBtn').click(function() {\r\n");
      out.write("        $('#id_form').bootstrapValidator('validate');\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
