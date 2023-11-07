package br.edu.fatec.exemplos;


import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Exemplo0901 extends JFrame{
	
	Exemplo0901() {
      setTitle("Minha primeira Aplicação");//Esse método define o titulo da janela
      setSize(400, 400);
      //setLocation(300, 150);
      setResizable(false);
      setLocationRelativeTo(null);
      getContentPane().setBackground(Color.green);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame janela = new Exemplo0901();
		janela.setVisible(true);
		
	}

}
