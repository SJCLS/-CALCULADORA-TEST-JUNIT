package calculadora;

public class CalculadoraDivisao { 
	public double dividir(double a, double b) {
		if (a == 0 & b == 0) { // tratamento para quando receber dois valores Zeros
			return 0;
		} else if (a != 0 & b == 0) { // tratamento para quando receber o segundo numero Zero
			return a;
		}
		return a / b;

	}
}
