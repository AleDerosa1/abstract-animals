package org.lessons.regno.animali.java;

public abstract class Animale {
    private String nome;
    private String tipologia;


    //COSTRUTTORE
    public Animale (String nome, String tipologia){
        this.nome = nome;
        this.tipologia = tipologia;
    }



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipologia() {
        return this.tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }


    //METODO
    public void dorme(){
        System.out.println("Zzzzz");
    }

    public abstract void mangia();


    public abstract void verso();

      @Override
    public String toString() {
        return "L'animale: " + this.nome + " è un " + this.tipologia;
    }
    
}
