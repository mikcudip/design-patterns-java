package core;

public class Item {
  private String name;
  private Double price;

  public Item(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
