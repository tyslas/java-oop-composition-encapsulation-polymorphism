package com.tito;

public class DeluxeBurger extends Burger {
  private boolean chips;
  private boolean drink;
  private int basePrice;
  private int addtnsPrice;
  private int totalPrice;

  public DeluxeBurger(boolean lettuce, boolean tomato, boolean avocado, boolean onion) {
    super(lettuce, tomato, avocado, onion);
    this.chips = true;
    this.drink = true;
    this.basePrice = 13;
    this.addtnsPrice = super.getAddtnsPrice();
    this.totalPrice = this.basePrice + this.addtnsPrice;
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
