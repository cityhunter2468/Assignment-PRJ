/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.home;

import Dal.PostDBContext;
import Model.Account;
import Model.Post;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author levan
 */
@MultipartConfig(maxFileSize = 16177215)
public class UpdatePost extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id"));
        PostDBContext pdb = new PostDBContext();
        Post p = pdb.getPost(id);
        request.setAttribute("post", p);
        request.getRequestDispatcher("view/UpdatePost.jsp").forward(request, response);
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
        int id = Integer.parseInt(request.getParameter("id"));
        PostDBContext pdb = new PostDBContext();
        Post pp = pdb.getPost(id);
        
        Post p = new Post();
        String img = "..JPEG..JPG..GIF..PNG";
        String video = "..MP4..MOV";
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
        p.setTime_create(added_date); //
        String path = folderName + File.separator + today + fileName;
        InputStream is = filePart.getInputStream();
        Files.copy(is, Paths.get(uploadPath + File.separator + today + fileName));
        
        if (!fileName.isEmpty()) {
            int index1 = fileName.lastIndexOf('.');
            String s1 = fileName.substring(index1);

            if (img.contains(s1.toUpperCase())) {
                p.setUrl_img(path);//
            } else 
            if (video.contains(s1.toUpperCase())) {
                p.setUrl_video(path);//
            } else p.setUrl_file(path);//
        } else {
            p.setUrl_img(pp.getUrl_img());
        }
        
        HttpSession session = request.getSession();
        Account ac = (Account) session.getAttribute("account");
        p.setUser_id(ac.getId());//
        
        p.setContent(request.getParameter("content"));
        p.setStatus(Integer.parseInt(request.getParameter("status")));//
        
        PostDBContext pdb = new PostDBContext();
        pdb.AddPost(p);
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+"/home");
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
