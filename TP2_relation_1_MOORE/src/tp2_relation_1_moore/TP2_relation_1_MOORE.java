/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_moore;

/**
 *
 * @author Administrateur
 */
public class TP2_relation_1_MOORE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;     //ajout manuel de voitures
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Voiture une206 = new Voiture ("206", "Peugeot", 4 ) ;
        Voiture une308 = new Voiture ("308", "Peugeot", 6 ) ;
        Personne Bob = new Personne("Bobby", "Sixkiller");      // ajout manuel de personnes
        Personne Reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles: \n "+ uneClio +
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;      // affiche les voitures disponibles
        
        Bob.liste_voitures[Bob.nbVoitures] = uneClio ;       //assigne une voiture à Bob
        Bob.nbVoitures += 1 ;                    
        uneClio.Proprietaire = Bob ;        // assigne le propriétaire Bob à uneClio
        Bob.liste_voitures[Bob.nbVoitures] = une2008;    //seconde voiture
        Bob.nbVoitures += 1 ;                    
        une2008.Proprietaire = Bob ;
        
        Reno.liste_voitures[Reno.nbVoitures] = uneMicra ;       //assigne une voiture à Bob
        Reno.nbVoitures += 1 ;                    
        uneClio.Proprietaire = Reno ;        // assigne le propriétaire Reno à uneMicra
        Reno.liste_voitures[Reno.nbVoitures] = uneAutreClio;    //seconde voiture
        Reno.nbVoitures += 1 ;                    
        une2008.Proprietaire = Reno ;
        
        System.out.println("la premiere voiture de Bob est " +
        Bob.liste_voitures[0]) ;       //tester le fonctionnement 
        
        System.out.println(Bob.ajouter_voiture(une206));        // on a bien la valeur true car une206 n'a pas de proprio
        System.out.println(Bob.ajouter_voiture(uneMicra));       // uneMicra appartient déja à Reno donc false
        System.out.println(Bob.ajouter_voiture(une308));        // Bob a déjà 3 voitures donc false
        }
    
}
