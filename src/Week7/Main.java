package Week7;

/**
 * Created by garyk on 2018-02-25.
 */
public class Main {

  public static void main(String[] args) {
    Subjects sub = new Subjects("Gary");
    NewObserver ob1 = new NewObserver("Martin");
    NewObserver ob2 = new NewObserver("Amber");
    NewObserver ob3 = new NewObserver("Benly");
    sub.addObserver(ob1);
    sub.addObserver(ob2);
    sub.SomethingChanged("Hello from the other side.");
    sub.notifyObservers("I am the da lalala");
  }

}
