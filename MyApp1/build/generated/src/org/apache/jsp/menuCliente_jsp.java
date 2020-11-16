package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ClienteAndMascota;
import model.dao.DAO_Cliente;
import model.Cliente;
import model.Cliente;
import model.Veterinario;

public final class menuCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/validar.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

Cliente c = (Cliente)session.getAttribute("cliente");
Veterinario v = (Veterinario)session.getAttribute("veterinario");
if(c == null){
    // no he iniciado sesión
    if(v == null){
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/barraMenu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/prueba.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"cuerpoDetalle\">\n");
      out.write("        <header>\n");
      out.write("            <section>\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\"><i class=\"home\"></i>Home</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"Contacto\"></i>Contacto</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"informacion\"></i>informacion</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fotos\"></i>fotos</a></li>\n");
      out.write("                        <li><a href=\"index.jsp\"><i class=\"cerrar-sesion\"></i>cerrar sesion</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </section>\n");
      out.write("        </header>\n");
      out.write("        <h1>Menu Paciente</h1>\n");
      out.write("\n");
      out.write("        <h3>Bienvenid@ ");
      out.print( c.getNombre());
      out.write("</h3>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Nombre Mascota</th>\n");
      out.write("                        <th>Fecha de nacimiento</th>\n");
      out.write("                        <th>Edad</th>\n");
      out.write("                        <th>Peso</th>\n");
      out.write("                        <th>Mascota</th>\n");
      out.write("                        <th>Raza</th>\n");
      out.write("                        <th>Atencion</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                     ");
DAO_Cliente dc = new DAO_Cliente();
                          for (ClienteAndMascota cm : dc.readMascotaCliente(c.getId())) {
      out.write(" \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( cm.getNombreMascota());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( cm.getFechaNacimiento());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( cm.getEdad());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( cm.getPeso());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( cm.getTipoMascota());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( cm.getRaza());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <form action=\"detalleMascotaCliente.jsp\" method=\"post\">\n");
      out.write("                                <input type=\"hidden\" name=\"idMascota\" value=\"");
      out.print( cm.getId());
      out.write("\"/>\n");
      out.write("                                <input type=\"submit\" class=\"button button5\" value=\"Ver detalles\">\n");
      out.write("                                \n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
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
