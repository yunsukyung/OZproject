package com.kh.project.view;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {

	static AudioInputStream stream;
	static Clip clip;
	static File file;
	
	public MusicPlayer(String str) {
		if(clip != null) {
			clip.close();
		}
		file = new File(str);
		try {
			stream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	public static void MusicStart(String str) {
		if(clip != null) {
			clip.close();
		}
		file = new File(str);
		try {
			stream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}


	
}
