package com.fundamentals.java;

/*This class is part of lesson 4
* My Application Overview*/
public class House {
    private String foundation;
    private String roofType;
    private String doorColor;
    private int windowSize;

    public House() {
        this(" Blue");
    } // end constructor

    public House(String doorColor) {
        this("wood","Wood", "black", 30);
        System.out.println("The door color is"+ doorColor);
    } // end constructor

    public House(String foundation, String roofType, String doorColor, int windowSize) {
        this.foundation = foundation;
        this.roofType = roofType;
        this.doorColor = doorColor;
        this.windowSize = windowSize;
    }// end constructor

    /*Properties for foundation*/
    protected void setFoundation(String value) {
        foundation = value;
    } // end property method setFoundation

    protected String getFoundation() {
        return foundation;
    } // end property method getFoundation

    /*Properties for roofType*/
    protected void setRoofType(String value) {
        roofType = value;
    } // end property method setRoofType

    protected String getRoofType() {
        return roofType;
    }// end property method getRoofType

    /*Properties for doorColor*/
    protected void setDoorColor(String value) {
        doorColor = value;
    }// end property method setDoorColor

    protected String getDoorColor() {
        return doorColor;
    }// end method getDoorColor

    /*Properties for windowSize*/
    protected void setWindowSize(int value) {
        windowSize = value;
    }//end property method setWindowSize

    protected int getWindowSize() {
        return windowSize;
    }//end property method getWindowSize

    // Original method
    public void doorOpenClose() {
        System.out.println("The door is open.");
        windowOpenClose();
    }// end method doorOpenClose

    // Overloaded method
    public void doorOpenClose(String message) {
        System.out.println(message);
    }// end method doorOpenClose

    /*
    * The below methods are demonstrating
    * lesson 10 access modifiers
    * */
    //Private means only accessible from the class
    private void windowOpenClose() {
        System.out.println("The window is open or closed");
    }// end method windowOpenClose

    //no modifier is default, which only accessible in the package name
    void openGarage() {
        System.out.println("Open the garage");
    }// end method openGarage

    //protected only accessible in the same package, or subclass of another package
    protected void closeGarage() {
        System.out.println("Close the garage");
    }// end method close Garage

}// end class House

