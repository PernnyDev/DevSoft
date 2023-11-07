package br.edu.fatec.exemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo0903 extends JFrame implements ActionListener{
	JButton b1,b2;
	ImageIcon icone= new ImageIcon("F:/icones/icons/anchor.png");
	
	Exemplo0903() {
      setTitle("Inserindo botões na Janela");
      setSize(350, 100);
      setLocation(50, 50);
      setResizable(false);
      getContentPane().setBackground(new Color(180,180,180));
      
      b1=new JButton("Busca",icone);
      b1.setHorizontalTextPosition(AbstractButton.LEFT);//posição do texto
      b1.setBackground(new Color(100,180,180));
      b1.setForeground(Color.black);
      b1.setFont(new Font("Script",Font.BOLD,20));
      b1.setEnabled(true);
      b1.addActionListener(this);
      
      b1.setToolTipText("Pressione aqui para realizar uma busca");
      b1.setMnemonic(KeyEvent.VK_B);
          
      b2=new JButton("Cancelar");
      b2.addActionListener(this);
      b2.setMnemonic(KeyEvent.VK_C);
      b2.setToolTipText("Pressione aqui para cancelar");
      
      getContentPane().setLayout(new FlowLayout());
      getContentPane().add(b1);
      getContentPane().add(b2);
      
      setResizable(false);
	}

	public void actionPerformed(ActionEvent e) {
	  if (e.getSource()==b1){
		  System.out.println("Botão 1 pressionado");
	  }
	  if (e.getSource()==b2){
		  System.out.println("Botão 2 pressionado");
	  }
	}
	
	public static void main(String[] args) {
		JFrame janela = new Exemplo0903();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
	}
}
