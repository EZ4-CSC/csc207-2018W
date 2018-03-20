package Week4;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by garyk on 2018-01-28.
 */
public abstract class ArrayListStack<E> implements Stack<E>{

  List<String> a = new ArrayList<>();


  private E var;


  @Override
  public void add(E item) {

  }

  public E foo(){
    return var;
  }

}
