package br.edu.fatec.exemplos;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

public class Exemplo0902 extends JFrame{
	JLabel label1,label2,label3,label4;
	
	ImageIcon icone= new ImageIcon("F:/icones/icons/accept.png");
	
	Exemplo0902() {
      setTitle("Inserindo Labels e Imagens na Janela");
      setSize(350, 120);
      //setLocation(50, 50);
      setLocationRelativeTo(null);
      setResizable(false);
      getContentPane().setBackground(new Color(220,220,220));
      
      label1=new JLabel("Aprendendo",JLabel.LEFT);
      label1.setForeground(Color.red);
      label2=new JLabel("OLA");
      label3=new JLabel("Inserir",JLabel.RIGHT);
      label3.setForeground(Color.blue);
      label4=new JLabel("Labels e Imagens",icone,JLabel.CENTER);
      label4.setFont(new Font("Serif",Font.BOLD,20));
      label4.setForeground(Color.black);
      
      getContentPane().setLayout(new GridLayout(4,1));
      getContentPane().add(label1);
      getContentPane().add(label2);
      getContentPane().add(label3);
      getContentPane().add(label4);
      
      
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame janela = new Exemplo0902();
		janela.setUndecorated(true);
		janela.setVisible(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.ERROR_DIALOG);
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
