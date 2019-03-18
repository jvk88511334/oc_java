package object_oriented.e_abstract_and_interface;

import object_oriented.e_abstract_and_interface.abstract_class.Animal;
import object_oriented.e_abstract_and_interface.abstract_class.Chien;
import object_oriented.e_abstract_and_interface.abstract_class.Rintintin;
import object_oriented.e_abstract_and_interface.strategy_pattern.without_pattern.*;

public class EAbstractAndInterface {

    /*
    Animal ani = new Animal(); //Classe abstraite
    ((Loup)ani).manger(); //Transtypage

    //Référence obj ; type Loup ci dessous. La référence obj pointe vers un emplacement mémoire
    Object obj = new Loup();
    //Loup l = obj; //problème de référence
    Loup l = (Loup)obj; //Prevenez la JVM que la référence que vous passez est de type loup
    */

    public EAbstractAndInterface() {
        System.out.print("\u001B[33m");

        Animal l = new Chien("Gris bleuté", 20);
        l.boire();
        l.manger();
        l.deplacement();
        l.crier();
        System.out.println(l.toString());

        //l.faireCalin(); impossible, il faut que le chien soit du supertype qui est son interface pour que ça marche
        Rintintin r = new Chien();
        r.faireCalin();
        r.faireLeBeau();
        r.faireLechouille();

        System.out.print("\u001B[34m");

        System.out.println("//Exemple utilisation pattern Strategy//");

        System.out.println("//A NE PAS FAIRE - SANS LE DESIGN PATTERN//");

        Personnage[] tPers = {new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin()};

        for (Personnage p : tPers) {
            System.out.println("\nInstance de " + p.getClass().getName());
            System.out.println("***************************************");
            p.combattre();
            p.seDeplacer();
            //PROBLEME p.soigner() inutilisable de manière polymorphe
        }

        Personnage[] tPers2 = {new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin()};
        String[] tArmes = {"pistolet", "pistolet", "couteau", "fusil à pompe", "couteau"};

        for (int i = 0; i < tPers2.length; i++) {
            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("*****************************************");
            tPers[i].combattre();
            tPers[i].setArmes(tArmes[i]);
            tPers[i].combattre();
            tPers[i].seDeplacer();
            //tPers[i].soigner(); inutilisable en l'état
        }

        System.out.println("//A FAIRE - AVEC LE DESIGN PATTERN//");



    }
}
