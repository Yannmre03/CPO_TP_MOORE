/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Administrateur
 */
public class Guerrier extends Personnage{
    private boolean cheval;
    
    public Guerrier(String nom, int niveauDeVie, boolean cheval){
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.cheval = cheval;
    }
    public void setCheval(boolean cheval){
        this.cheval = cheval;
    }
}
