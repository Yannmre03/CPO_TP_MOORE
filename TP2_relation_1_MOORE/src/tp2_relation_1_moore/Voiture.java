/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_moore;

/**
 *
 * @author Administrateur
 */
public class Voiture {
    String Modele, Marque;
    int puissanceCV;
    Personne Proprietaire ;
    
    public Voiture (String unModele, String uneMarque, int puissance) {
        Marque = uneMarque;
        Modele = unModele;
        puissanceCV = puissance;
        Proprietaire = null;
    }
    
    @Override
    public String toString () {
        return "caractéristiques de la voiture: " + Marque + ", " + Modele + ", " + puissanceCV + "\n";
    }
    
    public String Voiture(String unModele, String uneMarque, int puissance ) {
        Marque = uneMarque;
        Modele = unModele;
        puissanceCV = puissance;
        return Marque + Modele + puissanceCV;
    }
}
