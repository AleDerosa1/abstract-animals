package org.lessons.regno.animali.java;

public class Aquila extends Animale implements Volante {

    public Aquila(String nome, String tipologia) {
        super(nome, tipologia);
        
    }

    @Override
    public void mangia(){
        System.out.println("Si nutre di mammiferi ed uccelli");
    }

    @Override
    public void verso(){
        System.out.println("Stridio");
    }

    @Override
    public void vola(){
        System.out.println("Sto volando!!");
    }
    
}
