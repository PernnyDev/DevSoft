package br.edu.fatec.exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;

public class Exemplo0915 extends JFrame implements AdjustmentListener
{
  JScrollBar sb1;
  JLabel label1,label2;
   
  public static void main(String args[])
  {
    JFrame janela = new Exemplo0915();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    janela.setVisible(true);
  }
  Exemplo0915() 
  {
    setBackground(new Color(190,190,190));
    setBounds(300,50,250,100);
    setTitle("Uso da barra de rolagem");
    getContentPane().setLayout(new GridLayout(3,1));  
    sb1 = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,105); 
    sb1.addAdjustmentListener(this);  
    label1 = new JLabel("" + sb1.getValue(),JLabel.CENTER);
    label1.setForeground(Color.black);
    label2 = new JLabel("",JLabel.CENTER);
    label2.setForeground(Color.black);  
    getContentPane().add(sb1);
    getContentPane().add(label1);
    getContentPane().add(label2);
  }

  public void adjustmentValueChanged(AdjustmentEvent e)
    {
      label1.setText(sb1.getValue() + " Centímetros");
      NumberFormat nf;
      nf = NumberFormat.getNumberInstance();
      nf.setMinimumFractionDigits(3);
      double pol = sb1.getValue() / 2.54;	
      label2.setText(nf.format(pol) +" Polegadas");
    }
}