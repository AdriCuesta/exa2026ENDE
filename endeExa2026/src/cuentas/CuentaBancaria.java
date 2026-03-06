package cuentas;

public abstract class CuentaBancaria {

    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
    	if(cantidad < 0) {
    		throw new IllegalArgumentException("No puedes ingresar cantidades negativas");
    	}
        saldo += cantidad;
    }

    public void reintegrar(double cantidad) {
    	if(cantidad < 0) {
    		throw new IllegalArgumentException("No puedes retirar cantidades negativas");
    	}else if(cantidad > saldo) {
    		throw new IllegalArgumentException("No puedes retirar más de lo que tienes ");
    	}
        saldo -= cantidad;
    }
    
    public abstract double calcularInteres();

}

