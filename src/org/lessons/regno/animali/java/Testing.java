package org.lessons.regno.animali.java;

public class Testing {

    public static void faiVolare(Volante parm1Volante){

        parm1Volante.vola();

    }

    public static void faiNuotare(Nuotante parm2Nuotante){

        parm2Nuotante.nuota();

    }

    public static void main(String[] args) {

        Aquila Gianni = new Aquila("gianni", "fero");
        this.faiVolare(Gianni);
        
    }
    
}
