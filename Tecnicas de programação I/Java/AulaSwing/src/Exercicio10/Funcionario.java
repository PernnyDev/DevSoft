package Exercicio10;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome,String cpf, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
    @Override
    public String toString() {
        return "Funcionario [Nome: " + nome +" CPF: " + cpf  +", Salario: " + salario + "]";
    }

}
