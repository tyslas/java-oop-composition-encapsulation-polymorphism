package com.tito;

class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }

  public String plot() {
    return "no plot here";
  }

  public String getName() {
    return name;
  }
}

class Jaws extends Movie {
  public Jaws() {
    super("Jaws");
  }

  public String plot() {
    return "a shark causes untold damage and eats people";
  }
}

class IndependenceDay extends Movie {
  public IndependenceDay() {
    super("Independence Day");
  }

  @Override
  public String plot() {
    return "aliens attempt to take over Earth";
  }
}

class MazeRunner extends Movie {
  public MazeRunner() {
    super("Maze Runner");
  }

  @Override
  public String plot() {
    return "kids try to escape a maze";
  }
}

class StarWars extends Movie {
  public StarWars() {
    super("Star Wars");
  }

  @Override
  public String plot() {
    return "Imperial forces try to take over the Universe and crush the Rebellion";
  }
}

class Forgettable extends Movie {
  public Forgettable() {
    super("Forgettable");
  }

  // no plot method override added
}

class Car {
  private int cylinders;
  private String name;
  private int wheels;
  private boolean engine;
  private int velocity;
  private boolean on;

  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
    this.wheels = 4;
    this.engine = true;
    this.velocity = 0;
    this.on = false;
  }

  public void startEngine() {
    if (this.engine == true) {
      System.out.println("[Car.startEngine] car is running!");
    } else {
      System.out.println("[Car.startEngine] car has no engine, cannot be turned on");
    }
  }

  public void accelerate(int deltaV) {
    if (deltaV > 0 && deltaV + this.velocity <= 100) {
      this.velocity += deltaV;
      System.out.println("[Car.accelerate] car accelerated " + deltaV + " mph");
      System.out.println("[Car.accelerate] car is now traveling at a velocity of " + this.velocity + " mph");
    } else {
      System.out.println("[Car.accelerate] car cannot travel less 0 mph or greater than 100 mph");
    }
  }

  public void brake(int deltaV) {
    if (deltaV < 100 && deltaV + this.velocity >= 0) {
      this.velocity -= deltaV;
      System.out.println("[Car.brake] car decelerated " + deltaV + " mph");
      System.out.println("[Car.brake] car is now traveling at a velocity of " + this.velocity + " mph");
    } else {
      System.out.println("[Car.brake] car cannot travel less 0 mph or greater than 100 mph");
    }
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName() {
    return name;
  }

  public int getWheels() {
    return wheels;
  }

  public boolean isEngine() {
    return engine;
  }

  public int getVelocity() {
    System.out.println("[Car.getVelocity]");
    return velocity;
  }

  public void setVelocity(int velocity) {
    System.out.println("[Car.setVelocity]");
    this.velocity = velocity;
  }

  public boolean isOn() {
    return on;
  }
}

class Viper extends Car {
  public Viper() {
    super(10, "Vipe-ski");
  }

  @Override
  public void accelerate(int deltaV) {
    if (deltaV > 0 && this.getVelocity() + deltaV <= 220) {
      this.setVelocity(this.getVelocity() + deltaV);
      System.out.println("[Viper.accelerate] car accelerated " + deltaV + " mph");
      System.out.println("[Viper.accelerate] current velocity: " + this.getVelocity());
      System.out.println("[Viper.accelerate] car is now traveling at a velocity of " + this.getVelocity() + " mph");
    } else {
      System.out.println("[Viper.accelerate] car cannot travel less 0 mph or greater than 220 mph");
    }
  }

  @Override
  public void brake(int deltaV) {
    if (deltaV < 220 && this.getVelocity() - deltaV >= 0) {
      this.setVelocity(this.getVelocity() - deltaV);
      System.out.println("[Viper.brake] car decelerated " + deltaV + " mph");
      System.out.println("[Viper.brake] car is now traveling at a velocity of " + this.getVelocity() + " mph");
    } else {
      System.out.println("[Viper.brake] car cannot travel less 0 mph or greater than 220 mph");
    }
  }
}

class STI extends Car {
  public STI() {
    super(6, "Suby");
  }

  @Override
  public void accelerate(int deltaV) {
    if (deltaV > 0 && this.getVelocity() + deltaV <= 180) {
      this.setVelocity(this.getVelocity() + deltaV);
      System.out.println("[STI.accelerate] car accelerated " + deltaV + " mph");
      System.out.println("[STI.accelerate] current velocity: " + this.getVelocity());
      System.out.println("[STI.accelerate] car is now traveling at a velocity of " + this.getVelocity() + " mph");
    } else {
      System.out.println("[STI.accelerate] car cannot travel less 0 mph or greater than 180 mph");
    }
  }

  @Override
  public void brake(int deltaV) {
    if (deltaV < 220 && this.getVelocity() - deltaV >= 0) {
      this.setVelocity(this.getVelocity() - deltaV);
      System.out.println("[STI.brake] car decelerated " + deltaV + " mph");
      System.out.println("[STI.brake] car is now traveling at a velocity of " + this.getVelocity() + " mph");
    } else {
      System.out.println("[STI.brake] car cannot travel less 0 mph or greater than 220 mph");
    }
  }
}

public class Main {
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize: # of cylinders, name, wheels -> 4, and engine -> true
// Cylinders and names would be passed parameters.
// Create appropriate getters
// Create some methods like startEngine, accelerate, and brake
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

  public static void main(String[] args) {
    Viper viper = new Viper();
    System.out.println(viper.getName());
    viper.startEngine();
    viper.accelerate(60);
    viper.accelerate(160);
    viper.brake(60);
    System.out.println("\n");
    STI sti = new STI();
    System.out.println(sti.getName());
    sti.startEngine();
    sti.accelerate(140);
    sti.brake(45);
    sti.brake(62);
    sti.accelerate(26);
//    for (int i = 1; i < 11; i++) {
//      Movie movie = randomMovie();
//      System.out.println("Movie # " + i + " : " + movie.getName() + "\n"
//                          + "plot: " + movie.plot() + "\n");
//    }
  }

  public static Movie randomMovie() {
    int randNum = (int) (Math.random() * 5) + 1;
    System.out.println("random number generated: " + randNum);
    switch (randNum) {
      case 1:
        return new Jaws();
      case 2:
        return new IndependenceDay();
      case 3:
        return new MazeRunner();
      case 4:
        return new StarWars();
      case 5:
        return new Forgettable();
    }

    return null;
  }
}
