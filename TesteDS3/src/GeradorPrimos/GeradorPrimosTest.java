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
	}*/
	
	/*@Test(expected = NullObjectException.class)
	public void MaiorQue2() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(3);
		Assert.assertEquals("O resultado esperado deveria dois", "dois", gerador);
	}*/
	/*@Test(expected = NullObjectException.class)
	public void MaioresQue2() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(5);
		Assert.assertEquals("O resultado esperado deveria dois", "dois", gerador);
	}*/
	
//Entradas Inválidas
	@Test(expected = Exception.class)
	public void Negativo() throws Exception {		 
		String gerador = GeradorPrimos.gerarPrimosAte(-1);
	}
	/*@Test(expected = Exception.class)
	public void FloatsValue() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(0.5f);
	}*/
	
	@Test(expected = Exception.class)
	public void MenorQue2() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(1);
	}
	
	/*@Test(expected = Exception.class)
	public void MaiorQue2Float() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(2.5f);
	}*/
	
	//Testar inicializaListaCandidatos		
	//Entradas Válidas
	/*@Test(expected = NullObjectException.class)
	public void IgualA2() throws Exception {	
		String gerador = GeradorPrimos.inicializaListaCandidatos(2);
		Assert.assertTrue("O resultado esperado dois", gerador == "Dois");
	}*/
	
	/*@Test(expected = NullObjectException.class)
	public void MaiorQue2() throws Exception {		
		String gerador = GeradorPrimos.inicializaListaCandidatos(3);
		Assert.assertEquals("O resultado esperado deveria dois", "dois", gerador);
	}*/
	/*@Test(expected = NullObjectException.class)
	public void MaioresQue2() throws Exception {		
		String gerador = GeradorPrimos.inicializaListaCandidatos(5);
		Assert.assertEquals("O resultado esperado deveria dois", "dois", gerador);
	}*/
	
//Entradas Inválidas
	@Test(expected = Exception.class)
	public void ImitNegativo() throws Exception {		 
		boolean [] init = GeradorPrimos.inicializaListaCandidatos(-1);
	}
	/*@Test(expected = Exception.class)
	public void InitFloatsValue() throws Exception {		
		boolean [] init  = GeradorPrimos.inicializaListaCandidatos(0.5f);
	}*/
	
	//foi necessário implementar exceção neste método em geradorPrimos
	@Test(expected = Exception.class)
	public void InitMenorQue2() throws Exception {		
		boolean [] init = GeradorPrimos.inicializaListaCandidatos(1);
	}
	/*@Test(expected = Exception.class)
	public void MaiorQue2Float() throws Exception {		
		String gerador = GeradorPrimos.inicializaListaCandidatos(2.5f);
	}*/

}
