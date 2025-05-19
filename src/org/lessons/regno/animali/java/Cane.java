package org.lessons.regno.animali.java;

public class Cane extends Animale {

    public Cane(String nome, String tipologia) {
        super(nome, tipologia);
        
    }

    @Override
    public void mangia(){
        System.out.println("Mangia croccantini o anche carne");
    }

     @Override
    public void verso(){
        System.out.println("Abbaia");
    }
    
}
