package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intento2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/parte1.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1><span>Responsive Navigation Menu</span> Using Only CSS</h1>\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("<section>\n");
      out.write("<a href=\"https://www.linkedin.com/in/sutharmayur\" id=\"logo\" target=\"_blank\">Mayur Suthar</a>\n");
      out.write("\n");
      out.write("<label for=\"toggle-1\" class=\"toggle-menu\"><ul><li></li> <li></li> <li></li></ul></label>\n");
      out.write("<input type=\"checkbox\" id=\"toggle-1\">\n");
      out.write("\n");
      out.write("<nav>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"#logo\"><i class=\"icon-home\"></i>Home</a></li>\n");
      out.write("<li><a href=\"#about\"><i class=\"icon-user\"></i>About</a></li>\n");
      out.write("<li><a href=\"#portfolio\"><i class=\"icon-thumbs-up-alt\"></i>Portfolio</a></li>\n");
      out.write("<li><a href=\"#services\"><i class=\"icon-gear\"></i>Services</a></li>\n");
      out.write("<li><a href=\"#gallery\"><i class=\"icon-picture\"></i>Gallery</a></li>\n");
      out.write("<li><a href=\"#contact\"><i class=\"icon-phone\"></i>Contact</a></li>\n");
      out.write("</ul>\n");
      out.write("</nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section id=\"about\" class=\"content\">\n");
      out.write("<h2>About</h2>\n");
      out.write("<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section id=\"portfolio\" class=\"content\">\n");
      out.write("<h2>Portfolio</h2>\n");
      out.write("<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section id=\"services\" class=\"content\">\n");
      out.write("<h2>Services</h2>\n");
      out.write("<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section id=\"gallery\" class=\"content\">\n");
      out.write("<h2>Gallery</h2>\n");
      out.write("<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section id=\"contact\" class=\"content\">\n");
      out.write("<h2>Contact</h2>\n");
      out.write("<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("<ul class=\"social\">\n");
      out.write("<li><a href=\"https://twitter.com/mayursuthar2693\" target=\"_blank\"><i class=\"icon-twitter\"></i></a></li>\n");
      out.write("<li><a href=\"https://www.facebook.com/mayursuthar2693\" target=\"_blank\"><i class=\"icon-facebook\"></i></a></li>\n");
      out.write("<li><a href=\"https://www.linkedin.com/in/sutharmayur\" target=\"_blank\"><i class=\"icon-linkedin\"></i></a></li>\n");
      out.write("<li><a href=\"https://www.pinterest.com/MayurSuthar2693/\" target=\"_blank\"><i class=\"icon-pinterest\"></i></a></li>\n");
      out.write("<li><a href=\"https://plus.google.com/109916819421919014146/posts\" target=\"_blank\"><i class=\"icon-google-plus\"></i></a></li>\n");
      out.write("<li><a href=\"https://www.instagram.com/mayursuthar2693/\" target=\"_blank\"><i class=\"icon-instagram\"></i></a></li>\n");
      out.write("</ul>\n");
      out.write("</footer>\n");
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
