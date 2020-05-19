package com.fundamentals.java;

public class FlatScreen extends Television {

    private String remote = "wireless";

    public FlatScreen(int screenSize, int price, int ports, String isMountable) {
        super(screenSize, price, ports, isMountable);
    }

    public FlatScreen(int screenSize, int price) {
        this(30, 299, 5, "Yes");
    }

    @Override
    public void tvStatement() {
        System.out.println("Go ahead and plug it in and check out the resolution.");
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    public String getRemote() {
        return remote;
    }

    public void remote() {
        System.out.println("Never leave the couch with our " + remote + " remote.");
    }

}
