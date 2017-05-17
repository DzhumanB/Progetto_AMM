/**
 * @author Dzhuman Bohdan
 */
package amm.Nerdbook.Classi;

import java.util.List;
import java.util.ArrayList;

public class GruppoFactory {
    private static GruppoFactory singleton;
     
    public static GruppoFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppoFactory();
        }
        return singleton;
    }
    
    private ArrayList<Gruppo> listGruppo = new ArrayList<>();
    
    private GruppoFactory(){
        
        UtenteRegFactory utenteFactory = UtenteRegFactory.getInstance();
        
        Gruppo gruppo1 = new Gruppo();
        gruppo1.setIdGruppo(0);
        gruppo1.setNomeGruppo("Softair");
        gruppo1.setUrlFotoGruppo("");
        gruppo1.setCreator(UtenteRegFactory.getInstance().getUserByNome("Asuna"));
        
        Gruppo gruppo2 = new Gruppo();
        gruppo2.setIdGruppo(1);
        gruppo2.setNomeGruppo("Music");
        gruppo2.setUrlFotoGruppo("");
        gruppo2.setCreator(UtenteRegFactory.getInstance().getUserByNome("Kim"));
        
        Gruppo gruppo3 = new Gruppo();
        gruppo3.setIdGruppo(2);
        gruppo3.setNomeGruppo("Lineage");
        gruppo3.setUrlFotoGruppo("");
        gruppo3.setCreator(UtenteRegFactory.getInstance().getUserByNome("Ji-Yeon"));
        
        listGruppo.add(gruppo1);
        listGruppo.add(gruppo2);
        listGruppo.add(gruppo3); 
    }
    public Gruppo getGruppoById(int idGruppo) {
        for(Gruppo gruppo : this.listGruppo) {
            if(gruppo.getIdGruppo() == idGruppo) {
                return gruppo;
            }
        }
        return null;
    }
    
    public Gruppo getGruppoByNome(String nomeGruppo){
        for(Gruppo gruppo : this.listGruppo){
            if(gruppo.getNomeGruppo().equals(nomeGruppo))
                return gruppo;
        }
        return null;
    }
    
    public List getListGruppo(){
        return listGruppo;
    }
}