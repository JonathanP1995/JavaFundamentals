package com.fundamentals.java;
/*
* This class is a child class of House and will be used
* in different lessons to show how they work.
* */
public class Condo extends House{
    //fields
    private String balcony;

    //constructor
    public Condo() {

        super(" yellow");

    }// end constructor

    public Condo(String doorColor) {
        this("railing", "concrete", "shingles",
                doorColor, 40);

    }//end constructor

    public Condo(String balcony, String foundation,String roofType,
                 String doorColor, int windowSize) {
        super(foundation, roofType, doorColor, windowSize);
        this.balcony = balcony;

    }// end Constructor

    //setter/getter properties
    public String getBalcony() {
        return balcony;
    }// end property method getBalcony
    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }// end property method setBalcony
    // all other methods

    public void maintenance() {
        System.out.println("Will fix condo issues.");
    }// end method maintenance

    // This method Overrides parent class
    @Override
    public void doorOpenClose() {
        System.out.println("My door is closed.");
    }// end method doorOpenClose

}// end class Condo
