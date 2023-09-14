package exception;

public abstract class Farmacia {

	private String nomeProduto;
	private int qntProduto;
	private float valorProduto;
	private String metodoPagamento;
	
	
	public Farmacia(String nomeProduto, int qntProduto, float valorProduto, String metodoPagamento) {
		this.nomeProduto = nomeProduto;
		this.qntProduto = qntProduto;
		this.valorProduto = valorProduto;
		this.metodoPagamento = metodoPagamento;
	}
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQntProduto() {
		return qntProduto;
	}
	public void setQntProduto(int qntProduto) {
		this.qntProduto = qntProduto;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
		
	public abstract void visualizar();
}
