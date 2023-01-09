package com.company;

public class SmartDevice {

        private String brand;
        private String model;
        private int year;
        private boolean isConnected;

        public SmartDevice(){
            this.brand="";
            this.model="";
            this.year=0;
            this.isConnected=false;
        }

        public SmartDevice(String brand, String model,int year){
            this.brand= brand;
            this.model=model;
            this.year=year;
            this.isConnected=false;
        }

        public String getBrand(){
            return this.brand;
        }

        public String getModel(){
            return this.model;
        }

        public int getYear(){
            return this.year;
        }

        public boolean isConnected(){
            return this.isConnected;
        }

        public void connect(){
            this.isConnected=true;
        }

        public void disconnect(){
            this.isConnected=false;
        }



}
