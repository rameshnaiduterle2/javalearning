package com.java;

public class Vehicle {

    public static String NAME= "Breza";


    public Vehicle(String name, String vehicleType, int door) {
        this.modeName = name;
        this.vehicleType = vehicleType;
        this.doors = door;
    }

    public Vehicle(String name) {
        this.modeName = name;
    }

    public  Vehicle(){

    }

    String modeName;
    String vehicleType = "Electric";

    int doors;

    int seats;

    public void start(){

    }

    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle();
//        System.out.println(vehicle.toString());



    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modeName='" + modeName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", doors=" + doors +
                ", seats=" + seats +
                '}';
    }
}