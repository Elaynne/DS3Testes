package Produtos;

import java.util.*;

public class Venda {
	private Calendar data;
	private List<ItemDaVenda> itensDaVenda = new ArrayList<ItemDaVenda> ();
	
	public float obterTotal(){
		float total = 0.0f;
		int index = 0;
		for (index = 0; index < getItensDaVenda().size(); index++){
			total += getItensDaVenda().get(index).obterSubTotal();
		}
		return total;
	}

	public void setItensDaVenda(List<ItemDaVenda> itensDaVenda) {
		this.itensDaVenda = itensDaVenda;
	}

	public List<ItemDaVenda> getItensDaVenda() {
		return itensDaVenda;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	
	
}
