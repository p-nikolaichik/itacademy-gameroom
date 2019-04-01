package com.itacademy.nikolaichik.run;

import com.itacademy.nikolaichik.rooms.GameRoom;
import com.itacademy.nikolaichik.search.Parameter;
import com.itacademy.nikolaichik.search.Search;
import com.itacademy.nikolaichik.toys.Toy;
import com.itacademy.nikolaichik.toys.balls.Ball;
import com.itacademy.nikolaichik.toys.cars.CarSize;
import com.itacademy.nikolaichik.toys.cars.available.RaceCar;
import com.itacademy.nikolaichik.toys.cars.available.Van;
import com.itacademy.nikolaichik.toys.doll.available.Barbi;
import com.itacademy.nikolaichik.util.ToysUtil;

public class MainApp {

  public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {

    GameRoom gameRoom = new GameRoom(20, 600);
    Toy[] toys = new Toy[] {
        new RaceCar("Speed car", 5, 50, CarSize.SMALL),
        new RaceCar("Race car", 235, 70, CarSize.SMALL),
        new RaceCar("Rocket car", 34534, 20, CarSize.MEDIUM),
        new RaceCar("Big race car", 0, 2, CarSize.LARGE),
        new RaceCar("Seped car", 5, 46, CarSize.SMALL),
        new Van("Big van", 10, 20, CarSize.LARGE),
        new Ball("Football", 10, 20),
        new Barbi("Barbi", 40, 10)
        
    };

    gameRoom.buyToys(toys);
    gameRoom.buyToys(toys);
    Toy[] sortedArray = ToysUtil.sort(gameRoom.getToys(), Parameter.PRICE);
    printArray(sortedArray);
    Toy[] foundedToys = Search.searchByParameter(gameRoom, Parameter.COUNT, "5");
    printArray(foundedToys);
  }
  
  private static void printArray(Toy[] toys) {
    for (Toy toy : toys) {
      System.out.println(toy);
    }
    System.out.println("==============");
  }
}
