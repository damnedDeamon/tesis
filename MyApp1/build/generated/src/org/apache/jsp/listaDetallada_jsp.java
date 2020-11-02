package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dao.DAO_Cliente;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.sql.Date;
import model.Atencion;
import model.dao.DAO_Atencion;
import model.dao.DAO_Veterinario;
import model.Veterinario;
import model.DetalleAnimal;
import model.Cliente;
import model.Veterinario;

public final class listaDetallada_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/fecha.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, minium-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link href = \"https://fonts.googleapis.com/css2? family = Oswald: wght @ 700 & display = swap\" rel = \"stylesheet\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <h1>Horarios del paciente</h1>\n");
      out.write("\n");
      out.write("        Bienvenid@ ");
      out.print( v.getNombre());
      out.write("\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            table, th, td {\n");
      out.write("                border: 1px solid black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td, th {\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            th {\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("        </style> \n");
      out.write("        <table  style=\"width: 80%\">\n");
      out.write("            <tr>\n");
      out.write("                <th height=\"20px\" width=\"100px\">\n");
      out.write("                    Veterinario\n");
      out.write("                </th>\n");
      out.write("                <th height=\"20px\" width=\"125px\">\n");
      out.write("                    Nombre Mascota\n");
      out.write("                </th>\n");
      out.write("                <th height=\"20px\" width=\"100px\">\n");
      out.write("                    Tipo de atencion\n");
      out.write("                </th>\n");
      out.write("                <th height=\"20px\" width=\"100px\">\n");
      out.write("                    Resumen\n");
      out.write("                </th>\n");
      out.write("                <th height=\"20px\" width=\"100px\">\n");
      out.write("                    Fecha de Atencion\n");
      out.write("                </th>\n");
      out.write("                <th height=\"20px\" width=\"100px\">\n");
      out.write("                    Modificar Atencion\n");
      out.write("                </th>\n");
      out.write("                <th height=\"20px\" width=\"50px\">\n");
      out.write("                    Estado\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        ");

            int id;
            id = Integer.parseInt(request.getParameter("idMascota"));
            DAO_Atencion da = new DAO_Atencion();
        
      out.write("\n");
      out.write("        ");
for (Atencion a : da.readIdMascota(id)) {


        
      out.write("\n");
      out.write("        <table style=\"width: 80%\">\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"20px\" width=\"100px\">");
      out.print(a.getVeterinarioAFK());
      out.write("</td>\n");
      out.write("                <td height=\"20px\" width=\"125px\">");
      out.print(a.getMascotaAFK());
      out.write("</td>\n");
      out.write("                <td height=\"20px\" width=\"100px\">");
      out.print(a.getTipoAtencionAFK());
      out.write("</td>\n");
      out.write("                <td height=\"20px\" width=\"100px\">");
      out.print(a.getResumen());
      out.write("</td>\n");
      out.write("                ");

                    String fecha = a.getFechaHora();
                    int cantidad = 5;
                    /* Total de elementos a Eliminar*/
 /* Total de elementos a Mostrar*/
                    int m = Math.max(0, fecha.length() - cantidad);
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    Calendar calendario = new GregorianCalendar();

                    LocalDate fechaActual = LocalDate.now();

                    String fechaAhora = fechaActual.toString();

                    // Fecha actual.
                    int anio2 = 17;
                    int anioahora = Math.max(0, fecha.length() - anio2);
                    int anioActual = Integer.parseInt(fechaAhora.subSequence(0, anioahora).toString());

                    int mes2 = 14;
                    int mesahora = Math.max(0, fecha.length() - mes2);
                    int mesActual = Integer.parseInt(fechaAhora.subSequence(5, mesahora).toString());

                    int dia2 = 11;
                    int diaAhora = Math.max(0, fecha.length() - dia2);
                    int diaActual = Integer.parseInt(fechaAhora.subSequence(8, diaAhora).toString());

                    // Hora actual.
                    int horaActual, minutoActual;
                    horaActual = calendario.get(Calendar.HOUR_OF_DAY);
                    minutoActual = calendario.get(Calendar.MINUTE);

                    String fecha1 = a.getFechaHora();

                    // Fecha de la hora pedida.
                    int anio1 = 17;
                    int anio = Math.max(0, fecha.length() - anio1);
                    int anioCita = Integer.parseInt(fecha1.subSequence(0, anio).toString());

                    int mes1 = 14;
                    int mes = Math.max(0, fecha.length() - mes1);
                    int mesCita = Integer.parseInt(fecha1.subSequence(5, mes).toString());

                    int dia1 = 11;
                    int dia = Math.max(0, fecha.length() - dia1);
                    int diaCita = Integer.parseInt(fecha1.subSequence(8, dia).toString());

                    // Hora de la hora pedida.
                    int hora1 = 8;
                    int hora = Math.max(0, fecha.length() - hora1);
                    int horaCita = Integer.parseInt(fecha1.subSequence(11, hora).toString());

                    int minuto1 = 5;
                    int minuto = Math.max(0, fecha.length() - minuto1);
                    int minutoCita = Integer.parseInt(fecha1.subSequence(14, minuto).toString());

                    int unDiaDespues = diaActual + 1;
                    int dosDiasDespues = diaActual + 2;

                    DAO_Cliente dc = new DAO_Cliente();

                    for (Cliente cli : dc.buscarGmail(id)) {

                        if (anioActual == anioCita && mesActual == mesCita && diaCita == unDiaDespues) {
                            System.out.println(unDiaDespues);
                
      out.write("\n");
      out.write("                <td class=\"unDia\" height=\"20px\" width=\"100px\">");
      out.print(fecha.subSequence(0, m).toString());
      out.write("</td>\n");
      out.write("                ");

                    }
                    if (anioActual == anioCita && mesActual == mesCita && diaCita == dosDiasDespues) {
                        System.out.println(dosDiasDespues);

                
      out.write("\n");
      out.write("                ");
      out.print(c.getGmail());
      out.write("\n");
      out.write("\n");
      out.write("            <h2>FORMULARIO ENVIO CORREO ELECTRONICO</h2>\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>PARA: </td>\n");
      out.write("                <input type=\"hidden\" name=\"correoCliente\" value=\"");
      out.print(cli.getGmail());
      out.write("\"/>\n");
      out.write("                <td><input type=\"text\" name=\"para\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>DE: </td>\n");
      out.write("                <input type=\"hidden\" name=\"idAtencion\" value=\"matiasdiaz199@gmail.com\"/>\n");
      out.write("                <td><input type=\"text\" name=\"de\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>CONTRASEÑA DE: </td>\n");
      out.write("                <input type=\"hidden\" name=\"idAtencion\" value=\"damneddemon1996\"/>\n");
      out.write("                <td><input type=\"password\" name=\"clave\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>ASUNTO: </td>\n");
      out.write("                <input type=\"hidden\" name=\"idAtencion\" value=\"Hora veterinario\"/>\n");
      out.write("                <td><input type=\"text\" name=\"asunto\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>MENSAJE: </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"hidden\" name=\"idAtencion\" value=\"Recuerde que su hora es a las ");
      out.print(horaCita);
      out.write(':');
      out.print(minutoCita);
      out.write("\"/>\n");
      out.write("                        <textarea name=\"mensaje\" cols=\"40\" rows=\"10\"></textarea>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                <input type=\"hidden\" name=\"idAtencion\" value=\"\"/>\n");
      out.write("                <td><input type=\"submit\" value=\"ENVIAR CORREO ELECTRONICO\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <td class=\"dosDias\" height=\"20px\" width=\"100px\">");
      out.print(fecha.subSequence(0, m).toString());
      out.write("</td>\n");
      out.write("            ");

                }
                if (anioActual == anioCita && mesActual == mesCita && diaCita == diaActual) {
            
      out.write("\n");
      out.write("            <td class=\"atrasado\" height=\"20px\" width=\"100px\">");
      out.print(fecha.subSequence(0, m).toString());
      out.write("</td>\n");
      out.write("            ");

                }
                if (diaCita != dosDiasDespues && diaCita != unDiaDespues && diaCita != diaActual) {
            
      out.write("\n");
      out.write("            <td height=\"20px\" width=\"100px\">");
      out.print(fecha.subSequence(0, m).toString());
      out.write("</td>\n");
      out.write("            ");

                    }
                }

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <td height=\"20px\" width=\"100px\">\n");
      out.write("                <form action=\"actualizarHora.jsp\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" name=\"idAtencion\" value=\"");
      out.print(a.getId());
      out.write("\"/>\n");
      out.write("                    <input type=\"submit\" value=\"modificar\" name=\"btnFechaAtencion\">\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("            <td height=\"20px\" width=\"50px\">\n");
      out.write("                <form action=\"#\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" name=\"idAtencion\" value=\"");
      out.print(a.getId());
      out.write("\"/>\n");
      out.write("                    <input type=\"submit\" value=\"?\" name=\"btnFechaAtencion\">\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("    <br> \n");
      out.write("\n");
      out.write("    ");

        System.out.println("asdasdasdadsasdasdasdasdasdadsasdasdads");
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function call()\n");
      out.write("        {\n");
      out.write("            var name = \"Gautam\";\n");
      out.write("            window.location.replace(\"Demo2.jsp?name=\" + name);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <input type=\"button\" value=\"Get\" onclick='call()'>\n");
      out.write("    ");

        String name = request.getParameter("name");
        if (name != null) {
            out.println(name);
        }
    
      out.write("\n");
      out.write("\n");
      out.write("    <p  id=\"diaSemana\" class=\"diaSemana\"> </p>\n");
      out.write("    <p id=\"dia\" class=\"dia\"></p>\n");
      out.write("    <p>de </p>\n");
      out.write("    <p id=\"mes\" class=\"mes\"> </p>\n");
      out.write("    <p>del </p>\n");
      out.write("    <p id=\"anio\" class=\"anio\"></p>\n");
      out.write("\n");
      out.write("    <p id=\"horas\" class=\"horas\"></p>\n");
      out.write("    <p>:</p>\n");
      out.write("    <p id=\"minutos\" class=\"minutos\"></p>\n");
      out.write("    <p>:</p>\n");
      out.write("    <div class=\"caja-segundos\">\n");
      out.write("        <p id=\"ampm\" class=\"ampm\"></p>\n");
      out.write("        <p id=\"segundo\" class=\"segundo\"></p>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <script src=\"js/reloj.js\"></script>\n");
      out.write("    <a href=\"menuVeterinario.jsp\">volver</a><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
