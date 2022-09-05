package gui;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TresPontosColinearesController {
	private static Double Constante = 1.0;

	// private String result;

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

	@FXML
	public void onBtCalcularAction() {
		if ("X".equals(Coordenada1DoPontoA.getText()) && "Y".equals(Coordenada2DoPontoA.getText())) {

			String CoordenadaXDoPontoA = String.valueOf(Coordenada1DoPontoA.getText());
			String CoordenadaYDoPontoA = String.valueOf(Coordenada2DoPontoA.getText());
			Double CoordenadaXDoPontoB = Double.parseDouble(Coordenada1DoPontoB.getText());
			Double CoordenadaYDoPontoB = Double.parseDouble(Coordenada2DoPontoB.getText());
			Double CoordenadaXDoPontoC = Double.parseDouble(Coordenada1DoPontoC.getText());
			Double CoordenadaYDoPontoC = Double.parseDouble(Coordenada2DoPontoC.getText());

			Double Multi1 = CoordenadaYDoPontoB * Constante;
			Double Multi2 = Constante * CoordenadaXDoPontoC;
			Double Multi3 = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoC;

			Double Multi1N = CoordenadaXDoPontoC * CoordenadaYDoPontoB * Constante;
			Double Multi2N = CoordenadaYDoPontoC * Constante;
			Double Multi3N = Constante * CoordenadaXDoPontoB;

			Double Sum = Multi3 + Multi1N;
			Double SumX = Multi1 + Multi2N;
			Double SumY = Multi2 + Multi3N;

			String Matriz = "Aqui esta a Matriz \n";
			Matriz += "| " + CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + " " + Constante + " | "
					+ CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + "\n";
			Matriz += "| " + CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + " " + Constante + " | "
					+ CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + "\n";
			Matriz += "| " + CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + " " + Constante + " | "
					+ CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + "\n";
			Matriz += " \n";

			Matriz += "Agora vamos fazer a multiplicação cruzada para resolvermos a matriz \n";

			Matriz += "Vamos começar resolvendo a diagonal principal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoA + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + Multi1 + "x \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoA + " * " + Constante + " * "
					+ CoordenadaXDoPontoC + " = " + Multi2 + "y \n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoC + " = " + Multi3 + "\n";
			Matriz += "Diagonal principal = " + Multi1 + "x  " + Multi2 + "y  " + Multi3 + " \n";
			Matriz += " \n";

			Matriz += "Vamos resolver a diagonal secundária, lembre-se de inverter o sinal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoC + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + -(Multi1N) + "\n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoC + " * " + Constante + " * "
					+ CoordenadaXDoPontoA + " = " + -(Multi2N) + "x \n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + -(Multi3N) + "y \n";
			Matriz += "Diagonal secundária = " + Multi1N + "x  " + Multi2N + "y  " + Multi3N + " \n";
			Matriz += " \n";

			Matriz += "Agora vamos somar os iguais \n";
			Matriz += Multi1 + "x  " + Multi2 + "y  " + Multi3 + "  " + -(Multi1N) + "x  " + -(Multi2N) + "y  "
					+ -(Multi3N) + " = 0 \n";
			Matriz += "Valor da equação geral da reta = " + SumX + "x  " + SumY + "y  " + Sum + " = 0";

			JOptionPane.showMessageDialog(null, Matriz);
		}

		if ("X".equals(Coordenada1DoPontoA.getText())) {

			String CoordenadaXDoPontoA = String.valueOf(Coordenada1DoPontoA.getText());
			Double CoordenadaYDoPontoA = Double.parseDouble(Coordenada2DoPontoA.getText());
			Double CoordenadaXDoPontoB = Double.parseDouble(Coordenada1DoPontoB.getText());
			Double CoordenadaYDoPontoB = Double.parseDouble(Coordenada2DoPontoB.getText());
			Double CoordenadaXDoPontoC = Double.parseDouble(Coordenada1DoPontoC.getText());
			Double CoordenadaYDoPontoC = Double.parseDouble(Coordenada2DoPontoC.getText());

			Double Multi1 = CoordenadaYDoPontoB * Constante;
			Double Multi2 = CoordenadaYDoPontoA * Constante * CoordenadaXDoPontoC;
			Double Multi3 = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoC;

			Double Multi1N = CoordenadaXDoPontoC * CoordenadaYDoPontoB * Constante;
			Double Multi2N = CoordenadaYDoPontoC * Constante;
			Double Multi3N = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoA;

			Double Sum1 = Multi2 + Multi3;
			Double Sum2 = Multi1N + Multi3N;

			Double result = Sum1 + -(Sum2);
			Double result2 = Multi1 + -(Multi2N);
			Double result3 = result / result2;

			String Matriz = "Aqui esta a Matriz \n";
			Matriz += "| " + CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + " " + Constante + " | "
					+ CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + "\n";
			Matriz += "| " + CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + " " + Constante + " | "
					+ CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + "\n";
			Matriz += "| " + CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + " " + Constante + " | "
					+ CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + "\n";
			Matriz += " \n";

			Matriz += "Agora vamos fazer a multiplicação cruzada para resolvermos a matriz \n";

			Matriz += "Vamos começar resolvendo a diagonal principal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoA + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + Multi1 + "x \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoA + " * " + Constante + " * "
					+ CoordenadaXDoPontoC + " = " + Multi2 + "\n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoC + " = " + Multi3 + "\n";
			Matriz += "Diagonal principal = " + Sum1 + "  " + Multi1 + "x \n";
			Matriz += " \n";

			Matriz += "Vamos resolver a diagonal secundária, lembre-se de inverter o sinal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoC + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + -(Multi1N) + "\n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoC + " * " + Constante + " * "
					+ CoordenadaXDoPontoA + " = " + -(Multi2N) + "x \n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + -(Multi3N) + "\n";
			Matriz += "Diagonal secundária = " + -(Sum2) + " " + -(Multi2N) + "x \n";
			Matriz += " \n";

			Matriz += "Agora vamos somar os iguais \n";
			Matriz += Multi1 + "x  " + Multi2 + "  " + Multi3 + "  " + -(Multi1N) + "  " + -(Multi2N) + "x  "
					+ -(Multi3N) + " = 0 \n";
			Matriz += Sum1 + "  " + -(Sum2) + "  " + result2 + "x = 0 \n";
			Matriz += result + " = " + result2 + "x = 0 \n";
			Matriz += result + " / " + -(result2) + " = x" + "\n";
			Matriz += "X = " + -(result3);

			JOptionPane.showMessageDialog(null, Matriz);
		}

		if ("Y".equals(Coordenada2DoPontoA.getText())) {

			Double CoordenadaXDoPontoA = Double.parseDouble(Coordenada1DoPontoA.getText());
			String CoordenadaYDoPontoA = String.valueOf(Coordenada2DoPontoA.getText());
			Double CoordenadaXDoPontoB = Double.parseDouble(Coordenada1DoPontoB.getText());
			Double CoordenadaYDoPontoB = Double.parseDouble(Coordenada2DoPontoB.getText());
			Double CoordenadaXDoPontoC = Double.parseDouble(Coordenada1DoPontoC.getText());
			Double CoordenadaYDoPontoC = Double.parseDouble(Coordenada2DoPontoC.getText());

			Double Multi1 = CoordenadaXDoPontoA * CoordenadaYDoPontoB * Constante;
			Double Multi2 = Constante * CoordenadaXDoPontoC;
			Double Multi3 = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoC;

			Double Multi1N = CoordenadaXDoPontoC * CoordenadaYDoPontoB * Constante;
			Double Multi2N = CoordenadaYDoPontoC * Constante * CoordenadaXDoPontoA;
			Double Multi3N = Constante * CoordenadaXDoPontoB;

			Double Sum1 = Multi2 + Multi3;
			Double Sum2 = Multi1N + Multi3N;

			Double result = Sum1 + -(Sum2);
			Double result2 = Multi1 + -(Multi2N);
			Double result3 = result / result2;

			if (result == 0) {
				result3 = result2;
			}

			String Matriz = "Aqui esta a Matriz \n";
			Matriz += "| " + CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + " " + Constante + " | "
					+ CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + "\n";
			Matriz += "| " + CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + " " + Constante + " | "
					+ CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + "\n";
			Matriz += "| " + CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + " " + Constante + " | "
					+ CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + "\n";
			Matriz += " \n";

			Matriz += "Agora vamos fazer a multiplicação cruzada para resolvermos a matriz \n";

			Matriz += "Vamos começar resolvendo a diagonal principal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoA + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + Multi1 + "y \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoA + " * " + Constante + " * "
					+ CoordenadaXDoPontoC + " = " + Multi2 + "\n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoC + " = " + Multi3 + "\n";
			Matriz += "Diagonal principal = " + Sum1 + "  " + Multi1 + "y \n";
			Matriz += " \n";

			Matriz += "Vamos resolver a diagonal secundária, lembre-se de inverter o sinal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoC + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + -(Multi1N) + "\n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoC + " * " + Constante + " * "
					+ CoordenadaXDoPontoA + " = " + -(Multi2N) + "y \n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + -(Multi3N) + "\n";
			Matriz += "Diagonal secundária = " + -(Sum2) + " " + -(Multi2N) + "y \n";
			Matriz += " \n";

			Matriz += "Agora vamos somar os iguais \n";
			Matriz += Multi1 + "y  " + Multi2 + "  " + Multi3 + "  " + -(Multi1N) + "  " + -(Multi2N) + "y  "
					+ -(Multi3N) + " = 0 \n";
			Matriz += Sum1 + "  " + -(Sum2) + "  " + result2 + "y = 0\n";
			Matriz += result + " = " + result2 + "y \n";
			Matriz += result + " / " + -(result2) + " = " + "y \n";
			Matriz += "Y = " + -(result3);

			JOptionPane.showMessageDialog(null, Matriz);
		}

		if ("X".equals(Coordenada1DoPontoB.getText()) && "Y".equals(Coordenada2DoPontoB.getText())) {

			Double CoordenadaXDoPontoA = Double.parseDouble(Coordenada1DoPontoA.getText());
			Double CoordenadaYDoPontoA = Double.parseDouble(Coordenada2DoPontoA.getText());
			String CoordenadaXDoPontoB = String.valueOf(Coordenada1DoPontoB.getText());
			String CoordenadaYDoPontoB = String.valueOf(Coordenada2DoPontoB.getText());
			Double CoordenadaXDoPontoC = Double.parseDouble(Coordenada1DoPontoC.getText());
			Double CoordenadaYDoPontoC = Double.parseDouble(Coordenada2DoPontoC.getText());

			Double Multi1 = CoordenadaXDoPontoA * Constante;
			Double Multi2 = CoordenadaYDoPontoA * Constante * CoordenadaXDoPontoC;
			Double Multi3 = Constante * CoordenadaYDoPontoC;

			Double Multi1N = CoordenadaXDoPontoC * Constante;
			Double Multi2N = CoordenadaYDoPontoC * Constante * CoordenadaXDoPontoA;
			Double Multi3N = Constante * CoordenadaYDoPontoA;

			String Matriz = "Aqui esta a Matriz \n";
			Matriz += "| " + CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + " " + Constante + " | "
					+ CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + "\n";
			Matriz += "| " + CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + " " + Constante + " | "
					+ CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + "\n";
			Matriz += "| " + CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + " " + Constante + " | "
					+ CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + "\n";
			Matriz += " \n";

			Matriz += "Agora vamos fazer a multiplicação cruzada para resolvermos a matriz \n";

			Matriz += "Vamos começar resolvendo a diagonal principal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoA + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + Multi1 + "y \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoA + " * " + Constante + " * "
					+ CoordenadaXDoPontoC + " = " + Multi2 + " \n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoC + " = " + Multi3 + "x \n";
			Matriz += "Diagonal principal = " + Multi1 + "y  " + Multi2 + "  " + Multi3 + "x \n";
			Matriz += " \n";

			Matriz += "Vamos resolver a diagonal secundária, lembre-se de inverter o sinal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoC + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + -(Multi1N) + "y \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoC + " * " + Constante + " * "
					+ CoordenadaXDoPontoA + " = " + -(Multi2N) + " \n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + -(Multi3N) + "x \n";
			Matriz += "Diagonal secundária = " + -(Multi1N) + "y  " + -(Multi2N) + "  " + -(Multi3N) + "x \n";
			Matriz += " \n";

			Double Sum = Multi2 + -(Multi2N);
			Double SumX = Multi3 + -(Multi3N);
			Double SumY = Multi1 + -(Multi1N);

			Matriz += "Agora vamos somar os iguais \n";
			Matriz += Multi1 + "y  " + Multi2 + "  " + Multi3 + "x  " + -(Multi1N) + "y  " + -(Multi2N) + "  "
					+ -(Multi3N) + "x = 0 \n";
			Matriz += " \n";
			Matriz += "Valor da equação geral da reta = " + SumX + "x  " + SumY + "y  " + Sum + " = 0";

			JOptionPane.showMessageDialog(null, Matriz);
		}

		if ("X".equals(Coordenada1DoPontoB.getText())) {

			Double CoordenadaXDoPontoA = Double.parseDouble(Coordenada1DoPontoA.getText());
			Double CoordenadaYDoPontoA = Double.parseDouble(Coordenada2DoPontoA.getText());
			String CoordenadaXDoPontoB = String.valueOf(Coordenada1DoPontoB.getText());
			Double CoordenadaYDoPontoB = Double.parseDouble(Coordenada2DoPontoB.getText());
			Double CoordenadaXDoPontoC = Double.parseDouble(Coordenada1DoPontoC.getText());
			Double CoordenadaYDoPontoC = Double.parseDouble(Coordenada2DoPontoC.getText());

			Double Multi1 = CoordenadaXDoPontoA * CoordenadaYDoPontoB * Constante;
			Double Multi2 = CoordenadaYDoPontoA * Constante * CoordenadaXDoPontoC;
			Double Multi3 = Constante * CoordenadaYDoPontoC;

			Double Multi1N = CoordenadaXDoPontoC * CoordenadaYDoPontoB * Constante;
			Double Multi2N = CoordenadaYDoPontoC * Constante * CoordenadaXDoPontoA;
			Double Multi3N = Constante * CoordenadaYDoPontoA;

			Double Sum1 = Multi1 + Multi2;
			Double Sum2 = Multi1N + Multi2N;

			Double result = Sum1 + -(Sum2);
			Double result2 = Multi3 + -(Multi3N);
			Double result3 = result / result2;

			String Matriz = "Aqui esta a Matriz \n";
			Matriz += "| " + CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + " " + Constante + " | "
					+ CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + "\n";
			Matriz += "| " + CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + " " + Constante + " | "
					+ CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + "\n";
			Matriz += "| " + CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + " " + Constante + " | "
					+ CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + "\n";
			Matriz += " \n";

			Matriz += "Agora vamos fazer a multiplicação cruzada para resolvermos a matriz \n";

			Matriz += "Vamos começar resolvendo a diagonal principal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoA + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + Multi1 + "\n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoA + " * " + Constante + " * "
					+ CoordenadaXDoPontoC + " = " + Multi2 + "\n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + Multi3 + "x \n";
			Matriz += "Diagonal principal = " + Sum1 + "  " + Multi3 + "x \n";
			Matriz += " \n";

			Matriz += "Vamos resolver a diagonal secundária, lembre-se de inverter o sinal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoC + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + -(Multi1N) + "\n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoC + " * " + Constante + " * "
					+ CoordenadaXDoPontoA + " = " + -(Multi2N) + " \n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + -(Multi3N) + "x \n";
			Matriz += "Diagonal secundária = " + -(Sum2) + " " + -(Multi3N) + "x \n";
			Matriz += " \n";

			Matriz += "Agora vamos somar os iguais \n";
			Matriz += Multi1 + "  " + Multi2 + "  " + Multi3 + "x  " + -(Multi1N) + "  " + -(Multi2N) + "  "
					+ -(Multi3N) + "x = 0 \n";
			Matriz += Sum1 + "  " + -(Sum2) + "  " + result2 + "x = 0 \n";
			Matriz += result + " " + result2 + "x = 0 \n";
			Matriz += result2 + "x " + " = " + result + "\n";
			Matriz += "x = " + result + " / " + -(result2) + "\n";
			Matriz += "X = " + -(result3);

			JOptionPane.showMessageDialog(null, Matriz);
		}

		if ("Y".equals(Coordenada2DoPontoB.getText())) {

			Double CoordenadaXDoPontoA = Double.parseDouble(Coordenada1DoPontoA.getText());
			Double CoordenadaYDoPontoA = Double.parseDouble(Coordenada2DoPontoA.getText());
			Double CoordenadaXDoPontoB = Double.parseDouble(Coordenada1DoPontoB.getText());
			String CoordenadaYDoPontoB = String.valueOf(Coordenada2DoPontoB.getText());
			Double CoordenadaXDoPontoC = Double.parseDouble(Coordenada1DoPontoC.getText());
			Double CoordenadaYDoPontoC = Double.parseDouble(Coordenada2DoPontoC.getText());

			Double Multi1 = CoordenadaXDoPontoA * Constante;
			Double Multi2 = CoordenadaYDoPontoA * Constante * CoordenadaXDoPontoC;
			Double Multi3 = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoC;

			Double Multi1N = CoordenadaXDoPontoC * Constante;
			Double Multi2N = CoordenadaYDoPontoC * Constante * CoordenadaXDoPontoA;
			Double Multi3N = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoA;

			Double Sum1 = Multi2 + Multi3;
			Double Sum2 = Multi2N + Multi3N;

			Double result = Sum1 + -(Sum2);
			Double result2 = Multi1 + -(Multi1N);
			Double result3 = result / result2;

			if (result == 0) {
				result3 = result2;
			}

			String Matriz = "Aqui esta a Matriz \n";
			Matriz += "| " + CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + " " + Constante + " | "
					+ CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + "\n";
			Matriz += "| " + CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + " " + Constante + " | "
					+ CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + "\n";
			Matriz += "| " + CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + " " + Constante + " | "
					+ CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + "\n";
			Matriz += " \n";

			Matriz += "Agora vamos fazer a multiplicação cruzada para resolvermos a matriz \n";

			Matriz += "Vamos começar resolvendo a diagonal principal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoA + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + Multi1 + "y \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoA + " * " + Constante + " * "
					+ CoordenadaXDoPontoC + " = " + Multi2 + "\n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoC + " = " + Multi3 + "\n";
			Matriz += "Diagonal principal = " + Sum1 + "  " + Multi1 + "y \n";
			Matriz += " \n";

			Matriz += "Vamos resolver a diagonal secundária, lembre-se de inverter o sinal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoC + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + -(Multi1N) + "y \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoC + " * " + Constante + " * "
					+ CoordenadaXDoPontoA + " = " + -(Multi2N) + "\n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + -(Multi3N) + "\n";
			Matriz += "Diagonal secundária = " + -(Sum2) + " " + -(Multi1N) + "y \n";
			Matriz += " \n";

			Matriz += "Agora vamos somar os iguais \n";
			Matriz += Multi1 + "y  " + Multi2 + "  " + Multi3 + "  " + -(Multi1N) + "y  " + -(Multi2N) + "  "
					+ -(Multi3N) + " = 0 \n";
			Matriz += Sum1 + "  " + -(Sum2) + "  " + result2 + "y = 0\n";
			Matriz += result + " = " + result2 + "y \n";
			Matriz += result + " / " + -(result2) + " = " + "y \n";
			Matriz += "Y = " + -(result3);

			JOptionPane.showMessageDialog(null, Matriz);
		}

		if ("X".equals(Coordenada1DoPontoC.getText()) && "Y".equals(Coordenada2DoPontoC.getText())) {

			Double CoordenadaXDoPontoA = Double.parseDouble(Coordenada1DoPontoA.getText());
			Double CoordenadaYDoPontoA = Double.parseDouble(Coordenada2DoPontoA.getText());
			Double CoordenadaXDoPontoB = Double.parseDouble(Coordenada1DoPontoB.getText());
			Double CoordenadaYDoPontoB = Double.parseDouble(Coordenada2DoPontoB.getText());
			String CoordenadaXDoPontoC = String.valueOf(Coordenada1DoPontoC.getText());
			String CoordenadaYDoPontoC = String.valueOf(Coordenada2DoPontoC.getText());

			Double Multi1 = CoordenadaXDoPontoA * CoordenadaYDoPontoB * Constante;
			Double Multi2 = CoordenadaYDoPontoA * Constante;
			Double Multi3 = Constante * CoordenadaXDoPontoB;

			Double Multi1N = CoordenadaYDoPontoB * Constante;
			Double Multi2N = Constante * CoordenadaXDoPontoA;
			Double Multi3N = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoA;

			String Matriz = "Aqui esta a Matriz \n";
			Matriz += "| " + CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + " " + Constante + " | "
					+ CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + "\n";
			Matriz += "| " + CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + " " + Constante + " | "
					+ CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + "\n";
			Matriz += "| " + CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + " " + Constante + " | "
					+ CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + "\n";
			Matriz += " \n";

			Matriz += "Agora vamos fazer a multiplicação cruzada para resolvermos a matriz \n";

			Matriz += "Vamos começar resolvendo a diagonal principal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoA + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + Multi1 + " \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoA + " * " + Constante + " * "
					+ CoordenadaXDoPontoC + " = " + Multi2 + "x \n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoC + " = " + Multi3 + "y \n";
			Matriz += "Diagonal principal = " + Multi1 + "y  " + Multi2 + "  " + Multi3 + "x \n";
			Matriz += " \n";

			Matriz += "Vamos resolver a diagonal secundária, lembre-se de inverter o sinal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoC + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + -(Multi1N) + "x \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoC + " * " + Constante + " * "
					+ CoordenadaXDoPontoA + " = " + -(Multi2N) + "y \n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + -(Multi3N) + " \n";
			Matriz += "Diagonal secundária = " + -(Multi1N) + "y  " + -(Multi2N) + "  " + -(Multi3N) + "x \n";
			Matriz += " \n";

			Double Sum = Multi1 + -(Multi3N);
			Double SumX = Multi2 + -(Multi1N);
			Double SumY = Multi3 + -(Multi2N);

			Matriz += "Agora vamos somar os iguais \n";
			Matriz += Multi1 + "  " + Multi2 + "x  " + Multi3 + "y  " + -(Multi1N) + "x  " + -(Multi2N) + "y  "
					+ -(Multi3N) + " = 0 \n";
			Matriz += " \n";
			Matriz += "Valor da equação geral da reta = " + SumX + "x  " + SumY + "y  " + Sum + " = 0";

			JOptionPane.showMessageDialog(null, Matriz);
		}

		if ("X".equals(Coordenada1DoPontoC.getText())) {

			Double CoordenadaXDoPontoA = Double.parseDouble(Coordenada1DoPontoA.getText());
			Double CoordenadaYDoPontoA = Double.parseDouble(Coordenada2DoPontoA.getText());
			Double CoordenadaXDoPontoB = Double.parseDouble(Coordenada1DoPontoB.getText());
			Double CoordenadaYDoPontoB = Double.parseDouble(Coordenada2DoPontoB.getText());
			String CoordenadaXDoPontoC = String.valueOf(Coordenada1DoPontoC.getText());
			Double CoordenadaYDoPontoC = Double.parseDouble(Coordenada2DoPontoC.getText());

			Double Multi1 = CoordenadaXDoPontoA * CoordenadaYDoPontoB * Constante;
			Double Multi2 = CoordenadaYDoPontoA * Constante;
			Double Multi3 = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoC;

			Double Multi1N = CoordenadaYDoPontoB * Constante;
			Double Multi2N = CoordenadaYDoPontoC * Constante * CoordenadaXDoPontoA;
			Double Multi3N = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoA;

			Double Sum1 = Multi1 + Multi3;
			Double Sum2 = Multi3N + Multi2N;

			Double result = Sum1 + -(Sum2);
			Double result2 = Multi2 + -(Multi1N);
			Double result3 = result / result2;

			String Matriz = "Aqui esta a Matriz \n";
			Matriz += "| " + CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + " " + Constante + " | "
					+ CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + "\n";
			Matriz += "| " + CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + " " + Constante + " | "
					+ CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + "\n";
			Matriz += "| " + CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + " " + Constante + " | "
					+ CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + "\n";
			Matriz += " \n";

			Matriz += "Agora vamos fazer a multiplicação cruzada para resolvermos a matriz \n";

			Matriz += "Vamos começar resolvendo a diagonal principal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoA + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + Multi1 + "\n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoA + " * " + Constante + " * "
					+ CoordenadaXDoPontoC + " = " + Multi2 + "x\n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + Multi3 + " \n";
			Matriz += "Diagonal principal = " + Sum1 + "  " + Multi2 + "x \n";
			Matriz += " \n";

			Matriz += "Vamos resolver a diagonal secundária, lembre-se de inverter o sinal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoC + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + -(Multi1N) + "x \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoC + " * " + Constante + " * "
					+ CoordenadaXDoPontoA + " = " + -(Multi2N) + " \n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + -(Multi3N) + " \n";
			Matriz += "Diagonal secundária = " + -(Sum2) + " " + -(Multi1N) + "x \n";
			Matriz += " \n";

			Matriz += "Agora vamos somar os iguais \n";
			Matriz += Multi1 + "  " + Multi2 + "  " + Multi3 + "x  " + -(Multi1N) + "  " + -(Multi2N) + "  "
					+ -(Multi3N) + "x = 0 \n";
			Matriz += Sum1 + "  " + -(Sum2) + "  " + result2 + "x = 0 \n";
			Matriz += result + " " + result2 + "x = 0 \n";
			Matriz += result2 + "x " + " = " + result + "\n";
			Matriz += "x = " + result + " / " + -(result2) + "\n";
			Matriz += "X = " + -(result3);

			JOptionPane.showMessageDialog(null, Matriz);
		}

		if ("Y".equals(Coordenada2DoPontoC.getText())) {

			Double CoordenadaXDoPontoA = Double.parseDouble(Coordenada1DoPontoA.getText());
			Double CoordenadaYDoPontoA = Double.parseDouble(Coordenada2DoPontoA.getText());
			Double CoordenadaXDoPontoB = Double.parseDouble(Coordenada1DoPontoB.getText());
			Double CoordenadaYDoPontoB = Double.parseDouble(Coordenada2DoPontoB.getText());
			Double CoordenadaXDoPontoC = Double.parseDouble(Coordenada1DoPontoC.getText());
			String CoordenadaYDoPontoC = String.valueOf(Coordenada2DoPontoC.getText());

			Double Multi1 = CoordenadaXDoPontoA * CoordenadaYDoPontoB * Constante;
			Double Multi2 = CoordenadaYDoPontoA * Constante * CoordenadaXDoPontoC;
			Double Multi3 = Constante * CoordenadaXDoPontoB;

			Double Multi1N = CoordenadaXDoPontoC * CoordenadaYDoPontoB * Constante;
			Double Multi2N = Constante * CoordenadaXDoPontoA;
			Double Multi3N = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoA;

			Double Sum1 = Multi1 + Multi2;
			Double Sum2 = Multi1N + Multi3N;

			Double result = Sum1 + -(Sum2);
			Double result2 = Multi3 + -(Multi2N);
			Double result3 = result / result2;

			if (result == 0) {
				result3 = result2;
			}

			String Matriz = "Aqui esta a Matriz \n";
			Matriz += "| " + CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + " " + Constante + " | "
					+ CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + "\n";
			Matriz += "| " + CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + " " + Constante + " | "
					+ CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + "\n";
			Matriz += "| " + CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + " " + Constante + " | "
					+ CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + "\n";
			Matriz += " \n";

			Matriz += "Agora vamos fazer a multiplicação cruzada para resolvermos a matriz \n";

			Matriz += "Vamos começar resolvendo a diagonal principal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoA + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + Multi1 + " \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoA + " * " + Constante + " * "
					+ CoordenadaXDoPontoC + " = " + Multi2 + "\n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoC + " = " + Multi3 + "y\n";
			Matriz += "Diagonal principal = " + Sum1 + "  " + Multi3 + "y \n";
			Matriz += " \n";

			Matriz += "Vamos resolver a diagonal secundária, lembre-se de inverter o sinal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoC + " * " + CoordenadaYDoPontoB + " * "
					+ Constante + " = " + -(Multi1N) + " \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoC + " * " + Constante + " * "
					+ CoordenadaXDoPontoA + " = " + -(Multi2N) + "y\n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "
					+ CoordenadaYDoPontoA + " = " + -(Multi3N) + "\n";
			Matriz += "Diagonal secundária = " + -(Sum2) + " " + -(Multi2N) + "y \n";
			Matriz += " \n";

			Matriz += "Agora vamos somar os iguais \n";
			Matriz += Multi1 + "  " + Multi2 + "  " + Multi3 + "y  " + -(Multi1N) + "  " + -(Multi2N) + "y  "
					+ -(Multi3N) + " = 0 \n";
			Matriz += Sum1 + "  " + -(Sum2) + "  " + result2 + "y = 0\n";
			Matriz += result + " = " + result2 + "y \n";
			Matriz += result + " / " + -(result2) + " = " + "y \n";
			Matriz += "Y = " + -(result3);

			JOptionPane.showMessageDialog(null, Matriz);
		} else {
			Double CoordenadaXDoPontoA = Double.parseDouble(Coordenada1DoPontoA.getText());
			Double CoordenadaYDoPontoA = Double.parseDouble(Coordenada2DoPontoA.getText());
			Double CoordenadaXDoPontoB = Double.parseDouble(Coordenada1DoPontoB.getText());
			Double CoordenadaYDoPontoB = Double.parseDouble(Coordenada2DoPontoB.getText());
			Double CoordenadaXDoPontoC = Double.parseDouble(Coordenada1DoPontoC.getText());
			Double CoordenadaYDoPontoC = Double.parseDouble(Coordenada2DoPontoC.getText());

			Double Multi1 = CoordenadaXDoPontoA * CoordenadaYDoPontoB * Constante;
			Double Multi2 = CoordenadaYDoPontoA * Constante * CoordenadaXDoPontoC;
			Double Multi3 = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoC;

			Double Multi1N = CoordenadaXDoPontoC * CoordenadaYDoPontoB * Constante;
			Double Multi2N = CoordenadaYDoPontoC * Constante * CoordenadaXDoPontoA;
			Double Multi3N = Constante * CoordenadaXDoPontoB * CoordenadaYDoPontoA;

			Double Sum1 = Multi1 + Multi2 + Multi3;
			Double Sum2 = Multi1N + Multi2N + Multi3N;
			Double result = Sum1 - Sum2;
			String result2;
			
			if (result == 0) {
				result2 = "Os pontos são colineares";
			} else {
				result2 = "Os pontos não são colineares";
			}
			
			String Matriz = "Aqui esta a Matriz \n";
			Matriz += "| " + CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + " " + Constante + " | "
					+ CoordenadaXDoPontoA + " " + CoordenadaYDoPontoA + "\n";
			Matriz += "| " + CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + " " + Constante + " | "
					+ CoordenadaXDoPontoB + " " + CoordenadaYDoPontoB + "\n";
			Matriz += "| " + CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + " " + Constante + " | "
					+ CoordenadaXDoPontoC + " " + CoordenadaYDoPontoC + "\n";
			Matriz += " \n";

			Matriz += "Agora vamos fazer a multiplicação cruzada para resolvermos a matriz \n";

			Matriz += "Vamos começar resolvendo a diagonal principal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoA + " * " + CoordenadaYDoPontoB + " * "+ Constante + " = " + Multi1 + " \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoA + " * " + Constante + " * "+ CoordenadaXDoPontoC + " = " + Multi2 + "\n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "+ CoordenadaYDoPontoC + " = " + Multi3 + "\n";
			Matriz += "Diagonal principal = " + Sum1 + " \n";
			Matriz += " \n";

			Matriz += "Vamos resolver a diagonal secundária, lembre-se de inverter o sinal \n";
			Matriz += "Primeira multiplicação vai ser " + CoordenadaXDoPontoC + " * " + CoordenadaYDoPontoB + " * "+ Constante + " = " + -(Multi1N) + " \n";
			Matriz += "Segunda multiplicação vai ser " + CoordenadaYDoPontoC + " * " + Constante + " * "+ CoordenadaXDoPontoA + " = " + -(Multi2N) + "\n";
			Matriz += "Terceira multiplicação vai ser " + Constante + " * " + CoordenadaXDoPontoB + " * "+ CoordenadaYDoPontoA + " = " + -(Multi3N) + "\n";
			Matriz += "Diagonal secundária = " + -(Sum2) + " \n";
			Matriz += " \n";

			Matriz += "Agora vamos diminuir a diagonal secundária da principal \n";
			Matriz += "D = " + Sum1 + " - " + Sum2 + "\n";
			Matriz += "D = " + result + "\n";
			Matriz += result2;
			
			JOptionPane.showMessageDialog(null, Matriz);
		}

	}
}
