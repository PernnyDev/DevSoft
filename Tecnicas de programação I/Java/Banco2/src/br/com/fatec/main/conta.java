package br.com.fatec.main;


public class conta {
	private int nroConta;
	private double saldo;
	private Cliente[] clientes;
	private data dataApertura;

	public conta(int nroConta, Cliente[] clientes, data dataApertura, double monto) {
		this.nroConta = nroConta;
		this.saldo = monto;
		this.clientes = clientes;
		this.dataApertura = dataApertura;
	}

	public void fazerDeposito(double monto) {
		saldo += monto;
	}
	
	

	public double getSaldo() {
		return saldo;
	}

	public boolean fazerSaque(double monto) {
		if (monto <= saldo) {
			saldo -= monto;
			return true;
		}

		else
			return false;
	}
}