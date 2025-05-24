package org.aston.module_one.homework.first_task;

public abstract class Mammal extends Animal implements Vertebrate{

    @Override
    public void printInfo(){
        System.out.println("I am a mammal.");
    }

    @Override
    public boolean hasSpine() {
        return true;
    }
}
