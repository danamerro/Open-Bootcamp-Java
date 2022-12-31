package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(precioProducto());
    }

    public static double precioProducto(){
        double precioSinIva = 10.00;
        double total = precioSinIva*1.21;
        return total;
    }
}
