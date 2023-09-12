package exercicioOrientacaoObjeto;

public class Produto {
	private String videoGame;
	private String nomeJogo;
	private String generoJogo;
	private int duracaoJogo;
	private double valorJogo;
	
	public Produto (String videoGame, String nomeJogo, String generoJogo, int duracaoJogo, double valorJogo) {
		this.videoGame = videoGame;
		this.nomeJogo = nomeJogo;
		this.generoJogo = generoJogo;
		this.duracaoJogo = duracaoJogo;
		this.valorJogo = valorJogo;
	}
	
	
	public void visualizar() {
		System.out.println("Nome do vídeogame: " + videoGame);
		System.out.println("Nome do jogo: " + nomeJogo);
		System.out.println("Gênero do jogo: " + generoJogo);
		System.out.println("Duração do jogo: " + duracaoJogo + "h");
		System.out.println("Valor do jogo: " + "R$" + valorJogo + " à vista");
		System.out.println("\n");
	}
	
	public String getVideogame() {
		return videoGame;
	}
	public void setVideogame(String videogame) {
		this.videoGame = videogame;
	}
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public String getGeneroJogo() {
		return generoJogo;
	}
	public void setGeneroJogo(String generoJogo) {
		this.generoJogo = generoJogo;
	}
	public int getDuracaoJogo() {
		return duracaoJogo;
	}
	public void setDuracaoJogo(int duracaoJogo) {
		this.duracaoJogo = duracaoJogo;
	}
	public double getValorJogo() {
		return valorJogo;
	}
	public void setValorJogo(double valorJogo) {
		this.valorJogo = valorJogo;
	}
	
	
	
	

}
