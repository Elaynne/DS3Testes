import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ValidaDataTests {
	/* Todos os testes a seguir foram feitos utilizando a técnica do caminho básico.
	 * Caminhos Independentes:
01 - [1,2,F]
02 - [1,2,3,4,9,11,14,15,10,F]
03 - [1,2,3,4,5,9,11,14,15,10,F]
04 - [1,2,3,4,5,6,9,11,14,15,10,F]
05 - [1,2,3,4,5,6,7,9,11,14,15,10,F]
06 - [1,2,3,4,9,11,12,14,15,10,F]
07 - [1,2,3,4,9,11,12,13,15,10,F]
-------------------
08 - [1,2,3,4,5,6,7,8,16,24,25,28,29,30,10,F]
09 - [1,2,3,4,5,6,7,8,16,24,25,26,28,29,30,10,F]
10 - [1,2,3,4,5,6,7,8,16,24,25,26,27,29,30,10,F]
------------------------
11 - [1,2,3,4,5,6,7,8,16,17,24,25,28,29,30,10,F]
12 - [1,2,3,4,5,6,7,8,16,17,18,24,25,28,29,30,10,F]
13 - [1,2,3,4,5,6,7,8,16,17,18,19,24,25,28,29,30,10,F]
14 - [1,2,3,4,5,6,7,8,16,17,18,19,20,24,25,28,29,30,10,F]
15 - [1,2,3,4,5,6,7,8,16,17,18,19,20,21,24,25,28,29,30,10,F]
16 - [1,2,3,4,5,6,7,8,16,17,18,19,20,21,22,24,25,28,29,30,10,F]
----------------------------
17 - [1,2,3,4,5,6,7,8,16,17,18,19,20,21,22,23,31,33,35,30,10,F]
18 - [1,2,3,4,5,6,7,8,16,17,18,19,20,21,22,23,31,32,34,37,38,35,30,10,F]
19 - [1,2,3,4,5,6,7,8,16,17,18,19,20,21,22,23,31,32,34,36,39,40,42,38,35,30,10,F]
20 - [1,2,34,5,6,7,8,16,17,18,19,20,21,22,23,31,32,34,36,39,41,43,45,46,42,38,35,30,10,F]
21 - [1,2,34,5,6,7,8,16,17,18,19,20,21,22,23,31,32,34,36,39,41,43,44,47,50,51,52,46,42,38,35,30,10,F]
22 - [1,2,34,5,6,7,8,16,17,18,19,20,21,22,23,31,32,34,36,39,41,43,44,47,48,50,51,52,46,42,38,35,30,10,F]
23 - [1,2,34,5,6,7,8,16,17,18,19,20,21,22,23,31,32,34,36,39,41,43,44,47,48,49,52,46,42,38,35,30,10,F]
24 - [1,2,34,5,6,7,8,16,17,18,19,20,21,22,23,31,32,34,36,39,41,43,44,47,50,49,52,46,42,38,35,30,10,F]

Casos de Testes:
01 - {(0,0,-1), false}
02 - {(0,4,2000),false}
03 - {(0,6,2000),false}
04 - {(0,9,2000),false}
05 - {(0,11,2000),false}
06 - {(31,4,2000),false}
07 - {(30,4,2000),true}
08 - {(-10,1,2000),false}
09 - {(40,1,2000),false}
10 - {31,1,2000),true}
11 - {-10,3,2000),false}
12 - {-10,5,2000),false}
13 - {-10,7,2000),false}
14 - {-10,8,2000),false}
15 - {-10,10,2000),false}
16 - {-10,12,2000),false}
17 - {-10,14,2000),false}
18 - {-10,2,2000),false}
19 - {28,2,2000),true}
20 - {30,2,2000),false}
21 - {29,2,2001),false}
22 - {29,2,2100),false}
23 - {29,2,2400),true}
24 - {29,2,X),true}
	 * */
	

	//01 - [1,2,F]
	@Test
	public void validaData_01_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(0, 0, -1);
		//Assert - verificando resultado esperado.
		assertFalse("O resultado esperado é false porque o ano é inválido",result);
	}
	
	//02 - {(0,4,2000),false}
	@Test
	public void validaData_02_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(0, 4, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("O resultado esperado é false porque o dia é inválido",result);
	}
	
	//03 - {(0,6,2000),false}
	@Test
	public void validaData_03_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(0, 6, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("O resultado esperado é false porque o dia é inválido",result);
	}
	
	//04 - {(0,9,2000),false}
	@Test
	public void validaData_04_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(0, 9, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("O resultado esperado é false porque o dia é inválido",result);
	}
	
	//05 - {(0,11,2000),false}
	@Test
	public void validaData_05_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(0, 11, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("O resultado esperado é false porque o dia é inválido",result);
	}
	
	//06 - {(31,4,2000),false}
	@Test
	public void validaData_06_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(31, 4, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("O resultado esperado é false porque o dia é inválido para este mês",result);
	}
	
	//07 - {(30,4,2000),true}
	@Test
	public void validaData_07_Valido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(30, 4, 2000);
		//Assert - verificando resultado esperado.
		assertTrue("A data é válida",result);
	}
	
	//08 - {(-10,1,2000),false}
	@Test
	public void validaData_08_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(-10, 1, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("A dia é inválido",result);
	}
	
	//09 - {(40,1,2000),false}
	@Test
	public void validaData_09_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(40, 1, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("A dia é inválido",result);
	}
	
	//10 - {31,1,2000),true}
	@Test
	public void validaData_10_Valido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(31, 1, 2000);
		//Assert - verificando resultado esperado.
		assertTrue("A data é válida",result);
	}
	
	//11 - {-10,3,2000),false}
	@Test
	public void validaData_11_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(-10, 3, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("A dia é inválido",result);
	}

	
	//12 - {-10,5,2000),false}
	@Test
	public void validaData_12_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(-10, 5, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("A dia é inválido",result);
	}
	
	//13 - {-10,7,2000),false}
	@Test
	public void validaData_13_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(-10, 7, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("A dia é inválido",result);
	}
	
	//14 - {-10,8,2000),false}
	@Test
	public void validaData_14_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(-10, 8, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("A dia é inválido",result);
	}
	
	//15 - {-10,10,2000),false}
	@Test
	public void validaData_15_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(-10, 10, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("A dia é inválido",result);
	}
	
	//16 - {-10,12,2000),false}
	@Test
	public void validaData_16_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(-10, 12, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("A dia é inválido",result);
	}
	
	//17 - {-10,14,2000),false}
	@Test
	public void validaData_17_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(-10, 14, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("A dia e o mês são inválidos",result);
	}
	
	//18 - {-10,2,2000),false}
	@Test
	public void validaData_18_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(-10, 2, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("A dia é inválido",result);
	}
	
	//19 - {28,2,2000),true}
	@Test
	public void validaData_19_Valido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(28, 2, 2000);
		//Assert - verificando resultado esperado.
		assertTrue("A data é válida",result);
	}
	
	//20 - {30,2,2000),false}
	@Test
	public void validaData_20_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(30, 2, 2000);
		//Assert - verificando resultado esperado.
		assertFalse("Dia 30 para o mês de Fevereiro é inválido",result);
	}
	
	//21 - {29,2,2001),false}
	@Test
	public void validaData_21_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(29, 2, 2001);
		//Assert - verificando resultado esperado.
		assertFalse("O ano de 2001 não é bissexto",result);
	}
	
	//22 - {29,2,2100),false}
	@Test
	public void validaData_22_Invalido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(29, 2, 2100);
		//Assert - verificando resultado esperado.
		assertFalse("O ano de 2100 é múltiplo de 4,porém o resto da divisão por 100 é igual a zero!",result);
	}
	
	//23 - {29,2,2400),true}
	@Test
	public void validaData_23_Valido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(29, 2, 2400);
		//Assert - verificando resultado esperado.
		assertTrue("O ano de 2400 é múltiplo de 4,porém o resto da divisão por 100 não é diferente de zero"
				+ ".No entanto, o resto da divisão por 400 é igual a zero,portanto, a data é válida!",result);
	}
	
	//24 - {29,2,2004),true}	
	@Test
	public void validaData_24_Valido(){
		//Arrange - preparação
		ValidaData validaData = new ValidaData();
		//Act - agindo
		boolean result = validaData.validaData(29, 2, 2004);
		//Assert - verificando resultado esperado.
		assertTrue("",result);
	}
}
