package com.itacademy.nikolaichik.toys.balls;

import com.itacademy.nikolaichik.toys.Toy;

public class Ball extends Toy {

  public Ball(String name, int count, int price) {
    super(name, count, price);
  }

  @Override
  public void play() {
    System.out.println("Ball is jumping");
  }

}
