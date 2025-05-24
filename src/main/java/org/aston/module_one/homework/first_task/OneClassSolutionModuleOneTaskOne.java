package org.aston.module_one.homework.first_task;

public class OneClassSolutionModuleOneTaskOne {

    public abstract class Animal {

        public void printInfo(){
            System.out.println("I am an animal.");
        }
    }

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

    public interface FurBearer {

        boolean hasFur();
    }

    public interface Vertebrate {

        boolean hasSpine();
    }

    public interface WaterDweller {

        void swim();
    }

    public class Fish extends Animal implements WaterDweller {

        @Override
        public void swim() {
            System.out.println("Fish swimming.");
        }

        @Override
        public void printInfo(){
            System.out.println("Fish is an animal.");
        }
    }

    public class Whale extends Mammal implements WaterDweller {
        @Override
        public void swim() {
            System.out.println("Whale swimming.");
        }

        @Override
        public void printInfo(){
            System.out.println("Whale is a mammal.");
        }
    }

    public class Cat extends Mammal implements FurBearer {
        @Override
        public boolean hasFur() {
            return true;
        }

        @Override
        public void printInfo(){
            System.out.println("Cat is a mammal.");
        }

    }

    public class Bear extends Mammal implements FurBearer {
        @Override
        public boolean hasFur() {
            return true;
        }

        @Override
        public void printInfo(){
            System.out.println("Bear is a mammal.");
        }
    }

}