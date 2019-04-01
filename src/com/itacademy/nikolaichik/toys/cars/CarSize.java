package com.itacademy.nikolaichik.toys.cars;

public enum CarSize {
  
  SMALL("small"), MEDIUM("medium"), LARGE("large");
  
  private String name;
  
  private CarSize(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
}
