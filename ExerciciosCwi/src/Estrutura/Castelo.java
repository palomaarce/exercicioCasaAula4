package Estrutura;



public class Castelo extends Muro{
	protected String nome;
	protected Muro muro;
	protected boolean flagDestruidoOuNao;
	

	public Castelo(String nome, Muro muro, boolean flagDestruidoOuNao) {
		super();
		
		//ver depois se ele já recebe o valor dos pontos de defesa
		this.nome = nome;
		this.muro = muro;
		this.flagDestruidoOuNao = flagDestruidoOuNao;
		this.pontosDeDefesa = 50000;
		
	}
	
	
	
	public int  receberAtaque(int poderAtaqueArma) {
		
		return super.receberAtaque(poderAtaqueArma);
	}




	public boolean verificarSeCasteloFoiDestruido() {
		boolean verificarCasteloDestruido;
		if (pontosDeDefesa > 0) {
			 verificarCasteloDestruido = false;

				
			} else {
		 verificarCasteloDestruido = true;
		}
		return verificarCasteloDestruido;
	}
	
	
	
	
	public int verificarTipoAtaque(String tipoAtaque, int poderAtaqueArma) {
		if(verificarSeCasteloFoiDestruido() == false) {
			if(tipoAtaque.equalsIgnoreCase("aereo")) {
				receberAtaque( poderAtaqueArma);
			} else {
				if(muro.verificarSeMuroFoiDestruido() == false) {
					muro.receberAtaque(poderAtaqueArma);
					//atacar muro
					
				} else {
					receberAtaque(poderAtaqueArma);
					//atacar castelo
				}
				
			
			}
		}
		return this.pontosDeDefesa;
	}



	
	
	
	

}
