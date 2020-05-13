package com.fundamentals.java;
/*
* This enum is from Lesson 16,
* Enumerations*/
public enum Lesson16Enum {
    SUN(2),MON(4),TUE(6),WED(8),THU(10),FRI(12),SAT(14);

    private int dayNum;

    private  Lesson16Enum(int val) {
        dayNum = val;
        //System.out.println("Constructor calls for " + this.toString() );
    }//end private constructor

    public int getDayNum() {
        return dayNum;
    }

    public void someEnumMethod() {
        System.out.println("Method inside enum");
    }//end method someEnumMethod

}//end enum Lesson16Enum
