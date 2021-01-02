package javaBasicsTutorial;

public class arrays
{

	public static void main(String[] args)
	{
		String cars[] = {"Camaro", "Corvette", "Tesla"};
		
		cars[0] = "Mustang";
		
		for (int i = 0; i < cars.length; i++)
		{
			System.out.println(cars[i]);
		}
	}

}
