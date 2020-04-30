package com.fundamentals.java;

/*
 * The contents of this class are for the lesson 6 slide deck
 * Strings & More
 * */
public class Lesson6 {

    String myString = "LaMars";

    //Method shows String method for charAt
    public void exampleCharAt() {
        char myChar = myString.charAt(3);
        System.out.println(myChar);
    }//end example charAt

    // Method shows concatenation of 2 strings
    public void exampleConCat(String value) {
        String happy = myString.concat(value);
        System.out.println(happy);
    }// end example conCat

    //Method compares two strings to see if they are equal
    public void exampleEquals(String donut) {
        boolean myBoolean = myString.equals(donut);
        System.out.println(myBoolean);
    }//End method exampleEquals

    //Method takes a string and converts it to a lowercase
    public String exampleLowerCase() {
        return myString.toLowerCase();
    }// end method exampleLowerCase

    //Method takes a string and converts it to uppercase
    public String exampleUpperCase() {
        return myString.toUpperCase();
    }//end method exampleUpperCase

    //Method determines the length of a String
    public void exampleLength(){
        int length = myString.length();
        System.out.println(length);
    }//end Method exampleLength

    //Example of how to use the stringBuilder class
    public void exampleBuilder(String food, int value) {
        StringBuilder build = new StringBuilder() ;
        build.append("My favorite food is ");
        build.append(food).append(" and I ate ")
                .append(value).append(" plates of it.");
        String fav = build.toString();
        System.out.println(fav);
    }// end method exampleBuilder

    //Method for showing data char type
    public void exampleChar() {
        char c1 = 't' ;
        char c2 = '\u00A7' ;
        System.out.println(c2) ;
    } //end method exampleChar

    //Method demonstrates escape sequences
    public void exampleEscape() {
        System.out.println("That\'s a cool toy.\tCan I\n play with it.") ;
    }// end method exampleEscape


}// end class Lesson 6
