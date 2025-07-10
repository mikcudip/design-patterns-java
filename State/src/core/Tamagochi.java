package core;

public class Tamagochi {
  private String name;
  private TamagochiState currentState;

  public Tamagochi(String name) {
    this.name = name;
    currentState = new TamagochiStateHappy();
  }

  public void play() {
    currentState = currentState.playing();
  }

  public void eat() {
    currentState = currentState.eating();
  }

  public void sleep() {
    currentState = currentState.sleeping();
  }

  public TamagochiState getCurrentState() {
    return currentState;
  }
}
