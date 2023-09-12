package exercicioOrientacaoObjeto;

public class TestaGame {

	public static void main(String[] args) {
		Produto novoGame1 = new Produto ("Playstation", "College Hoops", "Esportes", 1, 29.99);
		Produto novoGame2 = new Produto ("Xbox", "Call of Duty", "Ação", 2, 49.99);
		
		novoGame1.visualizar();
		novoGame2.visualizar();
	}
}
