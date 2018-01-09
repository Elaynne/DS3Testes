import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SomaTest {

	@Test
	
	public void Soma_1() {
		int result = Soma.sum(0, 0);
		Assert.assertTrue("O resultado esperado deveria 0",result == 0);
	}
	
	@Test
	
	public void Soma_2() {
		int result = Soma.sum(-1, 0);
		Assert.assertTrue("O resultado esperado deveria -1",result == -1);
	}
	//1;2;3;4;5;6;8;9;10;12
	@Test
	public void Soma_3() {
		int result = Soma.sum(-1, 1);
		Assert.assertTrue("O resultado esperado deveria 0",result == -1);
	}
	
	@Test
	public void Soma_4() {
		int result = Soma.sum(1, 1);
		Assert.assertTrue("O resultado esperado deveria 0",result == 1);
	}
	
	@Test
	public void Soma_5() {
		int result = Soma.sum(1, -1);
		Assert.assertTrue("O resultado esperado deveria -1",result == 1);
	}
	

}
