/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_moore;

/**
 *
 * @author Administrateur
 */
public class Personne {
    String nom, prenom;
    int nbVoitures;
    Voiture [] liste_voitures;
    
    public Personne (String unPrenom, String unNom) {       // constructeur
    nom = unNom;
    prenom = unPrenom;
    liste_voitures = new Voiture [3] ;
    nbVoitures = 0;
    }
    
    @Override
    public String toString () {                             // méthode string 
        return prenom + " " + nom + " a " + nbVoitures + " voiture(s). Voici ses voitures: " + liste_voitures[0] + liste_voitures[1] + liste_voitures[2] ;
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire == null) {
            return false; 
            }
        for (int i = 0; i <= 3; i++ ) {
            
            return true;
            
        }
        
        return false;
    }

}
