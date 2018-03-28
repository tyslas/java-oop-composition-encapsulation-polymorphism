package com.tito;

public class Main {

  public static void main(String[] args) {
    // The purpose of the application: help Bill's Burgers manage their hamburger selling process
    // Our application will help Bill select types of burgers, add'tnl ingredients, and calculate price
    // We will have a base burger along with two of the other most popular burgers at Bill's
    // The base burger will have the following items:
      // Bun type, meat, and up to 4 add'tns (e.g. lettuce, tomato, carrot, etc.) to be selected by each guest
    // Each add'tnl item increases the price, which will be tracked and included in the calculation of the total price
    // The burger has a base price and all add'tns have their individual price
    // A Hamburger class will handle all the above
    // The constructor should only include the bun type, meat, and price - can also include burger name or use a setter
    // Also create two extra types of burgers (subclasses) that cater to:
      // a) Healthy burger (on a brown rye bread roll), plus two add'tnl items (up to 6 add'tnl ingredients)
      // hint: you probably want to process the two add'tnl ingredients in this new subclass, not the base class
      // b) Deluxe hamburger - comes with chips & drink as add'tns, w/no other add'tns allowed
      // hint: auto-magically add chips & drink at instantiation of the deluxe burger object & prevent further add'tns
    //  All 3 classes will have a method to show the base price plus any add'tns:
      // show the add'tn name, add'tn price, and total price (base price + all add'tns)
    // For the two add'tnl classes you may need to get pricing for the base class, then add add'tns to find the total

    Burger burger = new Burger(true, true, true, true);
    System.out.println("additions price: $" + burger.getAddtnsPrice());
    System.out.println("total price: $" + burger.getTotalPrice() + "\n");

    PopeyeBurger popeye = new PopeyeBurger(true, true, true, true);
    System.out.println("additions price: $" + popeye.getAddtnsPrice());
    System.out.println("total price: $" + popeye.getTotalPrice());
  }
}
