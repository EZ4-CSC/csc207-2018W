package Week7;


import java.util.Observable;

public class Subjects extends Observable{

  private String name;

  public Subjects(String name){
    this.name = name;
  }

  public void SomethingChanged(String something){
    System.out.println("Something is changed");
    setChanged();
    notifyObservers(something);

  }

  @Override
  public String toString(){
    return name;
  }

}
