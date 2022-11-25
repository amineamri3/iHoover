package amine;

import amine.models.Aspirateur;
import amine.models.Coordonnee;
import amine.models.Grille;
import amine.models.Instructions;

public class Main {

    public static void main(String[] args) {

        InputReader reader = new InputReader();
        InputData data = reader.getInput();

        Grille grille = new Grille(data.getDimensionX(), data.getDimensionY());
        Coordonnee aspInit = new Coordonnee(data.getInitAspirateurX(), data.getInitAspirateurY());
        Aspirateur asp = new Aspirateur(aspInit, data.getOrientationAspirateur());


        Simulator sim = new Simulator(asp, grille, data.getInstructions());

        asp = sim.run();

        System.out.println(String.format("x=%d  y=%d  orientation=%s",asp.getCord().getX(), asp.getCord().getY(), asp.getOrientation().toString()));

    }
}
