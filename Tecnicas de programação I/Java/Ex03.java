import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		int tipoFigura, baseQuadrado, baseTriangulo, areaQuadrado, araeTriangulo;

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println(
					"Digite '1' para calucular a área de um quadrado e '2' para calcular a área de um triango com base e altura iguais:");
			tipoFigura = entrada.nextInt();
		}

		switch (tipoFigura) {
			case 1: {
				try (Scanner entrada = new Scanner(System.in)) {
					System.out.println("Digite uma cota em metros para seu quadrado:");
					baseQuadrado = entrada.nextInt();
					areaQuadrado = baseQuadrado * baseQuadrado;
					System.out.println("A area do seu quadrado e " + areaQuadrado + " m²");
					break;
				}
			}

			case 2: {
				try (Scanner entrada = new Scanner(System.in)) {
					System.out.println("Digite uma cota em metros do seu triangulo:");

					baseTriangulo = entrada.nextInt();
					araeTriangulo = baseTriangulo * baseTriangulo / 2;
					System.out.println("A area do seu triagulo e " + araeTriangulo + " m²");
					break;
				}
			}
		}

	}
}