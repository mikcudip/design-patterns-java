package core;

import java.util.ArrayList;
import java.util.List;

public class ProductComposite extends Product {
  private List<Product> products = new ArrayList<>();
  private Double discount;

  public ProductComposite(String name, Double discount) {
    super(name);
    this.discount = discount;
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  @Override
  public Double calculatePrice() {
    Double finalPrice = 0.0;
    for (Product product : products) {
      finalPrice += product.calculatePrice();
    }
    return finalPrice - (finalPrice * discount);
  }
}
