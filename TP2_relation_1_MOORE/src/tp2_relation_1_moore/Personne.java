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
    
    public Personne (String unPrenom, String unNom) {
    nom = unNom;
    prenom = unPrenom;
    }
    
    @Override
    public String toString () {
        return "personne:" + nom + " " + prenom;
    }
    
    public String Personne(String unPrenom, String unNom) {
        nom = unNom;
        prenom = unPrenom;
        return prenom + nom;
    }
}
