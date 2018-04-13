package de.dpma.penandpaper.view;

import java.util.Locale;

import com.sun.beans.introspect.PropertyInfo.Name;

import de.dpma.penandpaper.MainApp;
import de.dpma.penandpaper.models.PlayableChar;
import de.dpma.penandpaper.models.pc.mage.Geomancer;
import de.dpma.penandpaper.models.pc.mage.Necromancer;
import de.dpma.penandpaper.models.pc.mage.Pyromancer;
import de.dpma.penandpaper.models.pc.rogue.Assasin;
import de.dpma.penandpaper.models.pc.rogue.Ranger;
import de.dpma.penandpaper.models.pc.rogue.Thief;
import de.dpma.penandpaper.models.pc.warrior.Berserker;
import de.dpma.penandpaper.models.pc.warrior.Brute;
import de.dpma.penandpaper.models.pc.warrior.Fighter;
import de.dpma.penandpaper.start.LevelManager;
import de.dpma.penandpaper.util.Language;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CreateCharacterController {

	public static MainApp mainApp;

	@FXML
	Label text;

	@FXML
	Button b1;

	@FXML
	Button b2;

	@FXML
	Button b3;

	@FXML
	TextField textField;

	int raceNum = 0;

	@FXML
	private void initialize() {
		text.setText(Language.getString("Welcome"));
		b1.setText(Language.getString("Human"));
		b2.setText(Language.getString("Orc"));
		b3.setText(Language.getString("Elf"));

		b1.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				human();
			}
		});
		b2.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				orc();
			}
		});
		b3.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				elf();
			}
		});
	}

	public static void setMainApp(MainApp mainApp) {
		CreateCharacterController.mainApp = mainApp;
	}

	// Knöpfe ändern
	private void human() {
		raceNum = 1;
		text.setText(Language.getString("ChooseRaceQuestion"));
		b1.setText(Language.getString("Warrior"));
		b2.setText(Language.getString("Rogue"));
		b3.setText(Language.getString("Mage"));
		b1.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				warrior();
			}
		});
		b2.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				rogue();
			}
		});
		b3.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				mage();
			}
		});
	}

	private void orc() {
		raceNum = 2;
		text.setText(Language.getString("ChooseRaceQuestion"));
		b1.setText(Language.getString("Warrior"));
		b2.setText(Language.getString("Rogue"));
		b3.setText(Language.getString("Mage"));
		b1.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				warrior();
			}
		});
		b2.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				rogue();
			}
		});
		b3.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				mage();
			}
		});
	}

	private void elf() {
		raceNum = 3;
		text.setText(Language.getString("ChooseRaceQuestion"));
		b1.setText(Language.getString("Warrior"));
		b2.setText(Language.getString("Rogue"));
		b3.setText(Language.getString("Mage"));
		b1.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				warrior();
			}
		});
		b2.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				rogue();
			}
		});
		b3.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				mage();
			}
		});
	}

	private void warrior() {

		text.setText(Language.getString("ChooseSpecWarrior") + Language.getString("ChooseSpecialisation"));
		b1.setText(Language.getString("Fighter"));
		b2.setText(Language.getString("Brute"));
		b3.setText(Language.getString("Berserker"));
		b1.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				fighter();
			}
		});
		b2.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				brute();
			}
		});
		b3.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				berserker();
			}
		});
	}

	private void rogue() {

		text.setText(Language.getString("ChooseSpecRogue") + Language.getString("ChooseSpecialisation"));
		b1.setText(Language.getString("Thief"));
		b2.setText(Language.getString("Assasin"));
		b3.setText(Language.getString("Ranger"));
		b1.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				LevelManager l = new LevelManager(new Thief(raceNum));
			}
		});
		b2.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				LevelManager l = new LevelManager(new Assasin(raceNum));
			}
		});
		b3.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				LevelManager l = new LevelManager(new Ranger(raceNum));
			}
		});
	}

	private void mage() {

		text.setText(Language.getString("ChooseSpecMage") + Language.getString("ChooseSpecialisation"));
		b1.setText(Language.getString("Geomancer"));
		b2.setText(Language.getString("Pyromancer"));
		b3.setText(Language.getString("Necromancer"));
		b1.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				LevelManager l = new LevelManager(new Geomancer(raceNum));
			}
		});
		b2.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				LevelManager l = new LevelManager(new Pyromancer(raceNum));
			}
		});
		b3.setOnAction(new EventHandler() {
			@Override
			public void handle(Event arg0) {
				LevelManager l = new LevelManager(new Necromancer(raceNum));
			}
		});
	}

	private void fighter() {
		
		mainApp.loadScene("view/CreateCharacterName", "Choose Character Name...");
		
	}

	private void brute() {
	}

	private void berserker() {
	}

}
