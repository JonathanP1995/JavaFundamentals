package com.fundamentals.java;

public class Television {

    private int screenSize;
    private int price;
    private int ports;
    private String isMountable;

    public Television(int screenSize, int price) {
        this(40, 399, 4, "yes");
        System.out.println("The TV's price is" + price);
    }

    public Television(int screenSize, int price, int ports, String isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.ports = ports;
        this.isMountable = isMountable;
    }

}
