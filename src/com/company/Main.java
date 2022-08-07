package com.company;

public class Main {
    public static void main(String[] args) {

        Father objectA = new Father(EnumCan.TEACH, 49, "Omurbek");
        Son objectB = new Son(15, "Alex", EnumCan.HELP);
        Son objectC = new Son(16,"Alexander", EnumCan.HELP );
        System.out.println("objectA " + objectA.getInfo() + "\nobjectB " + objectB.getInfo() +
                "\nobjectC " + objectC.getInfo());



    }}


