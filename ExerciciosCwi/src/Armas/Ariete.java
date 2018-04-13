package Armas;

public class Ariete extends Armas{
	protected boolean flagPontaDeFerro;
	
	
	public Ariete(String nome, boolean flagPontaDeFerro) {
		super(nome);
		// TODO Auto-generated constructor stub
		this.flagPontaDeFerro = flagPontaDeFerro;
		poderAtaque = 500;
		}
	
	
	
	@Override
	public int getPoderAtaque() {
		// TODO Auto-generated method stub
		if(this.flagPontaDeFerro == true) {
			poderAtaque *= 2;
		} else {
			if(this.flagPontaDeFerro == false) {
			poderAtaque = 500;
			}
		}
		
		return this.poderAtaque;
		
	}



	}
	
	

	
	


