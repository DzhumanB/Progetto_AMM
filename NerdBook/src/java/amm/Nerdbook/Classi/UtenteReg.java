/*
 * @author Dzhuman Bohdan
 */

package amm.Nerdbook.Classi;

public class UtenteReg {
    private int idUtente;
    private String nome;
    private String cognome;
    private String frasePres;
    private String dataNasc;
    private String username;
    private String password;
    
    public UtenteReg(){
        this.idUtente=0;
        this.nome="";
        this.cognome="";
        this.frasePres="";
        this.dataNasc="";
        this.username="";
        this.password="";
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
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}
