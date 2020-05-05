package com.fundamentals.java;

/* This class was created when the project
 * was created*/
public class Main {

    public static void main(String[] args) {
        // write your code here
        lesson8Examples();
        //lesson7Examples();
        //ArithmeticOperations1();
        //HelloWorld();
        // myHouseExample();
        //lesson6Examples();
        //lesson5Exercises();
        //lesson5Examples();
        //System.out.println("Hello Java");
        //System.out.println("This is my first sentence");
        //System.out.println("I am new to Java");
        //System.out.println("This Java course is cool");
        //System.out.println("I am learning stuff everyday");
    }// End main method

    public static void lesson8Examples() {
       Lesson8 myEight = new Lesson8();
       myEight.basicIfStatement(2, 3);
       myEight.basicIfElseExample(4, 5);
       myEight.exampleIfElseChainExample(33);
       myEight.basicIfAndOrExample(108);
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


