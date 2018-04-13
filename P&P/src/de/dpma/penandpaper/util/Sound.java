package de.dpma.penandpaper.util;

import javax.sound.sampled.*;
import java.io.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
public interface Sound {

	public static void playSound(String audioDataPath) {

		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(audioDataPath));
			AudioFormat af = audioInputStream.getFormat();
			int size = (int) (af.getFrameSize() * audioInputStream.getFrameLength());
			byte[] audio = new byte[size];
			DataLine.Info info = new DataLine.Info(Clip.class, af, size);
			audioInputStream.read(audio, 0, size);

			Clip clip = (Clip) AudioSystem.getLine(info);
			clip.open(af, audio, 0, size);
			clip.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
}

}