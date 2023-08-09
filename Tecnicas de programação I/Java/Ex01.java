import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {

    float notaP1, notaP2, media;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe a nota da P1");
    notaP1 = entrada.nextFloat();

    System.out.println("Informe a nota da P2");
    notaP2 = entrada.nextFloat();

    media = (notaP2 + notaP1) / 2;

    if (media < 6)
      System.out.println("Reprovado!!!");

    else
      System.out.println("Aprovado");

  }
}