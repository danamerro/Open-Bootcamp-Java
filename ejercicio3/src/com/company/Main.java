package com.company;



public class Main {

    public static void main(String[] args) {

        String[] nombres = {"pepe","julian","mora","rosa"};

        String resultado = "";

        for (int i =0; i<nombres.length;i++){
            resultado= resultado+nombres[i]+" ";
        }
        System.out.println(resultado);

    }
}
