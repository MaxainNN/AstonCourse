package org.aston.module_one.homework.second_task;

public class Boat extends Vehicle implements CargoTransport, Propelled{

    @Override
    public void printInfo(){
        System.out.println("Boat is vehicle.");
    }

    @Override
    public boolean isCargoTransport() {
        return true;
    }

    @Override
    public boolean hasPropeller() {
        return true;
    }
}
