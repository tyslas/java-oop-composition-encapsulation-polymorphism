package com.tito;

public class CoffeeTable {
  private Dimensions dimensions;
  private String material;
  private int weight;

  public CoffeeTable(Dimensions dimensions, String material, int weight) {
    this.dimensions = dimensions;
    this.material = material;
    this.weight = weight;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public String getMaterial() {
    return material;
  }

  public int getWeight() {
    return weight;
  }
}
