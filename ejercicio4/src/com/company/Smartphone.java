package com.company;

public class Smartphone extends SmartDevice{
    private String carrier;
    private int batteryLevel;
    private boolean isLocked;

    public Smartphone() {
        super();
        this.carrier = "";
        this.batteryLevel = 0;
        this.isLocked = true;
    }

    public Smartphone(String brand, String model, int year, String carrier){
        super(brand,model,year);
        this.carrier=carrier;
        this.batteryLevel = 100;
        this.isLocked = true;
    }

    public String getCarrier(){
        return this.carrier;
    }

    public int getBatteryLevel(){
        return this.batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isLocked(){
        return this.isLocked;
    }

    public void lock(){
        this.isLocked=true;
    }

    public void unLock(){
        this.isLocked=false;
    }



}
