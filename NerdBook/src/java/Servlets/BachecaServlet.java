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

public class BachecaServlet extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        Object inLog = session.getAttribute("inLog");
        
        if(inLog != null){
            boolean flag = (boolean)inLog;
            if(!flag){
                request.setAttribute("negato",true);
                request.getRequestDispatcher("bachecaJSP.jsp").forward(request, response);
            }else{
                inLog = session.getAttribute("login");
                request.setAttribute("negato",false);
                
                List<UtenteReg> lu = UtenteRegFactory.getInstance().getListUtenteReg();
                session.setAttribute("utenti", lu);
                List<Gruppo> lg = GruppoFactory.getInstance().getListGruppo();
                session.setAttribute("gruppi", lg);
                
                Object vb = request.getParameter("visualizza_bacheca"); 
                Object vg = request.getParameter("visualizza_gruppo");
                
                UtenteReg ut;
                Gruppo gr;
                 
                if(vg != null){
                    String n = vg.toString();
                    gr = GruppoFactory.getInstance().getGruppoByName(n);
                    if(gr != null){
                        request.setAttribute("attrivuteX", gr);
                        List<Post> p = PostFactory.getInstance().getPostByGruppo(gr);
                        if(p != null){
                            request.setAttribute("post", p);
                        }
                    }
                }else if(vb != null){
                    request.setAttribute("f",true);
                    String n = vb.toString();
                    ut = UtenteRegFactory.getInstance().getUserByName(n);
                    request.setAttribute("attributeX", ut);
                    List<Post> p = PostFactory.getInstance().getPostByReciever(ut);
                    if(p != null){
                        request.setAttribute("post", p);
                    }
                }else{
                    request.setAttribute("f",true);
                    ut = (UtenteReg)inLog;
                    request.setAttribute("attributeX", ut);
                    List<Post> p = PostFactory.getInstance().getPostByReciever(ut);
                    if(p != null){
                        request.setAttribute("post", p);
                    }
                }
                
                if(request.getParameter("stato") != null || request.getParameter("tipo") != null || request.getParameter("allegato") != null){
                    String testo = request.getParameter("stato");
                    String allegato = request.getParameter("link");
                    String radio = request.getParameter("tipo");
                    Post.postType tipo = null;
                    
                    if(radio != null){
                        if(radio.equals("imm")){
                            if(allegato != null){
                                if (!(allegato.equals(""))){
                                    request.setAttribute("multimedia",1);
                                    tipo = Post.postType.IMG;
                                    request.setAttribute("erroretipo", false);
                                    request.setAttribute("inspost", true);
                                }else{
                                    request.setAttribute("erroretipo", true);
                                }    
                            }else{
                                request.setAttribute("erroretipo", true);
                            }
                        }else if(radio.equals("url")){
                            if(allegato != null){
                                if (!(allegato.equals(""))){
                                    request.setAttribute("multimedia", 2);
                                    tipo = Post.postType.URL;
                                    request.setAttribute("erroretipo", false);
                                    request.setAttribute("inspost", true);
                                }else{
                                    request.setAttribute("erroretipo", true);
                                }
                            }else{
                                request.setAttribute("erroretipo", true);
                            }
                        }
                    }else if(testo != null){
                        if(!testo.equals("")){
                            request.setAttribute("inspost", true);
                            request.setAttribute("erroretipo", false);
                            tipo = Post.postType.TEXT;
                        }
                    }
                    if(!allegato.equals("")){
                        if(tipo == null){
                            request.setAttribute("erroretipo", true);
                            request.setAttribute("inspost", false);
                        }                        
                    }
                    
                    if(request.getAttribute("erroretipo") != null){
                        if(!(boolean)request.getAttribute("erroretipo")){
                            request.setAttribute("inspost", true);
                            Post n = new Post();
                            n.setIdPublisher((UtenteReg)session.getAttribute("login"));
                            if(vb != null){ 
                                n.setIdReciever(UtenteRegFactory.getInstance().getUserByName(vb.toString()));
                            }
                            else{ 
                                n.setIdReciever((UtenteReg)session.getAttribute("login"));
                            }
                            if(vg != null) 
                                n.setIdRecieverGruppo(GruppoFactory.getInstance().getGruppoByName(vg.toString()));
                            n.setpType(tipo);
                            if(!testo.equals(""))
                                n.setContain(request.getParameter("stato"));
                            if(!allegato.equals(""))
                                n.setAttachments(request.getParameter("link"));
                            request.setAttribute("n",n);
                        }
                    }
                }
               
                if(request.getParameter("conferma") != null){
                    if((request.getParameter("conferma").equals("true")))
                        request.setAttribute("conferma", true);
                }
                request.getRequestDispatcher("bachecaJsp.jsp").forward(request, response);
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
