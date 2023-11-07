package br.edu.fatec.exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo0918 extends JFrame implements ActionListener
{
  JMenuBar menuBar1;
  JMenu menuArquivo, menuSave;
  JMenuItem miNovo,miAbrir,miSair,miSalvar,miSalvarC,miSalvarT;

  public static void main(String args[])
  {
    JFrame janela=new Exemplo0918();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    janela.setVisible(true);
  }
  Exemplo0918()
  {
    setTitle("Uso de Menus");
    setBounds(300,50,250,150);
    getContentPane().setBackground(new Color(0,128,128));
    menuBar1 = new JMenuBar();
    menuArquivo = new JMenu("Arquivo");
    menuArquivo.setMnemonic(KeyEvent.VK_A);
    menuArquivo.addActionListener(this);
    
    menuSave = new JMenu("Save");
    miNovo = new JMenuItem ("Novo",new ImageIcon("MenuNovo.gif"));
    miNovo.addActionListener(this);
    miNovo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
    miNovo.setMnemonic(KeyEvent.VK_N);
    miAbrir = new JMenuItem ("Abrir",new ImageIcon("MenuAbrir.gif"));
    miAbrir.addActionListener(this);
    miAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
    miAbrir.setMnemonic(KeyEvent.VK_B);
    miSalvar = new JMenuItem ("Salvar",new ImageIcon("MenuSalvar.gif"));
    miSalvar.addActionListener(this);
    miSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
    miSalvar.setMnemonic(KeyEvent.VK_S);
    miSalvarC = new JMenuItem ("Salvar Como");
    miSalvarC.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
    miSalvarC.addActionListener(this);
    miSalvarC.setMnemonic(KeyEvent.VK_C);
    miSalvarT = new JMenuItem ("Salvar Tudo");
    miSalvarT.addActionListener(this);
    miSalvarT.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
    miSalvarT.setMnemonic(KeyEvent.VK_T);
    miSair = new JMenuItem ("Sair",new ImageIcon("MenuSair.gif"));
    miSair.addActionListener(this);
    miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
    miSair.setMnemonic(KeyEvent.VK_A);
    menuSave.add(miSalvar);      menuSave.add(miSalvarC);
    menuSave.add(miSalvarT);     menuArquivo.add(miNovo);
    menuArquivo.add(miAbrir);    menuArquivo.add(menuSave);
    menuArquivo.addSeparator();  menuArquivo.add(miSair);
    menuBar1.add(menuArquivo); 
    setJMenuBar(menuBar1);
  } 
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource()==miNovo)
      JOptionPane.showMessageDialog(null,"menu Novo." , "Usando menus", JOptionPane. INFORMATION_MESSAGE);
    if (e.getSource()==miAbrir)
      JOptionPane.showMessageDialog(null,"menu Abrir." , "Usando menus", JOptionPane. INFORMATION_MESSAGE);
    if (e.getSource()==miSalvar)
      JOptionPane.showMessageDialog(null,"Sub-menu Salvar." , "Usando menus", JOptionPane. INFORMATION_MESSAGE);
    if (e.getSource()==miSalvarC)
      JOptionPane.showMessageDialog(null,"Sub-menu Salvar Como." , "Usando menus", JOptionPane. INFORMATION_MESSAGE);     
    if (e.getSource()==miSalvarT)
      JOptionPane.showMessageDialog(null,"Sub-menu Salvar Tudo." , "Usando menus", JOptionPane. INFORMATION_MESSAGE);
    if (e.getSource()==miSair)
      System.exit(0);    
  }
}
