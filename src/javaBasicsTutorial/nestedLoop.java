package javaBasicsTutorial;

import java.util.Scanner;

public class nestedLoop
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int rows, columns;
		String symbol = "";
		
		System.out.println("Ingresa la cantidad de filas: ");
		rows = teclado.nextInt();
		
		System.out.println("Ingresa la cantidad de columnas: ");
		columns = teclado.nextInt();
		
		System.out.println("Ingresa el simbolo a utilizar: ");
		symbol = teclado.next();
		teclado.close();
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}
	}

}
