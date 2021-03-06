/*
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


public class ProfiloServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        Object r = session.getAttribute("in");
        if(r != null){
            boolean flag = (boolean)r;
            if(!flag){
                request.setAttribute("negato",true);
                request.getRequestDispatcher("profiloJSP.jsp").forward(request, response);
            }else{
                request.setAttribute("negato",false);
                List<UtenteReg> lst = UtenteRegFactory.getInstance().getListUtenteReg();
                session.setAttribute("utenti", lst);
                List<Gruppo> gr = GruppoFactory.getInstance().getListGruppo();
                session.setAttribute("gruppi", gr);
                UtenteReg ut = (UtenteReg)session.getAttribute("login");
                
                String nome = request.getParameter("nome");
                String cognome = request.getParameter("cognome");
                String stato = request.getParameter("stato");
                String compleanno = request.getParameter("compleanno");
                String foto = request.getParameter("foto");
                String password = request.getParameter("password");
                String cpassword = request.getParameter("cpassword");
                
                if(nome != null){
                    if(!nome.equals("")){
                        ut.setNameUtenteReg(nome);
                        request.setAttribute("erroredati", false);
                    }
                }
                
                if(cognome != null){
                    if(!cognome.equals("")){
                        ut.setSurnameUtenteReg(cognome);
                        request.setAttribute("erroredati", false);
                    }
                }
                
                if(stato != null){
                    if(!stato.equals("")){
                        ut.setDescrPhrase(stato);
                        request.setAttribute("erroredati", false);
                    }
                }
                
                if(compleanno != null){
                    if(!compleanno.equals("")){
                        ut.setBirthDate(compleanno);
                        request.setAttribute("erroredati", false);
                    }
                }
                
                if(foto != null){
                    if(!foto.equals("")){
                        ut.setUrlImgUtenteReg(foto);
                        request.setAttribute("erroredati", false);
                    }
                }
                
                if(password != null){
                    if(cpassword != null){
                        if(cpassword.equals(password)){
                            if (!(password.equals(""))){
                                ut.setPassWord(password);
                                request.setAttribute("erroredati", false);
                            }
                        }else{
                            request.setAttribute("erroredati", true);
                        }
                    }
                }else if (cpassword != null){ 
                    request.setAttribute("erroredati", true);
                }
                request.getRequestDispatcher("profiloJSP.jsp").forward(request, response);
            }
        }else{
            request.setAttribute("negato",true);
            request.getRequestDispatcher("profiloJSP.jsp").forward(request, response);
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
