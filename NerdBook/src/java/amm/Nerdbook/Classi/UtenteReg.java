/*
 * @author Dzhuman Bohdan
 */

package amm.Nerdbook.Classi;


public class UtenteReg {
    
    public enum uType{
        USER, ADMIN
    }; 
    
    private int idUtente;
    private String nome;
    private String cognome;
    private String frasePres;
    private String dataNasc;
    private uType tipUtente;
    private String password;
    private String urlFoto;
    
    public UtenteReg(){
        this.idUtente=0;
        this.nome="";
        this.cognome="";
        this.frasePres="";
        this.dataNasc="";
        this.tipUtente=uType.USER;
        this.password="";
        this.urlFoto="";
    }
    
    public int getIdUtente(){
        return this.idUtente;
    }
    
    public void setIdUtente(int idUtente){
        this.idUtente = idUtente;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCognome(){
        return this.cognome;
    }
    
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    
    public String getFrasePres(){
        return this.frasePres;
    }
    
    public void setFrasePres(String frasePres){
        this.frasePres = frasePres;
    }
    
    public String getDataNasc(){
        return this.dataNasc;
    }
    
    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }
    
    public uType getTipUtente(){
        return this.tipUtente;
    }
    
    public void setTipUtente(uType tipUtente){
        this.tipUtente = tipUtente;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUrlFoto(){
        return this.urlFoto;
    }
    
    public void setUrlFoto(String urlFoto){
        this.urlFoto = urlFoto;
    }
    
    @Override
    public boolean equals(Object u) {
        if(u == null){
            return false;
        }
        if (u instanceof UtenteReg){
            if (this.getIdUtente() == ((UtenteReg)u).getIdUtente()) return true;
        }
        return false;
    }
}
