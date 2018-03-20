package Strategy;

/**
 * Created by garyk on 2018-02-25.
 */
public class Main {

  public static void main(String[] args) {
    Context c1 = new Context(new AddStrategy());
    Context c2 = new Context(new MultiplyStrategy());

    System.out.println(c1.check(1, 2));
    System.out.println(c2.check(1, 2));
  }

}
