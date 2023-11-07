package br.edu.fatec.exemplos;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo0916 extends JFrame implements ActionListener
{
  JTextArea ta1,ta2;
  JTextField t1;
  JButton b1,b2;

  public static void main(String args[])
  {
    JFrame janela = new Exemplo0916();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    janela.setVisible(true);
  }
  Exemplo0916()
  {
    setBounds(150,50,480,280);
    setTitle("Uso do JTextArea");
    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));  
    t1 = new JTextField(40);
    t1.addActionListener(this);
    b1 = new JButton("Copia Tudo");
    b1.addActionListener(this);
    b2 = new JButton("Copia Selecao");
    b2.addActionListener(this);
    ta1 = new JTextArea("Editor de texto:\n",5,40);
    ta2 = new JTextArea(5,40);
    JScrollPane painel1 = new JScrollPane(ta1);
    JScrollPane painel2 = new JScrollPane(ta2);
    getContentPane().add(painel1);  getContentPane().add(t1);
    getContentPane().add(b1);       getContentPane().add(b2);
    getContentPane().add(painel2);
  }
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource()==t1) // ao pressionar ENTER no JTextField
    {
      ta1.append(t1.getText());
      t1.setText("");
    }
    if (e.getSource()==b1) // copia conteúdo de ta1 em ta2
      ta2.setText(ta1.getText()); 
    if (e.getSource()==b2) // copia selecao
      ta2.setText(ta1.getSelectedText());
  }
}

/*
Sinais de Escape:
\b retrocesso
\n novalinha
\t tabulação
\r retorno do carro
\f avanço do formulário
\\ barra invertida
\' apóstrofo
\" aspas 
*/
