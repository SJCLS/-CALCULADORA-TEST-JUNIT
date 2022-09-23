package calculadora;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
@SuppressWarnings("deprecation")

public class Cenarios_mult {
	int mult1 =0;

	@Test
	public void MultiplicarDoisNumerosPositivos() {
		CalculadoraMult mult = new CalculadoraMult();
		mult1 = mult.multiplicar(21, 7);//Cenário que vai testar dois valores positivos 
		Assert.assertEquals(147, mult1);//Nessa linha  ira verificar o resultado e a variável.
	}

	@Test
	public void MultiplicarDoisNumerosNegativos() {
		CalculadoraMult mult = new CalculadoraMult();
		mult1 = mult.multiplicar(-28, -7);//Cenário que vai testar dois valores negativos 
		Assert.assertEquals(196, mult1);//Nessa linha  ira verificar o resultado e a variável.
	}

	@Test
	public void MultiplicarDoisNumerosPositivoNegativos() {
		CalculadoraMult mult = new CalculadoraMult();
		mult1 = mult.multiplicar(28, -7);//Cenário que vai testar dois valores positivos e negativo
		Assert.assertEquals(-196, mult1);//Nessa linha  ira verificar o resultado e a variável.
	}

	@Test
	public void MultiplicarDoisNumerosNegativoPositivo() {
		CalculadoraMult mult = new CalculadoraMult();
		mult1 = mult.multiplicar(-28, 7);//Cenário que vai testar dois valores negativo e positivo
		Assert.assertEquals(-196, mult1);//Nessa linha  ira verificar o resultado e a variável.
	}

	@Test
	public void MultiplicarDoisNumerosZeros() {
		CalculadoraMult mult = new CalculadoraMult();
		mult1 = mult.multiplicar(0, 0);//Cenário que vai testar dois valores zeros
		Assert.assertEquals(0, mult1);//Nessa linha  ira verificar o resultado e a variável.
	}

	@Test
	public void MultiplicarDoisNumerosZeroPositivo() {
		CalculadoraMult mult = new CalculadoraMult();
		mult1 = mult.multiplicar(0, 7);//Cenário que vai testar dois valores zeros e positivo
		Assert.assertEquals(0, mult1);//Nessa linha  ira verificar o resultado e a variável.
	}

}
