package com.fundamentals.java;

public class Lesson8Exercises {

    public void practiceIfElse(int jim, int pam) {
        if(jim == pam) {
            System.out.println("Jim loves Pam.");
        } else {
            System.out.println("Jim does not love Pam.");
        }
    }

    public void practiceGrading(int grade) {
        switch(grade) {
            case 1:
                System.out.println("Excellent");
                break;
            case 2:
                System.out.println("Very Good");
                break;
            case 3:
                System.out.println("Good");
                break;
            case 4:
                System.out.println("Average");
            case 5:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Not a valid grade");
        }
    }
}
