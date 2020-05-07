package com.fundamentals.java;

public class Car {
    private String body;
    private String door;
    private int wheels;
    private String windows;

    public Car() { } // end constructor

    public Car(String door) {
        this("black", "black", 24, "tinted");
        System.out.println("The door is " + door);
    }

    public Car(String body, String door, int wheels, String windows){
        this.body = body;
        this.door = door;
        this.wheels = wheels;
        this.windows = windows;
    }

    protected void setBody(String body) {
        this.body = body;
    }

    protected String getBody() {
        return body;
    }

    protected void setDoor(String door) {
        this.door = door;
    }

    protected String getDoor() {
        return door;
    }

    protected void setWheels(int wheels) {
        this.wheels = wheels;
    }

    protected int getWheels() {
        return wheels;
    }

    protected void setWindows(String wheels) {
        this.windows = wheels;
    }

    protected String getWindows() {
        return windows;
    }
}
