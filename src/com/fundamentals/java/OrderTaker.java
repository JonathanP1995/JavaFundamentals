package com.fundamentals.java;
import com.sun.deploy.uitoolkit.Window;

import java.util.*;

public class OrderTaker {
    List<House> myOrder;
    int winSize;
    String colorDoor;
    Scanner in;

    public OrderTaker() {
        myOrder = new ArrayList<>();
        in = new Scanner(System.in);
    }

    public void welcomeMessage(){
        System.out.println("Welcome to Ace Construction.");
        System.out.println("We specialize in building custom homes :)");
        buildHouse();
    }

    public void buildHouse() {
        System.out.println("Let's build a house today!");
        windowSize();
        doorColor();
        orderDone();
    }

    public void orderDone() {
        System.out.println("Does this complete your order? Y for yes N for no.");
            String val = in.nextLine();
            switch(val) {
                case "Y":
                case "y":
                break;
                case"N":
                case"n":
                buildHouse();
                default:
            }
    }

    public void doorColor() {
        System.out.println("What door color would you prefer?");
        System.out.println("Press 1 for Red, 2 for Blue, 3 for Green");
        if(in.nextInt() < 3) {
            System.out.println("You have entered a larger number than 3. Try again.");
            doorColor();
        } else {
            switch(in.nextInt()) {
                case 1:
                    colorDoor = "Red";
                    break;
                case 2:
                    colorDoor = "Blue";
                    break;
                case 3:
                    colorDoor = "Green";
            }
        }
    }

    public void windowSize() {
        System.out.println("What size windows would you like?");
        if(verifyNumberInput()) {
            winSize = in.nextInt();
        } else {
            System.out.println("You have entered an incorrect value. Please try again.");
            windowSize();
        }
    }

    public void verifyWindowSize() {
        try{
            winSize = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You have entered an incorrect value. Please try again.");
            windowSize();
        } catch (NoSuchElementException a) {
            System.out.println("You have to provide a size");
            windowSize();
        }
    }

    public boolean verifyNumberInput() {
        int val;
        try{
            val = in.nextInt();
            return true;
        } catch (InputMismatchException ex) {
            System.out.println("You have entered an incorrect value. Please try again.");
            return false;
        } catch (NoSuchElementException a) {
            System.out.println("You have to provide a size");
            return false;
        }
    }
}
