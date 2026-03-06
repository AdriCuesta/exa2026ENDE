package cuentas;

public class CuentaCorriente extends CuentaBancaria {
	
	private double comision = 0.23;

	public CuentaCorriente(String titular, double saldoInicial,double comision) {
		super(titular,saldoInicial);
		this.comision = comision;
	}

	@Override
	public double calcularInteres() {
		return comision;
	}
	
	

}
