package com.fundamentals.java;
import java.util.Scanner;

public class PracticeProject {


    public static void acousticOrElectric() {
        Scanner guitar = new Scanner(System.in);
        System.out.println("What type of guitar are you looking for, Acoustic or Electric?");

        String userName = guitar.nextLine();
        System.out.println("Client would like to see our " + userName + " guitars.");

        Scanner guitar4 = new Scanner(System.in);
    }

    public static void acousticGuitar() {
        Scanner guitar2 = new Scanner(System.in);
        System.out.println("Which Acoustic Guitar were you interested in? We have" +
                " three available Dreadnaught, Parlour and Auditorium?");

        String acoustic = guitar2.nextLine();
        System.out.println("Here's our available " + acoustic + " guitars. Have a great day!!!");
    }

    public static void electricGuitar() {
        Scanner guitar3 = new Scanner(System.in);
        System.out.println("Which Electric were you interested? We have three available, a Fender Stratocaster, a Gibson Les Paul" +
                " and a Gibson Flying V?");

        String electric = guitar3.nextLine();
        System.out.println("Here's our available " + electric + " guitars. Have a great day!!!");
    }
}
