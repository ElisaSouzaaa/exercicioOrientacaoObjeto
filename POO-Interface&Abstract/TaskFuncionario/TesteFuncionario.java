package interfaceAbstratos;

public class TesteFuncionario {

	public static void main(String[] args) {
		Candidato candidato1 = new Candidato("Laura Magaleia", 45, 4,5f);
		Candidato candidato2 = new Candidato("Marvila Natal", 36, 3,6f);
		Candidato candidato3 = new Candidato("Nero Otavio", 27, 2,7f);
		Candidato candidato4 = new Candidato("Olivia Prudente", 18, 1,8f);
		
		candidato1.areaVendas();
		candidato1.dados1();
		candidato1.visualizar();
		
		candidato2.setor();
		candidato2.dados2();
		candidato2.visualizar();
		
		candidato3.areaVendas();
		candidato3.dados3();
		candidato3.visualizar();
		
		candidato4.setor();
		candidato4.dados4();
		candidato4.visualizar();
	}
}