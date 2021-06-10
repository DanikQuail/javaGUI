package cz.educanet.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

import java.awt.*;


public class Controller {
    @FXML
    public Button firstButton;
    public Button secondButton;
    public Button exitButton;
    public Text textDesc;

    public void onClickedFirst(ActionEvent actionEvent) {
        textDesc.setText("Sel si doleva a nasel si velmi starou truhlu, otevrel si ji a vevnitr byl lektvar, vypijes ho ?");

    }
    public void onClickedSecond(ActionEvent actionEvent) {
        textDesc.setText("Sel si doprava a v pulce cesty te bodl typek nozem do zad, umrel si");
        firstButton.setVisible(false);
        secondButton.setVisible(false);
    }
    public void onClickedExit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
