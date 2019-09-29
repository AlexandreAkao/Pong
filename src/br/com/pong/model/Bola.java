package br.com.pong.model;

public class Bola extends Elemento {

    private int dirX = -1;
    private int dirY = -1;
    private float velX;
    private float velY;
    private float VELOCIDADE;
    private int raio;

    public Bola(int a, int b, int raio, float velX, float velY) {
        this.raio = raio;
        this.velX = velX;
        this.velY = velY;
        VELOCIDADE = velX;
        setAltura(a);
        setLargura(b);
    }

    public float getVELOCIDADE() {
        return VELOCIDADE;
    }

    public float getVelX() {
        return velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setDirX(int dirX) {
        this.dirX = dirX;
    }

    public void setDirY(int dirY) {
        this.dirY = dirY;
    }

    public void incVel(float vx, float vy) {
        velX = vx;
        velY = vy;
    }

    @Override
    public void setVel(int vel) {
        velX = velY = vel;
    }

    @Override
    public int getVel() {
        return (int) velX;
    }

    public void incPx() {
        incPx((int) velX * dirX);
    }

    public void incPy() {
        incPy((int) velY * dirY);
    }

    public void inverteX() {
        dirX *= -1;
    }

    public void inverteY() {
        dirY *= -1;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
