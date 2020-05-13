package com.fundamentals.java;

public class Lesson8Exercises {

    public void practiceIfElse(int jim, int pam) {
        if(jim == pam) {
            System.out.println("Jim loves Pam.");
        } else {
            System.out.println("Jim does not love Pam.");
        }
    }

    public void practiceGrading(char grade) {
        switch(grade) {
            case 'E':
            case 'e':
                System.out.println("Excellent");
                break;
            case 'V':
            case 'v':
                System.out.println("Very Good");
                break;
            case 'G':
            case 'g':
                System.out.println("Good");
                break;
            case 'A':
            case 'a':
                System.out.println("Average");
            case 'F':
            case 'f':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Not a valid grade");
        }
    }

    public void loopExercise() {
     int num = 0;
     do {
         if(num % 3 == 0){
             System.out.println(num);
         }
         num++;

     }
         while(num <= 30);

     }

}
