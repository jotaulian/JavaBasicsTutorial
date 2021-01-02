package javaBasicsTutorial;

public class array2D
{

	public static void main(String[] args)
	{
		final int FILAS = 3;
		final int COLUMNAS = 3;
		String[][] cities = {
							 {"Melbourne", "Sydney"},
						 	 {"Madrid", "Barcelona"},
						 	 {"New York", "Los Angeles"},
						 	 {"Auckland", "Queenstown"}
							};
		
		String[][] cars = new String[FILAS][COLUMNAS];
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Pontiac Firebird";
		cars[1][1] = "Challenger";
		cars[1][2] = "Plymouth Barracuda";
		cars[2][0] = "Mercury Cougar";
		cars[2][1] = "Pontiac GTO";
		cars[2][2] = "Shelby AC Cobra";
		
		//Muestro coches
		for (int i = 0; i < FILAS; i++)
		{
			for (int j = 0; j < COLUMNAS; j++)
			{
				System.out.print(cars[i][j] + " ");
			}
			System.out.println();
		}
		
		//Muestro Ciudades
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.print(cities[i][j] + ", ");
			}
			System.out.println();
		}
	}

}
