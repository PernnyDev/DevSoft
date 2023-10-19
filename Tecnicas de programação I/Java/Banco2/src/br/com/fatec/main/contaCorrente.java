package br.com.fatec.main;

public class contaCorrente extends conta {
	double taxaMovimentacao;

	public contaCorrente(int nroConta, Cliente[] correntistas, data dataApertura, double monto,
			double taxaMovimentacao) {
		super(nroConta, correntistas, dataApertura, monto);
		this.taxaMovimentacao = taxaMovimentacao;
	}

	public void fazerDeposito(double monto) {
		System.out.println("Será cobrada uma taxa de: " + taxaMovimentacao);
		super.fazerDeposito(monto - taxaMovimentacao);
	}

	public boolean fazerSaque(double monto) {
		System.out
				.println("Será cobrada uma taxa de: " + taxaMovimentacao + " " + "      caso exista saldo suficiente");
		return super.fazerSaque(monto + taxaMovimentacao);
	}
}