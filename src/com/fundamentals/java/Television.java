package com.fundamentals.java;

public class Television {

    private int screenSize;
    private int price;
    private int ports;
    private String isMountable;

    public Television(int screenSize, int price) {
        this(60,399,4,"Yes");
    }

    public Television(int screenSize, int price, int ports, String isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.ports = ports;
        this.isMountable = isMountable;
    }

    protected void setScreenSize(int value) {
        value = screenSize;
    }
    protected int getScreenSize() {
        return screenSize;
    }
    protected  void setPrice(int value) {
        value = price;
    }
    protected int getPrice() {
        return price;
    }
    protected  void setPorts(int value) {
        value = ports;
    }
    protected int getPorts() {
        return ports;
    }
    protected void setIsMountable(String value) {
        value = isMountable;
    }
    protected String getIsMountable() {
        return isMountable;
    }
    public void tvStatement() {
        System.out.println("The tv is turned on.");
    }

}
