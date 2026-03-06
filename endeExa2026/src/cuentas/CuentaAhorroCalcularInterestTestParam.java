package cuentas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CuentaCorrienteCalcularInterestTestParam {

	private double interesResultado;

	private static ArrayList<CuentaCorriente> cuentas;
	private static CuentaCorriente cuentaUtilizada;
	private CuentaCorriente cuentaParam;

	public CuentaCorrienteCalcularInterestTestParam(CuentaCorriente cuenta, double interesResultado) {
		this.cuentaParam = cuenta;
		this.interesResultado = interesResultado;
	}

	@Parameters
	public static Collection<Object[]> parametros() {
		return Arrays.asList(new Object[][] { { cuentas.get(0), -10 }, { cuentas.get(1), -5 }, { cuentas.get(2), -20 },
			{ cuentas.get(3), 0 }, { cuentas.get(4), -15 } });
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cuentas = new ArrayList<>();
		cuentas.add(new CuentaCorriente("Vin", 1000, 10));
		cuentas.add(new CuentaCorriente("Paul", 500, 5));
		cuentas.add(new CuentaCorriente("Diesel", 2000, 20));
		cuentas.add(new CuentaCorriente("Walker", 1500, 0));
		cuentas.add(new CuentaCorriente("Chris Bumsted", 0, 15));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		cuentas = null;
	}

	@Before
	public void setUp() throws Exception {
		cuentaUtilizada = cuentaParam;
	}

	@After
	public void tearDown() throws Exception {
		cuentaUtilizada = null;
	}
	
	@Test
	public void calcularInteresTest() {
		assertEquals(interesResultado,cuentaUtilizada.calcularInteres());
	}

	@Ignore
	@Test
	public void testFiscal() {
		
	}

}
