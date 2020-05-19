package com.fundamentals.java;

public class Television {

    private int screenSize;
    private int price;
    private int ports;
    private String isMountable;

    public Television(int screenSize, int price) {
        this(screenSize,price,4,"Yes");
    }

    public Television(int screenSize, int price, int ports, String isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.ports = ports;
        this.isMountable = isMountable;
    }

    protected void setScreenSize(int value) {
        screenSize = value;
    }
    protected int getScreenSize() {
        return screenSize;
    }
    protected  void setPrice(int value) {
        price = value;
    }
    protected int getPrice() {
        return price;
    }
    protected  void setPorts(int value) {
        ports = value;
    }
    protected int getPorts() {
        return ports;
    }
    protected void setIsMountable(String value) {
        isMountable = value;
    }
    protected String getIsMountable() {
        return isMountable;
    }
    public void tvStatement() {
        System.out.println("The tv is turned on.");
    }

}
