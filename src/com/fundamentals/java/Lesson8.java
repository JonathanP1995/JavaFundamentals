package com.fundamentals.java;

/*
* The contents of this class will go over the Lesson 8 content,
* Control Flow Statements.
* */
public class Lesson8 {
    // This method goes over the basic if
    public void basicIfStatement(int val1 , int val2) {
        System.out.println("Before if Statement");
        if(val1 == val2) {
            System.out.println("Values are equal");
        } // end if
        System.out.println("After if Statement");
    }// End method

    //This method goes over if else
    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if Statement");
        if(alpha != beta) {
            System.out.println("The values are not equal");
        } else {
            System.out.println("The values are equal");
        } // end if else
        System.out.println("End of if Statement");
    } // end method basicIfElseExample

    //This method goes ove if else chain
    public void exampleIfElseChainExample(int charlie) {
        System.out.println("Before if Statement");
        if(charlie < 30) {
            System.out.println("The value is less than 30");
        } else if(charlie < 40) {
            System.out.println("The value is greater than 30, but less than 40");
        } else {
            System.out.println("The value is greater than 40");
        }
        System.out.println("After if Statement");
    }// end method basicIfElseChainExample

    //This method goes over And and Or conditions
    public void basicIfAndOrExample(int delta) {
        System.out.println("Before if Statement");
        //if delta is greater than 100 or less than 50
        if(delta > 100 || delta < 50) {
            System.out.println("The value is not between 100 and 50");
        }// end if

        //if delta modulus 2 is 0 and greater than 30
        if(delta % 2 == 0 && delta > 30) {
            System.out.println("The value is greater than 30 and its an even number");
        }// end if
    }// end method basicIfAndOrExample

    //This method demonstrates a Switch statement with case
    public void basicSwitchExample(int day) {
        switch(day) {
            case 1:
                System.out.println("Day = 1");
                break;
            case 2:
                System.out.println("Day = 2");
                break;
            case 3:
            case 4:
                System.out.println("Day = 3 or 4");
                break;
            default:
                System.out.println("day is greater than 4");
                break;
        } // end switch
    }// end method basicSwitchExample

    //This method goes over the While Loop
    public void basicWhileExample() {
        int val = 0;// initialized value
        while(val < 10) {
            System.out.println(val);
            val++ ;
        } // end while
    }// end method basicWhileExample

    //This method goes over the Do While loop
    public void basicDoWhileLoopExample() {
        int able = 0;// initialized value
        do {
            System.out.println(able);
            able++ ; // increment
        } while( able < 10) ; // condition
    }// end method basicDoWhileExample

    //This method goes over the For loop
    public void basicForLoopExample() {
        for(int i = 10; i < 30; i++){
            System.out.println(i);
        } // end for
    } // end method basicForLoop

    //This method goes over Branching Statements
    public String basicBranchingExample(int charlie) {
        String may = "Happy";
        for(int i = 0; i < charlie; i++) {
            if(i == 2) { continue; } // end if
            if(i == 3) { may += " Wednesday"; } // end if
            if(i == 4) {
                may += " Coding";
                break;
            } // end if
            may+= " Day";
        }// end for loop
        return may;
    }// end method basicBranchingExample

}// end class Lesson 8
