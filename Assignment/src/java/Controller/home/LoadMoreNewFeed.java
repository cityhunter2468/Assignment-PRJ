/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.home;

import Dal.PostDBContext;
import Model.Account;
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
                    + "                                <div class=\"user-profile\">");
            if (p.getAc().getUrl_avata() != null) {
                out.println("<img src=\"" + contextPath + "\\" + p.getAc().getUrl_avata() + "\" alt=\"Admin\" class=\"rounded-circle\" width=\"35\" height=\"35\" >");
            } else {
                out.println("<img src=\"" + contextPath + "/assert/no_avata.jpg" + "\" alt=\"Italian Trulli\">");
            }
            out.println("<div>\n"
                    + "                                        <p> <a href=\"profile/view?id=" + p.getAc().getId() + "\">" + p.getAc().getDisplayname() + "</a></p>\n"
                    + "                                        <small>" + p.getTime_create() + "</small>\n"
                    + "                                    </div>\n"
                    + "                                </div>\n"
                    + "                                <div>\n"
                    + "                                    <a href=\"#\"><i class=\"fas fa-ellipsis-v\"></i></a>\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "                            <div class=\"status-field\">\n"
                    + "                                <p>" + p.getContent() + "</p>");
            if (p.getUrl_img() != null) {
                out.println("<img src=\" " + contextPath + "\\" + p.getUrl_img() + "\" class=\"anh\" >");
            }
            out.println("</div>\n"
                    + "                            <div class=\"post-reaction\">\n"
                    + "                                <div class=\"activity-icons\">\n"
                    + "                                    <div onclick=\"heart()\"><i class=\"bi bi-heart\"></i>120 </div>\n"
                    + "                                    <div onclick=\"comment()\"><i class=\"bi bi-chat-left\"></i>120 </div>\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "                        </div>");

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
