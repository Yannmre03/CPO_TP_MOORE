/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_moore;

/**
 *
 * @author Administrateur
 */
public class TP2_Bieres_MOORE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        uneBiere.Décapsuler();
        System.out.println(uneBiere);
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
        uneBiere.Décapsuler();
        System.out.println(autreBiere) ;
        
        BouteilleBiere biereForte = new BouteilleBiere("Maximator", 12.0 ,"Usine chimique") ;
        biereForte.lireEtiquette();
        biereForte.Décapsuler();
        System.out.println(biereForte) ;
        biereForte.Décapsuler();
    }
    
}
