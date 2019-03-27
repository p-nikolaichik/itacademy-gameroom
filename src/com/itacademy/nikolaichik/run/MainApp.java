package com.itacademy.nikolaichik.run;

import com.itacademy.nikolaichik.Util.ToysUtil;
import com.itacademy.nikolaichik.rooms.GameRoom;
import com.itacademy.nikolaichik.search.Parameter;
import com.itacademy.nikolaichik.search.Search;
import com.itacademy.nikolaichik.toys.Toy;
import com.itacademy.nikolaichik.toys.balls.Ball;
import com.itacademy.nikolaichik.toys.cars.CarSize;
import com.itacademy.nikolaichik.toys.cars.available.RaceCar;
import com.itacademy.nikolaichik.toys.cars.available.Van;
import com.itacademy.nikolaichik.toys.doll.available.Arias;
import com.itacademy.nikolaichik.toys.doll.available.Barbi;

public class MainApp {

  public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    GameRoom gameRoom = new GameRoom(20, 300);
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
    gameRoom.addToys(toys);
    Toy[] sortedArray = ToysUtil.sort(gameRoom.getToys().toArray(new Toy[gameRoom.getToys().size()]), Parameter.PRICE);
    for (Toy toy : sortedArray) {
      System.out.println(toy);
    }
    Toy[] foundedToys = Search.search(gameRoom, Parameter.COUNT, "5");
    for (Toy toy : foundedToys) {
      System.out.println(toy.getName());
    }
    
  }

}
