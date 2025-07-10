package core;

public class TamagochiStateHungry implements TamagochiState {
  @Override
  public TamagochiState playing() {
    return this;
  }

  @Override
  public TamagochiState eating() {
    return new TamagochiStateHappy();
  }

  @Override
  public TamagochiState sleeping() {
    return this;
  }
}
