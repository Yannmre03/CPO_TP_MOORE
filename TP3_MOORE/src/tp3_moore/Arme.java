/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_moore;

/**
 *
 * @author Administrateur
 */
public abstract class Arme {
    String nom;
    int niveauAttaque;
    
    
            
            
    @Override
    public String toString () {                             // méthode string 
        return "nom de l'arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
    
}
