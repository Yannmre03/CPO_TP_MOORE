/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_moore;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class TP2_convertisseurObjet_MOORE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur stationMeteo = new Convertisseur();       //nouvelle reference objet de Convertisseur
        stationMeteo.CelciusVersFarenheit(10.0);       // conversions avec la méthode CelciusVersFarenheit de la classe Convertisseur
        stationMeteo.KelvinVersFarenheit(300.0);
        stationMeteo.CelciusVersKelvin(10.0);
        System.out.println("pour l'objet stationMeteo, " + stationMeteo + "\n");        // on affiche le nombre de conversions du convertisseur
        Convertisseur machine = new Convertisseur();            // de même pour une nouvelle reference objet
        machine.CelciusVersFarenheit(10.0);
        machine.FarenheitVersKelvin(451.0);
        System.out.println("pour l'objet machine, " + machine + "\n");
        //menu de conversions pour un utilisateur
        
        Convertisseur MenuConversions = new Convertisseur();
        Scanner sc = new Scanner(System.in);
        double valeurSortie;
        
        System.out.println("Quelle est la valeur de la température que vous voulez convertir? ");
        double valeurEntrée = sc.nextDouble();
        
        System.out.println("Quelle conversions voulez vous effetuer ? ");
        System.out.println(" (1) Celcius Vers Kelvin \n (2) Kelvin Vers Celcius \n "
            +"(3) Farenheit Vers Celcius \n (4) Celcius Vers Farenheit \n "
            +"(5) Farenheit Vers Kelvin \n (6) Kelvin Vers Farenheit ");
        int conversionChoisie = sc.nextInt();
        
        if (conversionChoisie == 1) {
            valeurSortie = MenuConversions.CelciusVersKelvin(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+valeurSortie + "K");
        }
        if (conversionChoisie == 2) {
            valeurSortie = MenuConversions.KelvinVersCelcius(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+valeurSortie + "°C");
        }
        if (conversionChoisie == 3) {
            valeurSortie = MenuConversions.FarenheitVersCelcius(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+valeurSortie + "°C");
        }
        if (conversionChoisie == 4) {
            valeurSortie = MenuConversions.CelciusVersFarenheit(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+valeurSortie + "F");
        }
        if (conversionChoisie == 5) {
            valeurSortie = MenuConversions.FarenheitVersKelvin(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+valeurSortie + "K");
        }
        if (conversionChoisie == 6) {
            valeurSortie = MenuConversions.KelvinVersFarenheit(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+valeurSortie + "F");
        }
        
        
        
    }
    
}
