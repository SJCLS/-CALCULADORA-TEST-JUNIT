package calculadora;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
@SuppressWarnings("deprecation")

public class Cenarios_div {
	double divi1 =0;
	@Test
	public void DividirDoisNumerosPositivos() {
		CalculadoraDivisao div = new CalculadoraDivisao(); 
		divi1 = div.dividir(21, 7);//Cenário que vai testar dois valores positivos 
		Assert.assertEquals(3.0 , divi1);//Nessa linha  ira verificar o resultado e a variável.
	}
	@Test
	public void DividirDoisNumerosNegativos() {
		CalculadoraDivisao div = new CalculadoraDivisao(); 
		divi1 = div.dividir(-28, -7);//Cenário que vai testar dois valores negativos 
		Assert.assertEquals(4.0 , divi1);//Nessa linha  ira verificar o resultado e a variável.
	}
	@Test
	public void DividirDoisNumerosPositivoNegativos() {
		CalculadoraDivisao div = new CalculadoraDivisao(); 
		divi1 = div.dividir(28, -7);//Cenário que vai testar dois valores positivos e negativo
		Assert.assertEquals(-4.0 , divi1);//Nessa linha  ira verificar o resultado e a variável.
	}
	@Test
	public void DividirDoisNumerosNegativoPositivo() {
		CalculadoraDivisao div = new CalculadoraDivisao(); 
		divi1 = div.dividir(-28, 7);//Cenário que vai testar dois valores zeros e negativo e positivo
		Assert.assertEquals(-4.0 , divi1);//Nessa linha  ira verificar o resultado e a variável.
	}
	@Test
	public void DividirDoisNumerosZeros() {
		CalculadoraDivisao div = new CalculadoraDivisao(); 
		divi1 = div.dividir(0, 0);//Cenário que vai testar dois valores zeros
		Assert.assertEquals(0.0 , divi1);//Nessa linha  ira verificar o resultado e a variável.
	}
	@Test
	public void DividirDoisNumerosZeroPositivo() {
		CalculadoraDivisao div = new CalculadoraDivisao(); 
		divi1 = div.dividir(0, 7);//Cenário que vai testar dois valores zeros e positivo
		Assert.assertEquals(0.0 , divi1);//Nessa linha  ira verificar o resultado e a variável.
	}


}
