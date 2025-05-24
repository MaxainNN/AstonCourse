package org.aston.module_one.homework.first_task;

public class Whale extends Mammal implements WaterDweller{
    @Override
    public void swim() {
        System.out.println("Whale swimming.");
    }

    @Override
    public void printInfo(){
        System.out.println("Whale is a mammal.");
    }
}
