package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    int numberOfTracks;
    // TODO: Implement your custom interface.

    public CD(String name, String type) {
        super(name,type);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void fillUpDisc(){
        System.out.println("The capacity of a single player CD is 734 MB");
    }

}
