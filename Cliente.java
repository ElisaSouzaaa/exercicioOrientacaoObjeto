package exercicioOrientacaoObjeto;

public class Cliente {
	
	private String nome;
	private int idade;
	private String sexo;
	private String pagamento;
	private float saldo;
	
	public Cliente(String nome, int idade, String sexo, String pagamento, float saldo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.pagamento = pagamento;
		this.saldo = saldo;
	}
	
	public void visualizar() {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(sexo);
		System.out.println(pagamento);
		System.out.println(saldo);
		System.out.println("\n");
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
