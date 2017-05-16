/*
 * @author Dzhuman Bohdan
 */

package amm.Nerdbook.Classi;

public class Gruppo {
    private int idGruppo;
    private String nomeGruppo;
    private String urlFotoGruppo;
    private String listPartecipanti;
    /* private  listPostGruppo; */
    
    public Gruppo(){
        this.idGruppo = 0;
        this.nomeGruppo = "";
        this.urlFotoGruppo = "";
        this.listPartecipanti = "";
        /* this.listPostGruppo=""; */
    }
    
    public int getIdGruppo(){
        return this.idGruppo;
    }
    
    public void setIdGruppo(int idGruppo){
        this.idGruppo = idGruppo;
    }
    
    public String getNomeGruppo(){
        return this.nomeGruppo;
    }

    public void setNomeGruppo(String nomeGruppo){
        this.nomeGruppo = nomeGruppo;
    }    
    
    public String getUrlFotoGruppo(){
        return this.urlFotoGruppo;
    }
    
    public void setUrlFotoGruppo(String urlFotoGruppo){
        this.urlFotoGruppo = urlFotoGruppo;
    }
    
    public String getListPartecipanti(){
        return this.listPartecipanti;
    }
    
    public void setListPartecipanti(String listPartecipanti){
        this.listPartecipanti = listPartecipanti;
    }
    
}
