package br.edu.fatec.exemplos;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class Exemplo0919 extends JFrame implements ActionListener
{
  JPopupMenu mpopup;
  JMenuItem miCopiar, miColar, miSalvar;
  JMenuBar menuBar1;
  JTextField t1;
  JButton b1,b2;
  public static void main(String args[])
  {
    JFrame janela=new Exemplo0919();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    janela.setVisible(true);
  }
 
  Exemplo0919()
  {
    setTitle("Uso de Menus Popup");
    setBounds(300,50,220,120);
    getContentPane().setBackground(new Color(0,128,128));
    getContentPane().setLayout(new GridLayout(3,1));
    menuBar1 = new JMenuBar();
    t1 = new JTextField();
    b1 = new JButton("Botão 1");    b2 = new JButton("Botão 2");
    mpopup = new JPopupMenu();
    MouseListener registra = new MostraPopup();
    b1.addMouseListener(registra);  
    miCopiar = new JMenuItem ("Copiar");
    miCopiar.addActionListener(this);
    miCopiar.setMnemonic(KeyEvent.VK_C);
    miColar = new JMenuItem ("Colar");
    miColar.addActionListener(this);
    miColar.setMnemonic(KeyEvent.VK_O);
    miSalvar = new JMenuItem ("Salvar", new ImageIcon("MenuSalvar.gif"));
    miSalvar.addActionListener(this);
    miSalvar.setMnemonic(KeyEvent.VK_S);
    mpopup.add(miCopiar);        mpopup.add(miColar);
    mpopup.add(miSalvar);        getContentPane().add(b1);
    getContentPane().add(b2);    getContentPane().add(t1);
  } 

  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource()==miCopiar)    t1.setText("Copiar");
    if (e.getSource()==miColar)     t1.setText("Colar");
    if (e.getSource()==miSalvar)    t1.setText("Salvar");
  }

  class MostraPopup extends MouseAdapter 
  {
    public void mousePressed(MouseEvent e) 
    {
      if (e.getButton()!=1)	
        mpopup.show(e.getComponent(),e.getX(), e.getY());	
    }
  }
}