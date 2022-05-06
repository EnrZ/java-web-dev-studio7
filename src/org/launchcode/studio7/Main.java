package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("How The West Was Won","Album");
        DVD myDvd = new DVD("Up", "Movie");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCd.spinDisc();
        myDvd.spinDisc();
        myCd.fillUpDisc();
        myDvd.fillUpDisc();
        System.out.println(myCd.getName());
        System.out.println(myDvd.getName());
    }
}
