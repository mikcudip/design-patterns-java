package core;

public class Reader implements Observer {
  public String name;
  public Integer age;

  public Reader(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public void update() {
    System.out.println("I am " + name + " and im reading the new article");
  }
}
