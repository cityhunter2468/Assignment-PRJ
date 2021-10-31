package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/styleProfile.css\" />\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Narbar.jsp", out, false);
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <main>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <div>\n");
      out.write("                                <div class=\"content social-timeline\">\n");
      out.write("                                    <div class=\"\">\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-12\">\n");
      out.write("                                                <div class=\"social-wallpaper\">\n");
      out.write("                                                    <div class=\"profile-hvr\">\n");
      out.write("                                                        <i class=\"icofont icofont-ui-edit p-r-10\"></i>\n");
      out.write("                                                        <i class=\"icofont icofont-ui-delete\"></i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xl-3 col-lg-4 col-md-4 col-xs-12\">\n");
      out.write("                                                <div class=\"social-timeline-left\">\n");
      out.write("                                                    <div class=\"card\">\n");
      out.write("                                                        <div class=\"social-profile\">\n");
      out.write("                                                            <img class=\"img-fluid width-100\" ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write(" alt=\"\">\n");
      out.write("                                                        <div class=\"profile-hvr m-t-15\">\n");
      out.write("                                                            <i class=\"icofont icofont-ui-edit p-r-10\"></i>\n");
      out.write("                                                            <i class=\"icofont icofont-ui-delete\"></i>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"card-block social-follower\">\n");
      out.write("                                                        <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                                                        <h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.occupation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("\n");
      out.write("                                                        <div class=\"\">\n");
      out.write("                                                            <button type=\"button\" class=\"btn btn-outline-primary waves-effect btn-block\"><i class=\"icofont icofont-ui-user m-r-10\"></i> Add as Friend</button>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>                                                                                                                                     \n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xl-9 col-lg-8 col-md-8 col-xs-12 \">\n");
      out.write("\n");
      out.write("                                            <div class=\"card social-tabs\">\n");
      out.write("                                                <ul class=\"nav nav-tabs md-tabs tab-timeline\" role=\"tablist\">\n");
      out.write("                                                    <li class=\"nav-item\">\n");
      out.write("                                                        <a class=\"nav-link active\" data-toggle=\"tab\" href=\"#timeline\" role=\"tab\">Timeline</a>\n");
      out.write("                                                        <div class=\"slide\"></div>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    <li class=\"nav-item\">\n");
      out.write("                                                        <a class=\"nav-link\" data-toggle=\"tab\" href=\"#about\" role=\"tab\">About</a>\n");
      out.write("                                                        <div class=\"slide\"></div>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    <li class=\"nav-item\">\n");
      out.write("                                                        <a class=\"nav-link\" data-toggle=\"tab\" href=\"#photos\" role=\"tab\">Photos</a>\n");
      out.write("                                                        <div class=\"slide\"></div>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    <li class=\"nav-item\">\n");
      out.write("                                                        <a class=\"nav-link\" data-toggle=\"tab\" href=\"#friends\" role=\"tab\">Friends</a>\n");
      out.write("                                                        <div class=\"slide\"></div>\n");
      out.write("                                                    </li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"tab-content\">\n");
      out.write("\n");
      out.write("                                                <div class=\"tab-pane active\" id=\"timeline\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-12 timeline-dot\">\n");
      out.write("                                                            <div class=\"social-timelines p-relative\">\n");
      out.write("                                                                <div class=\"row timeline-right p-t-35\">\n");
      out.write("                                                                    <div class=\"col-2 col-sm-2 col-xl-1\">\n");
      out.write("                                                                        <div class=\"social-timelines-left\">\n");
      out.write("                                                                            <img class=\"img-radius timeline-icon\" src=\"https://bootdey.com/img/Content/avatar/avatar7.png\" alt=\"\">\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-10 col-sm-10 col-xl-11 p-l-5 p-b-35\">\n");
      out.write("                                                                        <div class=\"card\">\n");
      out.write("                                                                            <div class=\"card-block post-timelines\">\n");
      out.write("                                                                                <span class=\"dropdown-toggle addon-btn text-muted f-right service-btn\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\" role=\"tooltip\"></span>\n");
      out.write("                                                                                <div class=\"dropdown-menu dropdown-menu-right b-none services-list\">\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Remove tag</a>\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Report Photo</a>\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Hide From Timeline</a>\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Blog User</a>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                                <div class=\"chat-header f-w-600\">Josephin Doe posted on your timeline</div>\n");
      out.write("                                                                                <div class=\"social-time text-muted\">50 minutes ago</div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <img src=\"https://via.placeholder.com/800x350/87CEFA/000000\" class=\"img-fluid width-100\" alt=\"\">\n");
      out.write("                                                                            <div class=\"card-block\">\n");
      out.write("                                                                                <div class=\"timeline-details\">\n");
      out.write("                                                                                    <div class=\"chat-header\">Josephin Doe posted on your timeline</div>\n");
      out.write("                                                                                    <p class=\"text-muted\">lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea </p>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"card-block b-b-theme b-t-theme social-msg\">\n");
      out.write("                                                                                <a href=\"#\"> <i class=\"icofont icofont-heart-alt text-muted\"></i><span class=\"b-r-muted\">Like (20)</span> </a>\n");
      out.write("                                                                                <a href=\"#\"> <i class=\"icofont icofont-comment text-muted\"></i> <span class=\"b-r-muted\">Comments (25)</span></a>\n");
      out.write("                                                                                <a href=\"#\"> <i class=\"icofont icofont-share text-muted\"></i> <span>Share (10)</span></a>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"card-block user-box\">\n");
      out.write("                                                                                <div class=\"p-b-30\"> <span class=\"f-14\"><a href=\"#\">Comments (110)</a></span><span class=\"f-right\">see all comments</span></div>\n");
      out.write("                                                                                <div class=\"media m-b-20\">\n");
      out.write("                                                                                    <a class=\"media-left\" href=\"#\">\n");
      out.write("                                                                                        <img class=\"media-object img-radius m-r-20\" src=\"https://bootdey.com/img/Content/avatar/avatar2.png\" alt=\"Generic placeholder image\">\n");
      out.write("                                                                                    </a>\n");
      out.write("                                                                                    <div class=\"media-body b-b-muted social-client-description\">\n");
      out.write("                                                                                        <div class=\"chat-header\">About Marta Williams<span class=\"text-muted\">Jane 10, 2015</span></div>\n");
      out.write("                                                                                        <p class=\"text-muted\">lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                                <div class=\"media m-b-20\">\n");
      out.write("                                                                                    <a class=\"media-left\" href=\"#\">\n");
      out.write("                                                                                        <img class=\"media-object img-radius m-r-20\" src=\"https://bootdey.com/img/Content/avatar/avatar3.png\" alt=\"Generic placeholder image\">\n");
      out.write("                                                                                    </a>\n");
      out.write("                                                                                    <div class=\"media-body b-b-muted social-client-description\">\n");
      out.write("                                                                                        <div class=\"chat-header\">About Marta Williams<span class=\"text-muted\">Jane 11, 2015</span></div>\n");
      out.write("                                                                                        <p class=\"text-muted\">lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                                <div class=\"media\">\n");
      out.write("                                                                                    <a class=\"media-left\" href=\"#\">\n");
      out.write("                                                                                        <img class=\"media-object img-radius m-r-20\" src=\"https://bootdey.com/img/Content/avatar/avatar4.png\" alt=\"Generic placeholder image\">\n");
      out.write("                                                                                    </a>\n");
      out.write("                                                                                    <div class=\"media-body\">\n");
      out.write("                                                                                        <form class=\"\">\n");
      out.write("                                                                                            <div class=\"\">\n");
      out.write("                                                                                                <textarea rows=\"5\" cols=\"5\" class=\"form-control\" placeholder=\"Write Something here...\"></textarea>\n");
      out.write("                                                                                                <div class=\"text-right m-t-20\"><a href=\"#\" class=\"btn btn-primary waves-effect waves-light\">Post</a></div>\n");
      out.write("                                                                                            </div>\n");
      out.write("                                                                                        </form>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"social-timelines p-relative\">\n");
      out.write("                                                                <div class=\"row timeline-right p-t-35\">\n");
      out.write("                                                                    <div class=\"col-2 col-sm-2 col-xl-1\">\n");
      out.write("                                                                        <div class=\"social-timelines-left\">\n");
      out.write("                                                                            <img class=\"img-radius timeline-icon\" src=\"https://bootdey.com/img/Content/avatar/avatar7.png\" alt=\"\">\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-10 col-sm-10 col-xl-11 p-l-5 p-b-35\">\n");
      out.write("                                                                        <div class=\"card\">\n");
      out.write("                                                                            <div class=\"card-block post-timelines\">\n");
      out.write("                                                                                <span class=\"dropdown-toggle addon-btn text-muted f-right service-btn\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\" role=\"tooltip\"></span>\n");
      out.write("                                                                                <div class=\"dropdown-menu dropdown-menu-right b-none services-list\">\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Remove tag</a>\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Report Photo</a>\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Hide From Timeline</a>\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Blog User</a>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                                <div class=\"chat-header f-w-600\">Josephin Doe posted on your timeline</div>\n");
      out.write("                                                                                <div class=\"social-time text-muted\">50 minutes ago</div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <img src=\"https://via.placeholder.com/800x350/FF69B4/000000\" class=\"img-fluid width-100\" alt=\"\">\n");
      out.write("                                                                            <div class=\"card-block\">\n");
      out.write("                                                                                <div class=\"timeline-details\">\n");
      out.write("                                                                                    <div class=\"chat-header\">Josephin Doe posted on your timeline</div>\n");
      out.write("                                                                                    <p class=\"text-muted\">lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea </p>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"card-block b-b-theme b-t-theme social-msg\">\n");
      out.write("                                                                                <a href=\"#\"> <i class=\"icofont icofont-heart-alt text-muted\"></i><span class=\"b-r-muted\">Like (20)</span></a>\n");
      out.write("                                                                                <a href=\"#\"> <i class=\"icofont icofont-comment text-muted\"></i><span class=\"b-r-muted\">Comments (25)</span> </a>\n");
      out.write("                                                                                <a href=\"#\"> <i class=\"icofont icofont-share text-muted\"></i><span>Share (10)</span> </a>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"card-block user-box\">\n");
      out.write("                                                                                <div class=\"p-b-30\"> <span class=\"f-14\"><a href=\"#\">Comments (110)</a></span><span class=\"f-right\">see all comments</span></div>\n");
      out.write("                                                                                <div class=\"media m-b-20\">\n");
      out.write("                                                                                    <a class=\"media-left\" href=\"#\">\n");
      out.write("                                                                                        <img class=\"media-object img-radius m-r-20\" src=\"https://bootdey.com/img/Content/avatar/avatar2.png\" alt=\"Generic placeholder image\">\n");
      out.write("                                                                                    </a>\n");
      out.write("                                                                                    <div class=\"media-body b-b-muted social-client-description\">\n");
      out.write("                                                                                        <div class=\"chat-header\">About Marta Williams<span class=\"text-muted\">Jane 10, 2015</span></div>\n");
      out.write("                                                                                        <p class=\"text-muted\">lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                                <div class=\"media\">\n");
      out.write("                                                                                    <a class=\"media-left\" href=\"#\">\n");
      out.write("                                                                                        <img class=\"media-object img-radius m-r-20\" src=\"https://bootdey.com/img/Content/avatar/avatar3.png\" alt=\"Generic placeholder image\">\n");
      out.write("                                                                                    </a>\n");
      out.write("                                                                                    <div class=\"media-body\">\n");
      out.write("                                                                                        <form class=\"\">\n");
      out.write("                                                                                            <div class=\"\">\n");
      out.write("                                                                                                <textarea rows=\"5\" cols=\"5\" class=\"form-control\" placeholder=\"Write Something here...\"></textarea>\n");
      out.write("                                                                                                <div class=\"text-right m-t-20\"><a href=\"#\" class=\"btn btn-primary waves-effect waves-light\">Post</a></div>\n");
      out.write("                                                                                            </div>\n");
      out.write("                                                                                        </form>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"f-30 text-muted text-center\">2014</div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-12 timeline-dot\">\n");
      out.write("                                                            <div class=\"social-timelines p-relative\">\n");
      out.write("                                                                <div class=\"row timeline-right p-t-35\">\n");
      out.write("                                                                    <div class=\"col-2 col-sm-2 col-xl-1\">\n");
      out.write("                                                                        <div class=\"social-timelines-left\">\n");
      out.write("                                                                            <img class=\"img-radius timeline-icon\" src=\"https://bootdey.com/img/Content/avatar/avatar7.png\" alt=\"\">\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-10 col-sm-10 col-xl-11 p-l-5 p-b-35\">\n");
      out.write("                                                                        <div class=\"card\">\n");
      out.write("                                                                            <div class=\"card-block post-timelines\">\n");
      out.write("                                                                                <span class=\"dropdown-toggle addon-btn text-muted f-right service-btn\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\" role=\"tooltip\"></span>\n");
      out.write("                                                                                <div class=\"dropdown-menu dropdown-menu-right b-none services-list\">\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Remove tag</a>\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Report Photo</a>\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Hide From Timeline</a>\n");
      out.write("                                                                                    <a class=\"dropdown-item\" href=\"#\">Blog User</a>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                                <div class=\"chat-header f-w-600\">Josephin Doe posted on your timeline</div>\n");
      out.write("                                                                                <div class=\"social-time text-muted\">50 minutes ago</div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <img src=\"https://via.placeholder.com/800x350/20B2AA/000000\" class=\"img-fluid width-100\" alt=\"\">\n");
      out.write("                                                                            <div class=\"card-block\">\n");
      out.write("                                                                                <div class=\"timeline-details\">\n");
      out.write("                                                                                    <div class=\"chat-header\">Josephin Doe posted on your timeline</div>\n");
      out.write("                                                                                    <p class=\"text-muted\">lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea </p>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"card-block b-b-theme b-t-theme social-msg\">\n");
      out.write("                                                                                <a href=\"#\"> <i class=\"icofont icofont-heart-alt text-muted\"></i><span class=\"b-r-muted\">Like (20)</span> </a>\n");
      out.write("                                                                                <a href=\"#\"> <i class=\"icofont icofont-comment text-muted\"></i> <span class=\"b-r-muted\">Comments (25)</span></a>\n");
      out.write("                                                                                <a href=\"#\"> <i class=\"icofont icofont-share text-muted\"></i> <span>Share (10)</span></a>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"card-block user-box\">\n");
      out.write("                                                                                <div class=\"p-b-30\"> <span class=\"f-14\"><a href=\"#\">Comments (110)</a></span><span class=\"f-right\">see all comments</span></div>\n");
      out.write("                                                                                <div class=\"media\">\n");
      out.write("                                                                                    <a class=\"media-left\" href=\"#\">\n");
      out.write("                                                                                        <img class=\"media-object img-radius m-r-20\" src=\"https://bootdey.com/img/Content/avatar/avatar6.png\" alt=\"Generic placeholder image\">\n");
      out.write("                                                                                    </a>\n");
      out.write("                                                                                    <div class=\"media-body\">\n");
      out.write("                                                                                        <form class=\"\">\n");
      out.write("                                                                                            <div class=\"\">\n");
      out.write("                                                                                                <textarea rows=\"5\" cols=\"5\" class=\"form-control\" placeholder=\"Write Something here...\"></textarea>\n");
      out.write("                                                                                                <div class=\"text-right m-t-20\"><a href=\"#\" class=\"btn btn-primary waves-effect waves-light\">Post</a></div>\n");
      out.write("                                                                                            </div>\n");
      out.write("                                                                                        </form>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"tab-pane\" id=\"about\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-12\">\n");
      out.write("                                                            <div class=\"card\">\n");
      out.write("                                                                <div class=\"card-header\">\n");
      out.write("                                                                    <h5 class=\"card-header-text\">Basic Information</h5>\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"card-block\">\n");
      out.write("                                                                    <div id=\"view-info\" class=\"row\">\n");
      out.write("                                                                        <div class=\"col-lg-6 col-md-12\">\n");
      out.write("                                                                            <form>\n");
      out.write("                                                                                <table class=\"table table-responsive m-b-0\">\n");
      out.write("                                                                                    <tbody>\n");
      out.write("                                                                                        <tr>\n");
      out.write("                                                                                            <th class=\"social-label b-none p-t-0\">Full Name\n");
      out.write("                                                                                            </th>\n");
      out.write("                                                                                            <td class=\"social-user-name b-none p-t-0 text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                        </tr>\n");
      out.write("                                                                                        <tr>\n");
      out.write("                                                                                            <th class=\"social-label b-none\">Gender</th>\n");
      out.write("                                                                                            <td class=\"social-user-name b-none text-muted\">");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("                                                                                        </tr>\n");
      out.write("                                                                                        <tr>\n");
      out.write("                                                                                            <th class=\"social-label b-none\">Birth Date</th>\n");
      out.write("                                                                                            <td class=\"social-user-name b-none text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                        </tr>\n");
      out.write("                                                                                        <tr>\n");
      out.write("                                                                                            <th class=\"social-label b-none\">Martail Status</th>\n");
      out.write("                                                                                            <td class=\"social-user-name b-none text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.mstatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                        </tr>\n");
      out.write("                                                                                        <tr>\n");
      out.write("                                                                                            <th class=\"social-label b-none p-b-0\">Location</th>\n");
      out.write("                                                                                            <td class=\"social-user-name b-none p-b-0 text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.location}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                        </tr>\n");
      out.write("                                                                                    </tbody>\n");
      out.write("                                                                                </table>\n");
      out.write("                                                                            </form>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-sm-12\">\n");
      out.write("                                                            <div class=\"card\">\n");
      out.write("                                                                <div class=\"card-header\">\n");
      out.write("                                                                    <h5 class=\"card-header-text\">Contact Information</h5>\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"card-block\">\n");
      out.write("                                                                    <div id=\"contact-info\" class=\"row\">\n");
      out.write("                                                                        <div class=\"col-lg-6 col-md-12\">\n");
      out.write("                                                                            <table class=\"table table-responsive m-b-0\">\n");
      out.write("                                                                                <tbody>\n");
      out.write("                                                                                    <tr>\n");
      out.write("                                                                                        <th class=\"social-label b-none p-t-0\">Mobile Number</th>\n");
      out.write("                                                                                        <td class=\"social-user-name b-none p-t-0 text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                    </tr>\n");
      out.write("                                                                                    <tr>\n");
      out.write("                                                                                        <th class=\"social-label b-none\">Web</th>\n");
      out.write("                                                                                        <td class=\"social-user-name b-none text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.wed}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                    </tr>\n");
      out.write("                                                                                    <tr>\n");
      out.write("                                                                                        <th class=\"social-label b-none\">Twitter</th>\n");
      out.write("                                                                                        <td class=\"social-user-name b-none text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.twitter}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                    </tr>\n");
      out.write("                                                                                    <tr>\n");
      out.write("                                                                                        <th class=\"social-label b-none p-b-0\">Github</th>\n");
      out.write("                                                                                        <td class=\"social-user-name b-none p-b-0 text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.github}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                    </tr>\n");
      out.write("                                                                                    <tr>\n");
      out.write("                                                                                        <th class=\"social-label b-none p-b-0\">Facebook</th>\n");
      out.write("                                                                                        <td class=\"social-user-name b-none p-b-0 text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.face}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                    </tr>\n");
      out.write("                                                                                    <tr>\n");
      out.write("                                                                                        <th class=\"social-label b-none p-b-0\">Instagram</th>\n");
      out.write("                                                                                        <td class=\"social-user-name b-none p-b-0 text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.insta}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                    </tr>\n");
      out.write("                                                                                </tbody>\n");
      out.write("                                                                            </table>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-sm-12\">\n");
      out.write("                                                            <div class=\"card\">\n");
      out.write("                                                                <div class=\"card-header\">\n");
      out.write("                                                                    <h5 class=\"card-header-text\">Work</h5>\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"card-block\">\n");
      out.write("                                                                    <div id=\"work-info\" class=\"row\">\n");
      out.write("                                                                        <div class=\"col-lg-6 col-md-12\">\n");
      out.write("                                                                            <table class=\"table table-responsive m-b-0\">\n");
      out.write("                                                                                <tbody>\n");
      out.write("                                                                                    <tr>\n");
      out.write("                                                                                        <th class=\"social-label b-none p-t-0\">Occupation      \n");
      out.write("                                                                                        </th>\n");
      out.write("                                                                                        <td class=\"social-user-name b-none p-t-0 text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.occupation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                    </tr>\n");
      out.write("                                                                                    <tr>\n");
      out.write("                                                                                        <th class=\"social-label b-none\">Skills</th>\n");
      out.write("                                                                                        <td class=\"social-user-name b-none text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.skill}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                                                    </tr>\n");
      out.write("\n");
      out.write("                                                                                </tbody>\n");
      out.write("                                                                            </table>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"tab-pane\" id=\"photos\">\n");
      out.write("                                                    <div class=\"card\">\n");
      out.write("\n");
      out.write("                                                        <div class=\"card-block\">\n");
      out.write("                                                            <div class=\"demo-gallery\">\n");
      out.write("                                                                <ul id=\"profile-lightgallery\" class=\"row\">\n");
      out.write("                                                                    <li class=\"col-md-4 col-lg-2 col-sm-6 col-xs-12\">\n");
      out.write("                                                                        <a href=\"#\" data-toggle=\"lightbox\" data-title=\"A random title\" data-footer=\"A custom footer text\">\n");
      out.write("                                                                            <img src=\"https://bootdey.com/img/Content/avatar/avatar1.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                                                        </a>\n");
      out.write("                                                                    </li>\n");
      out.write("                                                                    <li class=\"col-md-4 col-lg-2 col-sm-6 col-xs-12\">\n");
      out.write("                                                                        <a href=\"#\" data-toggle=\"lightbox\" data-title=\"A random title\" data-footer=\"A custom footer text\">\n");
      out.write("                                                                            <img src=\"https://bootdey.com/img/Content/avatar/avatar2.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                                                        </a>\n");
      out.write("                                                                    </li>\n");
      out.write("                                                                    <li class=\"col-md-4 col-lg-2 col-sm-6 col-xs-12\">\n");
      out.write("                                                                        <a href=\"#\" data-toggle=\"lightbox\" data-title=\"A random title\" data-footer=\"A custom footer text\">\n");
      out.write("                                                                            <img src=\"https://bootdey.com/img/Content/avatar/avatar3.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                                                        </a>\n");
      out.write("                                                                    </li>\n");
      out.write("                                                                    <li class=\"col-md-4 col-lg-2 col-sm-6 col-xs-12\">\n");
      out.write("                                                                        <a href=\"#\" data-toggle=\"lightbox\" data-title=\"A random title\" data-footer=\"A custom footer text\">\n");
      out.write("                                                                            <img src=\"https://bootdey.com/img/Content/avatar/avatar4.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                                                        </a>\n");
      out.write("                                                                    </li>\n");
      out.write("                                                                </ul>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"tab-pane\" id=\"friends\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-lg-12 col-xl-6\">\n");
      out.write("                                                            <div class=\"card\">\n");
      out.write("                                                                <div class=\"card-block post-timelines\">\n");
      out.write("                                                                    <span class=\"dropdown-toggle addon-btn text-muted f-right service-btn\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\" role=\"tooltip\"></span>\n");
      out.write("                                                                    <div class=\"dropdown-menu dropdown-menu-right b-none services-list\">\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Remove tag</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Report Photo</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Hide From Timeline</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Blog User</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"media bg-white d-flex\">\n");
      out.write("                                                                        <div class=\"media-left media-middle\">\n");
      out.write("                                                                            <a href=\"#\">\n");
      out.write("                                                                                <img class=\"media-object\" width=\"120\" src=\"https://bootdey.com/img/Content/avatar/avatar1.png\" alt=\"\">\n");
      out.write("                                                                            </a>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                        <div class=\"media-body friend-elipsis\">\n");
      out.write("                                                                            <div class=\"f-15 f-bold m-b-5\">Josephin Doe</div>\n");
      out.write("                                                                            <div class=\"text-muted social-designation\">Software Engineer</div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-lg-12 col-xl-6\">\n");
      out.write("                                                            <div class=\"card\">\n");
      out.write("                                                                <div class=\"card-block post-timelines\">\n");
      out.write("                                                                    <span class=\"dropdown-toggle addon-btn text-muted f-right service-btn\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\" role=\"tooltip\"></span>\n");
      out.write("                                                                    <div class=\"dropdown-menu dropdown-menu-right b-none services-list\">\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Remove tag</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Report Photo</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Hide From Timeline</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Blog User</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"media bg-white d-flex\">\n");
      out.write("                                                                        <div class=\"media-left media-middle\">\n");
      out.write("                                                                            <a href=\"#\">\n");
      out.write("                                                                                <img class=\"media-object\" width=\"120\" src=\"https://bootdey.com/img/Content/avatar/avatar2.png\" alt=\"\">\n");
      out.write("                                                                            </a>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                        <div class=\"media-body friend-elipsis\">\n");
      out.write("                                                                            <div class=\"f-15 f-bold m-b-5\">Josephin Doe</div>\n");
      out.write("                                                                            <div class=\"text-muted social-designation\">Software Engineer</div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-lg-12 col-xl-6\">\n");
      out.write("                                                            <div class=\"card\">\n");
      out.write("                                                                <div class=\"card-block post-timelines\">\n");
      out.write("                                                                    <span class=\"dropdown-toggle addon-btn text-muted f-right service-btn\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\" role=\"tooltip\"></span>\n");
      out.write("                                                                    <div class=\"dropdown-menu dropdown-menu-right b-none services-list\">\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Remove tag</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Report Photo</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Hide From Timeline</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Blog User</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"media bg-white d-flex\">\n");
      out.write("                                                                        <div class=\"media-left media-middle\">\n");
      out.write("                                                                            <a href=\"#\">\n");
      out.write("                                                                                <img class=\"media-object\" width=\"120\" src=\"https://bootdey.com/img/Content/avatar/avatar3.png\" alt=\"\">\n");
      out.write("                                                                            </a>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                        <div class=\"media-body friend-elipsis\">\n");
      out.write("                                                                            <div class=\"f-15 f-bold m-b-5\">Josephin Doe</div>\n");
      out.write("                                                                            <div class=\"text-muted social-designation\">Software Engineer</div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-lg-12 col-xl-6\">\n");
      out.write("                                                            <div class=\"card\">\n");
      out.write("                                                                <div class=\"card-block post-timelines\">\n");
      out.write("                                                                    <span class=\"dropdown-toggle addon-btn text-muted f-right service-btn\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\" role=\"tooltip\"></span>\n");
      out.write("                                                                    <div class=\"dropdown-menu dropdown-menu-right b-none services-list\">\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Remove tag</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Report Photo</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Hide From Timeline</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Blog User</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"media bg-white d-flex\">\n");
      out.write("                                                                        <div class=\"media-left media-middle\">\n");
      out.write("                                                                            <a href=\"#\">\n");
      out.write("                                                                                <img class=\"media-object\" width=\"120\" src=\"https://bootdey.com/img/Content/avatar/avatar6.png\" alt=\"\">\n");
      out.write("                                                                            </a>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                        <div class=\"media-body friend-elipsis\">\n");
      out.write("                                                                            <div class=\"f-15 f-bold m-b-5\">Josephin Doe</div>\n");
      out.write("                                                                            <div class=\"text-muted social-designation\">Software Engineer</div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>    \n");
      out.write("                                    </div>   \n");
      out.write("                                </div>  \n");
      out.write("                            </div> \n");
      out.write("                        </div> \n");
      out.write("                    </div> \n");
      out.write("                </div> \n");
      out.write("            </div> \n");
      out.write("        </main>\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                 ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                 ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                             ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.url_avata != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                     src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('/');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.url_avata}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" \n");
        out.write("                                                                 ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                     src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/assert/no_avata.jpg\" \n");
        out.write("                                                                 ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                                                                                    ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                                                                                    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                                                                                    ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.gender == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                        Male\n");
        out.write("                                                                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profile.gender == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                        Female\n");
        out.write("                                                                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                        Orther\n");
        out.write("                                                                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }
}
