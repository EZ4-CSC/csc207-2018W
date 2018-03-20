package Week4;

/**
 * Created by garyk on 2018-01-28.
 */
public class TaiShuaiException extends Exception {

  private Object a;

  TaiShuaiException(){
    super("Default message");
    this.a = 13;
  }

  TaiShuaiException(String msg){
    super(msg);
  }

  void foo() throws TaiShuaiException {
    throw new TaiShuaiException();
  }

  void boo() {
    throw new NullPointerException();
  }


}
