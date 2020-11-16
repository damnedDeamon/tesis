package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.TipoMascota;
import model.dao.DAO_TipoMascota;

public final class registrarMascota_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"form__top\">\n");
      out.write("                <h2>Formulario <span>Registro</span></h2>\n");
      out.write("            </div>\n");
      out.write("            ");

            request.getSession().getAttribute("cantidadMascota");
            
      out.write("\n");
      out.write("\n");
      out.write("            <form id=\"formulario\" class=\"form__reg\" action=\"#\" method=\"POST\">\n");
      out.write("\n");
      out.write("                <input class=\"input\" name=\"txtNombreMascota\" id=\"nombre\" type=\"text\" placeholder=\"Nombre\" required autofocus>\n");
      out.write("                <input class=\"input\" name=\"txtFecha\" id=\"fecha\" type=\"text\" placeholder=\"Fecha\" required>\n");
      out.write("                <input class=\"input\" name=\"txtPeso\" id=\"peso\" type=\"text\" placeholder=\"Peso\" required>\n");
      out.write("                <label class=\"input-radioMacho\"><input class=\"input\" name=\"txtSexo\" value=\"Macho\" id=\"sexo\" type=\"radio\" checked> Macho\n");
      out.write("                <input class=\"input-radioHembra\" name=\"txtSexo\" value=\"Hembra\" id=\"sexo\" type=\"radio\"> Hembra</label>\n");
      out.write("                <input class=\"input\" name=\"txtEdad\" id=\"edad\" type=\"text\" placeholder=\"Edad\" required>\n");
      out.write("                <script>\n");
      out.write("\n");
      out.write("                        $(document).ready(function () {\n");
      out.write("                            buscar();\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        function buscar() {\n");
      out.write("                            var idMascota = $(\"#tipoMascota\").val();\n");
      out.write("\n");
      out.write("                            $.ajax({\n");
      out.write("                                type: 'POST',\n");
      out.write("                                url: 'http://localhost:8090/MyApp1/buscarRaza.do',\n");
      out.write("                                data: {\n");
      out.write("                                    tipoMascota: idMascota\n");
      out.write("                                }\n");
      out.write("                            }).done(function (resultadoHtml) {\n");
      out.write("                                $(\"#divMascota\").html(resultadoHtml);\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("                        var i = 0;\n");
      out.write("                        function enviarInfo() {\n");
      out.write("                            \n");
      out.write("                            i = i + 1;\n");
      out.write("                        var btn = document.getElementById(\"boton\");\n");
      out.write("                        btn.value = \"Presiona Aqui (\" + i + \")\";\n");
      out.write("\n");
      out.write("                        if (i == 1) {\n");
      out.write("                            document.getElementById('boton').disabled = true;\n");
      out.write("                        }\n");
      out.write("                            var idCliente = ");
request.getSession().getAttribute("idCliente");
      out.write(" ;\n");
      out.write("                            var nombre = $(\"#nombre\").val();\n");
      out.write("                            var fecha = $(\"#fecha\").val();\n");
      out.write("                            var peso = $(\"#peso\").val();\n");
      out.write("                            var sexo = $(\"#sexo\").val();\n");
      out.write("                            var edad = $(\"#edad\").val();\n");
      out.write("                            var tipoMascota = $(\"#tipoMascota\").val();\n");
      out.write("                            var tipoRaza = $(\"#tipoRaza\").val();\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        $.ajax({\n");
      out.write("                            type: 'POST',\n");
      out.write("                            url: 'http://localhost:8090/MyApp1/crearMascota.do',\n");
      out.write("                            data: {nombre: nombre, fecha: fecha, peso: peso, sexo: sexo, edad: edad, tipoMascota: tipoMascota, tipoRaza: tipoRaza, idCliente:idCliente }\n");
      out.write("\n");
      out.write("                        });\n");
      out.write("                        document.getElementById(\"formulario\").reset();\n");
      out.write("                    }\n");
      out.write("                    ;\n");
      out.write("                    </script>\n");
      out.write("                    \n");
      out.write("                    <select id=\"tipoMascota\" class=\"select-css\" name=\"tipoMascota\" onchange=\"buscar()\"> \n");
      out.write("                            ");

                                DAO_TipoMascota dt = new DAO_TipoMascota();

                                for (TipoMascota tm : dt.read()) {
                                    out.print("<option value='" + tm.getId() + "'>" + tm.getTipoMascota() + "</option>");
                                }

                            
      out.write("\n");
      out.write("                        </select></td>\n");
      out.write("                    <td><div id=\"divMascota\" > <!-- Se va a cargar con ajax -->\n");
      out.write("                            <select></select>\n");
      out.write("                        </div> \n");
      out.write("                <div class=\"btn__form\">\n");
      out.write("                    <input class=\"btn__submit\" type=\"button\" id=\"boton\" value=\"REGISTRAR\" onclick=\"enviarInfo()\">\n");
      out.write("                    <input class=\"btn__reset\" type=\"reset\" value=\"LIMPIAR\">\t\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("                        \n");
      out.write("                        \n");
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
