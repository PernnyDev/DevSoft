package br.edu.fatec.exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Exemplo0910 extends JFrame implements ItemListener
{
  float n1 = 0,result = 0;
  JLabel label1,label2;
  JTextField t1, t2;
  JPanel p1,p2;
  JRadioButton radio1,radio2,radio3;
  ButtonGroup radiogroup;
  
  public static void main(String args[])
  {
    JFrame janela = new Exemplo0910();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    janela.setVisible(true);
  }

  Exemplo0910()
  {
   
	setTitle("Uso de botoes de Radio ");
    setBounds(230,50,340,120);
    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
    getContentPane().add(getP1());
    getContentPane().add(getP2());
  }

  
  public void itemStateChanged(ItemEvent e)
  {
    if (t1.getText().length()==0) return;
      try
      {
        n1 = Float.parseFloat(t1.getText());
        if (e.getSource()==radio1)  result = (n1 * 10)/100;
        if (e.getSource()==radio2)  result = (n1 * 20)/100;
        if (e.getSource()==radio3)  result = (n1 * 30)/100;       
      }
      catch(NumberFormatException erro)
      {
        t2.setText("Erro");  return;
      }
      t2.setText("" + result);           
  }

public JLabel getLabel1() {
	label1 = new JLabel("Digite um valor"); 
	label1.setForeground(Color.blue);
	return label1;
}

public JLabel getLabel2() {
	label2 = new JLabel("% do Valor :");    
	label2.setForeground(Color.blue);
	return label2;
}

public JPanel getP1() {
	 p1 = new JPanel();        
     p1.setLayout(new FlowLayout(FlowLayout.CENTER));
	 p1.setBackground(new Color(200,200,200));
	 p1.add(getLabel1());  p1.add(getT1());      
	 return p1;
}

public JPanel getP2() {
	p2 = new JPanel();
	p2.setLayout(new GridLayout(2,3));
    p2.setBackground(new Color(200,200,200));
    constroiRadiogroup();
    p2.add(radio1);     
    p2.add(radio2);
    p2.add(radio3);
    p2.add(getLabel2());
    p2.add(getT2());
	return p2;
}

public JRadioButton getRadio1() {
	radio1 = new JRadioButton("10% do valor");
    radio1.setMnemonic(KeyEvent.VK_1);
    radio1.addItemListener(this);
    return radio1;
}

public JRadioButton getRadio2() {
	radio2 = new JRadioButton("20% do valor");
	radio2.setMnemonic(KeyEvent.VK_2);
	radio2.addItemListener(this);
   	return radio2;
}

public JRadioButton getRadio3() {
	radio3 = new JRadioButton("30% do valor");
	radio3.setMnemonic(KeyEvent.VK_3);
	radio3.addItemListener(this);
	return radio3;
}

public void  constroiRadiogroup() {
	radiogroup = new ButtonGroup();
	radiogroup.add(getRadio1()); 
    radiogroup.add(getRadio2()); 
    radiogroup.add(getRadio3()); 
	
}

public JTextField getT1() {
	t1 = new JTextField(5); 
	return t1;
}

public JTextField getT2() {
	t2 = new JTextField(5);
	t2.setEditable(false);
	return t2;
}       
}