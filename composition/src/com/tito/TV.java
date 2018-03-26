package com.tito;

public class TV {
  private String model;
  private String manufacturer;
  private Dimensions dimensions;
  private int weight;
  private Resolution resolution;
  private boolean isSmart;

  public TV(String model, String manufacturer, Dimensions dimensions, int weight, Resolution resolution, boolean isSmart) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.dimensions = dimensions;
    this.weight = weight;
    this.resolution = resolution;
    this.isSmart = isSmart;
  }

  public void powerOn() {
    System.out.println("the TV has been turned on, you are ready to watch your favorite shows, sporting events & movies");
  }

  public void powerOff() {
    System.out.println("the TV has turned off, thanks for watching");
  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public int getWeight() {
    return weight;
  }

  public Resolution getResolution() {
    return resolution;
  }

  public boolean isSmart() {
    return isSmart;
  }
}
