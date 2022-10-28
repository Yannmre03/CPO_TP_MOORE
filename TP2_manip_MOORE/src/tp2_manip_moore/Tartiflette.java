/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_moore;

/**
 *
 * @author Administrateur
 */
public class Tartiflette {
    int nbCalories;
    
    public Tartiflette ( int caloriesInit) {        // constructeurqui initalise nbCalories
        nbCalories = caloriesInit;
    }
    public int modifier_calories (int desCalories) {
        nbCalories = desCalories;
        return nbCalories;
    }
}
