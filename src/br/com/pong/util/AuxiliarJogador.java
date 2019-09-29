package br.com.pong.util;

import br.com.pong.model.Jogador;

public class AuxiliarJogador {

    private static Jogador jogador1;
    private static Jogador jogador2;
    private static int modo;

    public static int getModo() {
        return modo;
    }

    public static void setModo(int modo) {
        AuxiliarJogador.modo = modo;
    }

    public static Jogador getJogador1() {
        return jogador1;
    }

    public static void setJogador1(Jogador jogador1) {
        AuxiliarJogador.jogador1 = jogador1;
    }

    public static Jogador getJogador2() {
        return jogador2;
    }

    public static void setJogador2(Jogador jogador2) {
        AuxiliarJogador.jogador2 = jogador2;
    }

}
