/*
 * @author Dzhuman Bohdan
 */

package amm.Nerdbook.Classi;

public class Post {
    private int idPost;
    private UtenteReg user;
    private String contain;
    private String urlFotoProfile;

    public Post(){
        this.idPost=0;
        this.user=null;
        this.contain="";
        this.urlFotoProfile="";
    }
    
    public int getIdPost(){
        return this.idPost;
    }
    
    public void setIdPost(int idPost){
        this.idPost = idPost;
    }
    
    public UtenteReg getUser(){
        return this.user;
    }
    
    public void setUser(UtenteReg user){
        this.user = user;
    }
    
    public String getContain(){
        return this.contain;
    }
    
    public void setContain(String contain){
        this.contain = contain;
    }
    
    public String getUrlFotoProfile(){
        return this.urlFotoProfile;
    }
    
    public void setUrlFotoProfile(String urlFotoProfile){
        this.urlFotoProfile = urlFotoProfile;
    }
}

