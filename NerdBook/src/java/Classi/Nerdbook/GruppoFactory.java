/**
 * @author Dzhuman Bohdan
 */
package Classi.Nerdbook;

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
        gruppo1.setNameGruppo("Softair");
        gruppo1.setDescrGruppo("Gruppo militaria e softair Sardegna.");
        gruppo1.setUrlImgGruppo("../../web/Asset/iconSoftair.jpg");
        gruppo1.setIdCreator(UtenteRegFactory.getInstance().getUserByName("Asuna"));
        
        Gruppo gruppo2 = new Gruppo();
        gruppo2.setIdGruppo(1);
        gruppo2.setNameGruppo("Music");
        gruppo2.setDescrGruppo("Qui, troverai tutta la musica che vuoi e di ottima qualità (suono). ");
        gruppo2.setUrlImgGruppo("../../web/Asset/iconMusic.jpg");
        gruppo2.setIdCreator(UtenteRegFactory.getInstance().getUserByName("Kim"));
        
        Gruppo gruppo3 = new Gruppo();
        gruppo3.setIdGruppo(2);
        gruppo3.setNameGruppo("Lineage");
        gruppo3.setDescrGruppo("Lineage II è un videogioco di tipo MMORPG, pubblicato il 1º ottobre 2003 dalla NCSoft.");
        gruppo3.setUrlImgGruppo("../../web/Asset/iconLineage.jpg");
        gruppo3.setIdCreator(UtenteRegFactory.getInstance().getUserByName("Ji-Yeon"));
        
        listGruppo.add(gruppo1);
        listGruppo.add(gruppo2);
        listGruppo.add(gruppo3); 
    }
    public Gruppo getGruppoById(int idGruppo){
        for(Gruppo gruppo : this.listGruppo){
            if(gruppo.getIdGruppo() == idGruppo){
                return gruppo;
            }
        }
        return null;
    }
    
    public Gruppo getGruppoByName(String nameGruppo){
        for(Gruppo gruppo : this.listGruppo){
            if(gruppo.getNameGruppo().equals(nameGruppo)){
                return gruppo;
            }
        }
        return null;
    }
    
    public List getListGruppo(){
        return listGruppo;
    }
}

