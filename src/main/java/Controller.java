import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    AnchorPane field;

    private final int N = 4;
    private double buttonSize;

    Button[][] buttons;


    public void initialize(URL location, ResourceBundle resources) {
        buttons = new Button[N][N];
        buttonSize = field.getPrefWidth() / N;

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                buttons[i][j] = new Button();
                field.getChildren().add(buttons[i][j]);

                buttons[i][j].setPrefWidth(buttonSize);
                buttons[i][j].setPrefHeight(buttonSize);
                buttons[i][j].setText(String.valueOf(i*N+j+1));
                buttons[i][j].setLayoutX(j*buttonSize);
                buttons[i][j].setLayoutY(i*buttonSize);
                buttons[i][j].setVisible(true);
            }
        }
        buttons[N-1][N-1].setVisible(false);
    }
}
