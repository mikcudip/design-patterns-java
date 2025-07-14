package core;

import java.util.ArrayList;
import java.util.List;

public class BurgerJoint {
  private List<Product> products;

  public BurgerJoint() {
    products = new ArrayList<>();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public Double calculateCartPrice() {
    Double finalPrice = 0.0;
    for (Product product : products) {
      finalPrice += product.calculatePrice();
    }
    return finalPrice;
  }
}
