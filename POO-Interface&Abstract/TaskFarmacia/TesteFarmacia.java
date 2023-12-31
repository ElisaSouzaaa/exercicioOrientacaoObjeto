package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Optional;

public class TesteFarmacia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Throw cliente1 = new Throw(null, 0, 0, null);
		Throw cliente2 = new Throw(null, 0, 0, null);

		String[] dados = new String[3];
		
		System.out.println("Olá, digite seu nome completo por favor:");
		dados[0] = leia.nextLine();
		
		System.out.println("\nAgora digite o Estado que você mora por favor:");
		dados [1] = leia.nextLine();
		
		System.out.println("\nE também precisamos saber seu bairro por favor:");
		dados[2] = leia.nextLine();
		
		Optional<String> checaNulo0 = Optional.ofNullable(dados[0]);
		Optional<String> checaNulo1 = Optional.ofNullable(dados[1]);
		Optional<String> checaNulo2 = Optional.ofNullable(dados[2]);
		
		if (checaNulo0.isPresent() && checaNulo0.get().isBlank()) {
		    System.out.println("\nCliente registrado: Ops algo está faltando aqui. Por favor preencha novamente!");
		    System.exit(0);
		} else {
		    String dado = dados[0].toLowerCase();
		    System.out.println("\nCliente registrado: " + dado + "\n");
		}
		
		if (checaNulo1.isPresent() && checaNulo1.get().isBlank()) {
		    System.out.println("\nEstado registrado: Ops algo está faltando aqui. Por favor preencha novamente!");
		    System.exit(0);
		} else {
		    String dado = dados[1].toLowerCase();
		    System.out.println("\nEstado registrado: " + dado + "\n");
		}
		
		if (checaNulo2.isPresent() && checaNulo2.get().isBlank()) {
		    System.out.println("\nBairro registrado: Ops algo está faltando aqui. Por favor preencha novamente!");
		    System.exit(0);
		} else {
		    String dado = dados[2].toLowerCase();
		    System.out.println("\nCliente registrado: " + dado + "\n");
		}
		
		int respost = 0;
		
			try {
				do {
					cliente1.askUser();
					respost = leia.nextInt();
					switch(respost) {
					case 1:
						cliente1.medicamentos();
						System.out.println("\nQual o nome do produto?");
						leia.nextLine();
						cliente1.setNomeProduto(leia.nextLine());
						
						System.out.println("\nQual a quantidade de produtos?");
						cliente1.setQntProduto(leia.nextInt());
						
						System.out.println("\nQual o valor do produto?");
						cliente1.setValorProduto(leia.nextFloat());
						
						System.out.println("\nQual o método de pagamento?");
						leia.nextLine();
						cliente1.setMetodoPagamento(leia.nextLine());
						
						System.out.println("\nVocê pediu: \n");
						cliente1.products();
						
						System.out.printf("\nO valor total do pedido é de R$ %.2f" , cliente1.getValorProduto() * cliente1.getQntProduto());
						cliente1.visualizar();
						break;
						
					case 2:
						cliente2.perfumaria();
						System.out.println("\nQual o nome do produto?");
						leia.nextLine();
						cliente2.setNomeProduto(leia.nextLine());
						
						System.out.println("\nQual a quantidade de produtos?");
						cliente2.setQntProduto(leia.nextInt());
						
						System.out.println("\nQual o valor do produto?");
						cliente2.setValorProduto(leia.nextFloat());
						
						System.out.println("\nQual o método de pagamento?");
						leia.nextLine();
						cliente2.setMetodoPagamento(leia.nextLine());
						
						System.out.println("\nVocê pediu: \n");
						cliente2.products();
						
						System.out.printf("\nO valor total do pedido é de R$ %.2f" , cliente2.getValorProduto() * cliente2.getQntProduto());
						cliente2.visualizar();
						break;
						}
				}while(respost != 0);
			}catch(InputMismatchException e){
				System.out.println("\nOps! Parece que ocorreu um erro...\nEsse erro ocorre quando você digita letras na pergunta errada." + "\nPor favor verifique e tente novamente!");
			}finally {
				System.out.println("\nA Fármacia Saúde para Todos agradece a preferência!");
			}

		leia.close();
	}

}
