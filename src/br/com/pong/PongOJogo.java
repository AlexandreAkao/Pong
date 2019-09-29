package br.com.pong;

import br.com.pong.view.*;
import br.com.pong.view.PalhetaModel;
import br.com.pong.model.Palheta;
import br.com.pong.model.Settings;
import br.com.pong.util.SourceSound;
import br.com.pong.util.Colide;
import br.com.pong.persistencia.JogadoresDAO;
import br.com.pong.util.AuxiliarJogador;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class PongOJogo extends Application {

    public static Stage primaryStage;
    private static Scene theScene;

    private static PalhetaModel palhetaE;
    private static PalhetaModel palhetaD;

    public static ArrayList<String> input = new ArrayList<String>();

    private static TelaPause t = new TelaPause();

    static JogadoresDAO players = new JogadoresDAO();

    public static SourceSound musica = new SourceSound("src/br/com/pong/resources/som/music.mp3");
    public static SourceSound ponto;
    public static SourceSound wall;
    public static SourceSound palheta;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        PongOJogo.primaryStage = primaryStage;
        //Colocar o no Executavel
        primaryStage.setTitle("Pong");

        //Colocar uma imagem no topo do Executavel
        primaryStage.getIcons().add(new Image("file:src/br/com/pong/resources/images/pongIcone.png"));

        telaMenuInicial(primaryStage);

        primaryStage.show();
    }

    //Animacao nos menus
    public static void animacaoPalheta(PalhetaModel palhetaMenuE, PalhetaModel palhetaMenuD) {
        //Animação
        Timeline gameLoop = new Timeline();
        gameLoop.setCycleCount(Timeline.INDEFINITE);

        final long timeStart = System.currentTimeMillis();

        KeyFrame kf = new KeyFrame(
                Duration.seconds(0.016), // 60 FPS
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                if (palhetaMenuE.isAnimacaoMenu()) {
                    palhetaMenuE.setLayoutY(palhetaMenuE.getLayoutY() - 5);
                    if (palhetaMenuE.getLayoutY() <= 0) {
                        palhetaMenuE.setAnimacaoMenu(false);
                    }
                } else {
                    palhetaMenuE.setLayoutY(palhetaMenuE.getLayoutY() + 5);
                    if (palhetaMenuE.getLayoutY() >= 340) {
                        palhetaMenuE.setAnimacaoMenu(true);
                    }
                }

                if (palhetaMenuD.isAnimacaoMenu()) {
                    palhetaMenuD.setLayoutY(palhetaMenuD.getLayoutY() + 5);
                    if (palhetaMenuD.getLayoutY() >= 340) {
                        palhetaMenuD.setAnimacaoMenu(false);
                    }
                } else {
                    palhetaMenuD.setLayoutY(palhetaMenuD.getLayoutY() - 5);
                    if (palhetaMenuD.getLayoutY() <= 0) {
                        palhetaMenuD.setAnimacaoMenu(true);
                    }
                }
            }
        });

        gameLoop.getKeyFrames().add(kf);
        gameLoop.play();
    }

    public static void jogoAnimacao(PalhetaModel palheta, BolaModelo bm, String KeyUP, String KeyDOWN, int ativar, TextoModelo a, TextoModelo b, Group root) {

        Random random = new Random();

        theScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent e) {
                String code = e.getCode().toString();
                if (!input.contains(code)) {
                    input.add(code);
                }
            }
        });
        theScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent e) {
                String code = e.getCode().toString();
                input.remove(code);
            }
        });

        //Animação
        Timeline gameLoop = new Timeline();
        gameLoop.setCycleCount(Timeline.INDEFINITE);

        final long timeStart = System.currentTimeMillis();

        KeyFrame kf = null;
        kf = new KeyFrame(
                Duration.seconds(0.016), // 60 FPS
                new EventHandler<ActionEvent>() {

            int ativa = ativar;
            Colide coli = new Colide(bm.getLayoutX(), bm.getLayoutY());
            int x = random.nextInt(400);
            int y = 150 + random.nextInt(151);
            int lado = (int) Math.pow(-1, random.nextInt(2));
            double deltaX = x - bm.getLayoutX();
            double deltaY = y - bm.getLayoutY();
            double h = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

            @Override
            public void handle(ActionEvent ae) {

                if (a.getTexto() < 11) {
                    if (b.getTexto() < 11) {
                        switch (ativa) {

                            //1 jogador
                            case 1:
                                if (input.contains(KeyUP) && palheta.getLayoutY() > 0) {
                                    palheta.setLayoutY(palheta.getLayoutY() - palheta.getPalheta().getVelocidade());
                                }
                                if (input.contains(KeyDOWN) && palheta.getLayoutY() < 340) {
                                    palheta.setLayoutY(palheta.getLayoutY() + palheta.getPalheta().getVelocidade());
                                }
                                if (input.contains("ESCAPE")) {
                                    if (root.getChildren().size() == 1) {

                                        ativa = 3;
                                        root.getChildren().add(t);
                                    } else {
                                        root.getChildren().remove(1);
                                        ativa = ativar;
                                    }
                                }
                                //IA
                                palhetaD.setLayoutY(bm.getLayoutY() - 80);

                                break;

                            //2 jogador
                            case 2:
                                if (input.contains(KeyUP) && palheta.getLayoutY() > 0) {
                                    palheta.setLayoutY(palheta.getLayoutY() - palheta.getPalheta().getVelocidade());
                                }
                                if (input.contains(KeyDOWN) && palheta.getLayoutY() < 340) {
                                    palheta.setLayoutY(palheta.getLayoutY() + palheta.getPalheta().getVelocidade());
                                }
                                if (input.contains("UP") && palhetaD.getLayoutY() > 0) {
                                    palhetaD.setLayoutY(palhetaD.getLayoutY() - palheta.getPalheta().getVelocidade());
                                }
                                if (input.contains("DOWN") && palhetaD.getLayoutY() < 340) {
                                    palhetaD.setLayoutY(palhetaD.getLayoutY() + palheta.getPalheta().getVelocidade());
                                }
                                if (input.contains("ESCAPE")) {
                                    if (root.getChildren().size() == 1) {

                                        ativa = 3;
                                        root.getChildren().add(t);
                                    } else {
                                        root.getChildren().remove(1);
                                        ativa = ativar;
                                    }
                                }
                                break;

                            //Enquanto tiver pausado
                            case 3:
                                if (input.contains("ESCAPE")) {
                                    if (root.getChildren().size() == 1) {

                                        ativa = 3;
                                        root.getChildren().add(t);
                                    } else {
                                        root.getChildren().remove(1);
                                        ativa = ativar;
                                    }
                                }
                                break;
                        }

                        if (ativa != 3) {
                            if (coli.getAux() == 0) {
                                if (coli.getAuxReset() == 0) {
                                    x = random.nextInt(400);
                                    y = 200 + random.nextInt(100);
                                    if (coli.getLado() == 0) {
                                        lado = (int) Math.pow(-1, random.nextInt(2));
                                    } else {
                                        lado = coli.getLado();
                                    }
                                    deltaX = x - bm.getLayoutX();
                                    deltaY = y - bm.getLayoutY();
                                    h = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
                                }
                                bm.setLayoutX(bm.getLayoutX() + (bm.getBola().getVelX() * lado * deltaX / h));
                                bm.setLayoutY(bm.getLayoutY() + (bm.getBola().getVelY() * deltaY / h));

                                coli.colidir(bm, deltaX / h, deltaY / h, a, b);
                                coli.kick(bm, palheta, palhetaD, deltaX / h, deltaY / h);

                            } else {
                                coli.colidir(bm, deltaX / h, deltaY / h, a, b);
                                coli.kick(bm, palheta, palhetaD, deltaX / h, deltaY / h);
                                if (coli.colisao) {
                                    coli.normal(bm, deltaX / h, deltaY / h);
                                } else if (coli.colisao1) {

                                    coli.normal1(bm, deltaX / h, deltaY / h);
                                } else if (coli.colisao2) {
                                    coli.normal2(bm, deltaX / h, deltaY / h);
                                } else if (coli.colisao3) {
                                    coli.normal3(bm, deltaX / h, deltaY / h);
                                }
                            }
                        }
                    } else if (b.getTexto() > 10) {

                        if (AuxiliarJogador.getModo() == 2) {

                            AuxiliarJogador.getJogador2().setVitoria(AuxiliarJogador.getJogador2().getVitoria() + 1);

                            try {
                                JogadoresDAO.addJogador(AuxiliarJogador.getJogador2());
                            } catch (Exception ex) {
                                Logger.getLogger(PongOJogo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        AuxiliarJogador.getJogador1().setDerrota(AuxiliarJogador.getJogador1().getDerrota() + 1);

                        try {
                            JogadoresDAO.addJogador(AuxiliarJogador.getJogador1());
                        } catch (Exception ex) {
                            Logger.getLogger(PongOJogo.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        gameLoop.stop();
                        if (AuxiliarJogador.getModo() == 2) {

                            telaVencedor(primaryStage, AuxiliarJogador.getJogador2().getNome());
                        } else {
                            telaVencedor(primaryStage, "COM");
                        }
                    }
                } else if (a.getTexto() > 10) {

                    if (AuxiliarJogador.getModo() == 2) {

                        AuxiliarJogador.getJogador2().setDerrota(AuxiliarJogador.getJogador2().getDerrota() + 1);

                        try {
                            JogadoresDAO.addJogador(AuxiliarJogador.getJogador2());
                        } catch (Exception ex) {
                            Logger.getLogger(PongOJogo.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                    AuxiliarJogador.getJogador1().setVitoria(AuxiliarJogador.getJogador1().getVitoria() + 1);

                    try {
                        JogadoresDAO.addJogador(AuxiliarJogador.getJogador1());
                    } catch (Exception ex) {
                        Logger.getLogger(PongOJogo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    gameLoop.stop();

                    telaVencedor(primaryStage, AuxiliarJogador.getJogador1().getNome());
                }
            }
        });

        gameLoop.getKeyFrames().add(kf);
        gameLoop.play();
    }

    public static void palheta(Color c1, Color c2) {
        //Palheta Esquerda
        palhetaE = new PalhetaModel(c1);
        AnchorPane.setLeftAnchor(palhetaE, Palheta.getPX_CONST());
        palhetaE.setLayoutY((Settings.getDEF_FRAME_HEIGHT() - palhetaE.getPalheta().getAltura()) / 2);

        //Palheta Direita
        palhetaD = new PalhetaModel(c2);
        AnchorPane.setRightAnchor(palhetaD, Palheta.getPX_CONST());
        palhetaD.setLayoutY((Settings.getDEF_FRAME_HEIGHT() - palhetaD.getPalheta().getAltura()) / 2);
    }

    public static void bola(BolaModelo bola) {

        bola.setLayoutX((Settings.getDEF_FRAME_WIDTH() - bola.getBola().getLargura()) / 2);
        bola.setLayoutY((Settings.getDEF_FRAME_HEIGHT() - bola.getBola().getAltura()) / 2);

    }

    public static void textoPontos(TextoModelo a, TextoModelo b) {
        AnchorPane.setLeftAnchor(a, 350.0);
        AnchorPane.setTopAnchor(a, 20.0);
        AnchorPane.setRightAnchor(b, 350.0);
        AnchorPane.setTopAnchor(b, 20.0);
    }

    public static void telaMenuInicial(Stage primaryStage) {
        Group root = new Group();
        theScene = new Scene(root);

        Menu menuInicial = new Menu();

        palheta(Color.RED, Color.RED);

        menuInicial.getChildren().add(palhetaE);
        menuInicial.getChildren().add(palhetaD);
        root.getChildren().add(menuInicial);

        animacaoPalheta(palhetaE, palhetaD);

        musica.volumeMusica(0.2);
        musica.tocarMusica();

        primaryStage.setScene(theScene);

    }

    public static void telaVencedor(Stage primaryStage, String nomeVencedor) {
        Group root = new Group();
        theScene = new Scene(root);

        TelaVencedor tv = new TelaVencedor(nomeVencedor);

        root.getChildren().add(tv);

        primaryStage.setScene(theScene);
    }

    public static void telaPontos(Stage primaryStage) {
        Group root = new Group();
        theScene = new Scene(root);

        TelaPontos tp;

        switch (JogadoresDAO.listaJogadores.size()) {
            case 0:
                tp = new TelaPontos("", "", "", "",
                        "", "", "", "",
                        "", "", "", "",
                        "", "", "", ""
                );
                break;
            case 1:
                tp = new TelaPontos(JogadoresDAO.listaJogadores.get(0).getNome(), Integer.toString(JogadoresDAO.listaJogadores.get(0).getPontos()), Integer.toString(JogadoresDAO.listaJogadores.get(0).getVitoria()), Integer.toString(JogadoresDAO.listaJogadores.get(0).getDerrota()),
                        "", "", "", "",
                        "", "", "", "",
                        "", "", "", ""
                );
                break;
            case 2:
                tp = new TelaPontos(JogadoresDAO.listaJogadores.get(0).getNome(), Integer.toString(JogadoresDAO.listaJogadores.get(0).getPontos()), Integer.toString(JogadoresDAO.listaJogadores.get(0).getVitoria()), Integer.toString(JogadoresDAO.listaJogadores.get(0).getDerrota()),
                        JogadoresDAO.listaJogadores.get(1).getNome(), Integer.toString(JogadoresDAO.listaJogadores.get(1).getPontos()), Integer.toString(JogadoresDAO.listaJogadores.get(1).getVitoria()), Integer.toString(JogadoresDAO.listaJogadores.get(1).getDerrota()),
                        "", "", "", "",
                        "", "", "", ""
                );
                break;
            case 3:
                tp = new TelaPontos(JogadoresDAO.listaJogadores.get(0).getNome(), Integer.toString(JogadoresDAO.listaJogadores.get(0).getPontos()), Integer.toString(JogadoresDAO.listaJogadores.get(0).getVitoria()), Integer.toString(JogadoresDAO.listaJogadores.get(0).getDerrota()),
                        JogadoresDAO.listaJogadores.get(1).getNome(), Integer.toString(JogadoresDAO.listaJogadores.get(1).getPontos()), Integer.toString(JogadoresDAO.listaJogadores.get(1).getVitoria()), Integer.toString(JogadoresDAO.listaJogadores.get(1).getDerrota()),
                        JogadoresDAO.listaJogadores.get(2).getNome(), Integer.toString(JogadoresDAO.listaJogadores.get(2).getPontos()), Integer.toString(JogadoresDAO.listaJogadores.get(2).getVitoria()), Integer.toString(JogadoresDAO.listaJogadores.get(2).getDerrota()),
                        "", "", "", ""
                );
                break;
            default:
                tp = new TelaPontos(JogadoresDAO.listaJogadores.get(0).getNome(), Integer.toString(JogadoresDAO.listaJogadores.get(0).getPontos()), Integer.toString(JogadoresDAO.listaJogadores.get(0).getVitoria()), Integer.toString(JogadoresDAO.listaJogadores.get(0).getDerrota()),
                        JogadoresDAO.listaJogadores.get(1).getNome(), Integer.toString(JogadoresDAO.listaJogadores.get(1).getPontos()), Integer.toString(JogadoresDAO.listaJogadores.get(1).getVitoria()), Integer.toString(JogadoresDAO.listaJogadores.get(1).getDerrota()),
                        JogadoresDAO.listaJogadores.get(2).getNome(), Integer.toString(JogadoresDAO.listaJogadores.get(2).getPontos()), Integer.toString(JogadoresDAO.listaJogadores.get(2).getVitoria()), Integer.toString(JogadoresDAO.listaJogadores.get(2).getDerrota()),
                        JogadoresDAO.listaJogadores.get(3).getNome(), Integer.toString(JogadoresDAO.listaJogadores.get(3).getPontos()), Integer.toString(JogadoresDAO.listaJogadores.get(3).getVitoria()), Integer.toString(JogadoresDAO.listaJogadores.get(3).getDerrota())
                );
                break;
        }

        palheta(Color.BROWN, Color.BROWN);

        tp.getChildren().add(palhetaE);
        tp.getChildren().add(palhetaD);
        root.getChildren().add(tp);
        animacaoPalheta(palhetaE, palhetaD);

        primaryStage.setScene(theScene);
    }

    public static void telaAjuda(Stage primaryStage) {
        Group root = new Group();
        theScene = new Scene(root);

        Ajuda ajuda = new Ajuda();

        palheta(Color.YELLOW, Color.YELLOW);

        ajuda.getChildren().add(palhetaE);
        ajuda.getChildren().add(palhetaD);
        root.getChildren().add(ajuda);
        animacaoPalheta(palhetaE, palhetaD);

        primaryStage.setScene(theScene);
    }

    public static void telaModoDeJ(Stage primaryStage) {
        Group root = new Group();
        theScene = new Scene(root);

        ModoDeJogo mdj = new ModoDeJogo();

        palheta(Color.GREEN, Color.GREEN);

        mdj.getChildren().add(palhetaE);
        mdj.getChildren().add(palhetaD);
        root.getChildren().add(mdj);

        animacaoPalheta(palhetaE, palhetaD);

        primaryStage.setScene(theScene);
    }

    public static void telaNomeUmJogador(Stage primaryStage) {
        Group root = new Group();
        theScene = new Scene(root);

        NomeUmJogador n1J = new NomeUmJogador();

        palheta(Color.WHITE, Color.BLUEVIOLET);

        n1J.getChildren().add(palhetaE);
        n1J.getChildren().add(palhetaD);
        root.getChildren().add(n1J);

        animacaoPalheta(palhetaE, palhetaD);

        primaryStage.setScene(theScene);

    }

    public static void telaNomeDoisJogador(Stage primaryStage) {
        Group root = new Group();
        theScene = new Scene(root);

        NomeDoisJogador n2J = new NomeDoisJogador();

        palheta(Color.WHITE, Color.SANDYBROWN);

        n2J.getChildren().add(palhetaE);
        n2J.getChildren().add(palhetaD);
        root.getChildren().add(n2J);

        animacaoPalheta(palhetaE, palhetaD);

        primaryStage.setScene(theScene);
    }

    public static void umJogador(Stage primaryStage) {
        Group root = new Group();
        theScene = new Scene(root);

        TelaJogo tl = new TelaJogo();
        BolaModelo bola = new BolaModelo(10, 10, 10, 8, 8);
        TextoModelo t1 = new TextoModelo();
        TextoModelo t2 = new TextoModelo();

        bola(bola);
        palheta(Color.WHITE, Color.BLUEVIOLET);
        textoPontos(t1, t2);

        tl.getChildren().add(palhetaE);
        tl.getChildren().add(palhetaD);
        tl.getChildren().add(bola);
        tl.getChildren().add(t1);
        tl.getChildren().add(t2);
        root.getChildren().add(tl);

        jogoAnimacao(palhetaE, bola, "W", "S", 1, t1, t2, root);

        primaryStage.setScene(theScene);

    }

    public static void doisJogador(Stage primaryStage) {
        Group root = new Group();
        theScene = new Scene(root);

        TelaJogo tl = new TelaJogo();
        BolaModelo bola = new BolaModelo(10, 10, 10, 8, 8);
        TextoModelo t1 = new TextoModelo();
        TextoModelo t2 = new TextoModelo();

        bola(bola);
        palheta(Color.WHITE, Color.SANDYBROWN);
        textoPontos(t1, t2);

        tl.getChildren().add(palhetaE);
        tl.getChildren().add(palhetaD);
        tl.getChildren().add(bola);
        tl.getChildren().add(t1);
        tl.getChildren().add(t2);
        root.getChildren().add(tl);

        jogoAnimacao(palhetaE, bola, "W", "S", 2, t1, t2, root);

        primaryStage.setScene(theScene);

    }
}
