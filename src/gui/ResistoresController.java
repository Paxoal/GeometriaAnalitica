package gui;

import java.io.IOException;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

public class ResistoresController {
	
	@FXML
	public void onMenuItemRolaAction() {
		loadView("/gui/Rola.fxml", x -> {});
	}
	
	@FXML
	public void onMenuItemUriAction() {
		loadView2("/gui/Uri.fxml", x -> {});
	}
	
	@FXML
	public void onMenuResistoresEmParaleloAction() {
		loadView3("/gui/ResistoresEmParalelo.fxml", x -> {});
	}
	
	@FXML
	public void  onMenuResistoresEmSerieAction() {
		loadView4("/gui/ResistoresEmSerie.fxml", x -> {});
	}
	
	
	private synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAcition) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();

			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
			T controller = loader.getController();
			initializingAcition.accept(controller);
			
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}
	
	private synchronized <T> void loadView2(String absoluteName, Consumer<T> initializingAcition) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox2 = loader.load();

			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox2.getChildren());
			
			T controller = loader.getController();
			initializingAcition.accept(controller);
			
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading viewab", e.getMessage(), AlertType.ERROR);
		}
	}
	
	private synchronized <T> void loadView3(String absoluteName, Consumer<T> initializingAcition) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox3 = loader.load();

			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox3.getChildren());
			
			T controller = loader.getController();
			initializingAcition.accept(controller);
			
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading viewab", e.getMessage(), AlertType.ERROR);
		}
	}	
	
	private synchronized <T> void loadView4(String absoluteName, Consumer<T> initializingAcition) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox4 = loader.load();

			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox4.getChildren());
			
			T controller = loader.getController();
			initializingAcition.accept(controller);
			
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading viewab", e.getMessage(), AlertType.ERROR);
		}
	}	
}
