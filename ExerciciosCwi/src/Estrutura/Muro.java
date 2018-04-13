package Estrutura;

//import Armas.Armas;

public class Muro {
	protected int pontosDeDefesa;

	public Muro() {
		this.pontosDeDefesa = 10000;
	}
	
	public boolean verificarSeMuroFoiDestruido() {
		boolean verificarMuroDestruido;
		if (pontosDeDefesa > 0) {
			 verificarMuroDestruido = false;

				
			} else {
		 verificarMuroDestruido = true;
		}
		return verificarMuroDestruido;
	}
	
	public int receberAtaque(int poderAtaqueArma) {
		this.pontosDeDefesa = pontosDeDefesa - poderAtaqueArma;
		if(pontosDeDefesa < 0) {
			verificarSeMuroFoiDestruido();
		}
		return pontosDeDefesa;
	}
	
	

}
