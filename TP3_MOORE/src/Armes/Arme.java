/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Administrateur
 */
public abstract class Arme {
    String nom;
    int niveauAttaque;
    
    public int connaitreNivAttaque() {
        return niveauAttaque;
    }
    
    public String connaitreNom() {
        return nom;
    }
            
            
    @Override
    public String toString () {                             // méthode string 
        return "nom de l'arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
    
}
