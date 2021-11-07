/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.home;

import Dal.PostDBContext;
import Model.Account;
import Model.Comment;
import Model.Post;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author levan
 */
public class LoadMoreNewFeed extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        PostDBContext pdb = new PostDBContext();
        int amount = Integer.parseInt(request.getParameter("exits"));
        Account ac = (Account) request.getSession().getAttribute("account");
        String contextPath = request.getContextPath();

        ArrayList<Post> list = pdb.getPostHome(ac.getId(), amount);
        for (Post p : list) {
            out.println("<div class=\"status-field-container write-post-container sub_content\">\n"
                    + "                            <div class=\"user-profile-box\">\n"
                    + "                                <div class=\"user-profile\">\n"
                    + "                                    <img");
            if (p.getAc().getUrl_avata() != null) {
                out.println("src=\"" + contextPath + "/" + p.getAc().getUrl_avata() + "\" ");
            } else {
                out.println("src=\"" + contextPath + "/assert/no_avata.jpg\" ");
            }
            out.println("alt=\"Admin\" class=\"rounded-circle\" width=\"35\" height=\"35\">\n"
                    + "\n"
                    + " <div>\n"
                    + " <p> <a href=\"profile/view?id=" + p.getAc().getId() + "\">" + p.getAc().getDisplayname() + "</a></p>\n"
                    + "  <small>" + p.getTime_create() + "</small>\n"
                    + " </div>\n"
                    + " </div>\n"
                    + "  <div>\n"
                    + "   <a href=\"#\"><i class=\"fas fa-ellipsis-v\"></i></a>\n"
                    + "  </div>\n"
                    + "  </div>");

            out.println("<div class=\"status-field\">\n"
                    + "<p>" + p.getContent() + "</p>");
            if (p.getUrl_img() != null) {
                out.println("<img src=\"" + contextPath + "/" + p.getUrl_img() + "\" class=\"anh\" alt=\"\">");
            }
            out.println("</div>");

            out.println(" <div class=\"post-reaction\">\n"
                    + " <div class=\"activity-icons\">\n"
                    + " <div onclick=\"like(" + ac.getId() + "," + p.getPost_id() + ")\">\n"
                    + "  <i id=\"like" + p.getPost_id() + "\" class=\"bi bi-heart ");
            if (p.getUserlike() == 1) {
                out.println("actives");
            }
            out.println("\"></i> \n"
                    + "  <span id=\"like1" + p.getPost_id() + "\">Like " + p.getCountlike() + " </span>\n"
                    + " </div>\n"
                    + "  <div ><i class=\"bi bi-chat-left\"></i> Comment </div>\n"
                    + "  </div>\n"
                    + " </div>");

            out.println("<div id=\"loadmorecomment\" onclick=\"comment(" + p.getPost_id() + ")\">Load more comment\n"
                    + "                            </div>");

            out.println("<div class=\"comment_like\" id=\"container_comment" + p.getPost_id() + "\">");
            for (Comment c : p.getComment()) {
                out.println("<div class=\"sub_comment" + p.getPost_id() + "\">\n"
                        + " <div class=\"row\">\n"
                        + "<div class=\"col-sm-1\"><img ");
                if (c.getAccount().getUrl_avata() != null) {
                    out.println("src=\"" + contextPath + "/" + c.getAccount().getUrl_avata() + "\" ");
                } else {
                    out.println("src=\"" + contextPath + "/assert/no_avata.jpg\" ");
                }
                out.println("alt=\"Admin\" class=\"rounded-circle\" width=\"40\" height=\"40\"> </div>\n"
                        + "  <div class=\"col-sm-10\"> <a href=\"\">" + c.getAccount().getDisplayname() + "</a> <span class=\"time_comment\"> " + c.getTime() + "</span>\n"
                        + "  <p>" + c.getContent() + "</p>\n"
                        + " </div>\n"
                        + "</div>\n"
                        + " </div> ");
            }
            out.println("</div>");

            out.println("<div class=\"post_comment\">\n"
                    + " <div class=\"row\">\n"
                    + " <div class=\"col-sm-1\"><img ");
            if (ac.getUrl_avata() != null) {
                out.println("src=\"" + contextPath + "/" + ac.getUrl_avata() + "\" ");
            } else {
                out.println("src=\"" + contextPath + "/assert/no_avata.jpg\" ");
            }
            out.println("alt=\"Admin\" class=\"rounded-circle\" width=\"40\" height=\"40\"></div>\n"
                    + "                                    <div class=\"col-sm-10\"><input type=\"text\" class=\"form-control\" placeholder=\"Your Comment Here\"  id=\"comment"+p.getPost_id()+"\"></div>\n"
                    + "                                </div>\n"
                    + "                                <div class=\"row button_post\">\n"
                    + "                                    <div class=\"col-sm-5\"></div>\n"
                    + "                                    <div class=\"col-sm-2\"><button type=\"button\" class=\"btn btn-primary\" onclick=\"post("+p.getPost_id()+")\">Post</button></div>\n"
                    + "                                </div>");

            out.println("</div>");

            out.println("</div>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
