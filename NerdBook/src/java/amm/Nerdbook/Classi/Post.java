/*
 * @author Dzhuman Bohdan
 */

package amm.Nerdbook.Classi;

public class Post {
    private int id;
    private UtenteReg user;
    private String contain;
    private String urlFotoProfile;

    public Post(){
        this.id=0;
        this.user=null;
        this.contain="";
        this.urlFotoProfile="";
    }
    
    public int getId(){
        return this.id;
    }
    
    public void SetId(int id){
        this.id = id;
    }
    
    
}

