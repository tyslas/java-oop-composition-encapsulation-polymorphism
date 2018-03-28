package com.tito;

public class Burger {
  private String bun;
  private String meat;
  private boolean lettuce;
  private boolean tomato;
  private boolean avocado;
  private boolean onion;
  private int basePrice;
  private int lettucePrice;
  private int tomatoPrice;
  private int avoPrice;
  private int onionPrice;
  private int addtnsPrice;
  private int totalPrice;


  public Burger(boolean lettuce, boolean tomato, boolean avocado, boolean onion) {
    this.bun = "brioche";
    this.meat = "beef";
    this.lettuce = lettuce;
    this.tomato = tomato;
    this.avocado = avocado;
    this.onion = onion;
    this.basePrice = 10;
    this.lettucePrice = 1;
    this.tomatoPrice = 1;
    this.avoPrice = 2;
    this.onionPrice = 1;

    addLettuce(lettuce);
    addTomato(tomato);
    addAvocado(avocado);
    addOnion(onion);

    this.totalPrice = this.basePrice + this.addtnsPrice;
  }

  private void addLettuce(boolean lettuce) {
    if (lettuce) {
      this.addtnsPrice += this.lettucePrice;
      System.out.println("Burger -> adding lettuce for price of $" + this.lettucePrice);
    }
  }

  private void addTomato(boolean tomato) {
    if (tomato) {
      this.addtnsPrice += this.tomatoPrice;
      System.out.println("Burger -> adding tomato for price of $" + this.tomatoPrice);
    }
  }

  private void addAvocado(boolean avocado) {
    if (avocado) {
      this.addtnsPrice += this.avoPrice;
      System.out.println("Burger -> adding avocado for price of $" + this.avoPrice);
    }
  }

  private void addOnion(boolean onion) {
    if (onion) {
      this.addtnsPrice += this.onionPrice;
      System.out.println("Burger -> adding onion for price of $" + this.onionPrice);
    }
  }

  public int getBasePrice() {
    return basePrice;
  }

  public int getLettucePrice() {
    return lettucePrice;
  }

  public int getTomatoPrice() {
    return tomatoPrice;
  }

  public int getAvoPrice() {
    return avoPrice;
  }

  public int getOnionPrice() {
    return onionPrice;
  }

  public int getAddtnsPrice() {
    return addtnsPrice;
  }

  public int getTotalPrice() {
    return totalPrice;
  }
}
