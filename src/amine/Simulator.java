package amine;

import amine.models.Aspirateur;
import amine.models.Grille;
import amine.models.Instructions;

public class Simulator {
    Aspirateur asp;
    Grille g;
    String inst;

    public Simulator(Aspirateur asp, Grille g, String inst) {
        this.asp = asp;
        this.g = g;
        this.inst = inst;
    }

    public Aspirateur getAsp() {
        return asp;
    }

    public void setAsp(Aspirateur asp) {
        this.asp = asp;
    }

    public Grille getG() {
        return g;
    }

    public void setG(Grille g) {
        this.g = g;
    }

    public String getInst() {
        return inst;
    }

    public void setInst(String inst) {
        this.inst = inst;
    }

    public Aspirateur run(){
        for(int i=0;i<inst.length();i++){
            if(inst.charAt(i) == 'G'){
                asp.addAngle(-90);
            }
            if(inst.charAt(i) == 'D'){
                asp.addAngle(90);
            }
            if(inst.charAt(i) == 'A'){
                asp.moveForward(g.getDimensionX()-1,g.getDimensionY()-1);
            }

        }
        return asp;

    }
}
