package javaBasicsTutorial;

import java.util.Random;

public class ifStatement
{

	public static void main(String[] args)
	{
		Random random = new Random();
		
		int age = random.nextInt(50);
		if(age > 35) {
			System.out.println("No puedes pasar. La edad limite es 35 años y tu tienes " + age +" años");
		}
		else if(age>=18) {
			System.out.println("Puedes pasar, ya que tienes "+ age + " años.");
		} else {
			System.out.println("Eres menor de edad, no puedes pasar.");
		}
	}
}
