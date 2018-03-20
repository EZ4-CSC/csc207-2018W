package MVC;

/**
 * Created by garyk on 2018-03-11.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MyApp extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {

    BorderPane root = new BorderPane();

    Scene scene = new Scene(root, 800, 600);
    primaryStage.setScene(scene);
    primaryStage.show();

    FXMLLoader viewLoader = new FXMLLoader(getClass().getResource("/MVC/Order.fxml"));
    root.setBottom(viewLoader.load());


  }

  public static void main(final String[] arguments)
  {
    MyApp.launch(arguments);
  }
}