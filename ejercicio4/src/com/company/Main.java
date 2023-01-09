package com.company;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Apple","Iphone 11",2019,"Movistar");
        SmartWatch smartwatch = new SmartWatch("Samsung","Galaxy Watch",2018,"pink");

        System.out.println("Smartphone: ");
        System.out.println(" Brand: "+smartphone.getBrand());
        System.out.println(" Model: "+smartphone.getModel());
        System.out.println(" Year: "+smartphone.getYear());
        System.out.println(" Carrier: "+smartphone.getCarrier());
        System.out.println(" Battery Level: "+smartphone.getBatteryLevel()+
                "%");
        System.out.println(" Locked: "+smartphone.isLocked());
        System.out.println(" Connected: "+smartphone.isConnected());

        System.out.println("Smartwatch");
        System.out.println(" Brand: "+smartwatch.getBrand());
        System.out.println(" Model: "+smartwatch.getModel());
        System.out.println(" Year: "+smartwatch.getYear());
        System.out.println(" Color: "+smartwatch.getColor());
        System.out.println(" Battery Level:"+smartwatch.getBatteryLevel()+
                "%");
        System.out.println(" On Wrist: "+smartwatch.isOnWrist());
        System.out.println(" Connected: "+smartwatch.isConnected());
    }

}
