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
    public Button wowButton;
    public Button exitButton;
    public Text textDesc;

    public void onClickedFirst(ActionEvent actionEvent) {
        textDesc.setText("Umrel si");
        firstButton.setVisible(false);
        secondButton.setVisible(false);
    }
    public void onClickedSecond(ActionEvent actionEvent) {
        textDesc.setText("Sel si doleva a nasel si velmi starou truhlu, otevrel si ji a vevnitr byl lektvar, vypijes ho ?");
        firstButton.setText("Ano");
        secondButton.setVisible(false);
    }
    public void onClickedNevimTohleJeTakovejTrash(ActionEvent actionEvent){
        textDesc.setText("Radsi sis rekl ze pudes domu protoze je tma. KONEC ");//ano velmi epicka hra, fakt jsem nevedel jak neco udelat a kopirovat kod jsem uz nechtel vubec delat
        firstButton.setVisible(false);
        wowButton.setVisible(false);
    }
    public void onClickedExit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
