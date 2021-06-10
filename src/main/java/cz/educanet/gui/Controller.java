package cz.educanet.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

import java.awt.*;


public class Controller {
    @FXML
    public Button startButton;
    public Button exitButton;

    public void onClickedStart(ActionEvent actionEvent) {

    }
    public void onClickedExit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
