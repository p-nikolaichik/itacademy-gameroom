package com.itacademy.nikolaichik.toys.doll;

import com.itacademy.nikolaichik.toys.Toy;
import com.itacademy.nikolaichik.toys.doll.operate.DollActions;

public abstract class Doll extends Toy implements DollActions {

  public Doll(String name, int count, int price) {
    super(name, count, price);
  }

  @Override
  public void play() {
    
  }

  protected abstract Doll getDoll();
}
