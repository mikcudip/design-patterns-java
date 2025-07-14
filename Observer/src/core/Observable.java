package core;

public interface Observable {
  void notifyAllObservers();
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
}
