package org.aston.module_one.homework.second_task;

public class Airplane extends Vehicle implements Winged, Wheeled, Propelled,CargoTransport{

    @Override
    public void printInfo(){
        System.out.println("Airplane is vehicle.");
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

    @Override
    public boolean hasWings() {
        return true;
    }
}
