package br.com.pong.view;

import br.com.pong.PongOJogo;
import static br.com.pong.PongOJogo.primaryStage;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TelaPontos extends AnchorPane {

    protected final Text text;
    protected final Button button;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final Label label6;
    protected final Label label7;
    protected final Label label8;
    protected final Label label9;
    protected final Label label10;
    protected final Label label11;
    protected final Label label12;
    protected final Label label13;
    protected final Label label14;
    protected final Label label15;
    protected final Label label16;
    protected final Label label17;
    protected final Label label18;

    public TelaPontos(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m, String n, String o, String p) {

        text = new Text();
        button = new Button();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();
        label7 = new Label();
        label8 = new Label();
        label9 = new Label();
        label10 = new Label();
        label11 = new Label();
        label12 = new Label();
        label13 = new Label();
        label14 = new Label();
        label15 = new Label();
        label16 = new Label();
        label17 = new Label();
        label18 = new Label();

        setId("AnchorPane");
        setPrefHeight(500.0);
        setPrefWidth(1000.0);
        setStyle("-fx-background-color: black;");

        AnchorPane.setTopAnchor(text, 20.0);
        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(368.0);
        text.setLayoutY(84.95999908447266);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("PONTOS");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setFont(new Font("ArcadeClassic", 80.0));

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

        AnchorPane.setTopAnchor(gridPane, 113.0);
        gridPane.setLayoutX(191.0);
        gridPane.setLayoutY(113.0);
        gridPane.setPrefHeight(304.0);
        gridPane.setPrefWidth(618.0);

        columnConstraints.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        label.setText("Nome:");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label0, 1);
        label0.setText("Pontos:");
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label1, 2);
        label1.setText("vtrs:");
        label1.setTextFill(javafx.scene.paint.Color.WHITE);
        label1.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label2, 3);
        label2.setText("DERTS:");
        label2.setTextFill(javafx.scene.paint.Color.WHITE);
        label2.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setRowIndex(label3, 1);
        label3.setText(a);
        label3.setTextFill(javafx.scene.paint.Color.WHITE);
        label3.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setRowIndex(label4, 2);
        label4.setText(e);
        label4.setTextFill(javafx.scene.paint.Color.WHITE);
        label4.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setRowIndex(label5, 3);
        label5.setText(i);
        label5.setTextFill(javafx.scene.paint.Color.WHITE);
        label5.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setRowIndex(label6, 4);
        label6.setText(m);
        label6.setTextFill(javafx.scene.paint.Color.WHITE);
        label6.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label7, 1);
        GridPane.setRowIndex(label7, 1);
        label7.setText(b);
        label7.setTextFill(javafx.scene.paint.Color.WHITE);
        label7.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label8, 1);
        GridPane.setRowIndex(label8, 2);
        label8.setText(f);
        label8.setTextFill(javafx.scene.paint.Color.WHITE);
        label8.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label9, 1);
        GridPane.setRowIndex(label9, 3);
        label9.setText(j);
        label9.setTextFill(javafx.scene.paint.Color.WHITE);
        label9.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label10, 1);
        GridPane.setRowIndex(label10, 4);
        label10.setText(n);
        label10.setTextFill(javafx.scene.paint.Color.WHITE);
        label10.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label11, 2);
        GridPane.setRowIndex(label11, 1);
        label11.setText(c);
        label11.setTextFill(javafx.scene.paint.Color.WHITE);
        label11.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label12, 2);
        GridPane.setRowIndex(label12, 2);
        label12.setText(g);
        label12.setTextFill(javafx.scene.paint.Color.WHITE);
        label12.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label13, 2);
        GridPane.setRowIndex(label13, 3);
        label13.setText(k);
        label13.setTextFill(javafx.scene.paint.Color.WHITE);
        label13.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label14, 2);
        GridPane.setRowIndex(label14, 4);
        label14.setText(o);
        label14.setTextFill(javafx.scene.paint.Color.WHITE);
        label14.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label15, 3);
        GridPane.setRowIndex(label15, 1);
        label15.setText(d);
        label15.setTextFill(javafx.scene.paint.Color.WHITE);
        label15.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label16, 3);
        GridPane.setRowIndex(label16, 2);
        label16.setText(h);
        label16.setTextFill(javafx.scene.paint.Color.WHITE);
        label16.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label17, 3);
        GridPane.setRowIndex(label17, 3);
        label17.setText(l);
        label17.setTextFill(javafx.scene.paint.Color.WHITE);
        label17.setFont(new Font("ArcadeClassic", 40.0));

        GridPane.setColumnIndex(label18, 3);
        GridPane.setRowIndex(label18, 4);
        label18.setText(p);
        label18.setTextFill(javafx.scene.paint.Color.WHITE);
        label18.setFont(new Font("ArcadeClassic", 40.0));

        getChildren().add(text);
        getChildren().add(button);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowConstraints3);
        gridPane.getChildren().add(label);
        gridPane.getChildren().add(label0);
        gridPane.getChildren().add(label1);
        gridPane.getChildren().add(label2);
        gridPane.getChildren().add(label3);
        gridPane.getChildren().add(label4);
        gridPane.getChildren().add(label5);
        gridPane.getChildren().add(label6);
        gridPane.getChildren().add(label7);
        gridPane.getChildren().add(label8);
        gridPane.getChildren().add(label9);
        gridPane.getChildren().add(label10);
        gridPane.getChildren().add(label11);
        gridPane.getChildren().add(label12);
        gridPane.getChildren().add(label13);
        gridPane.getChildren().add(label14);
        gridPane.getChildren().add(label15);
        gridPane.getChildren().add(label16);
        gridPane.getChildren().add(label17);
        gridPane.getChildren().add(label18);
        getChildren().add(gridPane);

    }

    protected void handleVoltar(javafx.event.ActionEvent actionEvent) {
        PongOJogo.telaMenuInicial(primaryStage);

    }

}
