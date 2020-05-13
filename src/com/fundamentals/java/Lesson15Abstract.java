package com.fundamentals.java;
/*
* This class goes over Lesson 15 content
* Abstract
* */
public abstract class Lesson15Abstract {
    private int volume;
    private int[] arrays;
    private int sendKey;
    private String screen;

    public Lesson15Abstract(int vol, int[]nKeys, int sKey, String screen) {
        this.volume = vol;
        this.arrays = nKeys;
        this.sendKey = sKey;
        this.screen = screen;
    }// end constructor

    public abstract  void receiveCall();//abstract method no body

    public abstract  void  sendCAll();//abstract method no body


    public int getVolume() {
        return volume;
    }

    public int[] getArrays() {
        return arrays;
    }

    public int getSendKey() {
        return sendKey;
    }

    public String getScreen() {
        return screen;
    }
}//end class Lesson15Abstract
