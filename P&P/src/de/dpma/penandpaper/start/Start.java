//package de.dpma.penandpaper.start;
//
//import java.util.InputMismatchException;
//import java.util.Locale;
//import java.util.Random;
//import java.util.ResourceBundle;
//import java.util.Scanner;
//
//import de.dpma.penandpaper.util.*;
//
//public class Start {
//
//	public static void main(String[] args) {
//
//		
////		Sound.playSound("resource/backround.wav");
//		Language.local =Locale.forLanguageTag("de");
//		Locale locale = Locale.forLanguageTag(setLang());
//		Language.local=locale;
//		CreateChar c = new CreateChar();
//		LevelManager l = new LevelManager(c.getChar());
//
//	}
//
//	public static String setLang() {
//		Scanner s = new Scanner(System.in);
//		int lang;
//		try {
//
//			System.out.println(Language.getString("SelectLanguage"));
//			lang = s.nextInt();
//
//		} catch (InputMismatchException e) {
//
//			return setLang();
//		}
//		if (lang == 1 || lang == 2) {
//
//			switch (lang) {
//			case 1:
//
//				return "de";
//
//				//Freischalten wenn ansatzweise übersetzt
////			case 2:
//
////				return "en";
//
//			}
//
//		}
//		return setLang();
//
//	}
//
//	
//	
//}
