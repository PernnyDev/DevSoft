package Exercicio10;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class FuncionarioDAO {
    private List<Funcionario> funcionarios;

    public FuncionarioDAO() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
    	
    	
        funcionarios.add(funcionario);
    }

    public void imprimirTodosFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public String obterNomeSalarioMaisAlto() {
        double salarioMaisAlto = Double.MIN_VALUE;
        String nomeSalarioMaisAlto = null;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSalario() > salarioMaisAlto) {
                salarioMaisAlto = funcionario.getSalario();
                nomeSalarioMaisAlto = funcionario.getNome();
            }
        }

        return nomeSalarioMaisAlto;
    }
    
    
   /* private void adicionarFuncionario() {
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        double salario = Double.parseDouble(salarioField.getText());

        Funcionario funcionario = new Funcionario(nome, cpf, salario);
        funcionarioDAO.adicionarFuncionario(funcionario);
        JOptionPane.showMessageDialog(this, "Funcionário adicionado com sucesso!");
    }

    private void imprimirFuncionarios() {
        funcionarioDAO.imprimirTodosFuncionarios();
    }

    private void mostrarSalarioMaisAlto() {
        String nomeSalarioMaisAlto = funcionarioDAO.obterNomeSalarioMaisAlto();
        JOptionPane.showMessageDialog(this, "Funcionário com o salário mais alto: " + nomeSalarioMaisAlto);
    }*/
    
}

