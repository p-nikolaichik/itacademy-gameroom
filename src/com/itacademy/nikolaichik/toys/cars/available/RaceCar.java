package com.itacademy.nikolaichik.toys.cars.available;

import com.itacademy.nikolaichik.toys.cars.Car;
import com.itacademy.nikolaichik.toys.cars.CarSize;

public class RaceCar extends Car {

  public RaceCar(String name, int count, int price, CarSize carSize) {
    super(name, count, price, carSize);
  }

  @Override
  public void run() {
    System.out.println("Race car is running fast");
  }

  @Override
  public void giveSignal() {
    System.out.println("bibibibibi");
  }

  @Override
  public void stop() {
    System.out.println("Race car is stopped");
  }

  @Override
  protected Car getCar() {
    return this;
  }
}
