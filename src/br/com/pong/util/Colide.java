package br.com.pong.util;

import br.com.pong.PongOJogo;
import br.com.pong.model.Settings;
import br.com.pong.view.BolaModelo;
import br.com.pong.view.PalhetaModel;
import br.com.pong.view.TextoModelo;

public class Colide {

    Auxiliar auxiliar = new Auxiliar();
    public boolean colisao = false;
    public boolean colisao1 = false;
    public boolean colisao2 = false;
    public boolean colisao3 = false;
    private int aux = 0;
    private int auxReset = 0;
    private int lado = 0;
    private double pxo;
    private double px;
    private double pyo;
    private double py;

    public Colide(double pxo, double pyo) {
        this.pxo = pxo;
        this.pyo = pyo;
    }

    public boolean isColisao() {
        return colisao;
    }

    public int getAux() {
        return aux;
    }

    public int getAuxReset() {
        return auxReset;
    }

    public int getLado() {
        return lado;
    }

    public void colidir(BolaModelo bola, double sen, double cos, TextoModelo a, TextoModelo b) {
        if (bola.getLayoutY() + bola.getBola().getRaio() < 0 + bola.getBola().getRaio() * 2) {

            colisao = true;
            colisao1 = false;
            colisao2 = false;
            colisao3 = false;
            aux = 1;

            PongOJogo.wall = new SourceSound("src/br/com/pong/resources/som/wall.wav");
            PongOJogo.wall.tocarMusica();
            PongOJogo.wall = null;

        } else if (bola.getLayoutY() - bola.getBola().getRaio() > 500 - bola.getBola().getRaio() * 2) {

            colisao = false;
            colisao1 = false;
            colisao2 = true;
            colisao3 = false;
            aux = 1;

            PongOJogo.wall = new SourceSound("src/br/com/pong/resources/som/wall.wav");
            PongOJogo.wall.tocarMusica();
            PongOJogo.wall = null;

            //If das redes
        } else if (bola.getLayoutX() + bola.getBola().getRaio() * 2 < 0 || bola.getLayoutX() + bola.getBola().getRaio() * 2 > 1000) {

            //Rede Esquerda
            if (bola.getLayoutX() + bola.getBola().getRaio() * 2 < 0) {
                b.setTexto(b.getTexto() + 1);
                b.setText(Integer.toString(b.getTexto()));

                if (AuxiliarJogador.getModo() == 2) {
                    AuxiliarJogador.getJogador2().setPontos(AuxiliarJogador.getJogador2().getPontos() + 1);
                }

                lado = -1;

                PongOJogo.ponto = new SourceSound("src/br/com/pong/resources/som/ponto.wav");
                PongOJogo.ponto.tocarMusica();
                PongOJogo.ponto = null;

                //Rede Direita
            } else if (bola.getLayoutX() + bola.getBola().getRaio() * 2 > 1000) {

                a.setTexto(a.getTexto() + 1);
                a.setText(Integer.toString(a.getTexto()));

                AuxiliarJogador.getJogador1().setPontos(AuxiliarJogador.getJogador1().getPontos() + 1);

                lado = 1;

                PongOJogo.ponto = new SourceSound("src/br/com/pong/resources/som/ponto.wav");
                PongOJogo.ponto.tocarMusica();
                PongOJogo.ponto = null;
            }

            aux = 0;
            auxReset = 0;

            bola.getBola().setVel((int) bola.getBola().getVELOCIDADE());
            bola.setLayoutX((Settings.getDEF_FRAME_WIDTH() - bola.getBola().getLargura()) / 2);
            bola.setLayoutY((Settings.getDEF_FRAME_HEIGHT() - bola.getBola().getAltura()) / 2);
        } else {
            auxReset = 1;
            pxo = bola.getLayoutX();
            pyo = bola.getLayoutY();
        }
    }

    //Colisão com as palhetas
    public void kick(BolaModelo bola, PalhetaModel a, PalhetaModel b, double sen, double cos) {

        // Palheta Esquerda //
        if ((bola.getLayoutX() > 40 && bola.getLayoutX() < 60) && (bola.getLayoutY() > a.getLayoutY() && bola.getLayoutY() < a.getLayoutY() + 160)) {

            colisao = false;
            colisao1 = true;
            colisao2 = false;
            colisao3 = false;
            aux = 1;
            PongOJogo.palheta = new SourceSound("src/br/com/pong/resources/som/palheta.wav");
            PongOJogo.palheta.tocarMusica();
            PongOJogo.palheta = null;

            bola.getBola().setVel(bola.getBola().getVel() + 1);

            auxiliar.setAux("L");

            // Palheta Direita //
        } else if ((bola.getLayoutX() > 940 && bola.getLayoutX() < 980) && (bola.getLayoutY() > b.getLayoutY() && bola.getLayoutY() < b.getLayoutY() + 160)) {

            colisao = false;
            colisao1 = false;
            colisao2 = false;
            colisao3 = true;
            aux = 1;
            PongOJogo.palheta = new SourceSound("src/br/com/pong/resources/som/palheta.wav");
            PongOJogo.palheta.tocarMusica();
            PongOJogo.palheta = null;

            bola.getBola().setVel(bola.getBola().getVel() + 1);

            auxiliar.setAux("R");

        }
    }

    public void normal(BolaModelo bola, double sen, double cos) {
        if ("L".equals(auxiliar.getAux())) {
            bola.setLayoutX(bola.getLayoutX() - (bola.getBola().getVelX() * sen));
            bola.setLayoutY(bola.getLayoutY() + (bola.getBola().getVelY() * -cos));
        } else if ("R".equals(auxiliar.getAux())) {
            bola.setLayoutX(bola.getLayoutX() + (bola.getBola().getVelX() * sen));
            bola.setLayoutY(bola.getLayoutY() + (bola.getBola().getVelY() * -cos));
        }
    }

    public void normal1(BolaModelo bola, double sen, double cos) {

        bola.setLayoutX(bola.getLayoutX() + (bola.getBola().getVelX() * -sen));
        bola.setLayoutY(bola.getLayoutY() + (bola.getBola().getVelY() * cos));
    }

    public void normal2(BolaModelo bola, double sen, double cos) {
        if ("L".equals(auxiliar.getAux())) {
            bola.setLayoutX(bola.getLayoutX() - (bola.getBola().getVelX() * sen));
            bola.setLayoutY(bola.getLayoutY() - (bola.getBola().getVelY() * cos));
        } else if ("R".equals(auxiliar.getAux())) {
            bola.setLayoutX(bola.getLayoutX() + (bola.getBola().getVelX() * sen));
            bola.setLayoutY(bola.getLayoutY() - (bola.getBola().getVelY() * cos));
        }
    }

    public void normal3(BolaModelo bola, double sen, double cos) {
        bola.setLayoutX(bola.getLayoutX() + (bola.getBola().getVelX() * sen));
        bola.setLayoutY(bola.getLayoutY() + (bola.getBola().getVelY() * cos));
    }
}
