package org.aston.module_one.homework.second_task;

public class Taxi extends Vehicle implements Wheeled{

    @Override
    public void printInfo(){
        System.out.println("Taxi is vehicle.");
    }

    @Override
    public boolean hasWheels() {
        return true;
    }
}
