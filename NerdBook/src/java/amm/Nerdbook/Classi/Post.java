/*
 * @author Dzhuman Bohdan
 */
package amm.Nerdbook.Classi;

public class Post {
    
    public enum Tipo {
        TEXT, IMAGE, AUDIO, URL;
    };
    
    private int idPost;
    private UtenteReg user;
    private String contain;
    private String urlFotoProfile;
    private Tipo postTipo;
    private Gruppo gruppo;
    private UtenteReg destination;

    public Post(){
        this.idPost=0;
        this.user=null;
        this.contain="";
        this.urlFotoProfile="";
        this.postTipo = Tipo.TEXT;
        this.gruppo = null;
        this.destination = null;
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
    
    public Tipo getPostTipo(){
        return this.postTipo;
    }
    
    public void setPostTipo(Tipo postTipo){
        this.postTipo = postTipo;
    }
    
    public Gruppo getGruppo() {
        return gruppo;
    }

    public void setGruppo(Gruppo gruppo) {
        this.gruppo = gruppo;
    }
    
    public UtenteReg getDestination(){
        return destination;
    }
    
    public void setDestination(UtenteReg destination){
        this.destination = destination;
    }
}

