package com.itacademy.nikolaichik.search;

import java.util.Arrays;

import com.itacademy.nikolaichik.rooms.GameRoom;
import com.itacademy.nikolaichik.toys.Toy;
import com.itacademy.nikolaichik.util.ObjectUtil;

public class Search {

  public static Toy[] searchByParameter(GameRoom gameRoom, Parameter parameter, String parameterValue) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    Toy[] existingToys = gameRoom.getToys();
    Toy[] matchedToys = new Toy[]{};
    if (!ObjectUtil.isNull(existingToys)) {
      for (int i = 0; i < existingToys.length; i++) {
        if (existingToys[i].getParameterValue(parameter.getValue()).toString().equalsIgnoreCase(parameterValue)) {
          matchedToys = Arrays.copyOf(matchedToys, matchedToys.length + 1);
          matchedToys[matchedToys.length - 1] = existingToys[i];
        }
      }
    }
    return matchedToys;
  }
}
