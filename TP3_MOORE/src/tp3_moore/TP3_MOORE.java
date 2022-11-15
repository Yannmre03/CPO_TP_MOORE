/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_moore;

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
        
        System.out.println(Epee1.connaitreNivAttaque());
        
    }
    
}
