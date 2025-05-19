package org.lessons.regno.animali.java;

public class Delfino extends Animale implements Nuotante {

    public Delfino(String nome, String tipologia) {
        super(nome, tipologia);
        
    }

    @Override
    public void mangia(){
        System.out.println("Mangia pesci, calamari e crostacei");
    }

         @Override
    public void verso(){
        System.out.println("Frigge");
    }

     @Override
    public void nuota(){
        System.out.println("Sto nuotandoo!!");
    }
}
