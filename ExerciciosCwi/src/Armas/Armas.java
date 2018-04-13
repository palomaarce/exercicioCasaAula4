package Armas;

public class Armas {
	protected String nome, tipoAtaque;
	protected int poderAtaque;
	
	public Armas(String nome) {
		this.nome = nome;
		this.tipoAtaque = "normal";
		this.poderAtaque = 20;
	}
	
	public int getPoderAtaque() {
		return poderAtaque;
	}
	
	
	
	

}
