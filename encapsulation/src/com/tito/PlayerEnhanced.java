package com.tito;

public class PlayerEnhanced {
  // encapsulated
  private String name;
  private int hitPoints = 100;
  private String weapon;

  public PlayerEnhanced(String name, int hitPoints, String weapon) {
    this.name = name;
    if(hitPoints > 0 && hitPoints <= 100) {
      this.hitPoints = hitPoints;
    } else {
      System.out.println("hitPoints must be from 1-100 inclusive");
    }
    this.weapon = weapon;
  }

  public void loseHealth(int damage) {
    this.hitPoints -= damage;
    if (this.hitPoints <= 0) {
      System.out.println("Player unconcious"); // normally would reduce the remaining number of lives
    }
  }

  public int getHitPoints() {
    return hitPoints;
  }
}
