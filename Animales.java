import java.util.Scanner;

public class Animales
{

	public static void main(String[] args)
	{

		int escoger,escoger2;

		Scanner sc = new Scanner(System.in);
		PezBeta beta = new PezBeta("Naranja", "Mediano");
		PezAnormal victor = new PezAnormal();

		while(true)
		{

			System.out.println("Escoge un pez: ");
			System.out.println("1. Pez beta.");
			System.out.println("2. Pez Anormal.");
            escoger = sc.nextInt();
			
			if (escoger == 1)
			{

				System.out.println("Soy un pez beta y mis caracteristicas son: ");
				beta.imprimeCaracteristicas();
				System.out.println("1. Comer.");
				System.out.println("2. Respirar");
				
				System.out.println("Que quieres que haga: ");
				escoger2 = sc.nextInt();
				
			
				if (escoger2 == 1)
				{

					beta.comer();

				}

				if (escoger2 == 2)
				{

					beta.respirar();

				}

			}

			if (escoger == 2)
			{

				System.out.println("Soy un pez anormal y mis caracteristicas son: ");
				System.out.println("Mi color es: " + victor.getColor());
				System.out.println("Mi tamano es: " + victor.getTamano());
				System.out.println("1. Comer.");
				System.out.println("2. Respirar");

				System.out.println("Que quieres que haga: ");
				escoger2 = sc.nextInt();
				
				if (escoger2 == 1)
				{

					victor.comer();

				}

				if (escoger2 == 2)
				{

					victor.respirar();

				}

			}

		}

	}

}
