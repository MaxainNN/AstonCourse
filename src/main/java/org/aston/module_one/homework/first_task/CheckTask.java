package org.aston.module_one.homework.first_task;

public class CheckTask {

    public static void main(String[] args) {
        // Checking in the console
        // Fish
        Fish fish = new Fish();
        fish.swim();
        fish.printInfo();
        // Whale
        Whale whale = new Whale();
        boolean isWhaleHasSpine = whale.hasSpine();
        whale.swim();
        whale.printInfo();
        System.out.println("Whale has spine - " + isWhaleHasSpine);
        // Cat
        Cat cat = new Cat();
        boolean isCatHasSpine = cat.hasSpine();
        boolean isCatFurBearer = cat.hasFur();
        cat.printInfo();
        System.out.println("Cat has spine - " + isCatHasSpine + " , has fur - " + isCatFurBearer + " .");
        // Bear
        Bear bear = new Bear();
        boolean isBearHasSpine = bear.hasSpine();
        boolean isBearFurBearer = bear.hasFur();
        bear.printInfo();
        System.out.println("Bear has spine - " + isBearHasSpine + " , has fur - " + isBearFurBearer + " .");
    }
}
