package amine;

import amine.models.Instructions;
import amine.interfaces.Input;
import amine.models.Orientations;


import java.util.Scanner;

public class InputReader implements Input {

    private Scanner input = new Scanner(System.in);

    @Override
    public InputData getInput() {
        //Grille
        int dimensionX;
        int dimensionY;
        //Aspirasteur
        int initAspirateurX;
        int initAspirateurY;
        Orientations orientationAspirateur;
        //Instructions
        String instructions;

        System.out.print("Dimensions de la grille:\nX: ");
        dimensionX = inputNumber(1, -1);
        System.out.print("Y: ");
        dimensionY = inputNumber(1, -1);

        System.out.print("\nPosition initial de l'aspirateur:\nX: ");
        initAspirateurX = inputNumber(0, dimensionX - 1);
        System.out.print("Y: ");
        initAspirateurY = inputNumber(0, dimensionY - 1);
        orientationAspirateur = inputOrientation();

        instructions = inputInstructions();


        return new InputData(dimensionX, dimensionY, initAspirateurX, initAspirateurY, orientationAspirateur, instructions);

    }

    int inputNumber(int min,int max){
        // -1 if optional
        int in = input.nextInt();
        while( (in<min && min != -1) || (in>max && max != -1)){
            System.out.println(String.format("Entrez un nombre entre %d et %d",min,max));
            in = input.nextInt();
        }
        return in;
    }

    Orientations inputOrientation(){
        String in = "";
        input.nextLine(); // consume the \n left by NextInt
        do{
            System.out.println("Orientation : ");
            in = input.nextLine();
        }while(!Orientations.contains(in));
        return Orientations.valueOf(in);
    }
    String inputInstructions(){
        String in ="";
        boolean valid = false;
        while(!valid){
            valid = true;
            System.out.println("Insructions : ");
            in = input.nextLine();
            if(!Instructions.isValid(in))
                valid = false;
        }
        return in;
    }

}
