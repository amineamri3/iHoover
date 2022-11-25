package amine.models;

public class Aspirateur {

    Coordonnee cord;
    Orientations orientation;

    public Aspirateur(Coordonnee cord, Orientations orientation) {
        this.cord = cord;
        this.orientation = orientation;
    }

    public Aspirateur(int x, int y, Orientations orientation) {
        this.cord = new Coordonnee(x,y);
        this.orientation = orientation;
    }

    public Coordonnee getCord() {
        return cord;
    }

    public void setCord(Coordonnee cord) {
        this.cord = cord;
    }

    public Orientations getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientations orientation) {
        this.orientation = orientation;
    }

    public void addAngle(int a){
        int newAngle = Orientations.toAngle(orientation);
        newAngle = (newAngle + a) % 360;
        if(newAngle<0) newAngle = 360 + newAngle;
        orientation = Orientations.fromAngle(newAngle);
    }

    public void moveForward(int max_x, int max_y){
        Coordonnee newCord =new Coordonnee(cord.getX(), cord.getY());

        switch(orientation){
            case N:
                newCord.setY(newCord.getY()+1);
                break;
            case E:
                newCord.setX(newCord.getX()+1);
                break;
            case S:
                newCord.setY(newCord.getY()-1);
                break;
            case W:
                newCord.setX(newCord.getX()-1);
                break;
        }

        if(newCord.getX()>max_x || newCord.getX() < 0)
            return;
        if(newCord.getY()>max_y || newCord.getY() < 0)
            return;

        this.setCord(newCord);
    }
}
