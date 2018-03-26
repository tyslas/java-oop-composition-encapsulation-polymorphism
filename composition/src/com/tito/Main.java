package com.tito;

import java.awt.*;

public class Main {

  public static void main(String[] args) {
    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well
    // Add at least one method to access an object via a getter and then that objects public method as you saw in the previous video
    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class like you saw in this video.

    Dimensions dimensions = new Dimensions(20, 20, 5);
    Case theCase = new Case("220B", "Dell", "240", dimensions);

    Monitor theMonitor = new Monitor("27in Beast", "Acer", 27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

    PC thePC = new PC(theCase, theMonitor, theMotherboard);
    thePC.powerUp();
    System.out.println("");

    Dimensions lrDims = new Dimensions(15, 15, 20);
    Dimensions TVdims = new Dimensions(80, 60, 4);
    Dimensions coffeeDims = new Dimensions(4, 2, 3);
    Dimensions couchDims = new Dimensions(8, 4, 4);
    Resolution tvResolution = new Resolution(3840, 2160);

    Couch theCouch = new Couch(couchDims, 100, 4, false);
    CoffeeTable theCoffeeTable = new CoffeeTable(coffeeDims, "brushed aluminum", 30);
    TV theTV = new TV("S990", "Samsung", TVdims, 20, tvResolution, true);
    LivingRoom theLR = new LivingRoom(lrDims, theCouch, theCoffeeTable, theTV);

    theLR.recline();

  }
}
