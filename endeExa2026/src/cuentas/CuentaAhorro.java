package cuentas;

public class CuentaAhorro extends CuentaBancaria {

	private double interes = 0.23;

	public CuentaAhorro(String titular, double saldoInicial, double interes) {
		super(titular, saldoInicial);
		this.interes = interes;
	}

	@Override
	public double calcularInteres() {
		return (saldo * interes);
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

}
