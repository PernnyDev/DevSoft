package br.edu.fatec.exemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.text.NumberFormat;

public class Exemplo0906 extends JFrame implements ActionListener{
	JTextField t1,t2;
	double valor1=1000.54;
	int valor2=100;
	NumberFormat df1,df2;
	
	
	public Exemplo0906() {
	
		setTitle("Formatando Números");
		setBounds(230, 50, 350, 65);
		getContentPane().setBackground(new Color(150,150,150));
		getContentPane().setLayout(new GridLayout(1,2));
		df1=NumberFormat.getNumberInstance();
		df2=NumberFormat.getNumberInstance();
		df1.setMinimumFractionDigits(4);
		df2.setMinimumFractionDigits(2);
		t1=new JTextField();
		t2=new JTextField();
		t1.setText(""+df1.format(valor1));
		t2.setText(""+df2.format(valor2));
		getContentPane().add(t1);
		getContentPane().add(t2);
	}
	
	
	public void actionPerformed(ActionEvent e){}
	public static void main(String[] args) {
		JFrame janela = new Exemplo0906();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

	}
}


