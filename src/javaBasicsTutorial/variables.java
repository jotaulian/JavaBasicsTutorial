package javaBasicsTutorial;

import java.util.Scanner;

public class variables
{
public static void main(String[] args)
{
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Como te llamas?");
	String name = teclado.nextLine();
	
	System.out.println("Hola " + name + " un gusto conocerte. En donde te encuentras en este momento ?");
	String location = teclado.nextLine();
	
	if(location.equalsIgnoreCase("málaga") || location.equalsIgnoreCase("los alamos")) {
				System.out.println("Wooow! Que suerte " + name + ", " + location + " es una ciudad hermosa. " );
	}
	System.out.println("Con quien te encuentras en este momento?");
	String company = teclado.nextLine();
	
	System.out.println("Que suerte que estes acompañada. Dile a " + company + " cuanto los quieres");
teclado.close();	
}
}
