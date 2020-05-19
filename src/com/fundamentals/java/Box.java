package com.fundamentals.java;

public class Box extends Television {

    private String mediaCenter;

    public Box(int screenSize, int price, int ports, String isMountable, String mediaCenter) {
        super(screenSize, price, ports, isMountable);
    }

    public Box() {
        this(40, 199, 2, "No", "Yes");
    }

    @Override
    public void tvStatement() {
        System.out.println("The tv is turned off.");
    }

    public void setMediaCenter(String mediaCenter) {
        this.mediaCenter = mediaCenter;
    }

    public String getMediaCenter() {
        return mediaCenter;
    }
}
