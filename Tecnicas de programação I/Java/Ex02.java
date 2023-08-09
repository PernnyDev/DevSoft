import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {

    int salario;
    System.out.println("Informe seu salário:");
    Scanner entrada = new Scanner(System.in);
    salario = entrada.nextInt();

    if (salario > 10000)
      System.out.println("Você é muito rico!");

    else
      System.out.println("Trabalhe mais zé mané!!!");

  }
}