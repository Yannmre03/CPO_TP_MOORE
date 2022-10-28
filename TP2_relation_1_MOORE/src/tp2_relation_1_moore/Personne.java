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
    Voiture [] liste_voitures;      // creer tableau connecté à la classe Voiture
    
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
        if (voiture_a_ajouter.Proprietaire != null) {           // passe à l'étape suivante seulement si la voiture n'a pas de propriétaire
            return false; 
            }
        for (int i = 0; i < 3; i++ ) {      // parcours la liste de voiture de la personne
            if (this.liste_voitures[i] == null) {           // passe à la suite seulement si une place du tableau est vide
                this.liste_voitures[this.nbVoitures] = voiture_a_ajouter ;       //assigne une voiture à la personne désignée
                this.nbVoitures += 1 ;          // incrémente son nombrede voiture                
                voiture_a_ajouter.Proprietaire = this ;     // ajoute le proprio à la voiture
                return true;    
            }
            else { if (i == 2){             // return false si tout le tableau a été parcouru mais qu'il n'y a plus de place
               return false; 
            }
                
            }          
        }
        return false;
    }

}
