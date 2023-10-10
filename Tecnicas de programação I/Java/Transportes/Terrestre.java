package br.com.transporte;

public class Terrestre extends Transporte {
	protected int numRodas;

	public Terrestre(int capacidadePessoas, int numRodas) {
		super(capacidadePessoas);

		this.numRodas = numRodas;

	}

	@Override

	public String mostrarDados() {

		return super.mostrarDados() + "Quantidade de Rodas: " + this.numRodas + "\n";
	}
}