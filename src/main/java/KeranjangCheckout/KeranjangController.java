package KeranjangCheckout;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class KeranjangController implements Initializable {

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private VBox vBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Mengatur style class untuk ScrollPane untuk mengaplikasikan CSS
        scrollPane.getStyleClass().add("scroll-pane");

    }
}
