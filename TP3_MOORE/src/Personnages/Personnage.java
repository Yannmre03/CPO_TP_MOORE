/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Administrateur
 */
public abstract class Personnage {
    String nom; 
    int niveauDeVie; 
    String ArmePortee = null;
    
    Vector armesPossedes = new Vector();
    public boolean ajouterUneArme(Arme armeAjouter){
        if (this.armesPossedes.size() == 5){
            return false;
        }else{
            this.armesPossedes.add(armeAjouter);
            return true;
        }
        
    }
    
    public void armePortee(){
        System.out.println("voici les armes disponibles, laquelle voulez vous choisir? \n");
        for (int i =0; i < this.armesPossedes.size(); i++ ){
            System.out.println("("+ i + ") " + this.armesPossedes.elementAt(i)); 
    }
      Scanner choix = new Scanner(System.in);
      int armeAjoutee = choix.nextInt();
      Arme name;
      ArmePortee = this.armesPossedes.elementAt(armeAjoutee).name;
    }
    
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
