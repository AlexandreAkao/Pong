package br.com.pong.view;

import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

import br.com.pong.model.Palheta;
import br.com.pong.model.Settings;

public class PalhetaModel extends VBox {

    protected final Rectangle rectangle;
    protected final Rectangle rectangle0;
    protected final Rectangle rectangle1;
    protected final Rectangle rectangle2;
    protected final Rectangle rectangle3;
    protected final Rectangle rectangle4;
    protected final Rectangle rectangle5;
    protected final Rectangle rectangle6;
    protected boolean animacaoMenu = true;
    protected Color cor;

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public boolean isAnimacaoMenu() {
        return animacaoMenu;
    }

    public void setAnimacaoMenu(boolean animacaoMenu) {
        this.animacaoMenu = animacaoMenu;
    }

    protected final Palheta palheta = new Palheta(5, Settings.getDEF_FRAME_HEIGHT() / 2, 20, 160);

    public PalhetaModel(Color c) {

        rectangle = new Rectangle();
        rectangle0 = new Rectangle();
        rectangle1 = new Rectangle();
        rectangle2 = new Rectangle();
        rectangle3 = new Rectangle();
        rectangle4 = new Rectangle();
        rectangle5 = new Rectangle();
        rectangle6 = new Rectangle();

        setPrefWidth(palheta.getLargura());
        setPrefHeight(palheta.getAltura());

        rectangle.setFill(c);
        rectangle.setHeight(palheta.getAltura() / 8);
        rectangle.setStroke(c);
        rectangle.setStrokeMiterLimit(0.0);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setStrokeWidth(0.0);
        rectangle.setWidth(palheta.getLargura());

        rectangle0.setFill(c);
        rectangle0.setHeight(palheta.getAltura() / 8);
        rectangle0.setStroke(c);
        rectangle0.setStrokeMiterLimit(0.0);
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setStrokeWidth(0.0);
        rectangle0.setWidth(palheta.getLargura());

        rectangle1.setFill(c);
        rectangle1.setHeight(palheta.getAltura() / 8);
        rectangle1.setStroke(c);
        rectangle1.setStrokeMiterLimit(0.0);
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setStrokeWidth(0.0);
        rectangle1.setWidth(palheta.getLargura());

        rectangle2.setFill(c);
        rectangle2.setHeight(palheta.getAltura() / 8);
        rectangle2.setStroke(c);
        rectangle2.setStrokeMiterLimit(0.0);
        rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle2.setStrokeWidth(0.0);
        rectangle2.setWidth(palheta.getLargura());

        rectangle3.setFill(c);
        rectangle3.setHeight(palheta.getAltura() / 8);
        rectangle3.setStroke(c);
        rectangle3.setStrokeMiterLimit(0.0);
        rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle3.setStrokeWidth(0.0);
        rectangle3.setWidth(palheta.getLargura());

        rectangle4.setFill(c);
        rectangle4.setHeight(palheta.getAltura() / 8);
        rectangle4.setStroke(c);
        rectangle4.setStrokeMiterLimit(0.0);
        rectangle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle4.setStrokeWidth(0.0);
        rectangle4.setWidth(palheta.getLargura());

        rectangle5.setFill(c);
        rectangle5.setHeight(palheta.getAltura() / 8);
        rectangle5.setStroke(c);
        rectangle5.setStrokeMiterLimit(0.0);
        rectangle5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle5.setStrokeWidth(0.0);
        rectangle5.setWidth(palheta.getLargura());

        rectangle6.setFill(c);
        rectangle6.setHeight(palheta.getAltura() / 8);
        rectangle6.setStroke(c);
        rectangle6.setStrokeMiterLimit(0.0);
        rectangle6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle6.setStrokeWidth(0.0);
        rectangle6.setWidth(palheta.getLargura());

        getChildren().add(rectangle);
        getChildren().add(rectangle0);
        getChildren().add(rectangle1);
        getChildren().add(rectangle2);
        getChildren().add(rectangle3);
        getChildren().add(rectangle4);
        getChildren().add(rectangle5);
        getChildren().add(rectangle6);

    }

    public Palheta getPalheta() {
        return palheta;
    }
}
