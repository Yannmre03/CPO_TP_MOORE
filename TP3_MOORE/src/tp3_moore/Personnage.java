/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_moore;

/**
 *
 * @author Administrateur
 */
public abstract class Personnage {
    String nom; 
    int niveauDeVie; 
    
    public int connaitreVie(){
        return niveauDeVie;
    }
    
    public String connaitrePerso(){
        return nom;
    }
    
    @Override
    public String toString () {                             // méthode string 
        return "nom du personnage: " + nom + ", Niveau de vie: " + niveauDeVie;
    }
    
}
