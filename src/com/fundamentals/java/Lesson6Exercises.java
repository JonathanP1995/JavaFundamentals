package com.fundamentals.java;

public class Lesson6Exercises {

    String exerciseString = "I LOVE LUCY";

    public String myLowerCase() {

        return exerciseString.toLowerCase();
    }

    public void exerciseChar() {
        char e1 = '¶';
        char e2 = '\u00B6';
        System.out.println(e2);
    }

    public void exerciseLength() {
        int length = exerciseString.length();
        System.out.println(length);
    }

    public void jackAndJill() {
        System.out.println("Jack and Jill\nWent up the hill\nTo fetch a pail of water.\n" +
                "Jack fell down and broke his crown\nAnd Jill came tumbling after. ");
    }

}
