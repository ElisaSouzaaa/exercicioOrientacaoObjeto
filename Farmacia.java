package exercicioOrientacaoObjeto;

public class Farmacia {
	private String nomeProduto;
	private String catgProduto;
	private int qntProduto;
	private double valorProduto;
	private String metodoPagamento;
	
	public void visualizar() {
		System.out.println("Nome do produto: " + this.nomeProduto);
		System.out.println("Categoria do produto: " + this.catgProduto);
		System.out.println("Quantidade do produto: " + this.qntProduto);
		System.out.println("Valor do produto: " + this.valorProduto);
		System.out.println("Método de pagamento: " + this.metodoPagamento);
		System.out.println("\n");
	}
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCatgProduto() {
		return catgProduto;
	}
	public void setCatgProduto(String catgProduto) {
		this.catgProduto = catgProduto;
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
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
}
