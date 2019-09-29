package br.com.pong.view;

import br.com.pong.PongOJogo;
import static br.com.pong.PongOJogo.primaryStage;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TelaPause extends AnchorPane {

    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final Button button;
    protected final Text text;

    public TelaPause() {

        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        button = new Button();
        text = new Text();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(1000.0);
        setStyle("-fx-background-color:  transparent;");

        anchorPane.setId("AnchorPane");
        anchorPane.setOpacity(0.7);
        anchorPane.setPrefHeight(500.0);
        anchorPane.setPrefWidth(1000.0);
        anchorPane.setStyle("-fx-background-color: Gray;");

        AnchorPane.setBottomAnchor(anchorPane0, 0.0);
        AnchorPane.setLeftAnchor(anchorPane0, 0.0);
        AnchorPane.setRightAnchor(anchorPane0, 0.0);
        AnchorPane.setTopAnchor(anchorPane0, 0.0);
        anchorPane0.setPrefHeight(500.0);
        anchorPane0.setPrefWidth(1000.0);
        anchorPane0.setStyle("-fx-background-color: transparent;");

        button.setAlignment(javafx.geometry.Pos.CENTER);
        button.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        button.setLayoutX(362.0);
        button.setLayoutY(361.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::handleMenu);
        button.setStyle("-fx-background-color: transparent; -fx-border-color: white;");
        button.setText("Tela  Inicial");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("ArcadeClassic", 36.0));
        button.setCursor(Cursor.HAND);

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(308.0);
        text.setLayoutY(280.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("PAUSADO");
        text.setFont(new Font("ArcadeClassic", 100.0));

        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(button);
        anchorPane0.getChildren().add(text);
        getChildren().add(anchorPane0);

    }

    protected void handleMenu(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaMenuInicial(primaryStage);

    }
}
