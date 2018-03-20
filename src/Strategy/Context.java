package Strategy;

/**
 * Created by garyk on 2018-02-25.
 */
public class Context {

  private IStrategy s;

  public Context(IStrategy s) {
    this.s = s;
  }

  public int check(int a, int b){
    return s.compute(a, b);
  }

}
