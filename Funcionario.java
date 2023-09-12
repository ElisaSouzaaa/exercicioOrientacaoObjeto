package exercicioOrientacaoObjeto;

public class Funcionario {
	private String nome;
	private int idade;
	private String departamento;
	private String cargo;
	private double experiencia;
	
	public Funcionario(String nome, int idade, String departamento, String cargo, double experiencia) {
		this.nome = nome;
		this.idade = idade;
		this.departamento = departamento;
		this.cargo = cargo;
		this.experiencia = experiencia;
	}

	public void visualizar() {
		System.out.println("\n");
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.departamento);
		System.out.println(this.cargo);
		System.out.println(this.experiencia);
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
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}
}
