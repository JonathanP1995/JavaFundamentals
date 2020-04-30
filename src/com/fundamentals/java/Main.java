package com.fundamentals.java;

/* This class was created when the project
* was created*/
public class Main {

    public static void main(String[] args) {
        lesson5Exercises();
        //lesson5Examples();
        // write your code here
        //System.out.println("Hello Java");
        //System.out.println("This is my first sentence");
        //System.out.println("I am new to Java");
        //System.out.println("This Java course is cool");
        //System.out.println("I am learning stuff everyday");
    }// End main method

    public static void lesson5Examples () {
        Lesson5 myFive = new Lesson5();
        myFive.showLocalExample();
        int example = myFive.showLocalWithReturn(5,7);// return to a variable
        System.out.println(example); //print variable from the line above
        System.out.println(myFive.showLocalWithReturn(2,9)); //direct return of variable
        myFive.showInstanceVariable();
        myFive.showConversions();
    }// end lesson 5 Examples

    public static void lesson5Exercises(){
        Lesson5Exercise myHomework = new Lesson5Exercise();
        myHomework.wideConversions();
        System.out.println("myHomework.wideConversions");

    }


        public void myHouseExample(){
            House myHouse = new House();
            myHouse.doorOpenClose();
        }// End myHouseExample
}
