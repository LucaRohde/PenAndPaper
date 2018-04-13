package de.dpma.penandpaper.view;

import de.dpma.penandpaper.MainApp;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainMenuController {

	public static MainApp mainApp;
st
	@FXML
	private void initialize() {

	}

	@FXML
	private void start() {
		
		mainApp.loadScene("view/SetLanguage.fxml", "SelectLanguage");

	}

	@FXML
	private void exit() {
		System.exit(0);

	}

	public static void setMainApp(MainApp mainApp) {
		MainMenuController.mainApp = mainApp;

	}

}
