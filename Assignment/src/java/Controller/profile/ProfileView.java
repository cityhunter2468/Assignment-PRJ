/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.profile;

import Controller.authen.BaseReqAuth;
import Dal.AccountDBContext;
import Dal.PostDBContext;
import Dal.ProfileDBContext;
import Model.Account;
import Model.Post;
import Model.Profile;
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
public class ProfileView extends BaseReqAuth {

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
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //tren git

        int id = Integer.parseInt(request.getParameter("id"));
        Account ac = (Account) request.getSession().getAttribute("account");

        ProfileDBContext pdb = new ProfileDBContext();
        Profile profile = new Profile();
        profile = pdb.getProfile(id);

        AccountDBContext adb = new AccountDBContext();
        Account account = adb.getAccountId(id);

        PostDBContext postdb = new PostDBContext();
        ArrayList<Post> posts = new ArrayList<Post>();
        if (ac.getId() == id) {
            posts = postdb.getPost(id,ac.getId(), 0, 2);
        } else {
            posts = postdb.getPost(id,ac.getId(), 0, 1);
        }
        
        ArrayList<Post> imgs = new ArrayList<Post>();
        if (ac.getId() == id) {
            imgs = postdb.getImg(id,ac.getId(), 0, 2);
        } else {
            imgs = postdb.getImg(id,ac.getId(), 0, 1);
        }
        
        ArrayList<Account> friends = postdb.getFriend(id,0);
        
        request.setAttribute("friend", friends);
        request.setAttribute("post", posts);
        request.setAttribute("img", imgs);
        request.setAttribute("profile", profile);
        request.setAttribute("account", account);
        request.getRequestDispatcher(".././view/Profile.jsp").forward(request, response);
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
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
