package core;

public class TamagochiStateTired implements TamagochiState {
  @Override
  public TamagochiState playing() {
    return this;
  }

  @Override
  public TamagochiState eating() {
    return this;
  }

  @Override
  public TamagochiState sleeping() {
    return new TamagochiStateHappy();
  }
}
