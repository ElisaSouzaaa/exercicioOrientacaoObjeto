package exercicioOrientacaoObjeto;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Funcionario novoFuncionario1 = new Funcionario(null, 0, null, null, 0);
		Funcionario novoFuncionario2 = new Funcionario(null, 0, null, null, 0);
		
			System.out.println("Digite seu nome: ");
			novoFuncionario1.setNome(leia.nextLine());
			
			System.out.println("\nDigite sua idade: ");
			novoFuncionario1.setIdade(leia.nextInt());
			
			System.out.println("\nDigite o departamento que trabalha: ");
			leia.nextLine();
			novoFuncionario1.setDepartamento(leia.nextLine());
			
			System.out.println("\nDigite seu cargo: ");
			novoFuncionario1.setCargo(leia.nextLine());
			
			System.out.println("\nDigite quantos anos de expriência você tem: ");
			novoFuncionario1.setExperiencia(leia.nextDouble());
			
			System.out.println("\nDigite seu nome: ");
			leia.nextLine();
			novoFuncionario2.setNome(leia.nextLine());
			
			System.out.println("\nDigite sua idade: ");
			novoFuncionario2.setIdade(leia.nextInt());
			
			System.out.println("\nDigite o departamento que trabalha: ");
			leia.nextLine();
			novoFuncionario2.setDepartamento(leia.nextLine());
			
			System.out.println("\nDigite seu cargo: ");
			novoFuncionario2.setCargo(leia.nextLine());
			
			System.out.println("\nDigite quantos anos de expriência você tem: ");
			novoFuncionario2.setExperiencia(leia.nextDouble());
		
		novoFuncionario1.visualizar();
		novoFuncionario2.visualizar();
		leia.close();
	}
}
