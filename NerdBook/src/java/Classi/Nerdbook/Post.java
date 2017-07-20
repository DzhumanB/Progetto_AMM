/**
 * @author Dzhuman Bohdan
 */
package Classi.Nerdbook;

public class Post {
    
    public enum postType{
        TEXT, IMG, URL;
    }
    
    private int idPost;
    private postType pType;
    private String contain;
    private String attachments;
    private Gruppo idRecieverGruppo;
    private UtenteReg idReciever;
    private UtenteReg idPublisher;
    private String urlImgPublisher;
    
    public Post(){
        this.idPost = 0;
        this.pType = postType.TEXT;
        this.contain = "";
        this.attachments = "";
        this.idRecieverGruppo = null;
        this.idReciever = null;
        this.idPublisher = null;
        this.urlImgPublisher = "";
    }

    /**
     * @return the idPost
     */
    public int getIdPost() {
        return idPost;
    }

    /**
     * @param idPost the idPost to set
     */
    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    /**
     * @return the pType
     */
    public postType getpType() {
        return pType;
    }

    /**
     * @param pType the pType to set
     */
    public void setpType(postType pType) {
        this.pType = pType;
    }

    /**
     * @return the contain
     */
    public String getContain() {
        return contain;
    }

    /**
     * @param contain the contain to set
     */
    public void setContain(String contain) {
        this.contain = contain;
    }
    
    /**
     * @return the attachments
     */
    public String getAttachments() {
        return attachments;
    }

    /**
     * @param attachments the attachments to set
     */
    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }
    
    /**
     * @return the idRecieverGruppo
     */
    public Gruppo getIdRecieverGruppo() {
        return idRecieverGruppo;
    }

    /**
     * @param idRecieverGruppo the idRecieverGruppo to set
     */
    public void setIdRecieverGruppo(Gruppo idRecieverGruppo) {
        this.idRecieverGruppo = idRecieverGruppo;
    }

    /**
     * @return the idReciever
     */
    public UtenteReg getIdReciever() {
        return idReciever;
    }

    /**
     * @param idReciever the idReciever to set
     */
    public void setIdReciever(UtenteReg idReciever) {
        this.idReciever = idReciever;
    }

    /**
     * @return the idPublisher
     */
    public UtenteReg getIdPublisher() {
        return idPublisher;
    }

    /**
     * @param idPublisher the idPublisher to set
     */
    public void setIdPublisher(UtenteReg idPublisher) {
        this.idPublisher = idPublisher;
    }

    /**
     * @return the urlImgPublisher
     */
    public String getUrlImgPublisher() {
        return urlImgPublisher;
    }

    /**
     * @param urlImgPublisher the urlImgPublisher to set
     */
    public void setUrlImgPublisher(String urlImgPublisher) {
        this.urlImgPublisher = urlImgPublisher;
    }    
}
