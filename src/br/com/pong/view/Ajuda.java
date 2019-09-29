package br.com.pong.view;

import br.com.pong.PongOJogo;
import static br.com.pong.PongOJogo.primaryStage;
import static br.com.pong.PongOJogo.telaMenuInicial;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Ajuda extends AnchorPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final Text text;
    protected final Text text0;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final Rectangle rectangle;
    protected final Text text1;
    protected final Rectangle rectangle0;
    protected final Text text2;
    protected final AnchorPane anchorPane;
    protected final Rectangle rectangle1;
    protected final SVGPath sVGPath;
    protected final AnchorPane anchorPane0;
    protected final Rectangle rectangle2;
    protected final SVGPath sVGPath0;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final Rectangle rectangle3;
    protected final SVGPath sVGPath1;
    protected final Rectangle rectangle4;
    protected final SVGPath sVGPath2;
    protected final AnchorPane anchorPane1;
    protected final Rectangle rectangle5;
    protected final SVGPath sVGPath3;
    protected final AnchorPane anchorPane2;
    protected final Rectangle rectangle6;
    protected final SVGPath sVGPath4;
    protected final Text text3;
    protected final Button button;

    public Ajuda() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        text = new Text();
        text0 = new Text();
        gridPane0 = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rectangle = new Rectangle();
        text1 = new Text();
        rectangle0 = new Rectangle();
        text2 = new Text();
        anchorPane = new AnchorPane();
        rectangle1 = new Rectangle();
        sVGPath = new SVGPath();
        anchorPane0 = new AnchorPane();
        rectangle2 = new Rectangle();
        sVGPath0 = new SVGPath();
        gridPane1 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rectangle3 = new Rectangle();
        sVGPath1 = new SVGPath();
        rectangle4 = new Rectangle();
        sVGPath2 = new SVGPath();
        anchorPane1 = new AnchorPane();
        rectangle5 = new Rectangle();
        sVGPath3 = new SVGPath();
        anchorPane2 = new AnchorPane();
        rectangle6 = new Rectangle();
        sVGPath4 = new SVGPath();
        text3 = new Text();
        button = new Button();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(1000.0);
        setStyle("-fx-background-color: black;");

        AnchorPane.setBottomAnchor(gridPane, 80.0);
        AnchorPane.setLeftAnchor(gridPane, 0.0);
        AnchorPane.setRightAnchor(gridPane, 0.0);
        AnchorPane.setTopAnchor(gridPane, 150.0);
        gridPane.setLayoutX(164.0);
        gridPane.setLayoutY(122.0);
        gridPane.setPrefHeight(238.0);
        gridPane.setPrefWidth(824.0);

        columnConstraints.setHalignment(javafx.geometry.HPos.RIGHT);
        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("PLAYER 1:");
        text.setFont(new Font("ArcadeClassic", 46.0));

        GridPane.setRowIndex(text0, 1);
        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("PLAYER 2:");
        text0.setFont(new Font("ArcadeClassic", 46.0));

        GridPane.setColumnIndex(gridPane0, 1);

        columnConstraints1.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHalignment(javafx.geometry.HPos.LEFT);
        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setValignment(javafx.geometry.VPos.CENTER);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(50.0);
        rectangle.setStroke(javafx.scene.paint.Color.WHITE);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(50.0);

        text1.setFill(javafx.scene.paint.Color.WHITE);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("W");
        text1.setFont(new Font("ArcadeClassic", 50.0));

        GridPane.setRowIndex(rectangle0, 1);
        rectangle0.setArcHeight(5.0);
        rectangle0.setArcWidth(5.0);
        rectangle0.setHeight(50.0);
        rectangle0.setStroke(javafx.scene.paint.Color.WHITE);
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setWidth(50.0);

        GridPane.setRowIndex(text2, 1);
        text2.setFill(javafx.scene.paint.Color.WHITE);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("S");
        text2.setFont(new Font("ArcadeClassic", 50.0));

        GridPane.setColumnIndex(anchorPane, 1);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        rectangle1.setArcHeight(5.0);
        rectangle1.setArcWidth(5.0);
        rectangle1.setFill(javafx.scene.paint.Color.WHITE);
        rectangle1.setHeight(40.0);
        rectangle1.setLayoutX(20.0);
        rectangle1.setLayoutY(25.0);
        rectangle1.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setWidth(6.0);

        sVGPath.setContent("M0,0 L0,6 L9,3 z");
        sVGPath.setFill(javafx.scene.paint.Color.WHITE);
        sVGPath.setLayoutX(19.0);
        sVGPath.setLayoutY(20.0);
        sVGPath.setRotate(-90.0);
        sVGPath.setScaleX(3.0);
        sVGPath.setScaleY(3.0);

        GridPane.setColumnIndex(anchorPane0, 1);
        GridPane.setRowIndex(anchorPane0, 1);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);
        anchorPane0.setRotate(180.0);

        rectangle2.setArcHeight(5.0);
        rectangle2.setArcWidth(5.0);
        rectangle2.setFill(javafx.scene.paint.Color.WHITE);
        rectangle2.setHeight(40.0);
        rectangle2.setLayoutX(224.0);
        rectangle2.setLayoutY(28.0);
        rectangle2.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle2.setWidth(6.0);

        sVGPath0.setContent("M0,0 L0,6 L9,3 z");
        sVGPath0.setFill(javafx.scene.paint.Color.WHITE);
        sVGPath0.setLayoutX(223.0);
        sVGPath0.setLayoutY(23.0);
        sVGPath0.setRotate(-90.0);
        sVGPath0.setScaleX(3.0);
        sVGPath0.setScaleY(3.0);

        GridPane.setColumnIndex(gridPane1, 1);
        GridPane.setRowIndex(gridPane1, 1);

        columnConstraints3.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rectangle3.setArcHeight(5.0);
        rectangle3.setArcWidth(5.0);
        rectangle3.setHeight(50.0);
        rectangle3.setStroke(javafx.scene.paint.Color.WHITE);
        rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle3.setWidth(50.0);

        sVGPath1.setContent("M0,0 L0,6 L9,3 z");
        sVGPath1.setFill(javafx.scene.paint.Color.WHITE);
        sVGPath1.setRotate(-90.0);
        sVGPath1.setScaleX(2.0);
        sVGPath1.setScaleY(2.0);

        GridPane.setRowIndex(rectangle4, 1);
        rectangle4.setArcHeight(5.0);
        rectangle4.setArcWidth(5.0);
        rectangle4.setHeight(50.0);
        rectangle4.setStroke(javafx.scene.paint.Color.WHITE);
        rectangle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle4.setWidth(50.0);

        GridPane.setRowIndex(sVGPath2, 1);
        sVGPath2.setContent("M0,0 L0,6 L9,3 z");
        sVGPath2.setFill(javafx.scene.paint.Color.WHITE);
        sVGPath2.setRotate(90.0);
        sVGPath2.setScaleX(2.0);
        sVGPath2.setScaleY(2.0);

        GridPane.setColumnIndex(anchorPane1, 1);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        rectangle5.setArcHeight(5.0);
        rectangle5.setArcWidth(5.0);
        rectangle5.setFill(javafx.scene.paint.Color.WHITE);
        rectangle5.setHeight(40.0);
        rectangle5.setLayoutX(20.0);
        rectangle5.setLayoutY(25.0);
        rectangle5.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle5.setWidth(6.0);

        sVGPath3.setContent("M0,0 L0,6 L9,3 z");
        sVGPath3.setFill(javafx.scene.paint.Color.WHITE);
        sVGPath3.setLayoutX(19.0);
        sVGPath3.setLayoutY(20.0);
        sVGPath3.setRotate(-90.0);
        sVGPath3.setScaleX(3.0);
        sVGPath3.setScaleY(3.0);

        GridPane.setColumnIndex(anchorPane2, 1);
        GridPane.setRowIndex(anchorPane2, 1);
        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(200.0);
        anchorPane2.setRotate(-180.0);

        rectangle6.setArcHeight(5.0);
        rectangle6.setArcWidth(5.0);
        rectangle6.setFill(javafx.scene.paint.Color.WHITE);
        rectangle6.setHeight(40.0);
        rectangle6.setLayoutX(224.0);
        rectangle6.setLayoutY(28.0);
        rectangle6.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle6.setWidth(6.0);

        sVGPath4.setContent("M0,0 L0,6 L9,3 z");
        sVGPath4.setFill(javafx.scene.paint.Color.WHITE);
        sVGPath4.setLayoutX(223.0);
        sVGPath4.setLayoutY(23.0);
        sVGPath4.setRotate(-90.0);
        sVGPath4.setScaleX(3.0);
        sVGPath4.setScaleY(3.0);

        AnchorPane.setTopAnchor(text3, 30.0);
        text3.setFill(javafx.scene.paint.Color.WHITE);
        text3.setLayoutX(363.0);
        text3.setLayoutY(112.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("AJUDA");
        text3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text3.setFont(new Font("ArcadeClassic", 100.0));

        AnchorPane.setBottomAnchor(button, 0.0);
        button.setLayoutX(401.0);
        button.setLayoutY(420.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::handleVoltar);
        button.setPrefHeight(0.0);
        button.setPrefWidth(199.0);
        button.setStyle("-fx-background-color: black; -fx-font-family: ArcadeClassic; -fx-font-size: 40; -fx-cursor: hand;");
        button.setText("VOLTAR");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("ArcadeClassic", 12.0));
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

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getChildren().add(text);
        gridPane.getChildren().add(text0);
        gridPane0.getColumnConstraints().add(columnConstraints1);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints1);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getChildren().add(rectangle);
        gridPane0.getChildren().add(text1);
        gridPane0.getChildren().add(rectangle0);
        gridPane0.getChildren().add(text2);
        anchorPane.getChildren().add(rectangle1);
        anchorPane.getChildren().add(sVGPath);
        gridPane0.getChildren().add(anchorPane);
        anchorPane0.getChildren().add(rectangle2);
        anchorPane0.getChildren().add(sVGPath0);
        gridPane0.getChildren().add(anchorPane0);
        gridPane.getChildren().add(gridPane0);
        gridPane1.getColumnConstraints().add(columnConstraints3);
        gridPane1.getColumnConstraints().add(columnConstraints4);
        gridPane1.getRowConstraints().add(rowConstraints3);
        gridPane1.getRowConstraints().add(rowConstraints4);
        gridPane1.getChildren().add(rectangle3);
        gridPane1.getChildren().add(sVGPath1);
        gridPane1.getChildren().add(rectangle4);
        gridPane1.getChildren().add(sVGPath2);
        anchorPane1.getChildren().add(rectangle5);
        anchorPane1.getChildren().add(sVGPath3);
        gridPane1.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(rectangle6);
        anchorPane2.getChildren().add(sVGPath4);
        gridPane1.getChildren().add(anchorPane2);
        gridPane.getChildren().add(gridPane1);
        getChildren().add(gridPane);
        getChildren().add(text3);
        getChildren().add(button);

    }

    protected void handleVoltar(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaMenuInicial(primaryStage);
    }

}
