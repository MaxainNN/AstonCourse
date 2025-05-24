package org.aston.module_one.homework.first_task;

public class Cat extends Mammal implements FurBearer{
    @Override
    public boolean hasFur() {
        return true;
    }

    @Override
    public void printInfo(){
        System.out.println("Cat is a mammal.");
    }

}
