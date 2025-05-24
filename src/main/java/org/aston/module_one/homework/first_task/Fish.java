package org.aston.module_one.homework.first_task;

public class Fish extends Animal implements WaterDweller{

    @Override
    public void swim() {
        System.out.println("Fish swimming.");
    }

    @Override
    public void printInfo(){
        System.out.println("Fish is an animal.");
    }
}
