package core;

public class TamagochiStateHappy implements TamagochiState {
  @Override
  public TamagochiState playing() {
    return this;
  }

  @Override
  public TamagochiState eating() {
    return new TamagochiStateTired();
  }

  @Override
  public TamagochiState sleeping() {
    return new TamagochiStateHungry();
  }
}
