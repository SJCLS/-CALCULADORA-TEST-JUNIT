package calculadora;

public class Cenarios_sub {
	public void subtracao() {
		CalculadoraSubtrair sub = new CalculadoraSubtrair();// Inicializando CalculadoraSubtrair para poder usar sua função adicionado valores como parâmetros.
		int subt=0;
	
		// Cenário 01, para testar dois numeros, sendo os dois valores positivos
		subt = sub.subtrair(21, 7);     
		System.out.println(subt);
		
		// Cenário 02, para testar dois numeros, sendo os dois valores negativos
		subt = sub.subtrair(-17, -7);   
		System.out.println(subt);
		
		 // Cenário 03, para testar dois numeros, um deles sendo positivo e outro negativo
		subt = sub.subtrair(3, -7);    
		System.out.println(subt);
		
		 // Cenário 04, para testar dois numeros, sendo os dois valores 0.
		subt = sub.subtrair(0, 0);    
		System.out.println(subt);
		
		// Cenário 05, para testar dois numeros, um deles sendo zero e outro negativo
		subt = sub.subtrair(0, -5);    
		System.out.println(subt);
		
		// Cenário 06, para testar dois numeros, um deles sendo zero e outro positivo
		subt = sub.subtrair(0, 5);     
		System.out.println(subt);
		
	}
	
}
