import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
    @FXML 
    private void sayHelloWorld(ActionEvent event) throws Exception {
        System.out.println("Hello JavaFX from Controller!");
    }
}
