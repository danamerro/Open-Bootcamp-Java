package com.company;

public class SmartWatch extends SmartDevice{
    private String color;
    private int batteryLevel;
    private boolean isOnWrist;

    public SmartWatch() {
        super();
        this.color = "";
        this.batteryLevel = 0;
        this.isOnWrist = false;
    }

    public SmartWatch(String brand, String model, int year, String color){
        super(brand,model,year);
        this.color=color;
        this.batteryLevel=100;
        this.isOnWrist = false;
    }

    public String getColor(){
        return this.color;
    }

    public int getBatteryLevel(){
        return this.batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel){
        this.batteryLevel= batteryLevel;
    }

    public boolean isOnWrist(){
        return this.isOnWrist;
    }

    public void putOnWrist(){
        this.isOnWrist=true;
    }

    public void takeOffWrist(){
        this.isOnWrist=false;
    }

}
