package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.mail.Transport;
import javax.mail.internet.MimeMultipart;
import javax.activation.FileDataSource;
import javax.activation.DataHandler;
import javax.mail.internet.MimeBodyPart;
import javax.mail.BodyPart;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import java.util.Properties;

public final class intento1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if (request.getParameter("btok") != null) {
                
                String remitente = request.getParameter("Corigen");
                String clave = request.getParameter("Pass");
                String destino = request.getParameter("Cdestino");
                String asunto = request.getParameter("Casunto");
                String cuerpo = request.getParameter("ta_cuerpo");

                Properties props = new Properties();
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.user", remitente);
                props.put("mail.smtp.clave", clave);

                javax.mail.Session s = javax.mail.Session.getDefaultInstance(props);
                MimeMessage mensaje = new MimeMessage(s);

                try {
                    mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
                    mensaje.setSubject(asunto);

                    mensaje.setText(cuerpo);
                    /*Envio Mensaje de texto*/
                    BodyPart parteTexto = new MimeBodyPart();                    
                    parteTexto.setContent("<b>"+cuerpo+"</b>", "text/html");

                    BodyPart parteArchivo = new MimeBodyPart();
                    parteArchivo.setDataHandler(new DataHandler(new FileDataSource( application.getRealPath("")+ "grafica1.jpg" )));
                    parteArchivo.setFileName("grafica1.jpg");

                    MimeMultipart todaslasPartes = new MimeMultipart();
                    todaslasPartes.addBodyPart(parteTexto);
                    todaslasPartes.addBodyPart(parteArchivo);

                    mensaje.setContent(todaslasPartes);

                    Transport transport = s.getTransport("smtp");
                    transport.connect("smtp.gmail.com", remitente, clave);
                    transport.sendMessage(mensaje, mensaje.getAllRecipients());
                    transport.close();
                    System.out.println("Correo Enviado");
                    out.print("<script> alert('Correo Enviado Exitosamente')</script>");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <center> \n");
      out.write("        <br>\n");
      out.write("        <h1>Enviar Correo</h1>\n");
      out.write("        <form action=\"index.jsp\" method=\"POST\">\n");
      out.write("            <label for=\"fname\">Correo Origen Gmail:</label><br>\n");
      out.write("            <input type=\"text\" id=\"fname\" size=\"50\" name=\"Corigen\" value=\"\" Placeholder=\"Correo Origen\"><br>\n");
      out.write("            <label for=\"lname\">Contraseña Gmail</label><br>\n");
      out.write("            <input type=\"password\" id=\"lname\" size=\"50\" name=\"Pass\" value=\"\" Placeholder=\"Password\"><br><br><br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <label for=\"lname\">Correo Destino:</label><br>\n");
      out.write("            <input type=\"text\" id=\"lname\" size=\"50\" name=\"Cdestino\" value=\"\" Placeholder=\"Correo Destino\"><br>\n");
      out.write("            <label for=\"lasunto\">Asunto del correo:</label><br>\n");
      out.write("            <input type=\"text\" id=\"lasunto\" size=\"50\" name=\"Casunto\" value=\"\" Placeholder=\"Asunto a tratar\"><br>\n");
      out.write("            <label for=\"lname\">Texto:</label><br>\n");
      out.write("            <textarea name=\"ta_cuerpo\" rows=\"4\" cols=\"40\" Placeholder=\"Texto a Enviar\"></textarea><br><br>\n");
      out.write("            <input type=\"submit\" name=\"btok\" value=\"Enviar Correo\">\n");
      out.write("        </form> \n");
      out.write("    </center> \n");
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
