package com.tito;

public class LivingRoom {
  private Dimensions roomDims;
  private Couch lrCouch;
  private CoffeeTable lrCoffeTable;
  private TV lrTV;

  public LivingRoom(Dimensions roomDims, Couch lrCouch, CoffeeTable lrCoffeTable, TV lrTV) {
    this.roomDims = roomDims;
    this.lrCouch = lrCouch;
    this.lrCoffeTable = lrCoffeTable;
    this.lrTV = lrTV;
  }

  public void recline() {
    lrCouch.reclineSeat(true);
    turnOnTV();
  }

  private void turnOnTV() {
    lrTV.powerOn();
  }

  public Dimensions getRoomDims() {
    return roomDims;
  }

  public Couch getLrCouch() {
    return lrCouch;
  }

  public CoffeeTable getLrCoffeTable() {
    return lrCoffeTable;
  }

  public TV getLrTV() {
    return lrTV;
  }
}
