package com.fundamentals.java;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Lesson9Exercises {

    public void exercise1DArray() {
        String[] stringPractice = new String[4];
        stringPractice[0] = "Sherbert";
        stringPractice[1] = "Butter Pecan";
        stringPractice[2] = "Cookies & Cream";
        stringPractice[3] = "Cookie Dough";

        for(int a = 0; a < stringPractice.length; a++){
            System.out.println(stringPractice[a]);
        }
    }

    public void TwoDArray() {
        int[][] stringPractice2 = {{26, 40}, {10, 28}, {33, 28}, {30, 34}, {13, 19},
                {24, 31}, {6, 30}, {24, 31}, {26, 23}, {35, 32}, {17, 24}, {40, 9}, {16, 23},
                {23, 3}, {3, 26}, {31, 21}};

        String home = "home", away = "away", msg = "";

        /*for(int homeTeam[] : stringPractice2){
            for(int awayTeam : homeTeam){
                System.out.println(awayTeam);
            }
        }
*/
        for (int h = 0; h < stringPractice2.length; h++) {
            for (int a = 0; a < stringPractice2[h].length; a++) {
                if (h % 1 == 0) {
                    msg = away + " " + stringPractice2[h][a];
                }
                if (a % 2 == 0) {
                    msg = home + " " + stringPractice2[h][a];
                }
                System.out.println(msg);
            }
        }
    }
}
