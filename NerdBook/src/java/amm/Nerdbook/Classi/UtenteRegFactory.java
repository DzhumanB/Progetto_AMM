/**
 * @author Dzhuman Bohdan
 */
package amm.Nerdbook.Classi;

import java.util.ArrayList;
import java.util.List;

public class UtenteRegFactory {
    
    private static UtenteRegFactory singleton;
    
    public static UtenteRegFactory getInstance(){
        if(singleton == null){
            singleton = new UtenteRegFactory();
        }
        return singleton;
    }
    
    private ArrayList<UtenteReg> listUtenteReg = new ArrayList<UtenteReg>();
    
    private UtenteRegFactory(){
    
        UtenteReg utente1 = new UtenteReg();
        utente1.setIdUtente(0);
        utente1.setNome("Asuna");
        utente1.setCognome("Miyagi");
        utente1.setFrasePres("Kill noob, save mob!");
        utente1.setDataNasc("22 / 03 / 1991");
        utente1.setUsername("miyagi.asuna");
        utente1.setPassword("polkmn12345");
        
        UtenteReg utente2 = new UtenteReg();
        utente2.setIdUtente(1);
        utente2.setNome("Ji-Yeon");
        utente2.setCognome("Park");
        utente2.setFrasePres("My favorite team is T-ara <3");
        utente2.setDataNasc("07 / 06 / 1993");
        utente2.setUsername("park.ji-yean");
        utente2.setPassword("polkmn12345");
        
        UtenteReg utente3 = new UtenteReg();
        utente3.setIdUtente(2);
        utente3.setNome("Ara");
        utente3.setCognome("Go");
        utente3.setFrasePres("A big kiss for each my fan :*");
        utente3.setDataNasc("11 / 02 / 1990");
        utente3.setUsername("go.ara");
        utente3.setPassword("polkmn12345");
        
        UtenteReg utente4 = new UtenteReg();
        utente4.setIdUtente(3);
        utente4.setNome("Kim");
        utente4.setCognome("Tae-Yeon");
        utente4.setFrasePres("I'm 41, but I feel like 18.");
        utente4.setDataNasc("03 / 01 / 1976");
        utente4.setUsername("tae-yeon.kim");
        utente4.setPassword("polkmn12345");
        
        listUtenteReg.add(utente1);
        listUtenteReg.add(utente2);
        listUtenteReg.add(utente3);
        listUtenteReg.add(utente4);
    }
        
    public UtenteReg getUtenteRegById(int idUtente) {
        for(UtenteReg utente : this.listUtenteReg) {
            if (utente.getIdUtente() == idUtente) {
                return utente;
            }
        }
        return null;
    }
    
    public int getIdUtenteAndPassword(String username, String password){
        for(UtenteReg utente : this.listUtenteReg){
            if(utente.getNome().equals(username) && utente.getPassword().equals(password)){
                return utente.getIdUtente();
            }
        }
        return -1;
    }
    
    public UtenteReg getUserByNome(String n)
    {
        for(UtenteReg u : this.listUtenteReg)
        {
            if(u.getNome().equals(n))
                return u;
        }
        return null;
    }
    
    public List getListUtenteReg()
    {
        return listUtenteReg;
    }
}
