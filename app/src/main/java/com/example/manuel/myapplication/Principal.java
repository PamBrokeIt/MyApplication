package com.example.manuel.myapplication;

import java.util.ArrayList;
import java.util.List;


public class Principal {

    public static void main(String arg[]) { //static es un método de una clase para que el metodo funcione como una funcion normal fuera de la clase.
        System.out.println("hola mundo\n"); //esto equivale a cout, \n es un salto de linea, pero el ln de println se supone hace lo mismo.

        int a = 0;

        int b = 3;

        int c;

        boolean d = false;

        int z = a + b;

        System.out.println(z);
    }

    public static void String(String arg[]) {

        String a = "hola";


        try {
            for (int i = 0;
            i<a.lenght(); i++){

                System.out.println(a.charAt(i));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ArrayList(String arg[]){
        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(3);
        numeros.add(4);

        for (int i =0; i<numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        for (int x : numeros) {
            System.out.println(x);
        }

}
