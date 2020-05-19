package com.fundamentals.java;

public class Box extends Television {

    private String mediaCenter = "extra storage place";

    public Box(int screenSize, int price, int ports, String isMountable) {
        super(screenSize, price, ports, isMountable);
    }

    public Box(int ports, String isMountable) {
        this(40, 150, ports, isMountable);
    }

    @Override
    public void tvStatement() {
        System.out.println("The TV is turned off, but feel free to check it out.");
    }

    public void setMediaCenter(String mediaCenter) {
        this.mediaCenter = mediaCenter;
    }

    public String getMediaCenter() {
        return mediaCenter;
    }

    public void mediaCenter() {
        System.out.println("This is our most affordable TV, but still a great steal" +
                " with a built in media center and " + mediaCenter + ".");
    }
}
