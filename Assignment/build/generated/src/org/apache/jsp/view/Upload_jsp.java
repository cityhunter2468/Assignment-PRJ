package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/styleUpload.css\" rel=\"stylesheet\">\n");
      out.write("        <script class=\"jsbin\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Narbar.jsp", out, false);
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div class=\"container\">\n");
      out.write("              \n");
      out.write("                    <div class=\"post\">\n");
      out.write("                        <form action=\"upload\" method=\"post\" enctype='multipart/form-data'>\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <label class=\"input-group-text\" for=\"inputGroupSelect01\">Options</label>\n");
      out.write("                                </div>\n");
      out.write("                                <select class=\"custom-select\" id=\"inputGroupSelect01\" name=\"status\">\n");
      out.write("                                    <option value=\"0\" selected>Private</option>\n");
      out.write("                                    <option value=\"1\">Friend</option>\n");
      out.write("                                    <option value=\"2\">Public</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <span class=\"input-group-text\" id=\"inputGroup-sizing-default\">Content</span>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-default\" name=\"content\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"image-upload-wrap\">\n");
      out.write("                                <input class=\"file-upload-input\" type='file' onchange=\"readURL(this);\" name=\"file\" />\n");
      out.write("                                <div class=\"drag-text\">\n");
      out.write("                                    <h3>Drag and drop a file or select add Image</h3>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"file-upload-content\">\n");
      out.write("                                <img class=\"file-upload-image\" src=\"#\" alt=\"your image\" />\n");
      out.write("                                <div class=\"image-title-wrap\">\n");
      out.write("                                    <button type=\"button\" onclick=\"removeUpload()\" class=\"remove-image\">Remove <span class=\"image-title\">Uploaded Image</span></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <script>\n");
      out.write("            function readURL(input) {\n");
      out.write("                if (input.files && input.files[0]) {\n");
      out.write("\n");
      out.write("                    var reader = new FileReader();\n");
      out.write("\n");
      out.write("                    reader.onload = function (e) {\n");
      out.write("                        $('.image-upload-wrap').hide();\n");
      out.write("\n");
      out.write("                        $('.file-upload-image').attr('src', e.target.result);\n");
      out.write("                        $('.file-upload-content').show();\n");
      out.write("\n");
      out.write("                        $('.image-title').html(input.files[0].name);\n");
      out.write("                    };\n");
      out.write("\n");
      out.write("                    reader.readAsDataURL(input.files[0]);\n");
      out.write("\n");
      out.write("                } else {\n");
      out.write("                    removeUpload();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function removeUpload() {\n");
      out.write("                $('.file-upload-input').replaceWith($('.file-upload-input').clone());\n");
      out.write("                $('.file-upload-content').hide();\n");
      out.write("                $('.image-upload-wrap').show();\n");
      out.write("            }\n");
      out.write("            $('.image-upload-wrap').bind('dragover', function () {\n");
      out.write("                $('.image-upload-wrap').addClass('image-dropping');\n");
      out.write("            });\n");
      out.write("            $('.image-upload-wrap').bind('dragleave', function () {\n");
      out.write("                $('.image-upload-wrap').removeClass('image-dropping');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
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
