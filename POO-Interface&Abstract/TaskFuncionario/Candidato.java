package interfaceAbstratos;

public class Candidato extends Funcionario implements Gerente, Vendedor{
	
	public Candidato(String nome, int idade, float experiencia, float f) {
		super(nome,idade,experiencia);
	}

	@Override
	public void areaVendas() {
		System.out.println("\nVaga de: Vendedor" + "\nNa area de: Promotoria de Vendas");
		
	}

	@Override
	public void setor() {
		System.out.println("\nVaga de: Gerente" + "\nNa area de: Àrea de Administração");
		
	}
	
	@Override
	public void visualizar() {
		System.out.println("Contratado!");
	}
	
	public void dados1() {
		System.out.println("\nNome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Experiência: " + getExperiencia() + " ano(s)");
	}
	
	public void dados2() {
		System.out.println("\nNome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Experiência: " + getExperiencia() + " ano(s)");
	}
	
	public void dados3() {
		System.out.println("\nNome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Experiência: " + getExperiencia() + " ano(s)");
	}
	
	public void dados4() {
		System.out.println("\nNome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Experiência: " + getExperiencia() + " ano(s)");
	}
}