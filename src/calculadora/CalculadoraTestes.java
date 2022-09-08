package calculadora;

public class CalculadoraTestes {

	public static void main(String[] args) {

	//Classe responsável por realizar o chamodo de todas as classes e aplicar os cenarios de testes  
		
		System.out.println("Cenarios de Soma"); // Cenários de soma 
		Cenarios_soma soma = new Cenarios_soma();
		soma.soma();

		System.out.println("Cenarios de Subtrair"); // Cenários de subtrair
		Cenarios_sub sub = new Cenarios_sub();
		sub.subtracao();

		System.out.println("Cenarios de Multiplicar"); // Cenários de multiplicar
		Cenarios_mult mult = new Cenarios_mult();
		mult.mult();

		System.out.println("Cenarios de Dividir"); // Cenários de dividir 
		Cenarios_div div = new Cenarios_div();
		div.divisao();

	}

}
