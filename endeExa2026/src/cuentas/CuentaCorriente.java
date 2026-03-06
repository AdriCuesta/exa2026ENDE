package cuentas;

public class CuentaCorriente extends CuentaBancaria {

	private double comision;

	public CuentaCorriente(String titular, double saldoInicial, double comision) {
		super(titular, saldoInicial);
		this.comision = comision;
	}

	@Override
	public double calcularInteres() {
		return comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

}
