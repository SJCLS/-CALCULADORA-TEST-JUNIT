package calculadora;

public class CalculadoraMult {
	public int multiplicar(int a, int b) {
		if (a != 0 & b == 0) { //  tratamento para quando recebe dois valores Zeros
			return a;
		}
		return a * b;
	}
}
