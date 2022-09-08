package calculadora;

public class Cenarios_div {
	public void divisao() {
		CalculadoraDivisao div = new CalculadoraDivisao(); // Inicializando CalculadoraDivisão para poder usar sua função adicionado valores como parâmetros.
		float divi = 0;

		// Cenário 01, para testar dois numeros, sendo os dois valores positivos
		divi = div.dividir(21, 7);
		System.out.println(divi);

		// Cenário 02, para testar dois numeros, sendo os dois valores negativos
		divi = div.dividir(-28, -7);
		System.out.println(divi);

		// Cenário 03, para testar dois numeros, um deles sendo positivo e outro
		// negativo
		divi = div.dividir(14, -7);
		System.out.println(divi);

		// Cenário 04, para testar dois numeros, sendo os dois valores 0.
		divi = div.dividir(0, 0);
		System.out.println(divi);

		// Cenário 05, para testar dois numeros, um deles sendo zero e outro negativo
		divi = div.dividir(-5, 0);
		System.out.println(divi);

		// Cenário 06, para testar dois numeros, um deles sendo zero e outro positivo
		divi = div.dividir(0, 5);
		System.out.println(divi);
	}

}
