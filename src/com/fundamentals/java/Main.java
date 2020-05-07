package com.fundamentals.java;

import com.fundamentals.lesson10.Lesson10;

/* This class was created when the project
 * was created*/
public class Main {

    public static void main(String[] args) {
        // write your code here
        //beerSong();
        //myCar();
        //lesson11Examples();
        //lesson10Examples();
        //lesson9Examples();
        //lesson8Examples();
        //lesson7Examples();
        lesson7Practice();
        //ArithmeticOperations1();
        //HelloWorld();
        // myHouseExample();
        //lesson6Practice();
        //lesson6Examples();
        //lesson5Exercises();
        //lesson5Examples();
        //System.out.println("Hello Java");
        //System.out.println("This is my first sentence");
        //System.out.println("I am new to Java");
        //System.out.println("This Java course is cool");
        //System.out.println("I am learning stuff everyday");
    }// End main

    public static void myCar() {
        Car newCar = new Car( "Black");
        newCar.setBody(" black");
        System.out.println("My wheels size are " + newCar.getWheels());
    }

    public static void lesson11Examples() {
        House house = new House(" Blue");
        //house.foundation = " concrete";
        house.setFoundation(" concrete");
        //house.roofType = " shingles";
        house.setRoofType(" shingles");
        System.out.println("The foundation is made up of" + house.getFoundation());
        System.out.println("The roof is made up of" + house.getRoofType());
        System.out.println("The window size is " + house.getWindowSize());
    }//End method lesson11Examples

    public static void lesson10Examples() {
        House yourHouse = new House();
        yourHouse.doorOpenClose();
        yourHouse.openGarage();
        yourHouse.closeGarage();
        //yourHouse.windowOpenClose(); // Cannot access

        Lesson10 myTen = new Lesson10();
        //myTen.showProtected; // cannot access
        //myTen.showLesson; // cannot access
    }// end method lesson10Examples

    public static void lesson9Examples() {
        Lesson9 myNine = new Lesson9();
        myNine.basicIntArray();
        myNine.basicStringArray();
        myNine.basicTwoDimensionalArray();
        myNine.basicThreeDimensionalArray();
        myNine.basicJaggedArray();
    }// end method lesson9Examples

    public static void beerSong() {
        BottlesOfBeerSong song = new BottlesOfBeerSong();
        song.timeToSing();
    }

    public static void lesson8Examples() {
       Lesson8 myEight = new Lesson8();
       myEight.basicIfStatement(2, 3);
       myEight.basicIfElseExample(4, 5);
       myEight.exampleIfElseChainExample(33);
       myEight.basicIfAndOrExample(108);
       myEight.basicSwitchExample(2);
       //myEight.basicWhileExample();
       //myEight.basicDoWhileLoopExample();
       //myEight.basicForLoopExample();
       System.out.println(myEight.basicBranchingExample(7));
    }// end method lesson8Examples

    public static void lesson7Examples() {
        Lesson7 mySeven = new Lesson7();
        mySeven.basicMath();
        mySeven.exampleModules();
        //mySeven.addTwoNumbers();
        mySeven.exampleAssignment();
        mySeven.exampleLeftShift();
        mySeven.exampleRightShift();
        mySeven.exampleAND();
        mySeven.exampleXOR();
        mySeven.exampleRelational();
        mySeven.exampleIncrement();
        mySeven.exampleDecrement();
    }// end method lesson7Examples

    public static void lesson7Practice() {
        Lesson7Exercises my7Practice = new Lesson7Exercises();

    }

    public static void lesson6Examples() {
    Lesson6 mySix = new Lesson6() ;
    mySix.exampleCharAt();
    mySix.exampleConCat(" has awesome donuts");
    mySix.exampleEquals("LaMars");
    System.out.println(mySix.exampleLowerCase());
    System.out.println(mySix.exampleUpperCase());
    mySix.exampleLength();
    mySix.exampleBuilder("Potatoes", 2);
    mySix.exampleChar();
    mySix.exampleEscape();
    }//end method lesson6Examples

    public static void lesson6Practice(){
        Lesson6Exercises my6Practice = new Lesson6Exercises();
        System.out.println(my6Practice.myLowerCase());
        my6Practice.exerciseChar();
        my6Practice.exerciseLength();
        my6Practice.jackAndJill();
    }

    public static void lesson5Examples() {
        Lesson5 myFive = new Lesson5();
        myFive.showLocalExample();
        int example = myFive.showLocalWithReturn(5, 7);// return to a variable
        System.out.println(example); //print variable from the line above
        System.out.println(myFive.showLocalWithReturn(2, 9)); //direct return of variable
        myFive.showInstanceVariable();
        myFive.showConversions();
    }// end lesson 5 Examples

    public static void lesson5Exercises() {
        Lesson5Exercise myHomework = new Lesson5Exercise();
        myHomework.wideConversions();
        System.out.println("myHomework.wideConversions");

    }


    public static void myHouseExample() {
        House myHouse = new House();
        myHouse.doorOpenClose();
    }// End myHouseExample

    public static void HelloWorld() {
        System.out.println("Hello World!") ;
    }

    // Java can perform basic math calculations
    public static void ArithmeticOperations1() {
        System.out.println(4 + 5) ;
        System.out.println(4 * 5) ;
        /*
        * Dividing integers will always result in a integer,
        * unless instructed otherwise*/
        System.out.println(4 / 5) ;
        System.out.println(4.00000 / 5) ; // This will print out the exact answer
        /*
        * You can print out the remainder of the integer
        * by replacing / with % */
        System.out.println(4 % 5) ;
        System.out.println(9.0 / 2) ;
        System.out.println(9.0 % 2.0) ;
        System.out.println(10 % 3);
    }

}


