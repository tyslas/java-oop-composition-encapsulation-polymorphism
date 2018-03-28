package com.tito;

public class PopeyeBurger {
  private String bun;
  private String meat;
  private boolean pickles;
  private boolean tomato;
  private boolean avocado;
  private boolean onion;
  private boolean spinach;
  private boolean mushrooms;
  private int basePrice;
  private int picklesPrice;
  private int tomatoPrice;
  private int avoPrice;
  private int onionPrice;
  private int spinachPrice;
  private int mushroomsPrice;
  private int addtnsPrice;
  private int totalPrice;

  public PopeyeBurger(boolean pickles, boolean tomato, boolean onion, boolean mushrooms) {
    this.bun = "brown rye roll";
    this.meat = "bison";
    this.pickles = pickles;
    this.avocado = true;
    this.tomato = tomato;
    this.onion = onion;
    this.spinach = true;
    this.mushrooms = mushrooms;
    this.basePrice = 14;
    this.picklesPrice = 1;
    this.tomatoPrice = 1;
    this.avoPrice = 2;
    this.onionPrice = 1;
    this.spinachPrice = 1;
    this.mushroomsPrice = 1;

    System.out.println("Popeye's base price: $" + this.basePrice + "\n");
    addPickles(pickles);
    addTomato(tomato);
    addOnion(onion);
    addMushrooms(mushrooms);

    this.totalPrice = this.basePrice + this.addtnsPrice;
  }

  private void addPickles(boolean pickles) {
    if (pickles) this.addtnsPrice += this.picklesPrice;
    System.out.println("adding pickles for price of $" + this.picklesPrice);
  }

  private void addTomato(boolean tomato) {
    if (tomato) this.addtnsPrice += this.tomatoPrice;
    System.out.println("adding tomato for price of $" + this.tomatoPrice);
  }

  private void addOnion(boolean onion) {
    if (onion) this.addtnsPrice += this.onionPrice;
    System.out.println("adding onion for price of $" + this.onionPrice);
  }

  private void addMushrooms(boolean mushrooms) {
    if (mushrooms) this.addtnsPrice += this.mushroomsPrice;
    System.out.println("adding mushrooms for price of $" + this.mushroomsPrice);
  }

  public int getBasePrice() {
    return basePrice;
  }

  public int getAddtnsPrice() {
    return addtnsPrice;
  }

  public int getTotalPrice() {
    return totalPrice;
  }
}
