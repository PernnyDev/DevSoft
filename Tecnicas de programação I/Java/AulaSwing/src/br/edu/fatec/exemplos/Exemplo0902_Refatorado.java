package br.edu.fatec.exemplos;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

public class Exemplo0902_Refatorado{
	
	private JFrame janela;
	private JLabel label1,label2,label3,label4,labelVazio;
	private ImageIcon icone;
	
	public JLabel getLabelVazio() {
		
		labelVazio=new JLabel("",JLabel.CENTER);
	    labelVazio.setForeground(Color.WHITE);
		return labelVazio;
	}


	
	

	public JLabel getLabel1() {
		label1=new JLabel("Aprendendo",JLabel.CENTER);
	    label1.setForeground(Color.red);
		return label1;
	}

	public JLabel getLabel2() {
      label2=new JLabel(getIcone());
      return label2;
	}

	public JLabel getLabel3() {
	    label3=new JLabel("Inserir",JLabel.CENTER);
	    label3.setForeground(Color.blue);
		return label3;
	}

	public JLabel getLabel4() {
		label4=new JLabel("Labels e Imagens",getIcone(),JLabel.CENTER);
	    label4.setFont(new Font("Serif",Font.BOLD,20));
	    label4.setForeground(Color.red);
		return label4;
	}

	public ImageIcon getIcone() {
		ImageIcon icone= new ImageIcon("src/imagensTop/mao.png");
		return icone;
	}

	private void montaJanela(){
		  janela = new JFrame();
		  janela.setTitle("Inserindo Labels e Imagens na Janela");
		  janela.setSize(350, 350);
		  janela.setLocation(50, 50);
		  //janela.setLocationRelativeTo(null);
		  janela.setResizable(false);
		  janela.getContentPane().setBackground(new Color(220,220,220));
		  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
	      janela.getContentPane().setLayout(new FlowLayout());
	      janela.getContentPane().add(getLabel1());
	      janela.getContentPane().add(getLabel2());
	      janela.getContentPane().add(getLabel3());
	      janela.getContentPane().add(getLabel4());
	      
	      janela.setVisible(true);
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Exemplo0902_Refatorado().montaJanela();  
	
		
	}

}
