/*
 * @author Dzhuman Bohdan
 */

package amm.Nerdbook.Classi;


public class Post {
    
    public enum Type {
        TEXT, IMAGE, AUDIO;
    };
    
    private int idPost;
    private UtenteReg user;
    private String contain;
    private String urlFotoProfile;
    private Type postType;

    public Post(){
        this.idPost=0;
        this.user=null;
        this.contain="";
        this.urlFotoProfile="";
        this.postType = Type.TEXT;
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
    
    public Type getPostType(){
        return this.postType;
    }
    
    public void setPostType(Type postType){
        this.postType = postType;
    }
}

