package br.edu.fatec.exemplos;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Exemplo0903_Refatorado{
	private JButton b1,b2;
	private ImageIcon icone;
	private JFrame janela;

	public void montaJanela() {
		janela= new JFrame();
		janela.setTitle("Inserindo bot�es na Janela");
		janela.setSize(350, 100);
		janela.setLocation(50, 50);
		janela.setResizable(false);
		janela.getContentPane().setBackground(new Color(180,180,180));
		janela.getContentPane().setLayout(new FlowLayout());
		janela.getContentPane().add(getB1());
		janela.getContentPane().add(getB2());
		janela.setResizable(false);

		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}



	public JButton getB2() {
		b2=new JButton("Cancelar");

		b2.setMnemonic(KeyEvent.VK_C);
		b2.setToolTipText("Pressione aqui para cancelar");

		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bot�o 2 pressionado");
			}

		};
		b2.addActionListener(listener);
		return b2;
	}



	public JButton getB1() {
		b1=new JButton("Busca",icone);
		b1.setHorizontalTextPosition(AbstractButton.LEFT);//posi��o do texto
		b1.setBackground(new Color(100,180,180));
		b1.setForeground(Color.black);
		b1.setFont(new Font("Script",Font.BOLD,20));
		b1.setEnabled(true);
		b1.setToolTipText("Pressione aqui para realizar uma busca");
		b1.setMnemonic(KeyEvent.VK_B);

		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bot�o 1 pressionado");
			}

		};
		b1.addActionListener(listener);
		return b1;
	}


	public static void main(String[] args) {
		new Exemplo0903_Refatorado().montaJanela();

	}
}
