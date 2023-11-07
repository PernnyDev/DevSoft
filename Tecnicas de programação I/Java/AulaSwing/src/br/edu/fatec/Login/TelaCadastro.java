package br.edu.fatec.Login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.edu.fatec.dao.UsuarioDAO;
import br.edu.fatec.modelo.Usuario;

public class TelaCadastro {
	private JLabel lblNome;
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JTextField txtNome;
	private JButton btnCadastrar;
	private JButton btnlimpar;
	private JFrame janela;
	private UsuarioDAO dao;

	public JLabel getLblNome() {
		lblNome = new JLabel("Nome: ");
		lblNome.setBounds(12, 100, 200, 33);
		return lblNome;
	}

	public JTextField getTxtNome() {
		txtNome = new JTextField();
		txtNome.setBounds(162, 100, 100, 33);
		return txtNome;
	}

	public JButton getBtnlimpar() {
		btnlimpar = new JButton("Limpar");
		btnlimpar.setBounds(200,180,100,33);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLogin.setText("");
				txtNome.setText("");
				txtSenha.setText("");
				
			}
		};
		
		btnlimpar.addActionListener(listener);
		return btnlimpar;
	}

	public JLabel getLblLogin() {
		lblLogin = new JLabel("Login: ");
		lblLogin.setBounds(12, 20, 200, 33);
		return lblLogin;
	}

	public JLabel getLblSenha() {
		lblSenha = new JLabel("Senha: ");
		lblSenha.setBounds(12, 60, 200, 33);
		return lblSenha;
	}

	public JTextField getTxtLogin() {
		txtLogin = new JTextField();
		txtLogin.setBounds(162, 20, 100, 33);
		return txtLogin;
	}

	public JPasswordField getTxtSenha() {
		txtSenha = new JPasswordField();
		txtSenha.setEchoChar('?');
		txtSenha.setBounds(162, 60, 100, 33);
		return txtSenha;
	}
	
	public JButton getBtnCadastrar() {
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(60,180,100,33);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario novoUsuario = new Usuario();
				novoUsuario.setNome(txtNome.getText());
				novoUsuario.setLogin(txtLogin.getText());
				novoUsuario.setSenha(new String(txtSenha.getPassword()));
				dao.adicionaNaLista(novoUsuario);
			
			}
		};
		
		btnCadastrar.addActionListener(listener);
		return btnCadastrar;
	}

	public void montaJanela(String nome, UsuarioDAO dao) {
		this.dao=dao;
		janela = new JFrame();
		janela.setTitle("Sejam Bem Vindo: " + nome);
		janela.setBounds(0,0,350,300);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.getContentPane().setBackground(new Color(150,150,150));
		janela.setLayout(null);
		janela.getContentPane().add(getLblLogin());
		janela.getContentPane().add(getTxtLogin());
		janela.getContentPane().add(getLblSenha());
		janela.getContentPane().add(getTxtSenha());
		janela.getContentPane().add(getLblNome());
		janela.getContentPane().add(getTxtNome());
		janela.getContentPane().add(getBtnCadastrar());
		janela.getContentPane().add(getBtnlimpar());
		janela.setVisible(true);
	}
	
}
