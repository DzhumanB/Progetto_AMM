/**
 * @author Dzhuman Bohdan
 */
package Servlets;

import Classi.Nerdbook.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        if(request.getParameter("logout") != null){
            HttpSession session = request.getSession(false);
            if(request.getParameter("logout").equals("1")){
                session.invalidate();
            }
        }
        
        HttpSession session = request.getSession();
        String utente = request.getParameter("login");
        String password = request.getParameter("pswd");
        
        if(utente == null || password == null){
            request.getRequestDispatcher("loginJSP.jsp").forward(request, response);
        }
        
        if(utente != null){
            UtenteReg ut = UtenteRegFactory.getInstance().getUserByName(utente);
            if(ut != null){
                if(ut.getNameUtenteReg().equals(utente) && ut.getPassWord().equals(password)){
                    session.setAttribute("inLog",true);
                    session.setAttribute("login",ut);
                    session.setAttribute("attributeX",ut);
                    
                    if(ut.getNameUtenteReg() == null || ut.getUrlImgUtenteReg() == null || ut.getSurnameUtenteReg() == null || ut.getDescrPhrase() == null){
                        response.sendRedirect("profilo.html");
                    }else{
                        List<Post> p = PostFactory.getInstance().getPostByUtenteReg(ut);
                        session.setAttribute("post", p);
                        response.sendRedirect("bacheca.html");
                    }
                }else{
                    request.setAttribute("notAccess", true);
                    session.setAttribute("inLog",false);
                    request.getRequestDispatcher("loginJSP.jsp").forward(request, response);
                }
            }else{
                request.setAttribute("notAccess", true);
                session.setAttribute("inLog",false);
                request.getRequestDispatcher("loginJSP.jsp").forward(request, response);
            }
        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
