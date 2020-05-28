package com.fundamentals.java;

import com.fundamentals.lesson10.Lesson10;

/* This class was created when the project
 * was created*/
public class Main {
/*
    public static int num = 0;

    static {
        System.out.println("Static Block 1");
        num = 42;
    }//end static block

    static {
        System.out.println("Static Block 2");
        num = 63;
    }//end static block
*/
    public static void main(String[] args) {
        // write your code here
        orderTaker();
        //practiceProject();
        //box();
        //flatScreen();
        //television();
        //beerSong();
        //smartCar();
        //myCar();
        //lesson18Examples();
        //lesson17Examples();
        //lesson16Examples();
        //lesson15Examples();
        //lesson14Examples();
        //lesson12Examples();
        //lesson11Examples();
        //lesson10Examples();
        //lesson9Examples();
        //lesson9Practice();
        //lesson8Examples();
        //lesson8Practice();
        //lesson7Examples();
        //lesson7Practice();
        //ArithmeticOperations1();
        //HelloWorld();
        //myHouseExample();
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

    public static void orderTaker() {
        OrderTaker order = new OrderTaker();
        order.welcomeMessage();
    }

    public static void practiceProject() {
        PracticeProject myProject = new PracticeProject();
        myProject.acousticOrElectric();
        myProject.electricGuitar();
        myProject.acousticGuitar();
    }

    public static  void box() {
        Box myBox = new Box(2,"No");
        myBox.mediaCenter();
        System.out.println("This classic box style Television comes with a" +
                " " + myBox.getScreenSize() + " inch screen.");
        System.out.println("It is an updated version of a classic look which means it comes" +
                " with " + myBox.getPorts() + " USB ports.");
        System.out.println(myBox.getIsMountable() + ", it is not mountable.");
        System.out.println("It's priced reasonably at " + myBox.getPrice() + " dollars.");
        myBox.tvStatement();
    }

    public static void flatScreen() {
        FlatScreen myFlat = new FlatScreen(30, 299);
        myFlat.remote();
        System.out.println("Our flatscreen has a " + myFlat.getScreenSize() + " inch screen.");
        System.out.println("It's priced at the low price of " + myFlat.getPrice() + " dollars.");
        System.out.println("Astonishingly this TV has " + myFlat.getPorts() + " USB ports.");
        System.out.println(myFlat.getIsMountable() + ", on top of all that it will mount on any wall" +
                " with a stud.");
        myFlat.tvStatement();
    }

    public static void television() {
        Television myTelli = new Television(60,399);
        myTelli.tvStatement();
        System.out.println("The television includes " + myTelli.getPorts() + " ports.");
        System.out.println("This TV goes for " + myTelli.getPrice() + " US dollars.");
        System.out.println("This television has a screen size of " +
                 myTelli.getScreenSize() + " inches.");
        System.out.println(myTelli.getIsMountable() + ", it is mountable.");
    }

    public static void lesson18Examples() {
        Lesson18 my18 = new Lesson18();
        //my18.exampleThrows();
        //my18.exampleException();
        my18.myArrayException();
    }// end method lesson18Examples

    public static void lesson17Examples() {
        Lesson17 my17 = new Lesson17();
        my17.exampleArrayList();
        my17.exampleArrayList2();
        my17.exampleHashSet();
        my17.exampleHashMap();
    }//end method lesson17Examples

    public static void lesson16Examples() {
        Lesson16 my16 = new Lesson16();
        my16.showEnum();

        my16.myFavoriteFlavor(Lesson16.iceCreamFlavors.ROCKY_ROAD);

        Lesson16Enum d1[] = Lesson16Enum.values();
        for(Lesson16Enum day : d1){
            System.out.println(day.name() + " at index " + day.ordinal() +
                " day number = " + day.getDayNum());
        }//end for loop


    }//end method lesson16Examples

    public static void lesson15Examples() {
        int[] nKeys = {0,1,2,3,4,5,6,7,8,9};
        Lesson15Child abs = new Lesson15Child(5, nKeys, 0, "Color");
        abs.receiveCall();// defined in child
        abs.sendCAll();// defined in child
        abs.endCall();// defined in parent from interface
    }//end method lesson15Example

    public static void lesson14Examples() {
        // cannot change value of a final variable
        //Lesson14.MY_FIRST_FINAL = 10;
        int sum = Lesson14.MY_FIRST_FINAL * 2;
        System.out.println(sum);

        Lesson14.myStaticMethod(10);
        System.out.println("Block number is " + sum);
    }// end method lesson14Examples

    public static void lesson12Examples(){
        Condo myCondo = new Condo();
        myCondo.doorOpenClose();// from House parent class
        myCondo.setBalcony("railing");// from condo class

        //Lesson 13 Overloading
        House newHouse = new House();
        newHouse.doorOpenClose("Close");

    }// end method lesson12Examples

    public static void smartCar() {
        SmartCar newSmartCar = new SmartCar();
        newSmartCar.getSmartCar();
        newSmartCar.setWheels(24);
        System.out.println("The wheel size of my smart car is " + newSmartCar.getWheels());
        newSmartCar.setSize("small");
        System.out.println("The smart car is " + newSmartCar.getSize());
    }

    public static void myCar() {
        Car newCar = new Car("black","black",24,"Tinted");
        System.out.println("My wheels size are " + newCar.getWheels());
        System.out.println("The body color is " + newCar.getBody());
        System.out.println("The windows are " + newCar.getWindows());
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

    public static void lesson9Practice() {
        Lesson9Exercises my9Practice = new Lesson9Exercises();
        my9Practice.exercise1DArray();
        my9Practice.TwoDArray();
    }

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

    public static void lesson8Practice() {
        Lesson8Exercises my8Practice = new Lesson8Exercises();
        my8Practice.practiceIfElse(5,5);
        my8Practice.practiceGrading('E');
        my8Practice.loopExercise();
    }

    public static void lesson7Examples() {
        Lesson7 mySeven = new Lesson7();
        mySeven.basicMath();
        mySeven.exampleModules();
        mySeven.addTwoNumbers();
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
        my7Practice.exerciseModules(5037,446);
        my7Practice.addMinusMultiplyDivide();
        my7Practice.myDearAuntSally(10,32,12,3);
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


