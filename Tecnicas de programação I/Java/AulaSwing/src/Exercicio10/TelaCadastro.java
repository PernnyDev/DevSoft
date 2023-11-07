package Exercicio10;
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaCadastro extends JFrame {

    private FuncionarioDAO funcionarioDAO;

    private JTextField nomeField, cpfField, salarioField;
    private JButton adicionarButton, imprimirButton, salarioAltoButton;

    public TelaCadastro() {
        funcionarioDAO = new FuncionarioDAO();

        setTitle("Cadastro de Funcionários");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        JLabel cpfLabel = new JLabel("CPF:");
        cpfField = new JTextField();
        JLabel salarioLabel = new JLabel("Salário:");
        salarioField = new JTextField();

        adicionarButton = new JButton("Adicionar");
        imprimirButton = new JButton("Imprimir Funcionários");
        salarioAltoButton = new JButton("Salário Mais Alto");

        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarFuncionario();
            }
        });

        imprimirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imprimirFuncionarios();
            }
        });

        salarioAltoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarSalarioMaisAlto();
            }
        });

        add(nomeLabel);
        add(nomeField);
        add(cpfLabel);
        add(cpfField);
        add(salarioLabel);
        add(salarioField);
        add(adicionarButton);
        add(imprimirButton);
        add(salarioAltoButton);
    }

    private void adicionarFuncionario() {
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        double salario = Double.parseDouble(salarioField.getText());

        Funcionario funcionario = new Funcionario(nome,cpf, salario);
        funcionarioDAO.adicionarFuncionario(funcionario);
        JOptionPane.showMessageDialog(this, "Funcionário adicionado com sucesso!");
    }

    private void imprimirFuncionarios() {
    	funcionarioDAO.imprimirTodosFuncionarios();
       }

    private void mostrarSalarioMaisAlto() {
        String nomeSalarioMaisAlto = funcionarioDAO.obterNomeSalarioMaisAlto();
        JOptionPane.showMessageDialog(this, "Funcionário com o salário mais alto: " + nomeSalarioMaisAlto);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TelaCadastro telaCadastro = new TelaCadastro();
                telaCadastro.setVisible(true);
            }
        });
    }
}*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {
	private FuncionarioDAO funcionarioDAO;
	private JTextField nomeField, cpfField, salarioField;
	private JButton adicionarButton, imprimirButton, salarioAltoButton;
	private JFrame janela;
	private JLabel nomeLabel, cpfLabel, salarioLabel;

	public TelaCadastro() {
		funcionarioDAO = new FuncionarioDAO();
		createUI();
	}

	public JLabel LB_Nome() {
		nomeLabel = new JLabel("Nome:");
		nomeLabel.setBounds(10, 10, 80, 20);
		nomeLabel.setForeground(Color.black);
		nomeLabel.setFont(new Font("", Font.BOLD, 14));
		return nomeLabel;
	}

	public JLabel LB_cpf() {
		cpfLabel = new JLabel("CPF:");
		cpfLabel.setBounds(10, 40, 80, 20);
		cpfLabel.setForeground(Color.black);
		cpfLabel.setFont(new Font("", Font.BOLD, 14));
		return cpfLabel;
	}

	public JLabel LB_salario() {
		salarioLabel = new JLabel("Salário:");
		salarioLabel.setBounds(10, 70, 80, 20);
		salarioLabel.setForeground(Color.black);
		salarioLabel.setFont(new Font("", Font.BOLD, 14));
		return salarioLabel;
	}

	private void createUI() {
		// janela = new JFrame();
		janela.setTitle("Cadastro de Funcionários");
		janela.setSize(320, 200); // Ajuste o tamanho da janela conforme necessário
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(null); // Usando layout nulo

		// Defina as posições e tamanhos dos componentes diretamente
		JLabel nomeLabel = new JLabel("Nome:");
		nomeLabel.setBounds(10, 10, 80, 20);
		nomeField = new JTextField();
		nomeField.setBounds(100, 10, 150, 20);

		JLabel cpfLabel = new JLabel("CPF:");
		cpfLabel.setBounds(10, 40, 80, 20);
		cpfField = new JTextField();
		cpfField.setBounds(100, 40, 150, 20);

		JLabel salarioLabel = new JLabel("Salário:");
		salarioLabel.setBounds(10, 70, 80, 20);
		salarioField = new JTextField();
		salarioField.setBounds(100, 70, 150, 20);

		adicionarButton = new JButton("Adicionar");
		adicionarButton.setBounds(10, 100, 100, 30);
		adicionarButton.addActionListener(e -> adicionarFuncionario());

		imprimirButton = new JButton("Imprimir Funcionários");
		imprimirButton.setBounds(120, 100, 200, 30);
		imprimirButton.addActionListener(e -> imprimirFuncionarios());

		salarioAltoButton = new JButton("Salário Mais Alto");
		salarioAltoButton.setBounds(10, 140, 310, 30);
		salarioAltoButton.addActionListener(e -> mostrarSalarioMaisAlto());

		// Adicione os componentes à janela
		//janela.getContentPane().add(LB_Nome());
		//janela.getContentPane().add(LB_cpf());
		//janela.getContentPane().add(LB_salario());
		add(nomeLabel);
		add(nomeField);
		add(cpfLabel);
		add(cpfField);
		add(salarioLabel);
		add(salarioField);
		add(adicionarButton);
		add(imprimirButton);
		add(salarioAltoButton);
	}

	private void adicionarFuncionario() {
		String nome = nomeField.getText();
		String cpf = cpfField.getText();
		double salario = Double.parseDouble(salarioField.getText());

		Funcionario funcionario = new Funcionario(nome, cpf, salario);
		funcionarioDAO.adicionarFuncionario(funcionario);
		JOptionPane.showMessageDialog(this, "Funcionário adicionado com sucesso!");
	}

	private void imprimirFuncionarios() {
		funcionarioDAO.imprimirTodosFuncionarios();
		// JOptionPane.showMessageDialog(this, funcionarioDAO.obterListaFuncionarios());

	}

	private void mostrarSalarioMaisAlto() {
		String nomeSalarioMaisAlto = funcionarioDAO.obterNomeSalarioMaisAlto();
		JOptionPane.showMessageDialog(this, "Funcionário com o salário mais alto: " + nomeSalarioMaisAlto);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			TelaCadastro telaCadastro = new TelaCadastro();
			telaCadastro.setVisible(true);
		});
	}
}
