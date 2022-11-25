package amine;

import amine.models.Orientations;
import com.sun.org.apache.xpath.internal.operations.Or;

public class InputData {

    //Grille
    private int dimensionX;
    private int dimensionY;

    //Aspirasteur
    private int initAspirateurX;
    private int initAspirateurY;
    private Orientations orientationAspirateur;

    //Instructions
    private String instructions;


    public InputData(int dimensionX, int dimensionY, int initAspirateurX, int initAspirateurY, Orientations orientationAspirateur, String instructions) {
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.initAspirateurX = initAspirateurX;
        this.initAspirateurY = initAspirateurY;
        this.orientationAspirateur = orientationAspirateur;
        this.instructions = instructions;
    }

    public int getDimensionX() {
        return dimensionX;
    }

    public void setDimensionX(int dimensionX) {
        this.dimensionX = dimensionX;
    }

    public int getDimensionY() {
        return dimensionY;
    }

    public void setDimensionY(int dimensionY) {
        this.dimensionY = dimensionY;
    }

    public int getInitAspirateurX() {
        return initAspirateurX;
    }

    public void setInitAspirateurX(int initAspirateurX) {
        this.initAspirateurX = initAspirateurX;
    }

    public int getInitAspirateurY() {
        return initAspirateurY;
    }

    public void setInitAspirateurY(int initAspirateurY) {
        this.initAspirateurY = initAspirateurY;
    }

    public Orientations getOrientationAspirateur() {
        return orientationAspirateur;
    }

    public void setOrientationAspirateur(Orientations orientationAspirateur) {
        this.orientationAspirateur = orientationAspirateur;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
