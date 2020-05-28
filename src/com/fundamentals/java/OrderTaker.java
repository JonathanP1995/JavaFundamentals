package com.fundamentals.java;
import com.sun.deploy.uitoolkit.Window;

import java.util.*;

public class OrderTaker {
    private List<House> myOrder;
    private int winSize, colorNum;
    private Scanner in;
    private String colorDoor;
    private boolean isValueRight;

    public OrderTaker() {
        myOrder = new ArrayList<>();
    }

    public void welcomeMessage() {
        System.out.println("Welcome to Ace Construction.");
        System.out.println("We specialize in building custom homes :)");
        buildHouse();
    }

    private void buildHouse() {
        System.out.println("Let's build a house today!");
        windowSize();
        doorColor();
        myOrder.add(new House(colorDoor, winSize));
        orderDone();
    }

    private void printResult() {
        System.out.println("My houses are listed below.");
        for (House myHouse : myOrder) {
            System.out.println("This house has the following: ");
            System.out.println(myHouse.getWindowSize() + " inch windows");
            System.out.println(myHouse.getRoofType() + " style roof");
            System.out.println(myHouse.getDoorColor() + " colored doors");
            System.out.println(myHouse.getFoundation() + " style foundation");
            System.out.println();
        }
    }

    private void orderDone() {
        System.out.println("Does this complete your order? Y for yes N for no.");
        String val = in.next();
        switch (val) {
            case "Y":
            case "y":
                printResult();
                break;
            case "N":
            case "n":
                buildHouse();
                break;
            default:
                System.out.println("You have entered the incorrect value. Please try again.");
                orderDone();
                break;
        }
    }

    private void doorColor() {
        System.out.println("Which door color would you prefer?");
        System.out.println("Press 1 for Red, 2 for Blue, or 3 for Green.");
        if (!verifyNumberInput()) {
            System.out.println("You have entered an incorrect value. Please try again.");
            doorColor();
        } else {
            if (colorNum > 3) {
                System.out.println("You have entered a number larger than 3. Please try again.");
                doorColor();
            } else {
                switch (colorNum) {
                    case 1:
                        colorDoor = "Red";
                        break;
                    case 2:
                        colorDoor = "Blue";
                        break;
                    default:
                        colorDoor = "Green";
                        break;
                }
            }
        }
    }

    private void windowSize() {
        System.out.println("What size windows would you like?");
        in = new Scanner(System.in);
        isValueRight = false;
        try {
            winSize = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You have entered an incorrect value. Please try again.");
            windowSize();
        }
    }

    private boolean verifyNumberInput() {
        in = new Scanner(System.in);
        try {
            colorNum = in.nextInt();
            isValueRight = true;
        } catch (InputMismatchException ex) {
            isValueRight = false;
        }
        return isValueRight;
    }
}
