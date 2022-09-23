package calculadora;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
@SuppressWarnings("deprecation")

public class Cenarios_sub {
	int sub1 =0;
 
	@Test
	public void SubtrirDoisNumerosPositivos() {					
		CalculadoraSubtrair sub = new CalculadoraSubtrair();
		sub1 = sub.subtrair(21, 7);		//Cenário que vai testar dois valores positivos 
		Assert.assertEquals(14, sub1);  //Nessa linha  ira verificar o resultado e a variável.
	}

	@Test
	public void SubtrirDoisNumerosNegativos() {
		CalculadoraSubtrair sub = new CalculadoraSubtrair();
		sub1 = sub.subtrair(-28, -7);	//Cenário que vai testar dois valores negativos 
		Assert.assertEquals(-21, sub1); //Nessa linha  ira verificar o resultado e a variável.
	}

	@Test
	public void SubtrirDoisNumerosPositivoNegativos() {
		CalculadoraSubtrair sub = new CalculadoraSubtrair();
		sub1 = sub.subtrair(28, -7);    //Cenário que vai testar dois valores, positivo e negativo 
		Assert.assertEquals(35, sub1); //Nessa linha  ira verificar o resultado e a variável.
	}

	@Test
	public void SubtrirDoisNumerosNegativoPositivo() {
		CalculadoraSubtrair sub = new CalculadoraSubtrair();
		sub1 = sub.subtrair(-28, 7);	//Cenário que vai testar dois valores negativo e positivo  
		Assert.assertEquals(-35, sub1); //Nessa linha ira verificar o resultado e a variável.
	}

	@Test
	public void SubtrirDoisNumerosZeros() {
		CalculadoraSubtrair sub = new CalculadoraSubtrair();
		sub1 = sub.subtrair(0, 0);		//Cenário que vai testar dois valores zeros 
		Assert.assertEquals(0, sub1); //Nessa linha ira verificar o resultado e a variável.
	}

	@Test
	public void SubtrirDoisNumerosZeroPositivo() {
		CalculadoraSubtrair sub = new CalculadoraSubtrair();
		sub1 = sub.subtrair(0, 7);     //Cenário que vai testar dois valores zero e positivo  
		Assert.assertEquals(-7, sub1); //Nessa linha ira verificar o resultado e a variável.
	}

}
