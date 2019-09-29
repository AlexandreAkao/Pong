package br.com.pong.view;

import br.com.pong.PongOJogo;
import static br.com.pong.PongOJogo.primaryStage;
import br.com.pong.model.Settings;
import javafx.event.EventHandler;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Menu extends AnchorPane {

    protected final Text text;
    protected final VBox vBox;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;

    public Menu() {

        text = new Text();
        vBox = new VBox();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();

        setId("AnchorPane");
        setPrefHeight(Settings.getDEF_FRAME_HEIGHT());
        setPrefWidth(Settings.getDEF_FRAME_WIDTH());
        setStyle("-fx-background-color: black;");

        AnchorPane.setTopAnchor(text, 30.0);
        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(390.0);
        text.setLayoutY(110.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("PONG");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setFont(Font.loadFont("File:src/br/com/pong/resources/font/ARCADECLASSIC.TTF", 100.0));

        AnchorPane.setBottomAnchor(vBox, 60.0);
        vBox.setAlignment(javafx.geometry.Pos.CENTER);
        vBox.setLayoutX(326.0);
        vBox.setLayoutY(173.0);
        vBox.setPrefHeight(265.0);
        vBox.setPrefWidth(349.0);

        button.setMnemonicParsing(false);
        button.setOnAction(this::handleJogar);
        button.setPrefHeight(153.0);
        button.setPrefWidth(249.0);
        button.setStyle("-fx-background-color: black; -fx-font-family: ArcadeClassic; -fx-font-size: 40; -fx-cursor: hand;");
        button.setText("JOGAR");
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
        button0.setOnAction(this::handlePontos);
        button0.setPrefHeight(153.0);
        button0.setPrefWidth(249.0);
        button0.setStyle("-fx-background-color: black; -fx-font-family: ArcadeClassic; -fx-font-size: 40; -fx-cursor: hand;");
        button0.setText("PONTOS");
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

        button1.setMnemonicParsing(false);
        button1.setOnAction(this::handleAjuda);
        button1.setPrefHeight(153.0);
        button1.setPrefWidth(249.0);
        button1.setStyle("-fx-background-color: black; -fx-font-family: ArcadeClassic; -fx-font-size: 40; -fx-cursor: hand;");
        button1.setText("AJUDA");
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

        button2.setMnemonicParsing(false);
        button2.setOnAction(this::handleSair);
        button2.setPrefHeight(153.0);
        button2.setPrefWidth(249.0);
        button2.setStyle("-fx-background-color: black; -fx-font-family: ArcadeClassic; -fx-font-size: 40; -fx-cursor: hand;");
        button2.setText("SAIR");
        button2.setTextFill(javafx.scene.paint.Color.WHITE);
        button2.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button2.setTextFill(javafx.scene.paint.Color.RED);
            }
        });

        button2.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button2.setTextFill(javafx.scene.paint.Color.WHITE);
            }
        });

        getChildren().add(text);
        vBox.getChildren().add(button);
        vBox.getChildren().add(button0);
        vBox.getChildren().add(button1);
        vBox.getChildren().add(button2);
        getChildren().add(vBox);
    }

    protected void handleJogar(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaModoDeJ(primaryStage);
    }

    protected void handlePontos(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaPontos(primaryStage);
    }

    protected void handleAjuda(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaAjuda(primaryStage);
    }

    protected void handleSair(javafx.event.ActionEvent actionEvent) {
        System.exit(0);
    }
}
