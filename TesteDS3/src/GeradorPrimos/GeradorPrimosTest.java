package GeradorPrimos;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

//tecnica Caminho Basico
public class GeradorPrimosTest {

	//Entradas Válidas
	/*@Test(expected = NullObjectException.class)
	public void IgualA2() throws Exception {	
		String gerador = GeradorPrimos.gerarPrimosAte(2);
		Assert.assertTrue("O resultado esperado dois", gerador == "Dois");
		//fail("Not yet implemented");
	}*/
	
	/*@Test(expected = NullObjectException.class)
	public void MaiorQue2() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(3);
		Assert.assertEquals("O resultado esperado deveria dois", "dois", gerador);
		fail("O valor deveria ser maior que 2");
	}*/
	/*@Test(expected = NullObjectException.class)
	public void MaioresQue2() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(5);
		Assert.assertEquals("O resultado esperado deveria dois", "dois", gerador);
		fail("O valor deveria ser maior que 2");
	}*/
	
//Entradas Inválidas
	@Test(expected = Exception.class)
	public void Negativo() throws Exception {
		 
		String gerador = GeradorPrimos.gerarPrimosAte(-1);
		Assert.assertEquals(expected, gerador);
		
	}
	/*@Test(expected = NullObjectException.class)
	public void FloatsValue() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(0.5f);
		Assert.assertEquals("O resultado esperado deveria ser dois", "dois", gerador);
		fail("Erro, O valor deveria ser maior que 2");
	}*/
	
	/*@Test(expected = NullObjectException.class)
	public void MenorQue2() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(1);
		Assert.assertEquals("O resultado esperado deveria ser dois", "dois", gerador);
		fail("Erro, O valor deveria ser maior que 2");
	}*/

}
