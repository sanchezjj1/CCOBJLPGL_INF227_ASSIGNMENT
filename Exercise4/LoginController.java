import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    
    @FXML
    TextField MyUsername;

    @FXML
    PasswordField MyPassword;

    @FXML
    Button mylogin;

    public void login(ActionEvent event) throws IOException {
        
        //get input in my textfield and store in a variable
        String username = MyUsername.getText();
        //get input in my passwordfield and store in a variable
        String password = MyPassword.getText();

        System.out.println(username);
        System.out.println(password);

        if (username.equals("123") && password.equals("456")) {

            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

    
    }
}
