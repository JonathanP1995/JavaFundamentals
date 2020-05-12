package com.fundamentals.java;

public class SmartCar extends Car {
    private String batteries; String size;

    public SmartCar() {

    }

    public void setSmartCar(String smartCar) {
        this.batteries = smartCar;
    }
    public void setSize(String small){
        this.size = small;
    }

    public String getSmartCar() {
        return batteries;
    }
    public String getSize() {
        return size;
    }


}
