package br.edu.fatec.exemplos;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*Para utilizar  uma lista de seleção devemos seguir as etapas
abaixo:
1-Declarar um objeto para instanciar a classe JList
2-Declarar um objeto que conterá a lista das opções e adicionar a ele
  todas as opções.
3-Inicializar o objeto do item 1 com o objeto do item 2
4-Criar um painel de rolagem
5-Adicionar o objeto do item 1 ao painel de rolagem  

*/
public class Exemplo0907_Refatorado {
	
	private JLabel label1;
	private JTextField t1;
	private JList lista;
	private JButton bquant,bindice,bclear;
	private DefaultListModel listModel;
	private JFrame janela;

	
	public void montaJanela() {
		janela = new JFrame();
		janela.setTitle("Uso do JList");
		janela.setBounds(300, 50, 200, 250);
		janela.getContentPane().setBackground(new Color(150,150,150));
						
		janela.getContentPane().setLayout(new GridLayout(6,1));
		janela.getContentPane().add(getLabel1());
		janela.getContentPane().add(getT1());
		janela.getContentPane().add(getPainel());
		janela.getContentPane().add(getBquant());
		janela.getContentPane().add(getBindice());
		janela.getContentPane().add(getBclear());
		
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		
	}

	public JScrollPane getPainel() {
		listModel=new DefaultListModel();
		listModel.addElement("Banana");
		listModel.addElement("Pera");
		listModel.addElement("Maça");
		listModel.addElement("Uva");
		
		lista = new JList(listModel);
		
		
		ListSelectionListener listener = new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				if(lista.getSelectedValue()!=null)
				  label1.setText("Selecionado: "+lista.getSelectedValue());
			}
		};
		
		lista.addListSelectionListener(listener);
		
		JScrollPane Painel=new JScrollPane(lista);
		return Painel;
	}

	private JButton getBclear() {
		bclear=new JButton("Remove item");
	
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(lista.getSelectedIndex()>= 0 ){
		    	     int index=lista.getSelectedIndex();
		    	     label1.setText("Removido: "+ lista.getSelectedValue());
		    	     listModel.remove(index);
		    	   }
		    	   else{
		    		   JOptionPane.showMessageDialog(null, "Selecione um item", "AVISO", JOptionPane.ERROR_MESSAGE);
		    	   }
				}
		};
		
		bclear.addActionListener(listener);
		return bclear;
		
	}

	public JButton getBindice() {
		bindice=new JButton("Indice selecionado");
		
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
		    	   t1.setText("Indice selecionado: "+lista.getSelectedIndex());
				}
		};
		
		bindice.addActionListener(listener);
		return bindice;
	}

	public JButton getBquant() {
		bquant=new JButton("Quantidade de itens");
		
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
		    	   t1.setText("Quantidade: "+listModel.getSize());

				}
		};
		
		bquant.addActionListener(listener);
		return bquant;
	}

	public JLabel getLabel1() {
		label1=new JLabel("Sem seleção");
		label1.setForeground(Color.black);
		return label1;
	}

	public JTextField getT1() {
		t1=new JTextField();
		
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				listModel.addElement(t1.getText());
		    	t1.setText("");
			}
		};
		
		t1.addActionListener(listener);
		return t1;
	}
	
	public static void main(String[] args) {
		new Exemplo0907_Refatorado().montaJanela();
			

	}
		
	
}

