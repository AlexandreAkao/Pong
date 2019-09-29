package br.com.pong.persistencia;

import br.com.pong.model.Jogador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JogadoresDAO {

    public static ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();

    public static void adicionar(String a) throws Exception {
        int aux = 0;
        for (int i = 0; i < listaJogadores.size(); i++) {

            if (listaJogadores.get(i).getNome() == a.toLowerCase()) {
                aux = 1;
            }

        }
        if (aux == 0) {
            listaJogadores.add(new Jogador(0, a.toLowerCase(), 0, 0));
        }

        gravarDados();
    }

    public static void addJogador(Jogador a) throws Exception {
        int aux = 0;
        int aux2 = 0;

        for (int i = 0; i < listaJogadores.size(); i++) {

            if (listaJogadores.get(i).getNome().equals(a.getNome())) {
                aux = 1;
                aux2 = i;
            }
        }

        if (aux == 0) {
            listaJogadores.add(a);
        } else {
            listaJogadores.set(aux2, a);
        }

        Collections.sort(listaJogadores, new Comparator<Jogador>() {
            @Override
            public int compare(Jogador o1, Jogador o2) {
                return Integer.valueOf(o2.getVitoria()).compareTo(o1.getVitoria());

            }
        });

        gravarDados();
    }

    public static void gravarDados() throws Exception {
        File f = new File("src\\br\\com\\pong\\resources\\persistencia\\jogadores.txt");

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            //Classe que armazena caracteres
            fw = new FileWriter(f);

            //Classe que armazena strings
            bw = new BufferedWriter(fw);

            //Escreveu uma linha no texto
            for (Jogador lj : listaJogadores) {
                bw.write(lj.getPontos() + ";" + lj.getNome() + ";" + lj.getVitoria() + ";" + lj.getDerrota());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        File f = new File("src\\br\\com\\pong\\resources\\persistencia\\jogadores.txt");

        if (f.exists()) {

            FileReader fr = null;
            BufferedReader br = null;

            try {
                //Classe que armazena caracteres
                fr = new FileReader(f);

                //Classe que armazena strings
                br = new BufferedReader(fr);

                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split(";");

                    Jogador p = new Jogador(Integer.parseInt(dados[0]), dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]));
                    listaJogadores.add(p);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                    if (fr != null) {
                        fr.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
