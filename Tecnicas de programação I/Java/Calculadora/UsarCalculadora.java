package br.edu.fatec.calculadoraMarota.principal;

import java.util.Scanner;

import br.edu.fatec.calculadoraMarota.bean.Calculadora;

public class UsaCalculadora {

	public static void main(String[] args) {

		int opcao = 0;
		boolean laco = false;
		Scanner input = new Scanner(System.in);
		Calculadora novaCalculadora = new Calculadora();

				
		while (!laco) {
			System.out.println(
					"Informe qual operação quer fazer:\n (1)-Soma;\n (2)-Subtração;\n (3)-multiplicação;\n (4)-Divisão;\n (5)-Sair");
			opcao = input.nextInt();

			switch (opcao) {
			case 1:

				novaCalculadora.infoNumeros();
				novaCalculadora.somar(novaCalculadora.num1, novaCalculadora.num2);
				novaCalculadora.imprimir();
				laco = true;
				break;

			case 2:
				novaCalculadora.infoNumeros();
				novaCalculadora.subtrair(novaCalculadora.num1, novaCalculadora.num2);
				novaCalculadora.imprimir();
				laco = true;
				break;

			case 3:
				novaCalculadora.infoNumeros();
				novaCalculadora.multiplicar(novaCalculadora.num1, novaCalculadora.num2);
				novaCalculadora.imprimir();
				laco = true;
				break;

			case 4:
				novaCalculadora.infoNumeros();
				novaCalculadora.dividir(novaCalculadora.num1, novaCalculadora.num2);
				novaCalculadora.imprimir();
				laco = true;
				break;

			case 5:
				laco = true;
				break;

			default:
				System.out.println("Operação invalida, digite novamente");
				break;
			}

		}

	}

}
