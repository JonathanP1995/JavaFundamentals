package com.fundamentals.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*This class goes over Lesson 17 content
* Collections Framework*/
public class Lesson17 {

    public void exampleArrayList() {
        List<String> myList = new ArrayList();
        myList.add("Happy");
        myList.add("Thursday");
        myList.add("Not Monday");
        myList.add("Where\'s Friday");

        for(String able : myList) {
            System.out.println(able);
        }//end for loop
    }//end method exampleArrayList

    public void exampleArrayList2() {
        ArrayList<House> myHouseList = new ArrayList<>();
        myHouseList.add(new House());
        myHouseList.add(new House("Red"));
        myHouseList.add(new House("Black", "Wood", "Wood", 30));

        for(House yourHouse : myHouseList) {
            System.out.println(yourHouse.getDoorColor());
        }// end for loop

        for(int a = 0; a < myHouseList.size(); a++) {
            System.out.println(myHouseList.get(a).getRoofType());
        }// end for loop

    }// end method exampleArrayList2

    public void exampleHashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("FireCrackers");
        myHash.add("Sparklers");
        myHash.add("Fountains");
        myHash.add("Quarter Stick");
        myHash.add("Smoke Bombs");
        myHash.add("Mortars");

        Iterator<String> inIt = myHash.iterator();
        while(inIt.hasNext()) {
            System.out.println(inIt.next());
        }//end while loop
    }//end method exampleHashSet

    public void exampleHashMap() {
        Map<Integer, String>  myMap = new HashMap<>();
        myMap.put(10, "Happy");
        myMap.put(15, "Days");
        myMap.put(20, "Are Here");
        myMap.put(25, "Happy");

        for(Map.Entry<Integer, String> beta : myMap.entrySet()){
            System.out.println(beta.getKey() + " = " + beta.getValue());
        }// end for loop

    }//end method exampleHashMap

}// end class Lesson17
