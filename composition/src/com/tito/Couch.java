package com.tito;

public class Couch {
  private Dimensions dimensions;
  private int weight;
  private int size;
  private boolean isReclining;

  public Couch(Dimensions dimensions, int weight, int size, boolean isReclining) {
    this.dimensions = dimensions;
    this.weight = weight;
    this.size = size;
    this.isReclining = isReclining;
  }

  public void reclineSeat(boolean recline) {
    this.isReclining = recline;
    System.out.println("your seat is reclining...");
    System.out.println("you're ready for maximum relaxation");
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public int getWeight() {
    return weight;
  }

  public int getSize() {
    return size;
  }

  public boolean isReclining() {
    return isReclining;
  }
}
