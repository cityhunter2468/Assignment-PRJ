/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.profile;

import Controller.authen.BaseReqAuth;
import Dal.AccountDBContext;
import Dal.ProfileDBContext;
import Model.Account;
import Model.Profile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author levan
 */
@MultipartConfig(maxFileSize = 16177215)
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
        request.setAttribute("profile", p);
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

        int op = Integer.parseInt(request.getParameter("op"));
        Account ac = (Account) request.getSession().getAttribute("account");
        if (op == 1) {
            String pattern = "dd.MM.yyyy hh.mm.ss.SSS";
            DateFormat df = new SimpleDateFormat(pattern);
            PrintWriter out = response.getWriter();
            String folderName = "assert";
            String uploadPath = request.getServletContext().getRealPath("") + File.separator + folderName;
            File dir = new File(uploadPath);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            Part filePart = request.getPart("file");
            String fileName = filePart.getSubmittedFileName();

            Timestamp added_date = new Timestamp(System.currentTimeMillis());
            String today = df.format(added_date);
            String path = folderName + "/"+ today + fileName;
            InputStream is = filePart.getInputStream();
            Files.copy(is, Paths.get(uploadPath + File.separator + today + fileName));
            
            Account a = new Account();
            a.setUrl_avata(path);
            a.setId(ac.getId());
            
            AccountDBContext adb = new AccountDBContext();
            adb.updateAvata(a);
            Account aa = (Account) request.getSession().getAttribute("account");
            aa.setUrl_avata(path);
            request.getSession().setAttribute("account", aa);
        } else {
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
            
            ProfileDBContext pdb = new ProfileDBContext();
            Profile pp = pdb.getProfile(ac.getId());
            response.getWriter().println(pp);
            if (pp == null) {
                pdb.insertProfile(p, ac.getId());
            } else {
                pdb.updateProfile(p, ac.getId());
            }
        }
        response.sendRedirect("edit");
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
