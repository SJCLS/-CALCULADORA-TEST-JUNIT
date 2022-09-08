package calculadora;

public class Cenarios_soma {
	public void soma() {
		CalculadoraSoma cal_soma = new CalculadoraSoma();// Inicializando CalculadoraSoma para poder usar sua função adicionado valores como parâmetros.

		 // Cenário 01, para testar dois numeros, sendo os dois valores positivos
		int soma = cal_soma.somar(3, 7);    
			System.out.println(soma);
			
			// Cenário 02, para testar dois numeros, sendo os dois valores negativos
			soma = cal_soma.somar(-3, -7);   
			System.out.println(soma);
			
			// Cenário 03, para testar dois numeros, um deles sendo positivo e outro negativo
			soma = cal_soma.somar(3, -7);    
			System.out.println(soma);
			
			// Cenário 04, para testar dois numeros, sendo os dois valores 0.
			soma = cal_soma.somar(0, 0);     
			System.out.println(soma);
			
			// Cenário 05, para testar dois numeros, um deles sendo zero e outro negativo
			soma = cal_soma.somar(0, -5);    
			System.out.println(soma);
			
			// Cenário 06, para testar dois numeros, um deles sendo zero e outro positivo
			soma = cal_soma.somar(0, 5);     
			System.out.println(soma);
		
			
	}
}
