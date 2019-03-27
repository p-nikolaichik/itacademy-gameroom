package com.itacademy.nikolaichik.toys.cars.available;

import com.itacademy.nikolaichik.toys.cars.Car;
import com.itacademy.nikolaichik.toys.cars.CarSize;

public class Van extends Car {

  public Van(String name, int count, int price, CarSize carSize) {
    super(name, count, price, carSize);
  }

  @Override
  public void run() {
   System.out.println("Van is drived");
  }

  @Override
  public void giveSignal() {
   System.out.println("BIP-BIP");
  }

  @Override
  public void stop() {
    System.out.println("Van is stopped");
  }

  @Override
  public Van getCar() {
    return this;
  }
}
