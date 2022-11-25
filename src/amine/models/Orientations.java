package amine.models;

import com.sun.org.apache.xpath.internal.operations.Or;

public enum Orientations {
    N,  //0
    E, //90
    S,//180
    W;//270


    public static boolean contains(String test) {

        for (Orientations c : Orientations.values()) {
            if (c.name().equals(test)) {
                return true;
            }
        }

        return false;
    }

    public static int toAngle(Orientations o){
        switch (o){
            case N: return 0;
            case E: return 90;
            case S: return 180;
            case W: return 270;
        }
        return 0;
    }

    public static Orientations fromAngle(int i){
        switch (i){
            case 0: return N;
            case 90: return E;
            case 180: return S;
            case 270: return W;
        }
        return N;
    }


}
