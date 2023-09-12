package exercicioOrientacaoObjeto;

public class PessoaFisica extends Cliente {
	private int cpf;
	public PessoaFisica(String nome, int idade, String sexo, String pagamento, float saldo, int cpf) {
		super(nome, idade, sexo, pagamento, saldo);
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSexo());
		System.out.println(getPagamento());
		System.out.println(getSaldo());
		System.out.println(getCpf());
		System.out.println("\n");
	}
}
