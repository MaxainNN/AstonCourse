package org.aston.module_one.homework.second_task;

public class Truck extends Vehicle implements Wheeled, CargoTransport{

    @Override
    public void printInfo(){
        System.out.println("Truck is vehicle.");
    }

    @Override
    public boolean hasWheels() {
        return true;
    }

    @Override
    public boolean isCargoTransport() {
        return true;
    }
}
