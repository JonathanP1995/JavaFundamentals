package com.fundamentals.java;

import java.util.Scanner;

public class Lesson7Exercises {

    public void exerciseModules(int foxtrot, int delta) {
        int total = foxtrot + delta;
        System.out.println(total);
    }

    public void addMinusMultiplyDivide() {
        int tom = 27, jerry = 34;

        tom += jerry;

        System.out.println(tom);

        tom *= jerry;

        System.out.println(tom);

        jerry ^= tom;

        System.out.println(jerry);

        jerry %= tom;
        System.out.println(jerry);
    }

    public void myDearAuntSally(int a, int b, int c, int d) {
        int simpleTotal = a + b * c / d;
        System.out.println(simpleTotal);
    }
}
