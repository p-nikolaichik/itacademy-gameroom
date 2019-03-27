package com.itacademy.nikolaichik.rooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.sound.midi.VoiceStatus;

import com.itacademy.nikolaichik.messages.Messages;
import com.itacademy.nikolaichik.toys.Toy;
import com.itacademy.nikolaichik.toys.operate.ToysActions;

public class GameRoom {
  
  private int maxCountOfToys;
  private int money;
  private List<Toy> toys;
  
  public List<Toy> getToys() {
    return toys;
  }

  public GameRoom(int maxCountOfToys, int money) {
    this.maxCountOfToys = maxCountOfToys;
    this.money = money;
    this.toys = new ArrayList<>(); 
  }
  
  public String addToys(Toy[] toys) {
    String hasFreeSpace = checkFreeSpaceForToys(toys);
    String hasBalance = checkBalance(toys);
    if (hasFreeSpace.equals(Messages.FREE_PLACE_AVAILABLE) && hasBalance.equals(Messages.MONEY_ENOUGH_FOR_BUYING)) {
      buyToys(toys);
    }
    return hasFreeSpace + "\n" + hasBalance;
  }

  public void addMoney(int money) {
    this.money += money;
  }
  
  private String checkFreeSpaceForToys(Toy[] toys) {
    if (hasRoomAvailablePlaceForToys(toys)) {
      return Messages.FREE_PLACE_AVAILABLE;
    }
    return Messages.FREE_PLAVE_UNAVAILABLE;
  }
  
  private boolean hasRoomAvailablePlaceForToys(Toy[] toys) {
    return getFreeSpace() >= toys.length;
  }
  
  private int getFreeSpace() {
    return maxCountOfToys -  toys.size() ;
  }
  
  private String checkBalance(Toy[] toys) {
    if (getCostOfToys(toys) <= money) {
      return Messages.MONEY_ENOUGH_FOR_BUYING;
    }
    return Messages.MONEY_NOT_ENOUGH_FOR_BUYING;
  }
  
  private int getCostOfToys(Toy[] toys) {
    int sum = 0;
    for (Toy toy : toys) {
      sum += toy.getPrice();
    }
    return sum;
  }
  
  private void buyToys(Toy[] toys) {
    money -= getCostOfToys(toys);
    this.toys.addAll(Arrays.asList(toys));
  }
}
