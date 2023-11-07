package br.edu.fatec.exemplos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.edu.fatec.Login.TelaCadastro;
import br.edu.fatec.dao.UsuarioDAO;
import br.edu.fatec.modelo.Usuario;

public class ExemploLogin {
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private JButton btnCadastrar, btnLimpar;
	private JFrame janela;
	private UsuarioDAO dao;

	public JLabel getLblLogin() {
		lblLogin = new JLabel("Nome: ",JLabel.RIGHT);
		lblLogin.setBounds(12, 20, 200, 33);
		return lblLogin;
	}

	public JLabel getLblSenha() {
		lblSenha = new JLabel("E-mail: ",JLabel.RIGHT);
		lblSenha.setBounds(12, 60, 200, 33);
		return lblSenha;
	}

	public JTextField getTxtLogin() {
		txtLogin = new JTextField();
		txtLogin.setBounds(162, 20, 100, 33);
		return txtLogin;
	}

	public JTextField getTxtSenha() {
		txtSenha = new JTextField();
		/*txtSenha.setEchoChar('?');*/
		txtSenha.setBounds(162, 60, 100, 33);
		return txtSenha;
	};
	
	public JButton getBtnCadastrar() {
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(60,180,100,33);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario novoUsuario = new Usuario();
				novoUsuario.setNome(txtLogin.getText());
				novoUsuario.setLogin(txtSenha.getText());
				
				dao.adicionaNaLista(novoUsuario);
			
			}
		};
		
		btnCadastrar.addActionListener(listener);
		return btnCadastrar;
	}
	
	public JButton getBtnLimpar() {
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(200,180,100,33);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLogin.setText("");
								txtSenha.setText("");
				
			}
		};
		
		btnLimpar.addActionListener(listener);
		return btnLimpar;
	}

	public void montaJanela() {
		janela = new JFrame();
		janela.setTitle("Sejam Bem Vindo");
		janela.setBounds(0,0,350,200);
		janela.getContentPane().setLayout(new GridLayout(3,2));
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.getContentPane().setBackground(new Color(150,150,150));
		//janela.setLayout(null);
		janela.getContentPane().add(getLblLogin());
		janela.getContentPane().add(getTxtLogin());
		janela.getContentPane().add(getLblSenha());
		janela.getContentPane().add(getTxtSenha());
		janela.getContentPane().add(getBtnCadastrar());
		janela.getContentPane().add(getBtnLimpar());
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ExemploLogin().montaJanela();
	}
	
}
