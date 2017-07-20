/**
 * @author Dzhuman Bohdan
 */
package Classi.Nerdbook;

import java.util.List;
import java.util.ArrayList;

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
        utente1.setIdUtenteReg(1);
        utente1.setNameUtenteReg("Asuna");
        utente1.setSurnameUtenteReg("Miyagi");
        utente1.setDescrPhrase("Kill noob, save mob!");
        utente1.setBirthDate("22 / 03 / 1991");
        utente1.setuType(UtenteReg.typeUtenteReg.ENTRANT);
        utente1.setPassWord("polkmn12345");
        
        UtenteReg utente2 = new UtenteReg();
        utente2.setIdUtenteReg(2);
        utente2.setNameUtenteReg("Ji-Yeon");
        utente2.setSurnameUtenteReg("Park");
        utente2.setDescrPhrase("My favorite team is T-ara <3");
        utente2.setBirthDate("07 / 06 / 1993");
        utente2.setuType(UtenteReg.typeUtenteReg.ENTRANT);
        utente2.setPassWord("polkmn12345");
        
        UtenteReg utente3 = new UtenteReg();
        utente3.setIdUtenteReg(3);
        utente3.setNameUtenteReg("Ara");
        utente3.setSurnameUtenteReg("Go");
        utente3.setDescrPhrase("A big kiss for each my fan :*");
        utente3.setBirthDate("11 / 02 / 1990");
        utente3.setuType(UtenteReg.typeUtenteReg.ENTRANT);
        utente3.setPassWord("polkmn12345");
        
        UtenteReg utente4 = new UtenteReg();
        utente4.setIdUtenteReg(4);
        utente4.setNameUtenteReg("Kim");
        utente4.setSurnameUtenteReg("Tae-Yeon");
        utente4.setDescrPhrase("I'm 41, but I feel like 18.");
        utente4.setBirthDate("03 / 01 / 1976");
        utente4.setuType(UtenteReg.typeUtenteReg.ENTRANT);
        utente4.setPassWord("polkmn12345");
        
        UtenteReg utente5 = new UtenteReg();
        utente5.setIdUtenteReg(0);
        utente5.setNameUtenteReg("Admin");
        utente5.setSurnameUtenteReg("Dictator");
        utente5.setDescrPhrase("ADMINISTRATOR OF NERDBOOK.");
        utente5.setBirthDate("00110001 00110101  / 00110000 00110011  / 00110001 00111001 00111001 00110101 ");
        utente5.setuType(UtenteReg.typeUtenteReg.ADMIN);
        utente5.setPassWord("OverPower");
        
        
        listUtenteReg.add(utente1);
        listUtenteReg.add(utente2);
        listUtenteReg.add(utente3);
        listUtenteReg.add(utente4);
        listUtenteReg.add(utente5);
    }
        
    public UtenteReg getUtenteRegById(int idUtente) {
        for(UtenteReg utente : this.listUtenteReg) {
            if (utente.getIdUtenteReg() == idUtente) {
                return utente;
            }
        }
        return null;
    }
    
    public UtenteReg getUserByName(String na){
        for(UtenteReg ut : this.listUtenteReg){
            if(ut.getNameUtenteReg().equals(na)){
                return ut;
            }
        }
        return null;
    }
    
    public List getListUtenteReg(){
        return listUtenteReg;
    }
}
