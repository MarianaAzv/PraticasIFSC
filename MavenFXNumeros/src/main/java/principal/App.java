package principal;

import javafx.application.Application;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {



    @Override
    public void start(Stage stage) throws IOException {
   stage.setTitle("Somador de numeros");
   
   FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Principal.fxml"));
   Parent root = loader.load();
   
   
   Scene cena = new Scene(root);
   stage.setScene(cena);
   stage.show();
    }

    

    

    public static void main(String[] args) {
        launch();
    }

}