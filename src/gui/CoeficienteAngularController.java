package gui;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CoeficienteAngularController {

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

		Double SumX = CoordenadaXDoPontoA - CoordenadaXDoPontoB;
		Double SumY = CoordenadaYDoPontoA - CoordenadaYDoPontoB;
		Double Div = SumY / SumX;

		String cof = "Primeiro vamos montar a formula \n";
		cof += "M = (" + CoordenadaYDoPontoA + " - " + CoordenadaYDoPontoB + ") /" + " ( " + CoordenadaXDoPontoA + " - " + CoordenadaXDoPontoB + " ) \n";
		cof += "M = " + SumY + " / " + SumX + "\n";
		cof += "M = " + Div;
	
		JOptionPane.showMessageDialog(null, cof);
	}

}
