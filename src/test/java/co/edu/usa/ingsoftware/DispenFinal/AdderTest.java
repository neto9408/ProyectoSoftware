package co.edu.usa.ingsoftware.DispenFinal;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdderTest {

	@Test
	public void testDeberiaDar1SiSolo1() {
		String entrada = "1";
		Adder adder = new Adder();
		int resultado = adder.obtenerSuma(entrada);
		assertEquals(1, resultado );
	}
	@Test 
	public void testDeberiaDar0SiVacio(){
		String entrada = "";
		Adder adder = new Adder();
		int resultado = adder.obtenerSuma(entrada);
		assertEquals(0, resultado );
	}
	@Test 
	public void testDeberiaDar8SiEntrada8(){
		String entrada = "8";
		Adder adder = new Adder();
		int resultado = adder.obtenerSuma(entrada);
		assertEquals(8, resultado );
	}
	void assertSumOfString (int result, String input){
	
		
		assertEquals(result, adder.obtenerSuma(input));
	}

}
