package com.example.manuel.myapplication;

public class Complejo {

    private double real, imaginario; //los atributos deben de ser declarados como private para que no sean editados por fuera del objeto.

    public Complejo(double r, double i) {
        this.real = r;//cada vez que usamos un this es para hacer referencia a una variable dentro de la clase
        this.imaginario = i;
    }

    public Complejo suma(Complejo a, Complejo b){
        return new Complejo(a.real + b.real,
                a.imaginario + b.imaginario);
    }

    public void suma(Complejo a, Complejo b){ //Los metodos o funciones static del tipo void no devuelven cosas, por lo menos con return
        this.real = a.real +b.real;
    }
}
