package br.edu.fatec.calculadoraMarota.bean;

import java.util.Scanner;



public class Calculadora {

	public double num1;
	public double num2;
	private double resultado;
	Scanner input = new Scanner(System.in);
	
	
	
    
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void somar(double num1, double num2) {
		setResultado(num1 + num2);
	}

	public void subtrair(double num1, double num2) {
		setResultado(num1 - num2);
	}

	public void multiplicar(double num1, double num2) {
		setResultado(num1 * num2);
	}

	public void dividir(double num1, double num2) {
		setResultado(num1 / num2);
	}
	public void infoNumeros() {
		System.out.println("Informe dois numeros");
		 num1 = input.nextDouble();
		 num2 = input.nextDouble();
	}
	public void imprimir() {
		System.out.print("O resultado da operação é: " + getResultado()+"\n");
	}
}

