package calculadora;

public class CalculadoraJunitTest {

	public static void main(String[] args) {


	Cenarios_div div = new Cenarios_div();      //---> Aqui realizei o chamado da classe responsavel por dividir 
	div.DividirDoisNumerosNegativoPositivo();   //---> Onde chamo cada cenário que a classe possui 
	div.DividirDoisNumerosNegativos();
	div.DividirDoisNumerosPositivoNegativos();
	div.DividirDoisNumerosPositivos();
	div.DividirDoisNumerosZeroPositivo();
	div.DividirDoisNumerosZeros();
	
	
	Cenarios_soma soma = new Cenarios_soma();  //---> Aqui realizei o chamado da classe responsavel por somar 
	soma.SomarDoisNumerosNegativoPositivo();   //---> Onde chamo cada cenário que a classe possui 
	soma.SomarDoisNumerosNegativos();
	soma.SomarDoisNumerosPositivoNegativos();
	soma.SomarDoisNumerosPositivos();
	soma.SomarDoisNumerosZeroPositivo();
	soma.SomarDoisNumerosZeros();
	
	
	Cenarios_sub sub = new Cenarios_sub();     //---> Aqui realizei o chamado da classe responsavel por subtrair 
	sub.SubtrirDoisNumerosNegativoPositivo();  //---> Onde chamo cada cenário que a classe possui 
	sub.SubtrirDoisNumerosNegativos();
	sub.SubtrirDoisNumerosPositivoNegativos();
	sub.SubtrirDoisNumerosPositivos();
	sub.SubtrirDoisNumerosZeroPositivo();
	sub.SubtrirDoisNumerosZeros();
	
	
	Cenarios_mult mult = new Cenarios_mult();      //---> Aqui realizei o chamado da classe responsavel por multiplicar 
	mult.MultiplicarDoisNumerosNegativoPositivo(); //---> Onde chamo cada cenário que a classe possui 
	mult.MultiplicarDoisNumerosNegativos();
	mult.MultiplicarDoisNumerosPositivoNegativos();
	mult.MultiplicarDoisNumerosPositivos();
	mult.MultiplicarDoisNumerosZeroPositivo();
	mult.MultiplicarDoisNumerosZeros();
	
		}
}
