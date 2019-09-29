package br.com.pong.model;

public class Palheta extends Elemento {

    private int velocidade;
    private static final double PX_CONST = 30.0;

    public Palheta(int velocidade, int py, int largura, int altura) {
        super(PX_CONST, py, largura, altura);
        this.velocidade = velocidade;
    }

    public static double getPX_CONST() {
        return PX_CONST;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
