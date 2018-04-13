package testes;

import static org.junit.Assert.*;
import Estrutura.Muro;

import org.junit.Test;

public class MuroTest {

	@Test
	public void testarSeMuroFoiDestruido() {
		Muro muro = new Muro();
		muro.verificarSeMuroFoiDestruido();
		boolean resultadoMuroDestruidoEsperado = false;
		boolean resultadoMuroDestruidoObtido = muro.verificarSeMuroFoiDestruido();
		assertEquals(resultadoMuroDestruidoEsperado, resultadoMuroDestruidoObtido);
	}
	
	@Test
	public void testarReceberAtaqueNoMuroComPoder1000() {
		Muro muro = new Muro();
		int resultadoPontosDefesaMuroEsperado = 9000;
		int resultadoPontosDefesaMuroObtido = muro.receberAtaque(1000);
		assertEquals(resultadoPontosDefesaMuroEsperado, resultadoPontosDefesaMuroObtido);
	}
	
	@Test
	public void testarReceberAtaqueNoMuroComPoder2000() {
		Muro muro = new Muro();
		int resultadoPontosDefesaMuroEsperado = 8000;
		int resultadoPontosDefesaMuroObtido = muro.receberAtaque(2000);
		assertEquals(resultadoPontosDefesaMuroEsperado, resultadoPontosDefesaMuroObtido);
	}
	
	
	@Test
	public void testarReceberAtaqueNoMuroComPoder10000ESeMuroFoiDestruido() {
		Muro muro = new Muro();
		//muro.receberAtaque(1000);
		int resultadoPontosDefesaMuroEsperado = 0;
		int resultadoPontosDefesaMuroObtido = muro.receberAtaque(10000);
		assertEquals(resultadoPontosDefesaMuroEsperado, resultadoPontosDefesaMuroObtido);
		muro.verificarSeMuroFoiDestruido();
		boolean resultadoEsperado = true;
		boolean resultadoObtido= muro.verificarSeMuroFoiDestruido();
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	
	

}
