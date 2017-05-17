/*
 * @author Dzhuman Bohdan
 */

package amm.Nerdbook.Classi;

public class Gruppo {
    private int idGruppo;
    private String nomeGruppo;
    private String description;
    private String urlFotoGruppo;
    private UtenteReg creator;
    /* private  listPostGruppo; */
    
    public Gruppo(){
        this.idGruppo = 0;
        this.nomeGruppo = "";
        this.description="";
        this.urlFotoGruppo = "";
        this.creator = null;
        
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
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getUrlFotoGruppo(){
        return this.urlFotoGruppo;
    }
    
    public void setUrlFotoGruppo(String urlFotoGruppo){
        this.urlFotoGruppo = urlFotoGruppo;
    }
    
    public UtenteReg getCreator(){
        return this.creator;
    }
    
    public void setCreator(UtenteReg creator){
        this.creator = creator;
    }
    
    @Override
    public boolean equals(Object g) {
        if(g == null){
            return false;
        }
        if (g instanceof Gruppo){
            if (this.getIdGruppo() == ((Gruppo)g).getIdGruppo()) return true;
        }
        return false;
    }
}
