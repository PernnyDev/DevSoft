import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    int tipoFigura, baseQuadrado, baseTriangulo, areaQuadrado, araeTriangulo;
    


      System.out.println
      ("Digite '1' para calucular C!rea de um quadrado e '2' para calcular C!rea de um triango com base e altura iguais:");
    Scanner entrada = new Scanner (System.in);
      tipoFigura = entrada.nextInt ();


    switch (tipoFigura)
      {
      case 1:
	{
	  System.out.println ("Digite uma cota em metros para seu quadrado:");
	  Scanner entrada1 = new Scanner (System.in);
	  baseQuadrado = entrada1.nextInt ();
	  areaQuadrado = baseQuadrado * baseQuadrado;
	  System.out.println ("A area do seu quadrado e " + areaQuadrado +" m²");
	  break;
	}

	case 2:
	{
	  System.out.println ("Digite uma cota em metros do seu triangulo:");
	  Scanner entrada2 = new Scanner (System.in);
	  baseTriangulo = entrada2.nextInt ();
	  araeTriangulo = baseTriangulo * baseTriangulo / 2;
	  System.out.println ("A area do seu triagulo e " + araeTriangulo +" m²");
	  break;
	}
      }


  }
}