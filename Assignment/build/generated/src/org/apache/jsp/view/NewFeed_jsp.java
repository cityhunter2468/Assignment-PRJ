package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewFeed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/styleNewFeed.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Narbar.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <main>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"status-field-container write-post-container\">\n");
      out.write("                    <div class=\"user-profile-box\">\n");
      out.write("                        <div class=\"user-profile\">\n");
      out.write("                            <img src=\"https://images.viblo.asia/full/23945add-dd34-4e20-9daa-f4ce967e577c.JPG\" alt=\"\">\n");
      out.write("                            <div>\n");
      out.write("                                <p> <a href=\"#\">Alex Carry </a></p>\n");
      out.write("                                <small>August 13 1999, 09.18 pm</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <a href=\"#\"><i class=\"fas fa-ellipsis-v\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"status-field\">\n");
      out.write("                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis dolores praesentium dicta\n");
      out.write("                            laborum nihil accusantium odit laboriosam, sed sit autem! <a href=\"#\">#This_Post_is_faster!!!!</a> </p>\n");
      out.write("                        <img src=\"assert\\10.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"post-reaction\">\n");
      out.write("                        <div class=\"activity-icons\">\n");
      out.write("                            <div onclick=\"heart()\"><i class=\"bi bi-heart\"></i>120 </div>\n");
      out.write("                            <div onclick=\"comment()\"><i class=\"bi bi-chat-left\"></i>120 </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("      \n");
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
