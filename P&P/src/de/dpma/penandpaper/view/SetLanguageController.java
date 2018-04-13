package de.dpma.penandpaper.view;

import java.util.Locale;

import de.dpma.penandpaper.MainApp;
import de.dpma.penandpaper.util.Language;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class SetLanguageController {

	public static MainApp mainApp;

	@FXML
	private void initialize() {
		selectLang.setText(Language.getString("SelectLanguage"));
		
	}

	@FXML
	Label selectLang;

	@FXML
	private void german() {
		Language.local=Locale.forLanguageTag("de");
		mainApp.loadScene("view/CreateCharacterProfession.fxml", "CharacterCreation");
		
	}

	@FXML
	private void english() {
		Language.local=Locale.forLanguageTag("en");
		
		mainApp.loadScene("view/CreateCharacterProfession.fxml", "CharacterCreation");
	}

	public static void setMainApp(MainApp mainApp) {
		SetLanguageController.mainApp = mainApp;

	}

}
