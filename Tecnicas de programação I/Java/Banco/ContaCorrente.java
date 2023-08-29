public class ContaCorrente {

  private String nomeCliente;
  private double saldo;
  private double deposito;
  private double limite;
  private double total;
  private String cpf;

  public void setNomeCliente(String nome) {
    this.nomeCliente = nome;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public String getNomeCliente() {
    return this.nomeCliente;
  }

  public double getLimite() {
    return this.limite;
  }

  public void depositar(double deposito) {
    if (deposito <= 0) {
      System.out.println("Valor precisa ser maior que zero!!! Tente novamente");
    } else {
      this.saldo += deposito;
      this.total = this.limite + this.saldo;
      this.deposito = deposito;
      System.out.println(
        "Com o deposito realizado de :" +
        this.deposito +
        " seu saldo é de :" +
        this.saldo +
        " e o total com limite é de: " +
        this.total
      );
    }
  }

  public double mostrarSaldoTotal() {
    return this.total;
  }

  public void retirarDinheiro(double saque) {
    if (saque <= this.total) {
      this.total -= saque;

      System.out.println(
        "Saque realizado de :" + saque + " seu saldo total é de :" + this.total
      );
    } else {
      System.out.println(
        "Você não tem saldo nem limite suficiente para este saque de " +
        saque +
        " seu total para saque é de : " +
        this.total
      );
    }
  }
}
