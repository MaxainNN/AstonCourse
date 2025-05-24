package org.aston.module_one.homework.second_task;

public class Tanker extends Vehicle implements CargoTransport, Propelled{

    @Override
    public void printInfo(){
        System.out.println("Tanker is vehicle.");
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
