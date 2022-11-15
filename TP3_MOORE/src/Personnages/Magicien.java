/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Administrateur
 */
public class Magicien extends Personnage {
    private boolean confirmé;
    
    public Magicien(String nom, int niveauDeVie, boolean confirmé){
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.confirmé = confirmé;
    }
    
    public void setCheval(boolean confirmé){
        this.confirmé = confirmé;
    }
}
