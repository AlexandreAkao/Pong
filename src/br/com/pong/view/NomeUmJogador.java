package br.com.pong.view;

import br.com.pong.PongOJogo;
import static br.com.pong.PongOJogo.primaryStage;
import br.com.pong.model.Jogador;
import br.com.pong.persistencia.JogadoresDAO;
import br.com.pong.util.AuxiliarJogador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javax.swing.JOptionPane;

public class NomeUmJogador extends AnchorPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final TextField textField;
    protected final Label label;
    protected final HBox hBox;
    protected final Button button;
    protected final Button button0;

    public NomeUmJogador() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        textField = new TextField();
        label = new Label();
        hBox = new HBox();
        button = new Button();
        button0 = new Button();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(1000.0);
        setStyle("-fx-background-color: black;");

        gridPane.setLayoutX(226.0);
        gridPane.setLayoutY(185.0);
        gridPane.setPrefHeight(130.0);
        gridPane.setPrefWidth(550.0);

        columnConstraints.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(383.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(318.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(270.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(232.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(textField, 1);
        textField.setAlignment(javafx.geometry.Pos.CENTER);
        textField.setPrefHeight(70.0);
        textField.setPrefWidth(224.0);
        textField.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: white;");
        textField.setFont(new Font("ArcadeClassic", 60.0));

        label.setText("Jogador 1:");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("ArcadeClassic", 45.0));

        hBox.setLayoutX(338.0);
        hBox.setLayoutY(397.0);
        hBox.setSpacing(30.0);

        button.setMnemonicParsing(false);
        button.setOnAction(this::handleVoltar);
        button.setStyle("-fx-background-color: black; -fx-cursor: hand;");
        button.setText("VOLTAR");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("ArcadeClassic", 30.0));
        button.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button.setTextFill(javafx.scene.paint.Color.RED);
            }
        });

        button.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button.setTextFill(javafx.scene.paint.Color.WHITE);
            }
        });

        button0.setMnemonicParsing(false);
        button0.setOnAction((actionEvent) -> {
            try {
                this.handleIniciar(actionEvent);
            } catch (Exception ex) {
                Logger.getLogger(NomeUmJogador.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        button0.setStyle("-fx-background-color: black; -fx-cursor: hand;");
        button0.setText("INICIAR");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font("ArcadeClassic", 30.0));
        button0.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button0.setTextFill(javafx.scene.paint.Color.RED);
            }
        });

        button0.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button0.setTextFill(javafx.scene.paint.Color.WHITE);
            }
        });

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getChildren().add(textField);
        gridPane.getChildren().add(label);
        getChildren().add(gridPane);
        hBox.getChildren().add(button);
        hBox.getChildren().add(button0);
        getChildren().add(hBox);

    }

    protected void handleVoltar(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaModoDeJ(primaryStage);

    }

    protected void handleIniciar(javafx.event.ActionEvent actionEvent) throws Exception {
        int aux = 0;
        int auxPlayer = 0;

        if ("".equals(textField.getText())) {
            JOptionPane.showMessageDialog(null, "Você deve inserir um nome", "Nome Inválido", 0);
        } else {

            for (int i = 0; i < JogadoresDAO.listaJogadores.size(); i++) {
                if (JogadoresDAO.listaJogadores.get(i).getNome().equals(textField.getText())) {
                    aux = 1;
                    auxPlayer = i;
                }
            }

            if (aux == 0) {

                AuxiliarJogador.setJogador1(new Jogador(0, textField.getText().toLowerCase(), 0, 0));
                AuxiliarJogador.setModo(1);

                PongOJogo.umJogador(primaryStage);
            } else {
                AuxiliarJogador.setJogador1(JogadoresDAO.listaJogadores.get(auxPlayer));
                AuxiliarJogador.setModo(1);

                PongOJogo.umJogador(primaryStage);

            }

        }
    }

}
