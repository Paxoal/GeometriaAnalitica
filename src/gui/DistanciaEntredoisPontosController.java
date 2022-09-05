package gui;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DistanciaEntredoisPontosController {

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

		Double Coordx = CoordenadaXDoPontoA > CoordenadaXDoPontoB ? CoordenadaXDoPontoA - CoordenadaXDoPontoB
				: CoordenadaXDoPontoB - CoordenadaXDoPontoA;
		Double Coordy = CoordenadaYDoPontoA > CoordenadaYDoPontoB ? CoordenadaYDoPontoA - CoordenadaYDoPontoB
				: CoordenadaYDoPontoB - CoordenadaYDoPontoA;

		Double MultCoordx = Coordx * Coordx;
		Double MultCoordy = Coordy * Coordy;

		Double SumCoord = MultCoordx + MultCoordy;

		String Hip1 = "Primeiro vamos montar a formula \n";
		Hip1 += "D = √( " + CoordenadaXDoPontoA + " - " + CoordenadaXDoPontoB + " )² + ( " + CoordenadaYDoPontoA + " - "
				+ CoordenadaYDoPontoB + " )² \n";
		Hip1 += "D = √( " + Coordx + "² + " + Coordy + "² )" + "\n";
		Hip1 += "D = √( " + MultCoordx + " + " + MultCoordy + " ) \n";
		Hip1 += "D = √(" + SumCoord + " ) \n";
		Hip1 += " \n";

		Hip1 += "Agora basta fazer a raiz quadrada \n";

		JOptionPane.showMessageDialog(null, Hip1);
	}

}
