/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Administrateur
 */
public class Epee extends Arme{
    int finesse;
    public Epee(String name, int niveauAttaque, int finesse) {
        this.name = name;
        this.finesse = finesse;
        this.niveauAttaque = niveauAttaque;
    }
}
