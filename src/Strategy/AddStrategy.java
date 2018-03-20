package Strategy;

/**
 * Created by garyk on 2018-02-25.
 */
public class AddStrategy implements IStrategy {

  @Override
  public int compute(int a, int b) {
    return a + b;
  }
}
