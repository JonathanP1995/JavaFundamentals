package com.fundamentals.java;
/*
* This class is over lesson 14 content
* Static
* */
public class Lesson14 {
    public static final int MY_FIRST_FINAL = 2020;

    public static int  myFirstStatic = 35;

    public static void myStaticMethod(int num) {
        int total = MY_FIRST_FINAL * num;
        System.out.println(total);
        System.out.println(myFirstStatic);
    }//end method myStaticMethod


} //end class Lesson14
