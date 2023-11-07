package br.edu.fatec.exemplos;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Exemplo0905_Refatorado{

	private JLabel l1,l2;
	private JTextField t1;
	private JPasswordField p1;
	private JFrame janela;
	
	public JLabel getL1() {
	    l1=new JLabel("Digite a Senha");
	    l1.setForeground(Color.black);
	    l1.setFont(new Font("",Font.BOLD,14));
		l1.setBounds(new Rectangle(12, 20,200, 33));

		return l1;
	}

	public JLabel getL2() {
		 l2=new JLabel("Validação");
		 l2.setForeground(Color.black);
		 l2.setFont(new Font("",Font.BOLD,14));
 		 l2.setBounds(new Rectangle(12, 60, 67, 33));

		return l2;
	}

	public JTextField getT1() {
		t1=new JTextField();
		t1.setForeground(Color.red);
		t1.setBounds(new Rectangle(162, 60, 100, 33));
		return t1;
	}

	public JPasswordField getP1() {
	    p1=new JPasswordField();
	    p1.setEchoChar('?');
		p1.setBounds(new Rectangle(162, 20,100, 33));
	    

	    ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				 if (new String(p1.getPassword()).equals("JAVA"))
					    t1.setText("Senha Válida");
			     else
						t1.setText("Senha Inválida");
						
					  
			}
		};
		p1.addActionListener(listener);
		return p1;
	}
	
	
	
	public void montaJanela(){
		janela = new JFrame();
		janela.setTitle("Verifica Senha");
		janela.setBounds(0, 0, 350, 200);
	    janela.setLocationRelativeTo(null);

		//janela.setResizable(false);
		janela.getContentPane().setBackground(new Color(150,150,150));
		janela.getContentPane().setLayout(null);
		
	    janela.getContentPane().add(getL1());
	    janela.getContentPane().add(getP1());
	    janela.getContentPane().add(getL2());
	    janela.getContentPane().add(getT1());
	    
	    janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	


	
	public static void main(String[] args) {
		new Exemplo0905_Refatorado().montaJanela();
		

	}

		  
}


