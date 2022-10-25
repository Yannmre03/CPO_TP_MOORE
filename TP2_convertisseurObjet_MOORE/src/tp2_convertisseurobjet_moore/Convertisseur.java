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

    @Override
    public String toString () {
    return "nb de conversions"+ nbConversions;
}
    public Convertisseur () {       //constructeur 
    nbConversions = 0 ;
}
    
    public double CelciusVersKelvin(double tempCelcius) {       // converti des celcius en kelvin (float -> float) 
        nbConversions +=1;
        return tempCelcius + 273.15;
    }
    public double KelvinVersCelcius(double tempKelvin) {
        nbConversions +=1;
        return tempKelvin - 273.15;
    }
    
}
