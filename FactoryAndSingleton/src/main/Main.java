package main;

import core.ItemFactory;
import core.Shop;

public class Main {
  public static void main(String[] args) {
    phrase();

    ItemFactory itemFactory = ItemFactory.getInstance();
    ItemFactory anotherItemFactory = ItemFactory.getInstance();
    Shop shop = new Shop();
    shop.addItem(itemFactory.createItem(1));
    shop.addItem(itemFactory.createItem(2));
    shop.addItem(itemFactory.createItem(3));

    System.out.println(shop.calculatePrice());
    System.out.println(itemFactory.equals(anotherItemFactory));
  }

  public static void phrase() {
    System.out.println("Hello World!");
  }
}
