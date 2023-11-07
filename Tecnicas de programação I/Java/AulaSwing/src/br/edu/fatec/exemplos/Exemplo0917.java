package br.edu.fatec.exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo0917 extends JFrame implements ActionListener
{
  JTextField t1;
  JMenuBar menuBar1;
  JMenu menuCadastro, menuRelatorio;
  JMenuItem miCliente, miFornecedor, miSair, mirlCliente, mirlFornecedor;
  public static void main(String args[])
  {
    JFrame janela=new Exemplo0917();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    janela.setVisible(true);
  }
  Exemplo0917()
  {
    setTitle("Uso de Menus");
    setBounds(270,50,270,130);
    getContentPane().setBackground(new Color(0,128,128));
    t1 = new JTextField();
    menuBar1 = new JMenuBar(); // cria a barra de menus
    menuCadastro = new JMenu("Cadastro"); // cria um novo menu
    menuRelatorio = new JMenu("Relatorios");
    
    miCliente = new JMenuItem ("Cliente"); // cria um item
    miCliente.addActionListener(this);
    miFornecedor = new JMenuItem ("Fornecedor");
    miFornecedor.addActionListener(this);
    miSair = new JMenuItem ("Sair do sistema");
    miSair.addActionListener(this);
    
    menuCadastro.add(miCliente); // adiciona o item ao menu
    menuCadastro.add(miFornecedor);
    menuCadastro.add(miSair);
    
    mirlCliente = new JMenuItem ("Relação de Clientes");
    mirlCliente.addActionListener(this);
    mirlFornecedor = new JMenuItem ("Relação de Fornecedores");
    miFornecedor.addActionListener(this);
    
    menuRelatorio.add(mirlCliente);
    menuRelatorio.add(mirlFornecedor);
    
    menuBar1.add(menuCadastro); // adiciona o menu na barra de menus
    menuBar1.add(menuRelatorio);
    setJMenuBar(menuBar1); // define a barra de menus como padrao
    getContentPane().add(t1);
  }
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource()==miCliente)
      t1.setText("Escolhido o item Cliente");
    if (e.getSource()==miFornecedor)
       t1.setText("Escolhido o item Fornecedor");      
    if (e.getSource()==mirlCliente)
      t1.setText("Escolhido o item Relação de Clientes");
    if (e.getSource()==mirlFornecedor)
      t1.setText("Escolhido o item Relação de Fornecedores");      
    if (e.getSource()==miSair)
      System.exit(0);    
  }
}