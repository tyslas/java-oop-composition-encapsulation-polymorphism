package com.tito;

public class PopeyeBurger extends Burger {
  private String bun;
  private String meat;
  private boolean pickles;
  private boolean spinach;
  private boolean mushrooms;
  private int basePrice;
  private int picklesPrice;
  private int spinachPrice;
  private int mushroomsPrice;
  private int addtnsPrice;
  private int totalPrice;

  public PopeyeBurger(boolean lettuce, boolean tomato, boolean avocado, boolean onion, boolean pickles) {
    super(lettuce, tomato, avocado, onion);
    this.pickles = pickles;
    this.mushrooms = true;
    this.bun = "brown rye roll";
    this.meat = "bison";
    this.spinach = true;
    this.basePrice = 14;
    this.picklesPrice = 1;
    this.spinachPrice = 1;
    this.mushroomsPrice = 1;

    addPickles(pickles);

    this.totalPrice = this.basePrice + this.addtnsPrice;
  }

  private void addPickles(boolean pickles) {
    if (pickles) {
      this.addtnsPrice += (this.picklesPrice + super.getAddtnsPrice());
      System.out.println("Popeye -> adding pickles for price of $" + this.picklesPrice);
    }
  }

  @Override
  public int getBasePrice() {
    return basePrice;
  }

  @Override
  public int getAddtnsPrice() {
    return addtnsPrice;
  }

  @Override
  public int getTotalPrice() {
    return totalPrice;
  }
}
