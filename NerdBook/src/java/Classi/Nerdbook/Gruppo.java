/**
 * @author Dzhuman Bohdan
 */
package Classi.Nerdbook;

public class Gruppo {
    private int idGruppo;
    private String nameGruppo;
    private String descrGruppo;
    private String urlImgGruppo;
    private UtenteReg idCreator;
    
    public Gruppo(){
        this.idGruppo = 0;
        this.nameGruppo = "";
        this.descrGruppo = "";
        this.urlImgGruppo = "";
        this.idCreator = null;
    }

    /**
     * @return the idGruppo
     */
    public int getIdGruppo() {
        return idGruppo;
    }

    /**
     * @param idGruppo the idGruppo to set
     */
    public void setIdGruppo(int idGruppo) {
        this.idGruppo = idGruppo;
    }

    /**
     * @return the nameGruppo
     */
    public String getNameGruppo() {
        return nameGruppo;
    }

    /**
     * @param nameGruppo the nameGruppo to set
     */
    public void setNameGruppo(String nameGruppo) {
        this.nameGruppo = nameGruppo;
    }

    /**
     * @return the descrGruppo
     */
    public String getDescrGruppo() {
        return descrGruppo;
    }

    /**
     * @param descrGruppo the descrGruppo to set
     */
    public void setDescrGruppo(String descrGruppo) {
        this.descrGruppo = descrGruppo;
    }

    /**
     * @return the urlImgGruppo
     */
    public String getUrlImgGruppo() {
        return urlImgGruppo;
    }

    /**
     * @param urlImgGruppo the urlImgGruppo to set
     */
    public void setUrlImgGruppo(String urlImgGruppo) {
        this.urlImgGruppo = urlImgGruppo;
    }

    /**
     * @return the idCreator
     */
    public UtenteReg getIdCreator() {
        return idCreator;
    }

    /**
     * @param idCreator the idCreator to set
     */
    public void setIdCreator(UtenteReg idCreator) {
        this.idCreator = idCreator;
    }
    
    @Override
    public boolean equals(Object gr) {
        if(gr == null){
            return false;
        }
        if (gr instanceof Gruppo){
            if (this.getIdGruppo() == ((Gruppo)gr).getIdGruppo()){
                return true;
            }
        }
        return false;
    }
}
