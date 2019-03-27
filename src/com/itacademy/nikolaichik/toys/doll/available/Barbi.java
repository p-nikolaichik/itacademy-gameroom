package com.itacademy.nikolaichik.toys.doll.available;

import com.itacademy.nikolaichik.toys.doll.Doll;

public class Barbi extends Doll {

  public Barbi(String name, int count, int price) {
    super(name, count, price);
  }

  @Override
  public void say() {
    System.out.println("Barbi is speaking");
  }

  @Override
  public void go() {
    System.out.println("barbi is going");
  }

  @Override
  public void dress() {
    System.out.println("Barbi is dressed");
  }

  @Override
  protected Barbi getDoll() {
    return this;
  }
}
