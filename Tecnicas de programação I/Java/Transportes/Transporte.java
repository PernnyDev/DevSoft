package br.com.transporte;

public class Transporte {
	protected int capacidadePessoas;

	public Transporte(int capacidadePessoas) {
		super();
		this.capacidadePessoas = capacidadePessoas;

	}

	public String mostrarDados() {
		return "Capaciade de pessoas: " + this.capacidadePessoas + "\n";

	}

}
