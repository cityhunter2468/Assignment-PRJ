/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.profile;

import Controller.authen.BaseReqAuth;
import Dal.Like_CommentDBContext;
import Model.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author levan
 */
public class CommentPost extends HttpServlet {

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
        String content = request.getParameter("content");
        int post_id = Integer.parseInt(request.getParameter("id_post"));
        System.out.println(post_id);
        Account ac = (Account) request.getSession().getAttribute("account");
        Like_CommentDBContext lcdb = new Like_CommentDBContext();
        lcdb.insertComment(ac.getId(), post_id, content);
        String contextPath = request.getContextPath();
        out.println("<div class=\"sub_comment\">\n"
                + "  <div class=\"row\">\n"
                + "  <div class=\"col-sm-1\"><img ");
        if (ac.getUrl_avata() != null) {
            out.println("src=\"" + contextPath + "/" + ac.getUrl_avata() + "\" ");
        } else {
            out.println("src=\"" + contextPath + "/assert/no_avata.jpg\" ");
        }
        out.println("alt=\"Admin\" class=\"rounded-circle\" width=\"40\" height=\"40\"> </div>\n"
                + "                                            <div class=\"col-sm-10\"> <a href=\"\">"+ac.getDisplayname()+"</a> <span class=\"time_comment\"> Vua xong</span>\n"
                + "                                                <p>"+content+"</p>\n"
                + "                                            </div>\n"
                + "                                        </div>\n"
                + "                                    </div>              ");
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

        String content = request.getParameter("content");
        int post_id = Integer.parseInt(request.getParameter("id_post"));
        System.out.println(post_id);
        Account ac = (Account) request.getSession().getAttribute("account");
        Like_CommentDBContext lcdb = new Like_CommentDBContext();
        lcdb.insertComment(ac.getId(), post_id, content);
        String contextPath = request.getContextPath();

        out.print("<div class=\"media m-b-20 sub_comment" + post_id + "\">\n"
                + "<a class=\"media-left\" href=\"" + contextPath + "/profile/view?id=" + ac.getUrl_avata() + "\">\n"
                + "<img class=\"media-object img-radius m-r-20\"");
        if (ac.getUrl_avata() != null) {
            out.println("src=\"" + contextPath + "/" + ac.getUrl_avata() + "\" ");
        } else {
            out.println("src=\"" + contextPath + "/assert/no_avata.jpg\" ");
        }
        out.println("alt=\"Generic placeholder image\">\n"
                + "   </a>\n"
                + "     <div class=\"media-body b-b-muted social-client-description\">\n"
                + "   <div class=\"chat-header\">" + ac.getDisplayname() + "<span class=\"text-muted\">Vua Xong</span></div>\n"
                + "   <p class=\"text-muted\">" + content + "</p>\n"
                + "   </div>\n"
                + "  </div>");
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
