/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.profile;

import Dal.Like_CommentDBContext;
import Model.Comment;
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
public class LoadMoreComment extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        int id_post = Integer.parseInt(request.getParameter("id_post"));
        int amount = Integer.parseInt(request.getParameter("ex"));
        Like_CommentDBContext lcdb = new Like_CommentDBContext();
        ArrayList<Comment> com = lcdb.getMoreComment(id_post, amount);
        String contextPath = request.getContextPath();
        for (Comment c : com) {
            out.println("<div class=\"sub_comment"+id_post+"\">\n"
                    + "  <div class=\"row\">\n"
                    + "  <div class=\"col-sm-1\"><img ");
            if (c.getAccount().getUrl_avata() != null) {
                out.println("src=\"" + contextPath + "/" + c.getAccount().getUrl_avata() + "\" ");
            } else {
                out.println("src=\"" + contextPath + "/assert/no_avata.jpg\" ");
            }
            out.println("alt=\"Admin\" class=\"rounded-circle\" width=\"40\" height=\"40\"> </div>\n"
                    + "                                            <div class=\"col-sm-10\"> <a href=\"\">" + c.getAccount().getDisplayname() + "</a> <span class=\"time_comment\"> " + c.getTime() + "</span>\n"
                    + "                                                <p>" + c.getContent() + "</p>\n"
                    + "                                            </div>\n"
                    + "                                        </div>\n"
                    + "                                    </div>              ");
        }
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
        int id_post = Integer.parseInt(request.getParameter("id_post"));
        int amount = Integer.parseInt(request.getParameter("ex"));
        Like_CommentDBContext lcdb = new Like_CommentDBContext();
        ArrayList<Comment> com = lcdb.getMoreComment(id_post, amount);
        String contextPath = request.getContextPath();
        for (Comment c : com) {
            out.print("<div class=\"media m-b-20 sub_comment" + id_post + "\">\n"
                    + "<a class=\"media-left\" href=\"" + contextPath + "/profile/view?id=" + c.getAccount().getUrl_avata() + "\">\n"
                    + "<img class=\"media-object img-radius m-r-20\"");
            if (c.getAccount().getUrl_avata() != null) {
                out.println("src=\"" + contextPath + "/" + c.getAccount().getUrl_avata() + "\" ");
            } else {
                out.println("src=\"" + contextPath + "/assert/no_avata.jpg\" ");
            }
            out.println("alt=\"Generic placeholder image\">\n"
                    + "   </a>\n"
                    + "     <div class=\"media-body b-b-muted social-client-description\">\n"
                    + "   <div class=\"chat-header\">" + c.getAccount().getDisplayname() + "<span class=\"text-muted\">" + c.getTime() + "</span></div>\n"
                    + "   <p class=\"text-muted\">" + c.getContent() + "</p>\n"
                    + "   </div>\n"
                    + "  </div>");
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
