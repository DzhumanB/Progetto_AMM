/**
 * @author Dzhuman Bohdan
 */
package Classi.Nerdbook;

public class UtenteReg {
    
    public enum typeUtenteReg{
        ENTRANT, ADMIN;
    }
    
    private int idUtenteReg;
    private String nameUtenteReg;
    private String surnameUtenteReg;
    private String birthDate;
    private String descrPhrase;
    private String passWord;
    private String urlImgUtenteReg;
    private typeUtenteReg uType;
    
    public UtenteReg(){
        this.idUtenteReg = 0;
        this.nameUtenteReg = "";
        this.surnameUtenteReg = "";
        this.birthDate = "";
        this.descrPhrase = "";
        this.passWord = "";
        this.urlImgUtenteReg = "";
        this.uType = typeUtenteReg.ENTRANT;
    }

    /**
     * @return the idUtenteReg
     */
    public int getIdUtenteReg() {
        return idUtenteReg;
    }

    /**
     * @param idUtenteReg the idUtenteReg to set
     */
    public void setIdUtenteReg(int idUtenteReg) {
        this.idUtenteReg = idUtenteReg;
    }

    /**
     * @return the nameUtenteReg
     */
    public String getNameUtenteReg() {
        return nameUtenteReg;
    }

    /**
     * @param nameUtenteReg the nameUtenteReg to set
     */
    public void setNameUtenteReg(String nameUtenteReg) {
        this.nameUtenteReg = nameUtenteReg;
    }

    /**
     * @return the surnameUtenteReg
     */
    public String getSurnameUtenteReg() {
        return surnameUtenteReg;
    }

    /**
     * @param surnameUtenteReg the surnameUtenteReg to set
     */
    public void setSurnameUtenteReg(String surnameUtenteReg) {
        this.surnameUtenteReg = surnameUtenteReg;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the descrPhrase
     */
    public String getDescrPhrase() {
        return descrPhrase;
    }

    /**
     * @param descrPhrase the descrPhrase to set
     */
    public void setDescrPhrase(String descrPhrase) {
        this.descrPhrase = descrPhrase;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * @return the urlImgUtenteReg
     */
    public String getUrlImgUtenteReg() {
        return urlImgUtenteReg;
    }

    /**
     * @param urlImgUtenteReg the urlImgUtenteReg to set
     */
    public void setUrlImgUtenteReg(String urlImgUtenteReg) {
        this.urlImgUtenteReg = urlImgUtenteReg;
    }

    /**
     * @return the uType
     */
    public typeUtenteReg getuType() {
        return uType;
    }

    /**
     * @param uType the uType to set
     */
    public void setuType(typeUtenteReg uType) {
        this.uType = uType;
    }
    
    @Override
    public boolean equals(Object ut) {
        if(ut == null){
            return false;
        }
        if (ut instanceof UtenteReg){
            if (this.getIdUtenteReg() == ((UtenteReg)ut).getIdUtenteReg()){
                return true;
            }
        }
        return false;
    }
}
