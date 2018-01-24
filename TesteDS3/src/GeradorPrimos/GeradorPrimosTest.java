package GeradorPrimos;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

//tecnica Caminho Basico
public class GeradorPrimosTest {

	//Entradas Válidas
	@Test
	public void IgualA2() throws Exception {	
		String gerador = GeradorPrimos.gerarPrimosAte(2);
		Assert.assertTrue("O resultado esperado dois", gerador.equals("2"));
	}
	
	@Test
	public void MaiorQue2() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(3);
		Assert.assertEquals("O resultado esperado deveria 2, 3", "2, 3", gerador);
	}
	
	@Test
	public void MaioresQue2() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(5);
		Assert.assertEquals("O resultado esperado deveria 2, 3, 5", "2, 3, 5", gerador);
	}
	
//Entradas Inválidas
	@Test(expected = Exception.class)
	public void Negativo() throws Exception {		 
		String gerador = GeradorPrimos.gerarPrimosAte(-1);
	}

	@Test(expected = Exception.class)
	public void MenorQue2() throws Exception {		
		String gerador = GeradorPrimos.gerarPrimosAte(1);
	}

	@Test(expected = Exception.class)
	public void ImitNegativo() throws Exception {		 
		boolean [] init = GeradorPrimos.inicializaListaCandidatos(-1);
	}

	//foi necessário implementar exceção neste método em geradorPrimos
	@Test(expected = Exception.class)
	public void InitMenorQue2() throws Exception {		
		boolean [] init = GeradorPrimos.inicializaListaCandidatos(1);
	}
}
