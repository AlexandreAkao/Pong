package br.com.pong.view;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import br.com.pong.model.Settings;

public class TelaJogo extends AnchorPane {

    protected final VBox vBox;
    protected final Rectangle rectangle;
    protected final Rectangle rectangle0;
    protected final Rectangle rectangle1;
    protected final Rectangle rectangle2;
    protected final Rectangle rectangle3;
    protected final Rectangle rectangle4;
    protected final Rectangle rectangle5;
    protected final Rectangle rectangle6;
    protected final Rectangle rectangle7;
    protected final Rectangle rectangle8;
    protected final Rectangle rectangle9;
    protected final Rectangle rectangle10;
    protected final Rectangle rectangle11;
    protected final Rectangle rectangle12;
    protected final Rectangle rectangle13;
    protected final Rectangle rectangle14;
    protected final Rectangle rectangle15;
    protected final Rectangle rectangle16;
    protected final Rectangle rectangle17;
    protected final Rectangle rectangle18;
    protected final Rectangle rectangle19;

    public TelaJogo() {

        vBox = new VBox();
        rectangle = new Rectangle();
        rectangle0 = new Rectangle();
        rectangle1 = new Rectangle();
        rectangle2 = new Rectangle();
        rectangle3 = new Rectangle();
        rectangle4 = new Rectangle();
        rectangle5 = new Rectangle();
        rectangle6 = new Rectangle();
        rectangle7 = new Rectangle();
        rectangle8 = new Rectangle();
        rectangle9 = new Rectangle();
        rectangle10 = new Rectangle();
        rectangle11 = new Rectangle();
        rectangle12 = new Rectangle();
        rectangle13 = new Rectangle();
        rectangle14 = new Rectangle();
        rectangle15 = new Rectangle();
        rectangle16 = new Rectangle();
        rectangle17 = new Rectangle();
        rectangle18 = new Rectangle();
        rectangle19 = new Rectangle();

        setId("AnchorPane");
        setPrefHeight(Settings.getDEF_FRAME_HEIGHT());
        setPrefWidth(Settings.getDEF_FRAME_WIDTH());
        setStyle("-fx-background-color: black;");

        AnchorPane.setTopAnchor(vBox, -20.0);
        vBox.setLayoutX(500.0);
        vBox.setMaxHeight(500.0);
        vBox.setMaxWidth(1000.0);
        vBox.setMinHeight(0.0);
        vBox.setMinWidth(0.0);
        vBox.setPrefHeight(231.0);
        vBox.setPrefWidth(5.0);
        vBox.setSpacing(10.0);

        rectangle.setFill(javafx.scene.paint.Color.WHITE);
        rectangle.setHeight(15.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(5.0);

        rectangle0.setFill(javafx.scene.paint.Color.WHITE);
        rectangle0.setHeight(15.0);
        rectangle0.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setWidth(5.0);

        rectangle1.setFill(javafx.scene.paint.Color.WHITE);
        rectangle1.setHeight(15.0);
        rectangle1.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setWidth(5.0);

        rectangle2.setFill(javafx.scene.paint.Color.WHITE);
        rectangle2.setHeight(15.0);
        rectangle2.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle2.setWidth(5.0);

        rectangle3.setFill(javafx.scene.paint.Color.WHITE);
        rectangle3.setHeight(15.0);
        rectangle3.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle3.setWidth(5.0);

        rectangle4.setFill(javafx.scene.paint.Color.WHITE);
        rectangle4.setHeight(15.0);
        rectangle4.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle4.setWidth(5.0);

        rectangle5.setFill(javafx.scene.paint.Color.WHITE);
        rectangle5.setHeight(15.0);
        rectangle5.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle5.setWidth(5.0);

        rectangle6.setFill(javafx.scene.paint.Color.WHITE);
        rectangle6.setHeight(15.0);
        rectangle6.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle6.setWidth(5.0);

        rectangle7.setFill(javafx.scene.paint.Color.WHITE);
        rectangle7.setHeight(15.0);
        rectangle7.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle7.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle7.setWidth(5.0);

        rectangle8.setFill(javafx.scene.paint.Color.WHITE);
        rectangle8.setHeight(15.0);
        rectangle8.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle8.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle8.setWidth(5.0);

        rectangle9.setFill(javafx.scene.paint.Color.WHITE);
        rectangle9.setHeight(15.0);
        rectangle9.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle9.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle9.setWidth(5.0);

        rectangle10.setFill(javafx.scene.paint.Color.WHITE);
        rectangle10.setHeight(15.0);
        rectangle10.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle10.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle10.setWidth(5.0);

        rectangle11.setFill(javafx.scene.paint.Color.WHITE);
        rectangle11.setHeight(15.0);
        rectangle11.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle11.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle11.setWidth(5.0);

        rectangle12.setFill(javafx.scene.paint.Color.WHITE);
        rectangle12.setHeight(15.0);
        rectangle12.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle12.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle12.setWidth(5.0);

        rectangle13.setFill(javafx.scene.paint.Color.WHITE);
        rectangle13.setHeight(15.0);
        rectangle13.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle13.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle13.setWidth(5.0);

        rectangle14.setFill(javafx.scene.paint.Color.WHITE);
        rectangle14.setHeight(15.0);
        rectangle14.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle14.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle14.setWidth(5.0);

        rectangle15.setFill(javafx.scene.paint.Color.WHITE);
        rectangle15.setHeight(15.0);
        rectangle15.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle15.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle15.setWidth(5.0);

        rectangle16.setFill(javafx.scene.paint.Color.WHITE);
        rectangle16.setHeight(15.0);
        rectangle16.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle16.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle16.setWidth(5.0);

        rectangle17.setFill(javafx.scene.paint.Color.WHITE);
        rectangle17.setHeight(15.0);
        rectangle17.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle17.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle17.setWidth(5.0);

        rectangle18.setFill(javafx.scene.paint.Color.WHITE);
        rectangle18.setHeight(15.0);
        rectangle18.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle18.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle18.setWidth(5.0);

        rectangle19.setFill(javafx.scene.paint.Color.WHITE);
        rectangle19.setHeight(15.0);
        rectangle19.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle19.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle19.setWidth(5.0);

        vBox.getChildren().add(rectangle);
        vBox.getChildren().add(rectangle0);
        vBox.getChildren().add(rectangle1);
        vBox.getChildren().add(rectangle2);
        vBox.getChildren().add(rectangle3);
        vBox.getChildren().add(rectangle4);
        vBox.getChildren().add(rectangle5);
        vBox.getChildren().add(rectangle6);
        vBox.getChildren().add(rectangle7);
        vBox.getChildren().add(rectangle8);
        vBox.getChildren().add(rectangle9);
        vBox.getChildren().add(rectangle10);
        vBox.getChildren().add(rectangle11);
        vBox.getChildren().add(rectangle12);
        vBox.getChildren().add(rectangle13);
        vBox.getChildren().add(rectangle14);
        vBox.getChildren().add(rectangle15);
        vBox.getChildren().add(rectangle16);
        vBox.getChildren().add(rectangle17);
        vBox.getChildren().add(rectangle18);
        vBox.getChildren().add(rectangle19);
        getChildren().add(vBox);
    }
}
