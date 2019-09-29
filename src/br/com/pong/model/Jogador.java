package br.com.pong.model;

public class Jogador {

    private int pontos;
    private String nome;
    private int vitoria;
    private int derrota;

    public Jogador(int pontos, String nome, int vitoria, int derrota) {
        this.pontos = pontos;
        this.nome = nome;
        this.vitoria = vitoria;
        this.derrota = derrota;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    @Override
    public String toString() {
        return "\nJogador{" + "pontos=" + pontos + ", nome=" + nome + ", vitoria=" + vitoria + ", derrota=" + derrota + '}';
    }

}
