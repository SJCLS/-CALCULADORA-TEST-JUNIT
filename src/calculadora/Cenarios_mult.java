package calculadora;

public class Cenarios_mult {
	public void mult() {
		CalculadoraMult multi = new CalculadoraMult();// Inicializando CalculadoraMult para poder usar sua função adicionado valores como parâmetros.

		 // Cenário 01, para testar dois numeros, sendo os dois valores positivos
		int mult = multi.multiplicar(3, 7);    
			System.out.println(mult);
			
			// Cenário 02, para testar dois numeros, sendo os dois valores negativos
			mult = multi.multiplicar(-3, -7);   
			System.out.println(mult);
			
			// Cenário 03, para testar dois numeros, um deles sendo positivo e outro negativo
			mult = multi.multiplicar(3, -7);    
			System.out.println(mult);
			
			// Cenário 04, para testar dois numeros, sendo os dois valores 0.
			mult = multi.multiplicar(0, 0);     
			System.out.println(mult);
			
			// Cenário 05, para testar dois numeros, um deles sendo zero e outro negativo
			mult = multi.multiplicar(-5 , 0);    
			System.out.println(mult);
			
			// Cenário 06, para testar dois numeros, um deles sendo zero e outro positivo
			mult = multi.multiplicar(0, 5);     
			System.out.println(mult);
		
	}
}
