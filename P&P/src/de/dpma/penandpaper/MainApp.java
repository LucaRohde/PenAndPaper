package de.dpma.penandpaper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import de.dpma.penandpaper.start.CreateChar;
import de.dpma.penandpaper.start.LevelManager;
import de.dpma.penandpaper.util.Language;
import de.dpma.penandpaper.view.CreateCharacterController;
import de.dpma.penandpaper.view.MainMenuController;
import de.dpma.penandpaper.view.SetLanguageController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainApp extends Application {
	private Stage primaryStage;
	private Scene scene;

	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;

		loadScene("view/MainMenu.fxml", "Login");
		controllerUpdate();
		 Language.local =Locale.forLanguageTag("de");

	}

	public static void main(String[] args) {
		launch(args);

	}

	public void loadScene(String path, String title) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource(path));

			AnchorPane anchor = (AnchorPane) loader.load();
			scene = new Scene(anchor);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void controllerUpdate() {

		MainMenuController.setMainApp(this);
		SetLanguageController.setMainApp(this);
		CreateCharacterController.setMainApp(this);
	}

	public Stage getPrimaryStage() {

		return primaryStage;

	}

}
