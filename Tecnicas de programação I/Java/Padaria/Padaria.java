package br.edu.fatec.padariaManoel.bean;

import java.util.Scanner;

public class Padaria {

	public int qtdPao;
	public int qtdSonho;
	Scanner input = new Scanner(System.in);

	public int getQtdPao() {
		return qtdPao;
	}

	public void setQtdPao(int qtdPao) {
		this.qtdPao = qtdPao;
	}

	public int getQtdSonho() {
		return qtdSonho;
	}

	public void setQtdSonho(int qtdSonho) {
		this.qtdSonho = qtdSonho;
	}

	public void comparaProdutos() {
		if (this.qtdPao > this.qtdSonho) {
			System.out.print("A quantidade de PÃO é maior que a de SONHO");
		} else if (this.qtdSonho > this.qtdPao) {
			System.out.print("A quantidade de SONHO é maior que a de PÃO");
		} else {
			System.out.print("A quantidade de SONHO é igual que a de PÃO");
		}

	}
}
