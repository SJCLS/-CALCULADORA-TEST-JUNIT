package calculadora;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
@SuppressWarnings("deprecation")

public class Cenarios_soma {
	int soma1 =0;
	@Test
	public void SomarDoisNumerosPositivos() {
		CalculadoraSoma soma = new CalculadoraSoma(); 
		soma1 = soma.somar(21, 7);			//Cenário que vai testar dois valores positivos 
		Assert.assertEquals(28 , soma1);	//Nessa linha  ira verificar o resultado e a variável.
	}
	@Test
	public void SomarDoisNumerosNegativos() {
		CalculadoraSoma soma = new CalculadoraSoma(); 
		soma1 = soma.somar(-28, -7);		//Cenário que vai testar dois valores negativo 
		Assert.assertEquals(-35, soma1);	//Nessa linha  ira verificar o resultado e a variável.
	}
	@Test
	public void SomarDoisNumerosPositivoNegativos() {
		CalculadoraSoma soma = new CalculadoraSoma(); 
		soma1 = soma.somar(28, -7);		//Cenário que vai testar dois valores positivos e negativo
		Assert.assertEquals(21, soma1); //Nessa linha  ira verificar o resultado e a variável.
	}
	@Test
	public void SomarDoisNumerosNegativoPositivo() {
		CalculadoraSoma soma = new CalculadoraSoma(); 
		soma1 = soma.somar(-28, 7);		//Cenário que vai testar dois valores positivos 
		Assert.assertEquals(-21, soma1);//Nessa linha ira verificar o resultado e a variável.
	}
	@Test
	public void SomarDoisNumerosZeros() {
		CalculadoraSoma soma = new CalculadoraSoma(); 
		soma1 = soma.somar(0, 0);		//Cenário que vai testar dois valores zeros 
		Assert.assertEquals(0, soma1); //Nessa linha ira verificar o resultado e a variável.
	}
	@Test
	public void SomarDoisNumerosZeroPositivo() {
		CalculadoraSoma soma = new CalculadoraSoma(); 
		soma1 = soma.somar(0, 7);		//Cenário que vai testar dois valores positivos 
		Assert.assertEquals(7 , soma1); //Nessa linha  ira verificar o resultado e a variável.
	}
	
}
