package br.com.pong.util;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class SourceSound {

    // Define o caminho da música //
    private Media musicSound;
    private MediaPlayer musicPlayer;

    public SourceSound(String a) {
        musicSound = new Media(new File(new File(a).getAbsolutePath()).toURI().toString());
        musicPlayer = new MediaPlayer(musicSound);

    }

    // Starta a música //
    public void tocarMusica() {
        musicPlayer.play();
    }

    // Para a música //
    public void pararMusica() {
        musicPlayer.stop();
    }

    public void volumeMusica(double a) {
        musicPlayer.setVolume(a);
    }

}
