package br.edu.fatec.Login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.edu.fatec.dao.UsuarioDAO;


public class TelaLogin {
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JButton btnEntrar;
	private JFrame janela;
	private UsuarioDAO dao;

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
	
	public JButton getBtnEntrar() {
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(100,120,100,33);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = new UsuarioDAO();
				if(dao.buscaUsuario(txtLogin.getText(),new String(txtSenha.getPassword()))) {
					janela.setVisible(false);
					new TelaCadastro().montaJanela(txtLogin.getText(),dao);
				}
				else
					JOptionPane.showMessageDialog(null,"Usuário não encontrado");
					janela.setVisible(false);
				    new TelaCadastro().montaJanela("Cadastre Novo Usuário",dao);
			}
		};
		
		btnEntrar.addActionListener(listener);
		return btnEntrar;
	}

	public void montaJanela() {
		janela = new JFrame();
		janela.setTitle("Sejam Bem Vindo");
		janela.setBounds(0,0,350,200);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.getContentPane().setBackground(new Color(150,150,150));
		janela.setLayout(null);
		janela.getContentPane().add(getLblLogin());
		janela.getContentPane().add(getTxtLogin());
		janela.getContentPane().add(getLblSenha());
		janela.getContentPane().add(getTxtSenha());
		janela.getContentPane().add(getBtnEntrar());
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaLogin().montaJanela();
	}
	
}
