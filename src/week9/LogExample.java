package week9;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogExample {

  private static final Logger LOGGER = Logger.getLogger(LogExample.class.getName());

  /* Level
  * OFF
  * SEVERE
  * WARNING
  * INFO
  * CONFIG
  * FINE
  * FINER
  * FINEST
  * ALL
  * */
  public Logger getLogger(){
    return LOGGER;
  }

  private LogExample() {
    LOGGER.setLevel(Level.FINEST);
    FileHandler fh;

    try {
      fh = new FileHandler("log" + System.currentTimeMillis() +".out");
      LOGGER.addHandler(fh);
      SimpleFormatter sf = new SimpleFormatter();
      fh.setFormatter(sf);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void putLog(){
    LOGGER.log(Level.WARNING, "老郑出事儿了!");
    LOGGER.log(Level.SEVERE, "老郑出大事儿了!");
    LOGGER.log(Level.FINE, "老郑吃饭了!");
    LOGGER.log(Level.FINER, "老郑用勺子吃饭了!");
    LOGGER.log(Level.FINEST, "老郑右手拿勺子吃饭了!");
  }

  public static void main(String[] args) {
    LogExample le = new LogExample();
    le.putLog();
  }
}
