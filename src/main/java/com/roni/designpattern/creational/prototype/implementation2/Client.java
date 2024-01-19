package com.roni.designpattern.creational.prototype.implementation2;

public class Client {
    public static void main(String[] args) {
        Sheep blackSheep = new BlackSheep("bla bla");
        Sheep whiteSheep = new WhiteSheep("hee hee");
        // before clone
        System.out.println("Black sheep: " + blackSheep.getName());
        System.out.println("White sheep: " + whiteSheep.getName());

        // Clone sheep as needed
        Sheep clonedBlackSheep = blackSheep.clone();
        Sheep clonedWhiteSheep = whiteSheep.clone();

        // Customize cloned sheep
        clonedBlackSheep.setName("Midnight");
        clonedWhiteSheep.setName("Snowball");

        // Your sheep farm is thriving!
        System.out.println("Black sheep: " + clonedBlackSheep.getName());
        System.out.println("White sheep: " + clonedWhiteSheep.getName());
    }
}
