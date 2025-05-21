package org.lessons.regno.animali.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ecco il Regno Animali");

        Aquila aquilaReale = new Aquila("Aquila Reale", "Volatile");
        Cane pitBull = new Cane("Pitbull", "Canide");
        Passerotto fringuelloAlpino = new Passerotto("Fringuello Alpino", "Volatile");
        Delfino delfinoDelleAmazzoni = new Delfino("Delfino delle Amazzoni", "Cetaceo");

        System.out.println(aquilaReale);
        System.out.println(pitBull);
        System.out.println(fringuelloAlpino);
        System.out.println(delfinoDelleAmazzoni);


        Animale[] listaAnimali = new Animale[4];
        listaAnimali[0] = aquilaReale;
        listaAnimali[1] = pitBull;
        listaAnimali[2] = fringuelloAlpino;
        listaAnimali[3] = delfinoDelleAmazzoni;
        System.out.println(Arrays.toString(listaAnimali));
       
        

    }
    
}
