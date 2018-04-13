package testes;

import static org.junit.Assert.*;
import Estrutura.Castelo;
import Estrutura.Muro;

import org.junit.Test;

public class CasteloTest {

	@Test
	public void testarVerificarSeCasteloFoiDestruido() {
		Muro muro = new Muro();
		Castelo castelo = new Castelo("Castelo Imperial",muro , false);
		castelo.verificarSeCasteloFoiDestruido();
		boolean resultadoSeCasteloFoiDestruidoEsperado = false;
		boolean resultadoSeCasteloFoiDestruidoObtido = castelo.verificarSeCasteloFoiDestruido();
		assertEquals(resultadoSeCasteloFoiDestruidoEsperado, resultadoSeCasteloFoiDestruidoObtido);
	}
	
	@Test
	public void testarReceberAtaqueCasteloForca10000() {
		Muro muro = new Muro();
		Castelo castelo = new Castelo("Castelo Imperial luxo",muro , false);
		int resultadoPoderDefesaEsperado = 40000;
		int resultadoPoderDefesaObtido = castelo.receberAtaque(10000);
		assertEquals(resultadoPoderDefesaEsperado, resultadoPoderDefesaObtido);
	}
	
	@Test
	public void testarReceberAtaqueCasteloForca1000() {
		Muro muro = new Muro();
		Castelo castelo = new Castelo("Castelo Imperial luxo2",muro , false);
		int resultadoPoderDefesaEsperado = 49000;
		int resultadoPoderDefesaObtido = castelo.receberAtaque(1000);
		assertEquals(resultadoPoderDefesaEsperado, resultadoPoderDefesaObtido);
	}
	
	@Test
	public void testarReceberAtaqueCasteloESeFoiDestruido() {
		Muro muro = new Muro();
		Castelo castelo = new Castelo("Castelo Imperial luxo",muro , false);
		int resultadoPoderDefesaEsperado = 0;
		int resultadoPoderDefesaObtido = castelo.receberAtaque(50000);
		assertEquals(resultadoPoderDefesaEsperado, resultadoPoderDefesaObtido);
		castelo.verificarSeMuroFoiDestruido();
		boolean resultadoSeCasteloFoiDestruidoEsperado = true;
		boolean resultadoSeCasteloFoiDestruidoObtido = castelo.verificarSeMuroFoiDestruido();
		assertEquals(resultadoSeCasteloFoiDestruidoEsperado, resultadoSeCasteloFoiDestruidoObtido);
	}
	
	@Test
	public void testarTipoDeAtaqueAoCastelo() {
		Muro muro = new Muro();
		Castelo castelo = new Castelo("Castelo Imperial luxooo",muro , false);

		int resultadoPontosDefesaCasteloAoSerAtacadoEsperado = 40000;
		int resultadoPontosDefesaCasteloAoSerAtacadoObtido = castelo.verificarTipoAtaque("aereo", 10000);
		assertEquals(resultadoPontosDefesaCasteloAoSerAtacadoEsperado, resultadoPontosDefesaCasteloAoSerAtacadoObtido);
		
		
	}
	
	
	
	

}
