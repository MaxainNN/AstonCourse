package org.aston.module_one.homework.second_task;

public class OneClassSolutionModuleOneTaskTwo {

    public abstract class Vehicle {

        public void printInfo(){
            System.out.println("It's vehicle.");
        }
    }

    public interface Winged {

        boolean hasWings();
    }

    public interface Wheeled {

        boolean hasWheels();
    }

    public interface Propelled {

        boolean hasPropeller();
    }

    public interface CargoTransport {
        boolean isCargoTransport();
    }

    public class Airplane extends Vehicle implements Winged, Wheeled, Propelled, CargoTransport {

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

    public class Helicopter extends Vehicle implements Wheeled, Propelled, CargoTransport {

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

    public class Boat extends Vehicle implements CargoTransport, Propelled {

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

    public class Tanker extends Vehicle implements CargoTransport, Propelled {

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

    public class Truck extends Vehicle implements Wheeled, CargoTransport {

        @Override
        public void printInfo(){
            System.out.println("Truck is vehicle.");
        }

        @Override
        public boolean hasWheels() {
            return true;
        }

        @Override
        public boolean isCargoTransport() {
            return true;
        }
    }

    public class Taxi extends Vehicle implements Wheeled {

        @Override
        public void printInfo(){
            System.out.println("Taxi is vehicle.");
        }

        @Override
        public boolean hasWheels() {
            return true;
        }
    }
}
