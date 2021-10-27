/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.profile;

import Controller.authen.BaseReqAuth;
import Dal.ProfileDBContext;
import Model.Account;
import Model.Profile;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author levan
 */
public class ProfileEdit extends BaseReqAuth {

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
        String servletPath = request.getContextPath();
        Account ac = (Account) request.getSession().getAttribute("account");
        ProfileDBContext pdb = new ProfileDBContext();
        Profile p = pdb.getProfile(ac.getId());
        request.setAttribute("profile",p);
        request.getRequestDispatcher(".././view/Profile_Edit.jsp").forward(request, response);
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
        Profile p = new Profile();
        p.setFname(request.getParameter("name"));
        p.setGender(Integer.parseInt(request.getParameter("gender")));
        p.setDob(Date.valueOf(request.getParameter("dob")));
        p.setMstatus(request.getParameter("status"));
        p.setLocation(request.getParameter("location"));
        p.setNumber(request.getParameter("phone"));
        p.setOccupation(request.getParameter("occupation"));
        p.setSkill(request.getParameter("skill"));
        p.setWed(request.getParameter("web"));
        p.setGithub(request.getParameter("git"));
        p.setTwitter(request.getParameter("twit"));
        p.setInsta(request.getParameter("ins"));
        p.setFace(request.getParameter("face"));
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
