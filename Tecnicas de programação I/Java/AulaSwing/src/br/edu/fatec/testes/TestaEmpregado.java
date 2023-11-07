package br.edu.fatec.testes;

import java.util.ArrayList;
import java.util.List;

public class TestaEmpregado {

	public static void main(String[] args) {
		List<Empregado> lista = new ArrayList<Empregado>();
		lista.add(new Empregado(11, "Karlota"));
		lista.add(new Empregado(5, "Chovronaldo"));
		lista.add(new Empregado(14, "Kiev"));
		lista.add(new Empregado(13, "Amandita"));
		lista.add(new Empregado(9, "Keropita"));

		for (Empregado emp : lista) {
			System.out.println("Id: "+ emp.getId() +" | " +"Nome: " + emp.getNome());
		}
	}
}
