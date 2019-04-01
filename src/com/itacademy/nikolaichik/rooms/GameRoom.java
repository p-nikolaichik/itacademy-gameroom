package com.itacademy.nikolaichik.rooms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.logging.Logger;

import com.itacademy.nikolaichik.toys.Toy;
import com.itacademy.nikolaichik.util.ObjectUtil;

public class GameRoom {

  private int maxCountOfToys;
  
  private BigDecimal balance;

  private Toy[] toys;

  private static final Logger logger = Logger.getLogger(GameRoom.class.getName());

  public Toy[] getToys() {
    return toys;
  }

  protected GameRoom() {
  }

  public GameRoom(int maxCountOfToys, double balance) {
    this.balance = new BigDecimal(balance);
    this.balance.setScale(2, RoundingMode.DOWN);
    this.maxCountOfToys = maxCountOfToys;
    this.toys = new Toy[] {};
  }

  public void buyToys(Toy[] toys) {
    if (!ObjectUtil.isNull(toys) || hasFreeSpace() || hasRoomEnoughBalanceForBuying(toys)) {
      balance.subtract(getCostOfToys(toys));
      addToys(toys);
    }
    
  }

  public void addMoney(double money) {
    this.balance.add(new BigDecimal(money));
  }
  
  private boolean hasFreeSpace() {
    if (toys.length > getFreeSpace()) {
      logger.info(String.format("Room doesn't have enough space. Available: [%s], neccesary [%s]", getFreeSpace(), toys.length));
      return false;
    }
    return true;
  }

  private int getFreeSpace() {
    return maxCountOfToys - this.toys.length;
  }

  private boolean hasRoomEnoughBalanceForBuying(Toy[] toys) {
    if (balance.compareTo(getCostOfToys(toys)) >= 0) {
      return true;
    }
    logger.info(String.format("Not enough balance. Available balance - [%s], need - [%s]", balance, toys));
    return false;
  }

  private BigDecimal getCostOfToys(Toy[] toys) {
    double sum = 0;
    for (Toy toy : toys) {
      sum += toy.getPrice();
    }
    return new BigDecimal(sum);
  }

  private void addToys(Toy[] toys) {
    Toy[] unitedArray = Arrays.copyOf(this.toys, this.toys.length + toys.length);
    System.arraycopy(toys, 0, unitedArray, this.toys.length, toys.length);
    this.toys = unitedArray;
  }
}
