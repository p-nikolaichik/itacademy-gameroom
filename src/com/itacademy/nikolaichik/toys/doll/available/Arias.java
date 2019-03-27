package com.itacademy.nikolaichik.toys.doll.available;

import com.itacademy.nikolaichik.toys.doll.Doll;

public class Arias extends Doll {

  public Arias(String name, int count, int price) {
    super(name, count, price);
  }

  @Override
  public void say() {
    System.out.println("Arias is speaking");
  }

  @Override
  public void go() {
    System.out.println("Arias is going");
  }

  @Override
  public void dress() {
    System.out.println("Arias is dressed");
  }

  @Override
  protected Doll getDoll() {
    return this;
  }

}
