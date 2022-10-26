/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_moore;

/**
 *
 * @author Administrateur
 */
public class Convertisseur {
    int nbConversions;                  // nombre de conversions a effectuer 
    
    public Convertisseur () {       //constructeur 
    nbConversions = 0 ;
    }
    public double CelciusVersKelvin(double tempCelcius) {       // converti des celcius en kelvin (float -> float) 
        nbConversions +=1;                                      // met à jour le nb de conversions
        return tempCelcius + 273.15;                            // retourne la température convertie 
    }
    public double KelvinVersCelcius(double tempKelvin) {        // converti des Kelvin en Celcius (float -> float)  
        nbConversions +=1;
        return tempKelvin - 273.15;
    }
    public double FarenheitVersCelcius(double tempFarenheit) {  // etc 
        nbConversions +=1;
        return (tempFarenheit - 32.0)/1.8;
    }
    public double CelciusVersFarenheit(double tempCelcius) {        
        nbConversions +=1;
        return (tempCelcius *1.8 + 32);
    }
    public double FarenheitVersKelvin(double tempFarenheit) {
        nbConversions += 1; 
        return (tempFarenheit-32)/1.8 + 273.15;
    }
    public double KelvinVersFarenheit(double tempKelvin) {
        nbConversions += 1; 
        return (tempKelvin-273.15)*1.8 + 32;
    }
    @Override
    public String toString () {
    return "nb de conversions: "+ nbConversions;
    }
}
