package br.edu.fatec.exemplos;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Exemplo0908_Refatorado {
	private JFrame janela;
	private JLabel label1;
	private JTextField t1,t2;
	private JComboBox combo;
	private JButton bMostraTexto,bMostraIndice,bAdicionaItem,bRemoveItem,bRemoveTodos,bQuantItens;

	public void montaJanela() {
		janela = new JFrame();
		janela.setTitle("Uso do JComboBox");
		janela.setBounds(200,50,400,170);
		janela.getContentPane().setBackground(new Color(190,190,190));
		janela.getContentPane().setLayout(new GridLayout(5,2));
		janela.getContentPane().add(getLabel1());
		janela.getContentPane().add(getCombo());
		janela.getContentPane().add(getbMostraTexto());janela.getContentPane().add(getbRemoveItem());
		janela.getContentPane().add(getbMostraIndice());janela.getContentPane().add(getbRemoveTodos());
		janela.getContentPane().add(getbAdicionaItem());
		janela.getContentPane().add(getT1());
		janela.getContentPane().add(getbQuantItens());janela.getContentPane().add(getT2());
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

	}

	public JLabel getLabel1() {
		label1 = new JLabel("Conteúdo");
		label1.setForeground(Color.blue);
		label1.setFont(new Font("Arial",Font.BOLD,15));
		return label1;
	}

	public JTextField getT1() {
		t1 = new JTextField();
		return t1;
	}

	public JTextField getT2() {
		t2 = new JTextField();
		return t2;
	}

	public JComboBox getCombo() {
		String[] cores ={"Branco","Vermelho","Azul","Verde"};
		combo= new JComboBox(cores);

		ItemListener listener = new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				t1.setText(""+combo.getSelectedItem());
			}
		};

		combo.addItemListener(listener);
		return combo;
	}

	public JButton getbMostraTexto() {
		bMostraTexto= new JButton("Mostra Texto"); 

		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				label1.setText("Texto: "+combo.getSelectedItem());
			}
		};

		bMostraTexto.addActionListener(listener);
		return bMostraTexto;
	}

	public JButton getbMostraIndice() {
		bMostraIndice= new JButton("Mostra Ìndice"); 


		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				label1.setText("Indice: "+combo.getSelectedIndex());
			}
		};

		bMostraIndice.addActionListener(listener);

		return bMostraIndice;
	}

	public JButton getbAdicionaItem() {
		bAdicionaItem= new JButton("Adiciona Item"); 

		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(t1.getText().length()!=0){
					combo.addItem(t1.getText());
					t1.setText("");
				}
			}
		};


		bAdicionaItem.addActionListener(listener);
		return bAdicionaItem;
	}

	public JButton getbRemoveItem() {
		bRemoveItem= new JButton("Remove Item");

		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				combo.removeItemAt(combo.getSelectedIndex());
			}
		};

		bRemoveItem.addActionListener(listener);

		return bRemoveItem;
	}

	public JButton getbRemoveTodos() {
		bRemoveTodos= new JButton("Remove Todos"); 
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				combo.removeAllItems();
			}
		};
		bRemoveTodos.addActionListener(listener);

		return bRemoveTodos;
	}

	public JButton getbQuantItens() {
		bQuantItens= new JButton("Quant.Itens");

		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t2.setText(""+combo.getItemCount());
			}
		};

		bQuantItens.addActionListener(listener);
		return bQuantItens;
	}

	public static void main(String[] args) {
		new Exemplo0908_Refatorado().montaJanela();

	}

}
