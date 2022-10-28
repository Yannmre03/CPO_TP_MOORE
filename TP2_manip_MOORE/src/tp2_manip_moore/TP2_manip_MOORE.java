/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_moore;

/**
 *
 * @author Administrateur
 */
public class TP2_manip_MOORE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        Moussaka [] Tab = new Moussaka[10];
        //nous avons réellement que 2 tartiflettes, assiette3 et assiette2 sont deux références qui pointent vers le même objet
        System.out.println("nb de calories de Assiette 1 : " +
        assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        assiette3.modifier_calories(550); 
        System.out.println("nb de calories de Assiette 2 après modification de l'assiette3 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 après sa modification : " +
        assiette3.nbCalories) ;
        //on remarque que le nombre de calories de l'assiette2 change lorsque l'on modifie l'assiette3: c'est donc le même objet
        assiette2 = assiette1;
        assiette1 = assiette3; //nous avons bien interverti 1 et 2 car 3 et 2 référencent le même objet
        //Moussaka assiette666 = assiette1 ; une assiette de trtiflette ne peut pas etre convertie en moussaka
        //Moussaka assiette667 = new Tartiflette(500) ;on ne peut pas creer une assiette de moussaka à l'aide de la recette d'une tartiflette 
        
        for (int i=0; i<10; i++) {      //parcours 10 fois la boucle avec comme valeur de i : 0 -> 10 en augmentant de 1 à chaque tour
            Tab[i] = new Moussaka(300+i); // création d'une nouvelle moussaka à chaque fois avec 1 calorie de plus 
        }
        System.out.println(Tab[5].nbCalories); // on voit que Tab[5] a bien 305 calories
        
    }
    
}
