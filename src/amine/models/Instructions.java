package amine.models;

public enum Instructions {
    G,D,A;

    public static boolean isValid(String test) {
        try {
            for (int i = 0;i<test.length();i++) {
                Instructions.valueOf(test.substring(i,i+1));
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
