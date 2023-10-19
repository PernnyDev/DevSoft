package br.com.fatec.main;

public class registroContas {
	public static void main(String[] args) {
		data d1 = new data(7, 4, 2017);
		data d2 = new data(15, 5, 2017);
		Cliente c11 = new Cliente("2229384055", "Ana");
		Cliente c12 = new Cliente("2229384055", "Abel");
		Cliente c2 = new Cliente("2229384666", "Mario");
		Cliente[] listaClientes1 = new Cliente[2];
		listaClientes1[0] = c11;
		listaClientes1[1] = c12;
		Cliente[] ListaClientes2 = new Cliente[1];
		ListaClientes2[0] = c2;
		conta conta1 = new contaCorrente(12345, listaClientes1, d1, 100, 0.15);
		conta conta2 = new contaPoupanca(453434739, ListaClientes2, d2, 2000);
		conta1.fazerDeposito(800);
		System.out.println(conta1.getSaldo());
		if (conta1.fazerSaque(900) == true) {
			System.out.println("Saque realizado");
		} else {
			System.out.println("Saque não realizado, saldo insuficiente");
		}
		System.out.println(conta1.getSaldo());
		conta2.fazerDeposito(700);
		System.out.println(conta2.getSaldo());
	}
}