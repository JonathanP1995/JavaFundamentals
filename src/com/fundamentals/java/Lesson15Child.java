package com.fundamentals.java;
/*
* This class goes over Lesson 15 content
* Abstract*/
public class Lesson15Child extends Lesson15Abstract{

    public Lesson15Child(int vol,int[] nKeys, int sKey, String screen) {
        super(vol, nKeys, sKey, screen);
    }//end constructor

    @Override
    public void receiveCall() {
    System.out.println("Receiving Phone Call");
    }// end method receiveCAll

    @Override
    public void sendCAll() {
    System.out.println("Sending Phone Call");
    }//end method sendCall

    @Override
    public void endCall() {
        super.endCall();
    }//end method endCall from Interface
}// end class Lesson15Child
