package gui;

import java.io.IOException;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class TresPontosColinearesController {
	private static Integer Constante = 1;

	private String X = "X";

	private String Y = "Y";

	@FXML
	private Button BtCalcular;

	@FXML
	private TextField Coordenada1DoPontoA;
	@FXML
	private TextField Coordenada2DoPontoA;
	@FXML
	private TextField Coordenada1DoPontoB;
	@FXML
	private TextField Coordenada2DoPontoB;
	@FXML
	private TextField Coordenada1DoPontoC;
	@FXML
	private TextField Coordenada2DoPontoC;

//	public void verficacao() {
//
//		if (Coordenada1DoPontoA.equals(X)) {
//			Integer CoordenadaYDoPontoA = Integer.parseInt(Coordenada2DoPontoA.getText());
//			Integer CoordenadaXDoPontoB = Integer.parseInt(Coordenada1DoPontoB.getText());
//			Integer CoordenadaYDoPontoB = Integer.parseInt(Coordenada2DoPontoB.getText());
//			Integer CoordenadaXDoPontoC = Integer.parseInt(Coordenada1DoPontoC.getText());
//			Integer CoordenadaYDoPontoC = Integer.parseInt(Coordenada2DoPontoC.getText());
//
//			Integer Multi1 = CoordenadaYDoPontoB * Constante + "x";
//			Integer Multi2 = CoordenadaYDoPontoA * Constante * CoordenadaXDoPontoC;
//			Integer Multi3 = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoC;
//
//			Integer Multi1N = CoordenadaXDoPontoC * CoordenadaYDoPontoB * Constante;
//			Integer Multi2N = CoordenadaYDoPontoC * Constante * Coordenada1DoPontoA;
//			Integer Multi3N = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoA;
//		}
//		if (Coordenada2DoPontoA.equals(Y)) {
//			Integer CoordenadaXDoPontoA = Integer.parseInt(Coordenada1DoPontoA.getText());
//			Integer CoordenadaXDoPontoB = Integer.parseInt(Coordenada1DoPontoB.getText());
//			Integer CoordenadaYDoPontoB = Integer.parseInt(Coordenada2DoPontoB.getText());
//			Integer CoordenadaXDoPontoC = Integer.parseInt(Coordenada1DoPontoC.getText());
//			Integer CoordenadaYDoPontoC = Integer.parseInt(Coordenada2DoPontoC.getText());
//
//			Integer Multi1 = CoordenadaXDoPontoA * CoordenadaYDoPontoB * Constante;
//			Integer Multi2 = Coordenada2DoPontoA * Constante * CoordenadaXDoPontoC;
//			Integer Multi3 = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoC;
//
//			Integer Multi1N = CoordenadaXDoPontoC * CoordenadaYDoPontoB * Constante;
//			Integer Multi2N = CoordenadaYDoPontoC * Constante * CoordenadaXDoPontoA;
//			Integer Multi3N = Constante * CoordenadaXDoPontoB * Coordenada2DoPontoA;
//		}
//
//	}
	@FXML
	public void onBtCalcularAction() {
		Integer CoordenadaXDoPontoA = Integer.parseInt(Coordenada1DoPontoA.getText());
		Integer CoordenadaYDoPontoA = Integer.parseInt(Coordenada2DoPontoA.getText());
		Integer CoordenadaXDoPontoB = Integer.parseInt(Coordenada1DoPontoB.getText());
		Integer CoordenadaYDoPontoB = Integer.parseInt(Coordenada2DoPontoB.getText());
		Integer CoordenadaXDoPontoC = Integer.parseInt(Coordenada1DoPontoC.getText());
		Integer CoordenadaYDoPontoC = Integer.parseInt(Coordenada2DoPontoC.getText());

		Integer Multi1 = CoordenadaXDoPontoA * CoordenadaYDoPontoB * Constante;
		Integer Multi2 = CoordenadaYDoPontoA * Constante * CoordenadaXDoPontoC;
		Integer Multi3 = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoC;

		Integer Multi1N = CoordenadaXDoPontoC * CoordenadaYDoPontoB * Constante;
		Integer Multi2N = CoordenadaYDoPontoC * Constante * CoordenadaXDoPontoA;
		Integer Multi3N = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoA;

		Integer Sum1 = Multi1 + Multi2 + Multi3;
		Integer Sum2 = Multi1N + Multi2N + Multi3N;

		System.out.println(Sum1 + " " + Sum2);

		loadView("/gui/RespTresPontosColineares.fxml", x -> {
		});

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

	public void ResolucaoDosTresPontos() {
		
	}
}
