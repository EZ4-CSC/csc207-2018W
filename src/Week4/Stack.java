package Week4;

import java.util.NoSuchElementException;

public interface Stack<E> {

  public static final String name = "Martin";

  void add(E item);

  E remove();

  boolean is_empty();

  default void lol(){
    throw new NoSuchElementException();
  }


}
