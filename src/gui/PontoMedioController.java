package gui;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PontoMedioController {

	@FXML
	private TextField Coordenada1DoPontoA;
	@FXML
	private TextField Coordenada2DoPontoA;
	@FXML
	private TextField Coordenada1DoPontoB;
	@FXML
	private TextField Coordenada2DoPontoB;

	public void onBtCalcularAction() {
		Double CoordenadaXDoPontoA = Double.parseDouble(Coordenada1DoPontoA.getText());
		Double CoordenadaYDoPontoA = Double.parseDouble(Coordenada2DoPontoA.getText());
		Double CoordenadaXDoPontoB = Double.parseDouble(Coordenada1DoPontoB.getText());
		Double CoordenadaYDoPontoB = Double.parseDouble(Coordenada2DoPontoB.getText());

		Double SumX = CoordenadaXDoPontoA + CoordenadaXDoPontoB;
		Double SumY = CoordenadaYDoPontoA + CoordenadaYDoPontoB;
		Double DivX = SumX / 2;
		Double DivY = SumY / 2;

		String cof = "Primeiro vamos montar a formula \n";
		cof += "Mab = (" + CoordenadaXDoPontoA + " + " + CoordenadaXDoPontoB + ") / 2," + " ( " + CoordenadaYDoPontoA + " + " + CoordenadaYDoPontoB + " ) / 2 \n";
		cof += "Mab = " + SumX + " / 2 , " + SumY + "/ 2 \n";
		cof += "Mab = " + DivX + " , " + DivY;
	
		JOptionPane.showMessageDialog(null, cof);
	}

}
