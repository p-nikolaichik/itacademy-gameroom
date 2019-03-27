package com.itacademy.nikolaichik.search;

public enum Parameter {

  NAME("name"), COUNT("count"), PRICE("price");
  
  private String value;
  
  private Parameter(String value) {
    this.value = value;
  }
  
  public String getValue() {
    return value;
  }
}
