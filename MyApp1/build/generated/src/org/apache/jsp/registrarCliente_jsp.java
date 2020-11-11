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
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css\" />\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.9.1.js\"></script>\n");
      out.write("        <script src=\"http://code.jquery.com/ui/1.10.1/jquery-ui.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#fecha\").datepicker();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $.datepicker.regional['es'] = {\n");
      out.write("                closeText: 'Cerrar',\n");
      out.write("                prevText: '< Ant',\n");
      out.write("                nextText: 'Sig >',\n");
      out.write("                currentText: 'Hoy',\n");
      out.write("                monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],\n");
      out.write("                monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],\n");
      out.write("                dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],\n");
      out.write("                dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mié', 'Juv', 'Vie', 'Sáb'],\n");
      out.write("                dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá'],\n");
      out.write("                weekHeader: 'Sm',\n");
      out.write("                dateFormat: 'yy-mm-dd',\n");
      out.write("                firstDay: 1,\n");
      out.write("                isRTL: false,\n");
      out.write("                showMonthAfterYear: false,\n");
      out.write("                yearSuffix: ''\n");
      out.write("            };\n");
      out.write("            $.datepicker.setDefaults($.datepicker.regional['es']);\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#fecha\").datepicker();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"form__top\">\n");
      out.write("                <h2>Formulario <span>Registro</span></h2>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");

                System.out.println(request.getAttribute("id"));
                
                if (request.getAttribute("id") == null) {
            
      out.write("\n");
      out.write("            <form class=\"form__reg\" action=\"crearCliente.do\" method=\"POST\">\n");
      out.write("                <input class=\"input\" name=\"txtNombre\" id=\"nombre\" type=\"text\" placeholder=\"&#128100;  Nombre\" required autofocus>\n");
      out.write("                <input class=\"input\" name=\"txtGmail\" id=\"gmail\" type=\"email\" placeholder=\"&#9993;  Gmail\" required>\n");
      out.write("                <input class=\"input\" name=\"txtTelefono\" id=\"telefono\" type=\"text\" placeholder=\"&#128222;  Telefono\" required>\n");
      out.write("                <input class=\"input\" name=\"txtDireccion\" id=\"direc\" type=\"text\" placeholder=\"&#8962;  Dirección\" required>\n");
      out.write("                <input class=\"input\" name=\"txtRut\" id=\"rut\" type=\"text\" placeholder=\"&#8962;  Rut\" required>\n");
      out.write("                <input class=\"input\" name=\"txtCantidad\" id=\"cantidad\" type=\"text\" placeholder=\"&#8962;  Cantidad de animales\" required>\n");
      out.write("                <div class=\"btn__form\">\n");
      out.write("                    <input class=\"btn__submit\" type=\"submit\" value=\"REGISTRAR\" onchange=\"registrarCliente()\">\n");
      out.write("                    <input class=\"btn__reset\" type=\"reset\" value=\"LIMPIAR\">\t\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            ");
} else {

            
      out.write("\n");
      out.write("            <form class=\"form__reg\" action=\"crearCliente.do\" method=\"POST\">\n");
      out.write("                <input class=\"input\" name=\"txtNombre\" id=\"nombre\" type=\"text\" placeholder=\"&#128100;  Nombre Mascota\" required autofocus>\n");
      out.write("                <input class=\"input\" name=\"txtGmail\" id=\"gmail\" type=\"text\" placeholder=\"&#9993;  Fecha de nacimiento\" required>\n");
      out.write("                <input class=\"input\" name=\"txtTelefono\" id=\"telefono\" type=\"text\" placeholder=\"&#128222;  Edad\" required>\n");
      out.write("                <input class=\"input\" name=\"txtDireccion\" id=\"direc\" type=\"text\" placeholder=\"&#8962;  Peso\" required>\n");
      out.write("                <select name=\"selectSexo\">\n");
      out.write("                    <option id=\"cboSexo\" name=\"cboSexo\" value=\"1\">Macho</option> \n");
      out.write("                    <option id=\"cboSexo\" name=\"cboSexo\" value=\"2\">Hembra</option>\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <script>\n");
      out.write("\n");
      out.write("                    $(document).ready(function () {\n");
      out.write("                        buscar();\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    function buscar() {\n");
      out.write("                        var idMascota = $(\"#tipoMascota\").val();\n");
      out.write("\n");
      out.write("                        $.ajax({\n");
      out.write("                            type: 'POST',\n");
      out.write("                            url: 'http://localhost:8090/MyApp1/buscarRaza.do',\n");
      out.write("                            data: {\n");
      out.write("                                tipoMascota: idMascota\n");
      out.write("                            }\n");
      out.write("                        }).done(function (resultadoHtml) {\n");
      out.write("                            $(\"#divMascota\").html(resultadoHtml);\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("                <select id=\"tipoMascota\" name=\"tipoMascota\" onchange=\"buscar()\"> \n");
      out.write("                    ");
                                DAO_TipoMascota dt = new DAO_TipoMascota();

                        for (TipoMascota tm : dt.read()) {
                            out.print("<option value='" + tm.getId() + "'>" + tm.getTipoMascota() + "</option>");
                        }

                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <div id=\"divMascota\" > <!-- Se va a cargar con ajax -->\n");
      out.write("                    <select></select>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"btn__form\">\n");
      out.write("                    <input class=\"btn__submit\" type=\"submit\" value=\"REGISTRAR\" onchange=\"registrarCliente()\">\n");
      out.write("                    <input class=\"btn__reset\" type=\"reset\" value=\"LIMPIAR\">\t\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            ");
}
      out.write("\n");
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
