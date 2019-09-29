package br.com.pong.model;

public class Elemento {

    private double px;
    private double py;
    private int largura;
    private int altura;

    private int vel;
    private boolean ativo;

    public Elemento() {
    }

    public Elemento(double px, double py, int largura, int altura) {
        this.px = px;
        this.py = py;
        this.largura = largura;
        this.altura = altura;
    }

    public void atualiza() {
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public double getPy() {
        return py;
    }

    public void setPy(int py) {
        this.py = py;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void incPx(int x) {
        px = px + x;
    }

    public void incPy(int y) {
        py = py + y;
    }
}
