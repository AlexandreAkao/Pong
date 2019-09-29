package br.com.pong.view;

import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TextoModelo extends Text {

    private int texto = 0;

    public void setTexto(int a) {
        this.texto = a;
    }

    public int getTexto() {
        return texto;
    }

    public TextoModelo() {

        setFill(javafx.scene.paint.Color.WHITE);
        setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        setStrokeWidth(0.0);
        setText(Integer.toString(texto));
        setWrappingWidth(90);
        setFont(new Font("ArcadeClassic", 80.0));

    }
}
