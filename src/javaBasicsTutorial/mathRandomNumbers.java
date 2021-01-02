package javaBasicsTutorial;


import java.util.Random;

public class mathRandomNumbers
{

	public static void main(String[] args)
	{
		Random random = new Random();
		
		int x = random.nextInt(6); //Genera números entre 0 y 5.
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		boolean h = random.nextBoolean();
		
		System.out.println(x);
		System.out.println(y);
		//Podemos utilizar la instancia del objeto random para generar
		//randoms en diferentes variables.
		System.out.println(z);
		System.out.println(h);
	}

}
