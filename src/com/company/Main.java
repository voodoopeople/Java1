package com.company;

import com.company.network.Room;
import com.company.network.ThirstClass;


public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello!");

        Room some = new Room(2, 3, 2, "Petr");
        some.setWidth(10000);
        System.out.println(some.calculate());
        System.out.println(some.getWidth());
        //System.out.println(some.calculate() + some.calculate() + some.calculate());


        Room some1 = new Room(21, 32, 22, "Petr");
        System.out.println(some1.calculate());


        Room some2 = new Room(2234, 3234,  "Petr");
        System.out.println(some2.calculate());

        Room some3 = new Room();

        ThirstClass oneTwoThre = new ThirstClass();

    }
}
