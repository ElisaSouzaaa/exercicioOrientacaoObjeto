package exception;

public class Throw extends Farmacia implements Medicamento, Perfumaria {

	public Throw(String nomeProduto, int qntProduto, float valorProduto, String metodoPagamento) {
		super(nomeProduto, qntProduto, valorProduto, metodoPagamento);
	}

	
	public void askUser() {
		System.out.println("Bem-vindo a farmácia Saúde a Todos! Qual categoria deseja comprar?\n1- Medicamento\n2- Perfumaria\n0- Finalizar procedimento" + "\n");
	}
	
	public void products() {
		System.out.println("Produto escolhido: " + this.getNomeProduto());
		System.out.println("Quantidade do produto: " + this.getQntProduto());
		System.out.printf("Valor do produto: %.2f" , this.getValorProduto());
		System.out.println("\nMetodo de pagamento: " + this.getMetodoPagamento());
	}

	@Override
	public void perfumaria() {
		System.out.println("\nVocê selecinou perfumaria!\n");
	}

	@Override
	public void medicamentos() {
		System.out.println("\nVocê elecionou medicamentos!\n");
	}

	@Override
	public void visualizar() {
		System.out.println("\nPedido anotado com sucesso! Em breve chegará até você, volte sempre!" + "\n");
	}

}
