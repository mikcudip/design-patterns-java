package main;

import core.Tamagochi;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Tamagochi tamagochi = new Tamagochi("Tamagochi One");
    System.out.println(tamagochi.getCurrentState());
    tamagochi.eat();
    System.out.println(tamagochi.getCurrentState());
    tamagochi.sleep();
    System.out.println(tamagochi.getCurrentState());
    tamagochi.play();
    System.out.println(tamagochi.getCurrentState());
  }
}
