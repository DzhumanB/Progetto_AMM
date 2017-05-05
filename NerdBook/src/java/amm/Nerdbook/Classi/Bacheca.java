/**
 * @author Dzhuman Bohdan
 */
package amm.Nerdbook.Classi;

import java.util.List;
import java.io.IOException;
/*import java.io.PrintWriter; */
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Bacheca extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        
        Object in = session.getAttribute("in");
        if(in != null){
            boolean flag = (boolean)in;
            
            if(!flag){
                request.setAttribute("denied",true);
                request.getRequestDispatcher("bacheca.jsp").forward(request, response);
            }else{
                in = session.getAttribute("user");
                request.setAttribute("denied",false);
                
                List<UtenteReg> lu = UtenteRegFactory.getInstance().getListUtenteReg();
                session.setAttribute("utente", lu);
                List<Gruppo> lg = GruppoFactory.getInstance().getListGruppo();
                session.setAttribute("gruppo", lg);
                
                Object vb = request.getParameter("visualizza_bacheca"); 
                Object vg = request.getParameter("visualizza_gruppo");
                UtenteReg u;
                Gruppo g;
                
                if(vg != null){
                    String n = vg.toString();
                    g = GruppoFactory.getInstance().getGruppoByNome(n);
                    
                    if(g != null){
                        request.setAttribute("x", g);
                        List<Post> p = PostFactory.getInstance().getPostByGruppo(g);
                        
                        if(p != null){
                            request.setAttribute("post", p);
                        }
                    }
                }else if(vb != null){
                    request.setAttribute("f",true);
                    String n = vb.toString();
                    u = UtenteRegFactory.getInstance().getUserByNome(n);
                    request.setAttribute("x", u); 
                    List<Post> p = PostFactory.getInstance().getPostByUser(u);
                    if(p != null){
                        request.setAttribute("post", p);
                    }
                }else{
                    request.setAttribute("f",true);
                    u = (UtenteReg)in;
                    request.setAttribute("x", u);
                }
                
                if(request.getParameter("stato") != null || request.getParameter("tipo") != null || request.getParameter("allegato") != null){
                    String testo = request.getParameter("stato");
                    String allegato = request.getParameter("link");
                    String radio = request.getParameter("tipo");
                    Post.Tipo tipo = null;
                    
                    if(radio != null){
                        if(radio.equals("imm")){
                            if(allegato != null){
                                if (!(allegato.equals(""))){
                                    request.setAttribute("multimedia",1);
                                    tipo = Post.Tipo.IMAGE;
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
                                    tipo = Post.Tipo.URL;
                                    request.setAttribute("errore_tipo", false);
                                    request.setAttribute("inspost", true);
                                }else{
                                    request.setAttribute("errore_tipo", true);
                                }    
                            }
                            else{
                                request.setAttribute("errore_tipo", true);
                            }
                        }else if(radio.equals("audio")){
                            if(allegato != null){
                                if (!(allegato.equals(""))){
                                    request.setAttribute("multimedia", 3);
                                    tipo = Post.Tipo.AUDIO;
                                    request.setAttribute("errore_tipo", false);
                                    request.setAttribute("inspost", true);
                                }else{
                                    request.setAttribute("errore_tipo", true);
                                }    
                            }
                            else{
                                request.setAttribute("errore_tipo", true);
                            }
                        }
                    }else if(testo != null){
                        if(!testo.equals("")){
                            request.setAttribute("inspost", true);
                            request.setAttribute("errore_tipo", false);
                            tipo = Post.Tipo.TEXT;
                        }
                    }
                    if(!allegato.equals("")){
                        if(tipo == null || !testo.equals("")){
                            request.setAttribute("errore_tipo", true);
                            request.setAttribute("inspost", false);
                        }                        
                    }
                    if(request.getAttribute("errore_tipo") != null){
                        if(!(boolean)request.getAttribute("errore_tipo")){
                            request.setAttribute("inspost", true);
                            
                            Post n = new Post();
                            n.setUser((UtenteReg)session.getAttribute("user"));
                            
                            if(vb != null){
                                n.setDestination(UtenteRegFactory.getInstance().getUserByNome(vb.toString()));
                            }else{
                                n.setDestination((UtenteReg)session.getAttribute("user"));
                            }
                            if(vg != null){
                                n.setGruppo(GruppoFactory.getInstance().getGruppoByNome(vg.toString()));
                            }
                            n.setPostTipo(tipo);
                            if(tipo == Post.Tipo.TEXT){
                                n.setContain(request.getParameter("stato"));
                            }else if(tipo == Post.Tipo.URL || tipo == Post.Tipo.IMAGE || tipo == Post.Tipo.AUDIO){
                                n.setContain(request.getParameter("link"));
                            }
                            request.setAttribute("n",n);
                        }
                    }
                }
                if(request.getParameter("conferma") != null){
                    if((request.getParameter("conferma").equals("true"))){
                        request.setAttribute("conferma", true);
                    }
                }
                request.getRequestDispatcher("bachecaJSP.jsp").forward(request, response);
            }
        }else{
            request.setAttribute("denied",true);
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
