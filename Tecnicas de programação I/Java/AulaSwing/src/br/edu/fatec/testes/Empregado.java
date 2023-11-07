package br.edu.fatec.testes;

public class Empregado {
	private int id;
	private String nome;

	public Empregado(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;

	}

	public String getNome() {
		return nome;

	}

	public String tostring() {
		return "Id: " + this.id + " | Nome: " + this.nome;

	}
}
