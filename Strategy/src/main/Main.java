package main;

import core.*;

public class Main {
  public static void main(String[] args) {
    Location location1 = new Location(50.0, 100.0);
    Location location2 = new Location(20.0, 300.0);

    Map map = new Map(location1, new MovementStrategyWalking());
    System.out.println(map.calculateTimeLocation(location2));

    map.setMovementStrategy(new MovementStrategyCar(true));
    System.out.println(map.calculateTimeLocation(location2));
  }
}
