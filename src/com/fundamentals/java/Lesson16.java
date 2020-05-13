package com.fundamentals.java;
/*This class goes over Lesson 16 content
* Enumerations*/
public class Lesson16 {
    public enum iceCreamFlavors {VANILLA,CHOCOLATE,STRAWBERRY,ROCKY_ROAD}

    public void showEnum() {
        Lesson16Enum day = Lesson16Enum.WED;
        System.out.println(day);
        day.someEnumMethod();
        System.out.println(iceCreamFlavors.STRAWBERRY);
        System.out.println(Lesson16Enum.THU);
    }// end method show enum

    public void myFavoriteFlavor(iceCreamFlavors flavors) {
        String msg = "My favorite flavor is ";
        switch (flavors) {
            case VANILLA:
                msg += "VANILLA";
                break;
            case CHOCOLATE:
                msg += "CHOCOLATE";
                break;
            case STRAWBERRY:
                msg += "STRAWBERRY";
                break;
            default:
                msg += "ROCKY_ROAD";
                break;

        }//end switch
        System.out.println(msg);
    }//end method myFavoriteFlavor

}// end class Lesson16
