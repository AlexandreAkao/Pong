package br.com.pong.model;

public class Texto extends Elemento {

    private String text;
    private String fonte;

    public Texto(double px, double py, int largura, int altura, String text, String fonte) {
        super(px, py, largura, altura);
        this.text = text;
        this.fonte = fonte;
    }
}
