/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_moore;

/**
 *
 * @author Administrateur
 */
public class BouteilleBiere {               // type classe
    public String Nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte;
    
    public void  lireEtiquette() {              // lit l'etiquette
System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie + "\n" ) ;
}
    
    @Override
public String toString() {  // change la réponse que la console renoie quand on appelle une reference d'objet
String chaine_a_retourner;
chaine_a_retourner = Nom + " (" + degreAlcool + " degrés)Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += ("oui \n") ;
else chaine_a_retourner += "non \n" ;
return chaine_a_retourner ;
}

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {      // constructeur
 Nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}
    
     public boolean Décapsuler() {                      // permet de décapsuler une bière 
        if (ouverte == false) {
            ouverte = true; 
            System.out.println(" bière décapsulée \n");
            return true;
        }
        else {
            System.out.println(" erreur : biere déjà ouverte \n");
            return false;
                    }
}  
}


    