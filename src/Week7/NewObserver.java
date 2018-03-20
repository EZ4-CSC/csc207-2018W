package Week7;

import java.util.Observable;
import java.util.Observer;


public class NewObserver implements Observer {

  private String name;

  public NewObserver(String name){
    this.name = name;
  }

  @Override
  public void update(Observable o, Object arg) {
    System.out.println(o.toString() + " says " + name + ": " + arg.toString());
  }
}
