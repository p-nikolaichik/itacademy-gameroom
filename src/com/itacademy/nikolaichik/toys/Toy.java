package com.itacademy.nikolaichik.toys;

import java.lang.reflect.Field;

import com.itacademy.nikolaichik.toys.operate.ToyActions;

public abstract class Toy implements ToyActions {

  private String name;

  private int count;

  private int price;

  public Toy(String name, int count, int price) {
    this.name = name;
    this.count = count;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Toy [name=" + name + ", count=" + count + ", price=" + price + "]";
  }

  public Object getParameterValue(String parameterName) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    Class<Toy> toy = Toy.class;
    Field field = toy.getDeclaredField(parameterName);
    Object value = field.get(this);
    return value;
  }
}
