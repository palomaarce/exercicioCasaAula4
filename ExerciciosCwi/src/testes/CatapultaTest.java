package testes;

import static org.junit.Assert.*;
import Armas.Catapulta;

import org.junit.Test;

public class CatapultaTest {

	@Test
	public void testarGetPoderAtaqueComAltura10() {
		Catapulta catapulta = new Catapulta("catapulta super", 10);
		catapulta.getPoderAtaque();
		int resultadoPoderAtaqueEsperado = 3520;
		int resultadoPoderAtaqueObtido = catapulta.getPoderAtaque();
		assertEquals(resultadoPoderAtaqueEsperado, resultadoPoderAtaqueObtido);

	

	}
	
	@Test
	public void testarGetPoderAtaqueComAltura5() {
		Catapulta catapulta = new Catapulta("catapulta super nova", 5);
		catapulta.getPoderAtaque();
		int resultadoPoderAtaqueEsperado = 3510;
		int resultadoPoderAtaqueObtido = catapulta.getPoderAtaque();
		assertEquals(resultadoPoderAtaqueEsperado, resultadoPoderAtaqueObtido);

	}
	
	public void testarGetPoderAtaqueComAltura40() {
		Catapulta catapulta = new Catapulta("catapulta super nova 2", 40);
		catapulta.getPoderAtaque();
		int resultadoPoderAtaqueEsperado = 3540;
		int resultadoPoderAtaqueObtido = catapulta.getPoderAtaque();
		assertEquals(resultadoPoderAtaqueEsperado, resultadoPoderAtaqueObtido);

	}
	
	
}
