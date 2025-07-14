package core;

public class ProductSingle extends Product {
  private Double price;

  public ProductSingle(String name, Double price) {
    super(name);
    this.price = price;
  }

  @Override
  public Double calculatePrice() {
    return price;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
