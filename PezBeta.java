public class PezBeta extends Pez
{
	private String color, tamano;

	public PezBeta(String a, String b)
	{

		color = a;
		tamano = b;

	}

	public void imprimeCaracteristicas()
	{

		System.out.println("El color es: " + color);
		System.out.println("El tamano es: " + tamano);

	}

	public void respirar()
	{

		System.out.println("Estoy respirando por mis branquias");

	}


}