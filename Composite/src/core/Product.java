package core;

public abstract class Product {
  private String name;

  public Product(String name) {
    this.name = name;
  }

  public abstract Double calculatePrice();

  public String getName() {
    return name;
  }
}
