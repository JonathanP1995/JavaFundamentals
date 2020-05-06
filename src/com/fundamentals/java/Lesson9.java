package com.fundamentals.java;
/*
* The contents of this class is for
* Lesson 9 Arrays
* */
public class Lesson9 {
    // this method shows array of int
    public void basicIntArray(){
        int[] intArray = {23, 45, 12, 8, 92, 103, 37};
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }// end for loop
    } // end method basicIntArray

    //This method shows Array of String
    public void basicStringArray() {
        String[] stringArray = new String[4];
        stringArray[0] = "Happy";
        stringArray[1] = "Wednesday";
        stringArray[2] = "movie";
        stringArray[3] = "grape";

        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }// end for loop
    }// end method basicStringArray

    //This method shows 2D Array
    public void basicTwoDimensionalArray() {
        int[][] myArray = {{23, 45}, {35, 46}, {57, 98}, {32, 48} };
        for(int able[] : myArray) {
            for(int beta : able) {
                System.out.println(beta);
            }// end inner foreach
        }//end outer foreach

        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                System.out.println(myArray[i][j]);
            }// end inner for loop
        }// end outer for loop
    }// end method basicTwoDimensionalArray

    //This method goes over 3D array
    public void basicThreeDimensionalArray() {
        int[][][] threeD = new int[2][2][2];
        threeD[0][0][0] = 10;
        threeD[0][1][0] = 12;
        threeD[0][0][1] = 13;
        threeD[0][1][1] = 14;


        threeD[1][0][0] = 15;
        threeD[1][1][0] = 16;
        threeD[1][1][1] = 17;
        threeD[1][0][1] = 18;

        for(int i = 0; i < threeD.length; i++) {
            for(int j = 0; j < threeD[i].length; j++) {
                for(int k = 0; k < threeD[j].length; k++) {
                    System.out.println(threeD[i][j][k]);
                }// end inner inner for loop
            }// end inner for loop
        }//end outer for loop
    }// end method basicThreeDimensionalArray

    //This method goes over a jagged array
    public void basicJaggedArray() {
        String[][] strArray = new String[1][3];
        strArray[0][0] = "June";
        strArray[0][1] = "July";
        strArray[0][2] = "August";

        for(String[] first : strArray) {
            for(String months : first) {
                System.out.println(months);
            }//end inner foreach
        }// end outer foreach
    }//end method basicJaggedArray

}// end class Lesson9
