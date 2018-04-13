package testes;

import static org.junit.Assert.*;
import Armas.Ariete;

import org.junit.Test;

public class ArieteTest {

	@Test
	public void testarGetPoderAtaqueComTrue() {
		Ariete ariete = new Ariete("ariete poder X", true);
		int resultadoPoderAtaqueEsperado = 1000;
		int resultadoPoderAtaqueObtido = ariete.getPoderAtaque();
		assertEquals(resultadoPoderAtaqueEsperado, resultadoPoderAtaqueObtido);
		
	}
	
	@Test
	public void testarGetPoderAtaqueComFalse() {
		Ariete ariete = new Ariete("ariete poder Y", false);
		int resultadoPoderAtaqueEsperado = 500;
		int resultadoPoderAtaqueObtido = ariete.getPoderAtaque();
		assertEquals(resultadoPoderAtaqueEsperado, resultadoPoderAtaqueObtido);
		
	}

}
