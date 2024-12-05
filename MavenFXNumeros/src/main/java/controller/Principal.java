package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Principal {

    @FXML
    private MenuItem MenuPesquisa;

    @FXML
    private Menu menuAjuda;

    @FXML
    private Menu menuArquivo;

    @FXML
    private Menu menuCalculadora;

    @FXML
    private MenuItem menuSair;

    @FXML
    private MenuItem menuSobre;

    @FXML
    private MenuItem menuSomar;

    @FXML
    void btnPesquisaClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Tela2.fxml"));
        Parent root = loader.load();

        Stage novaTela = new Stage();

        Scene cena = new Scene(root);

        novaTela.setTitle("Pesquisa");
        novaTela.setScene(cena);
        novaTela.show();
    }

    @FXML
    void btnSairClick(ActionEvent event) {
        if (fecharSistema()) {
            System.exit(0);
        } else {
            event.consume();
        }
    }

    @FXML
    void btnSomarClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SomarView.fxml"));
        Parent root = loader.load();

        Stage novaTela = new Stage();

        Scene cena = new Scene(root);

        novaTela.setTitle("Soma de numeros");
        novaTela.setScene(cena);
        novaTela.show();
    }

    @FXML
    void btnsobreClick(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Sobre");
        alerta.setHeaderText("Informacao do sistema");
        alerta.setContentText("Sistema desenvolvido na aula de PDS-1");
        alerta.showAndWait();
    }

    public boolean fecharSistema() {
        Alert confirmar = new Alert(Alert.AlertType.CONFIRMATION);
        confirmar.setTitle("Confirmar");
        confirmar.setHeaderText("Tem certeza que deseja fechar a aplicaçao?");
        confirmar.setContentText("Todas as alteracoes seram perdidas");

        return confirmar.showAndWait().filter(response -> response == ButtonType.OK).isPresent();
    }
}
