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
public class CuentaAhorroCalcularInterestTestParam {

	private double interesResultado;

	private static ArrayList<CuentaAhorro> cuentas;
	private static CuentaAhorro cuentaUtilizada;
	private CuentaAhorro cuentaParam;

	public CuentaAhorroCalcularInterestTestParam(CuentaAhorro cuenta, double interesResultado) {
		this.cuentaParam = cuenta;
		this.interesResultado = interesResultado;
	}

	@Parameters
	public static Collection<Object[]> parametros() {
		return Arrays.asList(new Object[][] { { cuentas.get(0), 50 }, { cuentas.get(1), 10 }, { cuentas.get(2), 60 },
			{ cuentas.get(3), 60 }, { cuentas.get(4), 0 } });
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cuentas = new ArrayList<>();
		cuentas.add(new CuentaAhorro("Vin", 1000, 0.05));
		cuentas.add(new CuentaAhorro("Paul", 500, 0.02));
		cuentas.add(new CuentaAhorro("Diesel", 2000, 0.03));
		cuentas.add(new CuentaAhorro("Walker", 1500, 0.04));
		cuentas.add(new CuentaAhorro("Chris Bumsted", 0, 0.05));
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
