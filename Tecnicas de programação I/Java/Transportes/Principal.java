package br.com.transporte;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		Transporte[] conjuntoTransporte = new Transporte[(5)];

		for (int j = 0 ; j < 3; j++) {
			System.out.println("Informe os dados do carro:" + (j + 1) + "\n");
			System.out.println("Informe a capacidade de pessoas:");
			int capPessoas = scanner.nextInt();
			System.out.println("Informe o numero de rodas:");
			int numRodas = scanner.nextInt();
			System.out.println("Informe a cor do carro:");
			String corAuto = scanner.next();
			System.out.println("Informe o numero de portas:");
			int numPortas = scanner.nextInt();
			System.out.println("Informe a placa:");
			String placaAuto = scanner.next();
			conjuntoTransporte[j] = new Automovel(capPessoas, numRodas, corAuto, numPortas, placaAuto);

		};

		for (int i = 3; i < 5; i++) {
			System.out.println("Informe os dados do Navio:" + (i + 1) + "\n");
			System.out.println("Informe a capacidade de pessoas:");
			int capPessoas = scanner.nextInt();
			System.out.println("Informe o porte bruto:");
			int porteBruto = scanner.nextInt();
			System.out.println("Informe o porte Liquido:");
			int porteLiquido = scanner.nextInt();

			conjuntoTransporte[i] = new Navio(capPessoas, porteBruto, porteLiquido);
		}
		;

		for (int i = 0; i < conjuntoTransporte.length; i++) {

			System.out.println("Os dados do " + conjuntoTransporte[i].getClass().getSimpleName() + " são:");

			System.out.println(conjuntoTransporte[i].mostrarDados());

		}

	}

}