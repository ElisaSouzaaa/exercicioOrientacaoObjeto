package exercicioOrientacaoObjeto;

public class PessoaJuridica extends PessoaFisica {
	private int cnpj;
	public PessoaJuridica(String nome, int idade, String sexo, String pagamento, float saldo, int cpf, int cnpj) {
		super(nome, idade, sexo, pagamento, saldo,cpf);
		this.cnpj = cnpj;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizar() {
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSexo());
		System.out.println(getPagamento());
		System.out.println(getSaldo());
		System.out.println(getCpf());
		System.out.println(getCnpj());
		System.out.println("\n");
	}
}
