package com.fundamentals.java;

import java.util.Scanner;

public class Lesson7Exercises {

    public void exerciseModules(int foxtrot, int delta) {
        int total = foxtrot + delta;
        System.out.println(total);
    }

    public void addMinusMultiplyDivide() {
        int tom = 5, jerry = 7;

        tom += jerry;
        System.out.println(tom);

        tom *= jerry;
        System.out.println(tom);

        tom %= jerry;
        System.out.println(tom);

        tom ^= jerry;
        System.out.println(tom);
    }

    public void myDearAuntSally(int a, int b, int c, int d) {
        int simpleTotal = a + b * c / d;
        System.out.println(simpleTotal);

         int simpleTotal2 = (a + b) * c / d;
        System.out.println(simpleTotal2);
    }
}
