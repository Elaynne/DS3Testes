package Produtos;


public class ItemDaVenda {
	private Produto produto;
	private int quantidade;
	
	public ItemDaVenda (Produto produto, int quantidade){
		super();
		this.setProduto(produto);
		this.setQuantidade(quantidade);
	}
	
	public float obterSubTotal(){
		float subTotal = getProduto().getPrecoUnitario() * getQuantidade();
		return subTotal;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}
}