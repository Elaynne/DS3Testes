package Produtos;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class VendaTeste {

	@Test
	public void Venda1() {
		Venda venda = new Venda();
		
		Produto p = new Produto(1, "comida", 10f, 2);
		Produto p2 = new Produto(2, "bebida", 5f, 5);
		Produto p3 = new Produto(3, "sobremesa", 3f, 2);
		
		ItemDaVenda item = new ItemDaVenda(p, 3);
		ItemDaVenda item2 = new ItemDaVenda(p2, 2);
		ItemDaVenda item3 = new ItemDaVenda(p3, 4);	
		
		venda.getItensDaVenda().add(item);
		venda.getItensDaVenda().add(item2);
		venda.getItensDaVenda().add(item3);
		
		assertEquals(52, venda.obterTotal(), 0.1f);
	}
	
	@Test 
	public void Venda2() {
	Venda venda = new Venda();
		
		Produto p = new Produto(1, "comida", 10f, 2);
		Produto p2 = new Produto(2, "bebida", 5f, 5);
		Produto p3 = new Produto(3, "sobremesa", 3f, 2);
		
		ItemDaVenda item = new ItemDaVenda(p, 3);
		ItemDaVenda item2 = new ItemDaVenda(p2, 2);
		ItemDaVenda item3 = new ItemDaVenda(p3, 4);	
		
		venda.getItensDaVenda().add(item);
		venda.getItensDaVenda().add(item2);
		venda.getItensDaVenda().add(item3);
		
		assertEquals(52, venda.obterTotal(), 0.1f);
	}	
	
	
	
}
