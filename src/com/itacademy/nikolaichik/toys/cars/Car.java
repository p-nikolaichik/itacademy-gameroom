package com.itacademy.nikolaichik.toys.cars;

import com.itacademy.nikolaichik.toys.Toy;
import com.itacademy.nikolaichik.toys.cars.operate.CarActions;

public abstract class Car extends Toy implements CarActions {
  
  private CarSize carSize;
  
  public Car(String name, int count, int price, CarSize carSize) {
    super(name, count, price);
    this.carSize = carSize;
  }
  
  protected abstract Car getCar();
  
  public void play() {
    getCar().run();
    getCar().giveSignal();
    getCar().stop();
  }
  
  public CarSize getCarSize() {
    return carSize;
  }
}
