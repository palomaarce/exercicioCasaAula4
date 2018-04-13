package Armas;

public class Catapulta extends Armas{
	protected int alturaAtaqueMetros;

	public Catapulta(String nome, int alturaAtaqueMetros) {
		super(nome);
		// TODO Auto-generated constructor stub
		this.alturaAtaqueMetros = alturaAtaqueMetros;
		tipoAtaque = "terrestre";
		//pq tem poder de ataque maior que o tipo normal
		this.poderAtaque = 3500;
		
	}

	@Override
	public int getPoderAtaque() {
		// TODO Auto-generated method stub
		int poderFinal= this.poderAtaque + (alturaAtaqueMetros*2);
		return poderFinal;
	}
	
	
	
	

}
