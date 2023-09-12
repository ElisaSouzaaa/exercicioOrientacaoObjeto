package exercicioOrientacaoObjeto;

public class TesteCliente {

	public static void main(String[] args) {
		PessoaFisica PessoaFisica1 = new PessoaFisica("Cicloniudo Genivaldo", 118, "Masculino", "Ouro", 459, 15485252);
		PessoaFisica PessoaFisica2 = new PessoaFisica("Cicloneia Genivaldo", 120, "Feminino", "Ouro", 918, 01345210);
		PessoaJuridica PessoaJuridca1 = new PessoaJuridica("Fadaleia Naturale", 228, "Feminino", "Diamantes", 894, 1324521, 0001234);
		PessoaJuridica PessoaJuridca2 = new PessoaJuridica("Jimbei Oyabun", 154, "Masculino", "Moedas de prata", 924, 3254690, 0004321);
		
		PessoaFisica1.visualizar();
		PessoaFisica2.visualizar();
		PessoaJuridca1.visualizar();
		PessoaJuridca2.visualizar();
		
	}
}
