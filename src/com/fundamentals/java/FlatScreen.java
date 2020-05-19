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
        System.out.println("The Television is unplugged.");
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    public String getRemote() {
        return remote;
    }

}
