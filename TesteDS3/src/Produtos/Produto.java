package Produtos;

public class Produto {
	private int cdProduto;
	private String dsProduto;
	private float precoUnitario;
	private int qtEstoque;
	
	public Produto(int cd, String descricao, float preco, int quantidade){
		super();
		this.setCdProduto(cd);
		this.setDsProduto(descricao);
		this.setPrecoUnitario(preco);
		this.setQtEstoque(quantidade);
	}
	
	public void setCdProduto(int cdProduto) {
		this.cdProduto = cdProduto;
	}
	public int getCdProduto() {
		return cdProduto;
	}
	public void setDsProduto(String dsProduto) {
		this.dsProduto = dsProduto;
	}
	public String getDsProduto() {
		return dsProduto;
	}
	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public int getQtEstoque() {
		return qtEstoque;
	}

	public void setQtEstoque(int qtEstoque) {
		this.qtEstoque = qtEstoque;
	}
	


}