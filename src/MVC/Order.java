package MVC;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Order {

  @FXML
  private TextField orderInputBox;

  @FXML
  protected void makeOrder(ActionEvent event) {
    System.out.println(orderInputBox.getText());

  }


}
