package interfaceAbstratos;

public abstract class Funcionario {
	private String nome;
	private int idade;
	private float experiencia;
	
	public Funcionario(String nome, int idade, float experiencia) {
		this.nome = nome;
		this.idade = idade;
		this.experiencia = experiencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}
	
	public abstract void visualizar();
	
}
