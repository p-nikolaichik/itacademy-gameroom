package com.itacademy.nikolaichik.search;

import java.util.ArrayList;
import java.util.List;

import com.itacademy.nikolaichik.rooms.GameRoom;
import com.itacademy.nikolaichik.toys.Toy;

public class Search {

  public static Toy[] search(GameRoom gameRoom, Parameter parameter, String parameterValue) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    Toy[] existingToys = gameRoom.getToys().toArray(new Toy[gameRoom.getToys().size()]);
    List<Toy> foundedToys = new ArrayList<>();
    if (existingToys != null) {
      for (Toy toy : existingToys) {
        if (toy.getParameterValue(parameter.getValue()).toString().equalsIgnoreCase(parameterValue)) {
          foundedToys.add(toy);
        }
      }
    }
    return foundedToys.toArray(new Toy[foundedToys.size()]);
  }
}
