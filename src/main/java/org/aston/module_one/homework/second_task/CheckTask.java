package org.aston.module_one.homework.second_task;

public class CheckTask {
    public static void main(String[] args) {
        // Checking in the console
        // Airplane
        Airplane airplane = new Airplane();
        airplane.printInfo();
        boolean isAirplaneHasWings = airplane.hasWings();
        boolean isAirplaneHasWheels = airplane.hasWheels();
        boolean isAirplaneHasPropeller = airplane.hasPropeller();
        boolean isAirplaneCargoTransport = airplane.isCargoTransport();
        System.out.println("Airplane has wings - " + isAirplaneHasWings + " , has wheels - "
                + isAirplaneHasWheels + " , has propeller - " + isAirplaneHasPropeller
                + " , cargo transport - " + isAirplaneCargoTransport);
        // Helicopter
        Helicopter helicopter = new Helicopter();
        helicopter.printInfo();
        boolean isHelicopterHasWheels = helicopter.hasWheels();
        boolean isHelicopterHasPropeller = helicopter.hasPropeller();
        boolean isHelicopterCargoTransport = helicopter.isCargoTransport();
        System.out.println("Helicopter has wheels - " + isHelicopterHasWheels
                + " , has propeller - " + isHelicopterHasPropeller
                + " , cargo transport - " + isHelicopterCargoTransport);
        // Boat
        Boat boat = new Boat();
        boat.printInfo();
        boolean isBoatHasPropeller = boat.hasPropeller();
        boolean isBoatCargoTransport = boat.isCargoTransport();
        System.out.println("Boat has propeller - " + isBoatHasPropeller
                + " , cargo transport - " + isBoatCargoTransport);
        //Tanker
        Tanker tanker = new Tanker();
        tanker.printInfo();
        boolean isTankerHasPropeller = tanker.hasPropeller();
        boolean isTankerCargoTransport = tanker.isCargoTransport();
        System.out.println("Tanker has propeller - " + isTankerHasPropeller
                + " , cargo transport - " + isTankerCargoTransport);
        // Truck
        Truck truck = new Truck();
        truck.printInfo();
        boolean isTruckHasWheels = truck.hasWheels();
        boolean isTruckCargoTransport = truck.isCargoTransport();
        System.out.println("Truck has wheels - " + isTruckHasWheels
                + " , cargo transport - " + isTruckCargoTransport);
        // Taxi
        Taxi taxi = new Taxi();
        taxi.printInfo();
        boolean isTaxiHasWheels = taxi.hasWheels();
        System.out.println("Taxi has wheels - " + isTaxiHasWheels);
    }
}
