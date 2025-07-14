package core;

import java.util.List;

public class NewsPaper implements Observable {
  private String name;
  private List<Observer> suscribers;

  public NewsPaper(String name) {
    this.name = name;
  }

  public void publish() {
    System.out.println("New article is now online");
    notifyAllObservers();
  }

  @Override
  public void notifyAllObservers() {
    for (Observer subscriber : suscribers) {
      subscriber.update();
    }
  }

  @Override
  public void addObserver(Observer observer) {
    suscribers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    suscribers.remove(observer);
  }
}
