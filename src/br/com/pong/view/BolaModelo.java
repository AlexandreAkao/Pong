package br.com.pong.view;

import javafx.scene.shape.*;
import br.com.pong.model.Bola;

public class BolaModelo extends Circle {

    Bola bola;

    public BolaModelo(int a, int b, int c, float vX, float vY) {
        bola = new Bola(a, b, c, vX, vY);

        setFill(javafx.scene.paint.Color.WHITE);
        setRadius(bola.getRaio());
        setStroke(javafx.scene.paint.Color.WHITE);
        setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

    }

    public Bola getBola() {
        return bola;
    }
}
