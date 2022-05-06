package org.launchcode.studio7;


public class DVD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.
    int mainMenuOptions;

    public DVD(String name, String type) {
        super(name, type);
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void fillUpDisc(){
        System.out.println("The capacity of a single player DVD is 4.7 GB");
    }

//    public int menu(){
//        return
//    }
}
