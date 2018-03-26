package com.tito;

public class Player {
  // not encapsulated
  public String name;
  public int health;
  public String weapon;

  public void loseHealth(int damage) {
    this.health -= damage;
    if (this.health <= 0) {
      System.out.println("Player unconcious"); // normally would reduce the remaining number of lives
    }
  }

  public int healthRemaining() {
    return this.health;
  }
}
