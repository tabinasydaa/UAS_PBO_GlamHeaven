package KeranjangCheckout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class KeranjangApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/KeranjangCheckout/Keranjang.fxml")));

        // Set up the primary stage
        primaryStage.setTitle("Keranjang Belanja");
        Scene scene = new Scene(root, 925, 605);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/KeranjangCheckout/Styles.css")).toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
