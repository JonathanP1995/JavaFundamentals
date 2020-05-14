package com.fundamentals.java;
/*
*This class goes over the Lesson 18 content
* Exception Handling
* */
public class Lesson18 {
    House ranch;

    public void exampleThrows() throws NullPointerException {
        System.out.println(ranch.getWindowSize());

    }//end method exampleThrows

    public void exampleException() {
        try {
            System.out.println(ranch.getWindowSize());
        } catch (NullPointerException e) {
            System.out.println("A null pointer was called " + e.getMessage());
        } finally {
            System.out.println("The finally block was called");
        }// end try / catch / finally
    } //end method exampleException

    public void myArrayException() {
        //String[] names = {"Dave", "Matt", "Jody"};
        String[] values = {"2433", "423", "542"};
        try{
            byte b = Byte.parseByte(values[5]);
            System.out.println(b);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Please provide at least one argument");
        }catch(NumberFormatException ed) {
            System.out.println("This is not a number");
        }catch(StackOverflowError e) {
            System.out.println("You have given me more than a byte");
        }catch(Exception ea) {
            System.out.println("I dunno what you did " + ea.toString());
        }

    }//end method myArrayException

}//end class Lesson18
