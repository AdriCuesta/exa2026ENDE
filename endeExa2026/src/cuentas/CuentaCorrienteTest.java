package cuentas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CuentaCorrienteTest {

	private static CuentaCorriente cuenta = new CuentaCorriente("Vin", 2000, 5);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void reintegroTest1() {
		Exception errorAtrapado = assertThrows(IllegalArgumentException.class, () ->
		cuenta.reintegrar(-1000));
		
		assertEquals("No puedes retirar cantidades negativas", errorAtrapado.getMessage());
	}
	
	@Test
	public void reintegroTest2() {
		Exception errorAtrapado = assertThrows(IllegalArgumentException.class, () ->
		cuenta.reintegrar(10000));
		
		assertEquals("No puedes retirar más de lo que tienes ", errorAtrapado.getMessage());
	}
	
	@Test
	public void ingresoTest1() {
		Exception errorAtrapado = assertThrows(IllegalArgumentException.class, () ->
		cuenta.ingresar(-1000));
		
		assertEquals("No puedes ingresar cantidades negativas", errorAtrapado.getMessage());
	}

}
