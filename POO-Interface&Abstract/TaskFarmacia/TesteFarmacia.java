package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteFarmacia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Throw cliente1 = new Throw(null, 0, 0, null);
		Throw cliente2 = new Throw(null, 0, 0, null);
		
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
