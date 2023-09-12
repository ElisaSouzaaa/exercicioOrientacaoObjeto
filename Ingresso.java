package exercicioOrientacaoObjeto;

public class Ingresso {
	private String nomeIngresso;
	private String tipoIngresso;
	private int qntIngresso;
	private double valorIngresso;
	private String pgtIngresso;
	
	public Ingresso ( String nomeIngresso, String tipoIngresso, int qntIngresso, double valorIngresso, String pgtIngresso) {
		this.nomeIngresso = nomeIngresso;
		this.tipoIngresso = tipoIngresso;
		this.qntIngresso = qntIngresso;
		this.valorIngresso = valorIngresso;
		this.pgtIngresso = pgtIngresso;
	}
	
	public void visualizar() {
		System.out.println(nomeIngresso );
		System.out.println(tipoIngresso);
		System.out.println(qntIngresso);
		System.out.println(valorIngresso);
		System.out.println(pgtIngresso);
		System.out.println("\n");
	}
	
	public String getNomeIngresso() {
		return nomeIngresso;
	}
	public void setNomeIngresso(String nomeIngresso) {
		this.nomeIngresso = nomeIngresso;
	}
	public String getTipoIngresso() {
		return tipoIngresso;
	}
	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
	public int getQntIngresso() {
		return qntIngresso;
	}
	public void setQntIngresso(int qntIngresso) {
		this.qntIngresso = qntIngresso;
	}
	public double getValorIngresso() {
		return valorIngresso;
	}
	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	public String getPgtIngresso() {
		return pgtIngresso;
	}
	public void setPgtIngresso(String pgtIngresso) {
		this.pgtIngresso = pgtIngresso;
	}
	
	
	

}
