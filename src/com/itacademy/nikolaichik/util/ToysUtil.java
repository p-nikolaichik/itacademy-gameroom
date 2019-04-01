package com.itacademy.nikolaichik.util;

import com.itacademy.nikolaichik.search.Parameter;
import com.itacademy.nikolaichik.toys.Toy;

public class ToysUtil {

  public static Toy[] sort(Toy[] toys, Parameter parameter) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    for (int i = 1; i < toys.length; i++) {
      for (int j = i; j >= 1; j--) {
        Object currentValue = toys[j].getParameterValue(parameter.getValue());
        Object previousValue = toys[j - 1].getParameterValue(parameter.getValue());
        if (compareTo(currentValue, previousValue) > 1) {
          Toy temp = toys[j];
          toys[j] = toys[j - 1];
          toys[j - 1] = temp;
        }
      }

    }
    return toys;
  }

  private static int compareTo(Object object1 ,Object object2) {
    if (object1 instanceof Integer) {
      return (int) object1 - (int) object2;
    } else if (object1 instanceof String) {
      return ((String) object1).compareTo((String) object2);
    }
    throw new IllegalArgumentException();
  }
}
