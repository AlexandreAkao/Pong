package br.com.pong.view;

import br.com.pong.PongOJogo;
import static br.com.pong.PongOJogo.primaryStage;
import br.com.pong.model.Settings;
import javafx.event.EventHandler;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class ModoDeJogo extends AnchorPane {

    protected final VBox vBox;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;

    public ModoDeJogo() {

        vBox = new VBox();
        button = new Button();
        button0 = new Button();
        button1 = new Button();

        setId("AnchorPane");
        setPrefHeight(Settings.getDEF_FRAME_HEIGHT());
        setPrefWidth(Settings.getDEF_FRAME_WIDTH());
        setStyle("-fx-background-color: black;");

        AnchorPane.setTopAnchor(vBox, 85.0);
        vBox.setAlignment(javafx.geometry.Pos.CENTER);
        vBox.setLayoutX(326.0);
        vBox.setLayoutY(82.0);
        vBox.setPrefHeight(265.0);
        vBox.setPrefWidth(349.0);

        button.setMnemonicParsing(false);
        button.setOnAction(this::handleBtnUmJogador);
        button.setPrefHeight(153.0);
        button.setPrefWidth(249.0);
        button.setStyle("-fx-background-color: black; -fx-font-family: ArcadeClassic; -fx-font-size: 40; -fx-cursor: hand;");
        button.setText("1 JOGADOR");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
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
        button0.setOnAction(this::handleBtnDoisJogador);
        button0.setPrefHeight(153.0);
        button0.setPrefWidth(249.0);
        button0.setStyle("-fx-background-color: black; -fx-font-family: ArcadeClassic; -fx-font-size: 40; -fx-cursor: hand;");
        button0.setText("2 JOGADOR");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
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

        button1.setLayoutX(376.0);
        button1.setLayoutY(408.0);
        button1.setMnemonicParsing(false);
        button1.setOnAction(this::handleVoltar);
        button1.setPrefHeight(47.0);
        button1.setPrefWidth(249.0);
        button1.setStyle("-fx-background-color: black; -fx-font-family: ArcadeClassic; -fx-font-size: 40; -fx-cursor: hand;");
        button1.setText("VOLTAR");
        button1.setTextFill(javafx.scene.paint.Color.WHITE);
        button1.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button1.setTextFill(javafx.scene.paint.Color.RED);
            }
        });

        button1.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button1.setTextFill(javafx.scene.paint.Color.WHITE);
            }
        });

        vBox.getChildren().add(button);
        vBox.getChildren().add(button0);
        getChildren().add(vBox);
        getChildren().add(button1);

    }

    private void handleBtnUmJogador(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaNomeUmJogador(primaryStage);
    }

    private void handleBtnDoisJogador(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaNomeDoisJogador(primaryStage);
    }

    private void handleVoltar(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaMenuInicial(primaryStage);
    }

}
