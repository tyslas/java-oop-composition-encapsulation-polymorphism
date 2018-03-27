package com.tito;

public class Main {
  public static void main(String[] args) {
    // Create a class and demonstrate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, and anything else you think is needed.


    Player player1 = new Player();
    player1.name = "Paul";
    player1.health = 20;
    player1.weapon = "long bow";

    int damage = 10;
    player1.loseHealth(damage);
    System.out.println("remaining health of player1 is: " + player1.healthRemaining() + "\n");

    damage = 11;
    player1.loseHealth(damage);
    System.out.println("remaining health of player1 is: " + player1.healthRemaining());

    PlayerEnhanced player2 = new PlayerEnhanced("Chase", 85, "earth breaker");
    System.out.println("initial health of player2 is: " + player2.getHitPoints() + "\n");

    Printer officePrinter = new Printer(50, 5, true, 100);
    officePrinter.printPage(51, true);
    officePrinter.fillToner(30);
    officePrinter.printPage(51, true);
//    officePrinter.fillPaper(-5);
//    officePrinter.fillPaper(60);
    officePrinter.fillPaper(20);
    officePrinter.fillToner(30);
    officePrinter.printPage(30, false);
  }
}
