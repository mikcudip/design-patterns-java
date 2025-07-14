package main;

import core.BurgerJoint;
import core.ProductComposite;
import core.ProductSingle;

public class Main {
  public static void main(String[] args) {
    ProductSingle hamburger = new ProductSingle("Hamburger", 5.0);
    ProductSingle frenchFries = new ProductSingle("Fries", 2.0);
    ProductSingle cola = new ProductSingle("Cola", 1.0);

    BurgerJoint burgerJoint = new BurgerJoint();
    burgerJoint.addProduct(hamburger);
    burgerJoint.addProduct(frenchFries);
    burgerJoint.addProduct(cola);

    ProductComposite productComposite = new ProductComposite("Combo 1", 0.1);
    productComposite.addProduct(hamburger);
    productComposite.addProduct(frenchFries);
    productComposite.addProduct(cola);

    burgerJoint.addProduct(productComposite);

    ProductComposite megaProductComposite = new ProductComposite("Mega Combo", 0.25);
    megaProductComposite.addProduct(productComposite);
    megaProductComposite.addProduct(productComposite);
    megaProductComposite.addProduct(productComposite);
    megaProductComposite.addProduct(productComposite);
    megaProductComposite.addProduct(frenchFries);

    burgerJoint.addProduct(megaProductComposite);

    System.out.println(burgerJoint.calculateCartPrice());
  }
}
