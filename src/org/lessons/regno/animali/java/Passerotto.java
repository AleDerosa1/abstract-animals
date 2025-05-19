package org.lessons.regno.animali.java;

public class Passerotto extends Animale implements Volante {

    public Passerotto(String nome, String tipologia) {
        super(nome, tipologia);
        
    }


    @Override
    public void mangia(){
        System.out.println("Mangia semi, cereali, frutta ed insetti");
    }

     @Override
    public void verso(){
        System.out.println("Cinguettio");
    }

    @Override
    public void vola(){
        System.out.println("Sto volandoo!!");
    }
    
}
