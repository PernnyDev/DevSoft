
/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {

    int v1, v2, v3;
    v1 = 3;
    v2 = 3;
    v3 = 3;

    try (Scanner entrada = new Scanner(System.in)) {

      while (v1 != 0 && v1 != 1) {
        System.out.println("Digite a entrada 1 (0 ou 1):");
        v1 = entrada.nextInt();

      }

      while (v2 != 0 && v2 != 1) {
        System.out.println("Digite a entrada 2 (0 ou 1):");
        v2 = entrada.nextInt();
      }

      while (v3 != 0 && v3 != 1) {
        System.out.println("Digite a entrada 3 (0 ou 1):");
        v3 = entrada.nextInt();
      }

      if (v1 == 0 && v2 == 0 && v3 == 0)
        System.out.println("Nenhum");
      if (v1 == 0 && v2 == 0 && v3 == 1)
        System.out.println("Direita");
      if (v1 == 0 && v2 == 1 && v3 == 0)
        System.out.println("Centro");
      if (v1 == 0 && v2 == 1 && v3 == 1)
        System.out.println("Centro-direita");
      if (v1 == 1 && v2 == 0 && v3 == 0)
        System.out.println("Esquerda");
      if (v1 == 1 && v2 == 0 && v3 == 1)
        System.out.println("Esquerda-direita");
      if (v1 == 1 && v2 == 1 && v3 == 0)
        System.out.println("Centro-esquerda");
      if (v1 == 1 && v2 == 1 && v3 == 1)
        System.out.println("Todos");

    }
  }
}
