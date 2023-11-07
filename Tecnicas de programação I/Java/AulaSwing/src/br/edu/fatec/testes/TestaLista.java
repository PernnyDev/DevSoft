package br.edu.fatec.testes;

import java.util.*;

public class TestaLista {

	public static void main(String[] args) {
		List<String> listal = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe 5 nomes");

		for (int i = 0; i < 5; i++) {
			listal.add(entrada.next());

		}

		listal.add("CHifronildo");

		Collections.sort(listal);

		for (String resultado : listal) {
			System.out.println(resultado);
		}
	}
}