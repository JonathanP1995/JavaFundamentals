package com.fundamentals.java;
/*
* This class demonstrates Control
* Flow using a song.
* */
public class BottlesOfBeerSong {
    void timeToSing () {
        int bottlesOfBeer = 99;
        String word = "bottles", result ="";

        while(bottlesOfBeer > 0) {
            if(bottlesOfBeer == 1) {
                word = "bottle";
            } // end if
            System.out.println(bottlesOfBeer + " " + word +" of Beer on the Wall");
            System.out.println(bottlesOfBeer + " " + word +" of Beer on the Wall");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            bottlesOfBeer--; // same as bottlesOfBeer - 1

            if(bottlesOfBeer > 0) {
                System.out.println(bottlesOfBeer + " " + word +" of Beer on the Wall \n");
            } else {
                System.out.println("No more bottles of Beer on the Wall");
            }// end if
        } // end while
    } // end method timeToSing
} // end class bottlesOfBeerSong
