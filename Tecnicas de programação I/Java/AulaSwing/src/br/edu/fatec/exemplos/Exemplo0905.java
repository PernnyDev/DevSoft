package br.edu.fatec.exemplos;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Exemplo0905 extends JFrame implements ActionListener{

	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	
	
	public Exemplo0905() {
		setTitle("Verifica Senha");
        setBounds(300, 50, 350, 90);
	    setResizable(false);
	    getContentPane().setBackground(new Color(150,150,150));
	    getContentPane().setLayout(new GridLayout(2,2));
	    
	    l1=new JLabel("Digite a Senha");
	    l1.setForeground(Color.black);
	    l1.setFont(new Font("",Font.BOLD,14));
	    
	    l2=new JLabel("Validação");
	    l2.setForeground(Color.black);
	    l2.setFont(new Font("",Font.BOLD,14));
	    
	    t1=new JTextField();
	    t1.setForeground(Color.red);
	    
	    p1=new JPasswordField();
	    p1.setEchoChar('?');
	    p1.addActionListener(this);
	    
	    getContentPane().add(l1);
	    getContentPane().add(p1);
	    getContentPane().add(l2);
	    getContentPane().add(t1);
	    
	}
	
	public void actionPerformed(ActionEvent e) {
		  if (new String(p1.getPassword()).equals("JAVA"))
		    t1.setText("Senha Válida");
		  else
			t1.setText("Senha Inválida");
			
		  }
	
	public static void main(String[] args) {
		JFrame janela = new Exemplo0905();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

	}		  
}


