import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {

    int salario;
    try (Scanner entrada = new Scanner(System.in)) {
      System.out.println("Informe seu salário:");
      salario = entrada.nextInt();
    }

    if (salario > 10000)
      System.out.println("Você é muito rico!");

    else
      System.out.println("Trabalhe mais zé mané!!!");

  }
}