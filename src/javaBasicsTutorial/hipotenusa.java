package javaBasicsTutorial;

import java.util.Scanner;

public class hipotenusa
{

	public static void main(String[] args)
	{
		double x, y, z;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = teclado.nextDouble();
		
		System.out.println("Enter side y: ");
		y = teclado.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("the hypotenuse is: " + z);
		teclado.close();
		
	}

}
