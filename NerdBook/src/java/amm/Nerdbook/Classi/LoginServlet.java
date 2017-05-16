/**
 * @author Dzhuman Bohdan
 */
package amm.Nerdbook.Classi;

import java.io.IOException;
/*import java.io.PrintWriter; */
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        
        if(request.getParameter("logout") != null){
            if(request.getParameter("logout").equals("1")){
                session.invalidate();
            }
        }
        
        String utente = request.getParameter("user");
        String password = request.getParameter("password");
        
        if(utente == null || password == null){
            request.getRequestDispatcher("loginJSP.jsp").forward(request, response);
        }
        if(utente != null){
            UtenteReg u = UtenteRegFactory.getInstance().getUserByNome(utente);
            if(u != null){
                if(u.getNome().equals(utente) && u.getPassword().equals(password)){
                    session.setAttribute("in",true);
                    session.setAttribute("user",u); 
                    session.setAttribute("x",u);
                    if(u.getNome() == null || u.getUrlFoto() == null || u.getCognome() == null || u.getFrasePres() == null){
                        response.sendRedirect("profilo.html");
                    }else{
                        List<Post> p = PostFactory.getInstance().getPostByUser(u);
                        session.setAttribute("post", p);
                        response.sendRedirect("bacheca.html");
                    }
                }else{
                    request.setAttribute("errore", true);
                    session.setAttribute("in",false);
                    request.getRequestDispatcher("loginJSP.jsp").forward(request, response);
                }
            }else{
                request.setAttribute("errore", true);
                session.setAttribute("in",false);
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
