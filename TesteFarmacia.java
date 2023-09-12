package exercicioOrientacaoObjeto;

public class TesteFarmacia {

	public static void main(String[] args) {
		Farmacia novoProduto1 = new Farmacia();
		Farmacia novoProduto2 = new Farmacia();
		
		novoProduto1.setNomeProduto("Analgésico");
		novoProduto1.setCatgProduto("Medicamentos");
		novoProduto1.setQntProduto(3);
		novoProduto1.setValorProduto(9.99);
		novoProduto1.setMetodoPagamento("Cartão de crédito");
		
		novoProduto2.setNomeProduto("Absorvente");
		novoProduto2.setCatgProduto("Higiene");
		novoProduto2.setQntProduto(1);
		novoProduto2.setValorProduto(12.99);
		novoProduto2.setMetodoPagamento("Dinheiro");
		
		novoProduto1.visualizar();
		novoProduto2.visualizar();
		
		

	}

}
