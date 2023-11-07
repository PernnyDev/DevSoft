package br.edu.fatec.exemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Exemplo0909 {
	private JFrame janela;
	private JLabel label1;
	private JCheckBox c1,c2;
	private int negrito=0,italico=0;
		
	
	public static void main(String[] args) {
		
		new Exemplo0909().montaJanela();
		
	}
	
	public void montaJanela(){
		janela = new JFrame();
		janela.getContentPane().setBackground(new Color(180,180,180));
		janela.setTitle("Uso do Jcheckbox");
		janela.setBounds(250, 50, 300, 70);
		janela.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
				
		janela.getContentPane().add(getLabel1());
		janela.getContentPane().add(getC1());
		janela.getContentPane().add(getC2());
		
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
		


	public JLabel getLabel1() {
		label1= new JLabel("Java");
		label1.setFont(new Font("Arial",Font.PLAIN,20));
		label1.setForeground(Color.black);
		return label1;
	}

	public JCheckBox getC1() {
		c1=new JCheckBox("Negrito");
		c1.setBackground(new Color(180,180,180));
				
		ItemListener listener = new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					negrito=Font.BOLD;
				else
					negrito=Font.PLAIN;
				label1.setFont(new Font("Arial",negrito+italico,20));
			}
		};
		
		c1.addItemListener(listener);
		return c1;
	}

	public JCheckBox getC2() {
		c2=new JCheckBox("Italico");
		c2.setBackground(new Color(180,180,180));
		
		ItemListener listener = new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					italico=Font.ITALIC;
				else
					italico=Font.PLAIN;
				label1.setFont(new Font("Arial",negrito+italico,20));
			}
		};
		
		c2.addItemListener(listener);
		return c2;
	}
}
