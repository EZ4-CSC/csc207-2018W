package Strategy;


/**
 * Created by garyk on 2018-02-25.
 */
public class Singleton {

  private static Singleton baobao;

  private Singleton(){

  }

  public static Singleton getInstance(){
    if (baobao == null){
      baobao = new Singleton();
    }
    return baobao;
  }



}
