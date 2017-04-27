/*
 * @author Dzhuman Bohdan
 */

package amm.Nerdbook.Classi;

public class UtenteReg {
    private int id;
    private String nome;
    private String cognome;
    private String frasePres;
    private String dataNasc;
    private String username;
    private String password;
    
    public UtenteReg(){
        this.id=0;
        this.nome="";
        this.cognome="";
        this.frasePres="";
        this.dataNasc="";
        this.username="";
        this.password="";
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void getNome(String nome){
        this.nome = nome;
    }
    
    public String getCognome(){
        return this.cognome;
    }
    
    public void getCognome(String cognome){
        this.cognome = cognome;
    }
    
    public String getFrasePres(){
        return this.frasePres;
    }
    
    public void getFrasePres(String frasePres){
        this.frasePres = frasePres;
    }
    
    public String getDataNasc(){
        return this.dataNasc;
    }
    
    public void getDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void getUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void getPassword(String password){
        this.password = password;
    }
}
