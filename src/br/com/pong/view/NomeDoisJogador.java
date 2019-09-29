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

public class NomeDoisJogador extends AnchorPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final TextField textField;
    protected final TextField textField0;
    protected final Label label;
    protected final Label label0;
    protected final HBox hBox;
    protected final Button button;
    protected final Button button0;

    public NomeDoisJogador() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        textField = new TextField();
        textField0 = new TextField();
        label = new Label();
        label0 = new Label();
        hBox = new HBox();
        button = new Button();
        button0 = new Button();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(1000.0);
        setStyle("-fx-background-color: black;");

        gridPane.setLayoutX(218.0);
        gridPane.setLayoutY(97.0);
        gridPane.setPrefHeight(246.0);
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

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(textField, 1);
        textField.setAlignment(javafx.geometry.Pos.CENTER);
        textField.setPrefHeight(70.0);
        textField.setPrefWidth(224.0);
        textField.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: white;");
        textField.setFont(new Font("ArcadeClassic", 60.0));

        GridPane.setColumnIndex(textField0, 1);
        GridPane.setRowIndex(textField0, 1);
        textField0.setAlignment(javafx.geometry.Pos.CENTER);
        textField0.setPrefHeight(70.0);
        textField0.setPrefWidth(275.0);
        textField0.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: white;");
        textField0.setFont(new Font("ArcadeClassic", 60.0));

        label.setText("Jogador 1:");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("ArcadeClassic", 45.0));

        GridPane.setRowIndex(label0, 1);
        label0.setText("Jogador 2:");
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setFont(new Font("ArcadeClassic", 45.0));

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
                Logger.getLogger(NomeDoisJogador.class.getName()).log(Level.SEVERE, null, ex);
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
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getChildren().add(textField);
        gridPane.getChildren().add(textField0);
        gridPane.getChildren().add(label);
        gridPane.getChildren().add(label0);
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
        int auxPlayer1 = 0;
        int auxPlayer2 = 0;

        if ("".equals(textField.getText()) || "".equals(textField0.getText())) {
            JOptionPane.showMessageDialog(null, "Você deve inserir um nome", "Nome Inválido", 0);
        } else {

            for (int i = 0; i < JogadoresDAO.listaJogadores.size(); i++) {
                if (JogadoresDAO.listaJogadores.get(i).getNome().equals(textField.getText())) {
                    aux += 1;
                    auxPlayer1 = i;
                }
                if (JogadoresDAO.listaJogadores.get(i).getNome().equals(textField0.getText())) {
                    aux += 2;
                    auxPlayer2 = i;
                }
            }

            if (textField.getText().equals(textField0.getText())) {
                aux = 4;
            }

            switch (aux) {
                case 0:
                    AuxiliarJogador.setJogador1(new Jogador(0, textField.getText().toLowerCase(), 0, 0));
                    AuxiliarJogador.setJogador2(new Jogador(0, textField0.getText().toLowerCase(), 0, 0));
                    AuxiliarJogador.setModo(2);

                    PongOJogo.doisJogador(primaryStage);
                    break;
                case 1:
                    AuxiliarJogador.setJogador1(JogadoresDAO.listaJogadores.get(auxPlayer1));
                    AuxiliarJogador.setJogador2(new Jogador(0, textField0.getText().toLowerCase(), 0, 0));
                    AuxiliarJogador.setModo(2);

                    PongOJogo.doisJogador(primaryStage);
                    break;
                case 2:
                    AuxiliarJogador.setJogador1(new Jogador(0, textField.getText().toLowerCase(), 0, 0));
                    AuxiliarJogador.setJogador2(JogadoresDAO.listaJogadores.get(auxPlayer2));
                    AuxiliarJogador.setModo(2);

                    PongOJogo.doisJogador(primaryStage);
                    break;
                case 3:
                    AuxiliarJogador.setJogador1(JogadoresDAO.listaJogadores.get(auxPlayer1));
                    AuxiliarJogador.setJogador2(JogadoresDAO.listaJogadores.get(auxPlayer2));
                    AuxiliarJogador.setModo(2);

                    PongOJogo.doisJogador(primaryStage);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Nome dos jogadores iguais", "Nomes iguais", 0);

                    break;
            }
        }
    }
}
