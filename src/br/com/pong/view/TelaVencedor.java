package br.com.pong.view;

import br.com.pong.PongOJogo;
import static br.com.pong.PongOJogo.primaryStage;
import br.com.pong.model.Settings;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TelaVencedor extends AnchorPane {

    protected final HBox hBox;
    protected final Text text;
    protected final Text text0;
    protected final Button button;

    public TelaVencedor(String nomeVencedor) {

        hBox = new HBox();
        text = new Text();
        text0 = new Text();
        button = new Button();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(1000.0);
        setStyle("-fx-background-color: black;");

        hBox.setLayoutX((Settings.getDEF_FRAME_WIDTH() - hBox.getWidth()) / 2);
        hBox.setLayoutY(205.0);
        hBox.setSpacing(30.0);

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText(nomeVencedor);
        text.setFont(new Font("ArcadeClassic", 80.0));

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("ganhou");
        text0.setFont(new Font("ArcadeClassic", 80.0));

        button.setLayoutX(407.0);
        button.setLayoutY(367.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::handleMenu);
        button.setStyle("-fx-background-color: black; -fx-font-family: ArcadeClassic; -fx-font-size: 40; -fx-cursor: hand;");
        button.setText("Voltar");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("ArcadeClassic", 12.0));

        hBox.setLayoutX((Settings.getDEF_FRAME_WIDTH() - hBox.getWidth()) / 4);

        hBox.getChildren().add(text);
        hBox.getChildren().add(text0);
        getChildren().add(hBox);
        getChildren().add(button);

    }

    protected void handleMenu(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaMenuInicial(primaryStage);

    }

}
