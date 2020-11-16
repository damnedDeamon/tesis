package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Raza;
import model.TipoMascota;
import model.dao.DAO_TipoMascota;
import model.dao.DAO_Raza;

public final class registrarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:400,900\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"form__top\">\n");
      out.write("                <h2>Formulario <span>Registro</span></h2>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <form class=\"form__reg\" action=\"crearCliente.do\" method=\"POST\">\n");
      out.write("                <input class=\"input\" name=\"txtNombre\" id=\"nombre\" type=\"text\" placeholder=\"&#128100;  Nombre\" required autofocus>\n");
      out.write("                <input class=\"input\" name=\"txtGmail\" id=\"gmail\" type=\"email\" placeholder=\"&#9993;  Gmail\" required>\n");
      out.write("                <input class=\"input\" name=\"txtTelefono\" id=\"telefono\" type=\"text\" placeholder=\"&#128222;  Telefono\" required>\n");
      out.write("                <input class=\"input\" name=\"txtDireccion\" id=\"direc\" type=\"text\" placeholder=\"&#8962;  Dirección\" required>\n");
      out.write("                <input class=\"input\" name=\"txtRut\" id=\"rut\" type=\"text\" placeholder=\"&#8962;  Rut\" required>\n");
      out.write("                <input class=\"input\" name=\"txtCantidad\" id=\"cantidad\" type=\"text\" placeholder=\"&#8962;  Cantidad de animales\" required>\n");
      out.write("                <div class=\"btn__form\">\n");
      out.write("                    <input class=\"btn__submit\" type=\"submit\" value=\"REGISTRAR\">\n");
      out.write("                    <input class=\"btn__reset\" type=\"reset\" value=\"LIMPIAR\">\t\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
