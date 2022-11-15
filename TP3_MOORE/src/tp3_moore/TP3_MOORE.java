/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_moore;

import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Armes.bâton;
import Armes.Arme;
import Armes.Epee;
import java.util.Vector;

/**
 *
 * @author Administrateur
 */
public class TP3_MOORE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arme Epee1 = new Epee ("Excalibur",7,5);
        Arme Epee2 = new Epee ("Durandal",4,7);
        Arme bat1 = new bâton ("Chêne", 4, 5);
        Arme bat2 = new bâton ("Charme", 5, 6);
        
        Vector tabArmes = new Vector();
        tabArmes.add(Epee1);
        tabArmes.add(Epee2);
        tabArmes.add(bat1);
        tabArmes.add(bat2);
        for (int i =0; i < tabArmes.size(); i++ ){
            System.out.println(tabArmes.elementAt(i));
        }
        
        Personnage Magicien1 = new Magicien("Gandalf",65, true);
        Personnage Magicien2 = new Magicien("Garcimore",44,false);
        Personnage Guerrier1 = new Guerrier("Conan", 78, false);
        Personnage Guerrier2 = new Guerrier("Lannister", 45, true);
        Vector tabPerso = new Vector();
        tabPerso.add(Magicien1);
        tabPerso.add(Magicien2);
        tabPerso.add(Guerrier1);
        tabPerso.add(Guerrier2);
        for (int i =0; i < tabPerso.size(); i++ ){
            System.out.println(tabPerso.elementAt(i));
        }
        
    }
    
}
