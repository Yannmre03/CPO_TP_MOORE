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
    Personne Proprietaire ;     // créer une varaible proprétaire connecté avec la classe Personne 
    
    public Voiture (String unModele, String uneMarque, int puissance) {     // constrcteur 
        Marque = uneMarque;
        Modele = unModele;
        puissanceCV = puissance;
        Proprietaire = null;
    }
    
    @Override
    public String toString () {         // méthode string pour l'affichage 
        return Modele + " " + Marque + " " + puissanceCV;
    }
}
