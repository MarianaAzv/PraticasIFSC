package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class somarController {

    @FXML
    private Label Resultado;

    @FXML
    private Label Soma;

    @FXML
    private Button bntSomar;

    @FXML
    private Button btnFechar;

    @FXML
    private Button btnLimpar;

    @FXML
    private Label lblnumero2;

    @FXML
    private Label lbnumero1;

    @FXML
    private TextField txtnumero1;

    @FXML
    private TextField txtnumero2;

    @FXML
    void onClickBtnFechar(ActionEvent event) {
    System.exit(0);
    }

    @FXML
    void onClickBtnLimpar(ActionEvent event) {
txtnumero1.setText("");
txtnumero2.setText("");
Soma.setText("0");
txtnumero1.requestFocus();

    }

    @FXML
    void onClickBtnSomar(ActionEvent event) {
        try{
    Double numero1= Double.valueOf(txtnumero1.getText());
     Double numero2= Double.valueOf(txtnumero2.getText());
      Double soma= numero1+ numero2;
      Soma.setText(soma.toString());
    } catch(NumberFormatException n){
            System.out.println("Numero invalido");
    }
    }

}
