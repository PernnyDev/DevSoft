package br.com.transporte;

public class Automovel extends Terrestre {
	private String cor;
	private String placa;
	private int numPortas;

	public Automovel(int capacidadePessoas, int numRodas, String cor, int numPortas, String placa) {
		super(capacidadePessoas, numRodas);
		this.cor = cor;
		this.numPortas = numPortas;
		this.placa = placa;

	}

@Override

public String mostrarDados() {
return super.mostrarDados() + "Cor: " +this.cor + "Placa: " + this.placa +
"\nQuantidade de Portas: " + this.numPortas +"\n";
		 }
}