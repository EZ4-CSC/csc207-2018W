package Strategy;

/**
 * Created by garyk on 2018-02-25.
 */
public class Factory {

  public IStrategy getInstance(String name){
    switch (name) {
      case "add":
        return new AddStrategy();
      case "multiply":
        return new MultiplyStrategy();
    }

    return null;
  }

}
