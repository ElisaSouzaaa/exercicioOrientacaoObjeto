package exercicioOrientacaoObjeto;

import java.util.Scanner;

public class TesteIngresso {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Ingresso novoIngresso1 = new Ingresso(null, null, 0, 0, null);
		Ingresso novoIngresso2 = new Ingresso(null, null, 0, 0, null);
		int resposta = 0;
		
		System.out.println("Bem-vindo a nossa bilheteria! Digite as informações ou digite 0 para sair: \n" );
		
		do {
			System.out.println("Para qual evento é o seu ingresso? " );
			novoIngresso1.setNomeIngresso(leia.nextLine());
			
			System.out.println("Qual tipo do ingresso: Meia-entrada ou Inteira? ");
			novoIngresso1.setTipoIngresso(leia.nextLine());
			
			System.out.println("Quantos ingressos possui? ");
			novoIngresso1.setQntIngresso(leia.nextInt());
			
			System.out.println("Qual o valor do(s) ingressos? ");
			novoIngresso1.setValorIngresso(leia.nextDouble());
			
			System.out.println("Qual o método de pagamento? ");
			novoIngresso1.setPgtIngresso(leia.nextLine());
			
			System.out.println("Para qual evento é o seu ingresso? " );
			novoIngresso2.setNomeIngresso(leia.nextLine());
			
			System.out.println("Qual tipo do ingresso: Meia-entrada ou Inteira? ");
			novoIngresso2.setTipoIngresso(leia.nextLine());
			
			System.out.println("Quantos ingressos possui? ");
			novoIngresso2.setQntIngresso(leia.nextInt());
			
			System.out.println("Qual o valor do(s) ingressos? ");
			novoIngresso2.setValorIngresso(leia.nextDouble());
			
			System.out.println("Qual o método de pagamento? ");
			novoIngresso2.setPgtIngresso(leia.nextLine());
		}while(resposta != -1);
		
		novoIngresso1.visualizar();
		
		leia.close();

	}

}
