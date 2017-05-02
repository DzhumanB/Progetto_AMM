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
        gruppo1.setListPartecipanti("Miyagi Asuna, Park Ji-Yeon, Go Ara, Tae-Yeon Kim");
        
        Gruppo gruppo2 = new Gruppo();
        gruppo2.setIdGruppo(1);
        gruppo2.setNomeGruppo("Music");
        gruppo2.setUrlFotoGruppo("");
        gruppo2.setListPartecipanti("Miyagi Asuna, Park Ji-Yeon, Tae-Yeon Kim");
        
        Gruppo gruppo3 = new Gruppo();
        gruppo3.setIdGruppo(2);
        gruppo3.setNomeGruppo("Lineage");
        gruppo3.setUrlFotoGruppo("");
        gruppo3.setListPartecipanti("Miyagi Asuna, Go Ara, Tae-Yeon Kim");
        
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
/**
    public List getGruppoList(Gruppo gruppo) {

        List<Gruppo> listGruppo = new ArrayList<>();

        for(Gruppo gruppo : this.listGruppo) {
            if (gruppo.getUser().equals(utente)) {
                listGruppo.add(gruppo);
            }
        }
        return listGruppo;
    }
**/
}