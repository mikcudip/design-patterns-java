package core;

import java.util.ArrayList;
import java.util.List;

public class Shop {
  public List<Item> items;

  public Shop() {
    items = new ArrayList<Item>();
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(Item item) {
    items.remove(item);
  }

  public Double calculatePrice() {
    Double totalPrice = 0.0;
    for (Item item : items) {
      totalPrice += item.getPrice();
    }
    return totalPrice;
  }
}
