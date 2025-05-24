package org.aston.module_one.homework.second_task;

public class Helicopter extends Vehicle implements Wheeled, Propelled,CargoTransport{

    @Override
    public void printInfo(){
        System.out.println("Helicopter is vehicle.");
    }

    @Override
    public boolean isCargoTransport() {
        return true;
    }

    @Override
    public boolean hasPropeller() {
        return true;
    }

    @Override
    public boolean hasWheels() {
        return true;
    }
}
