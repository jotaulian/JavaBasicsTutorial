package javaBasicsTutorial;

import java.util.Random;

public class ifStatement
{

	public static void main(String[] args)
	{
		Random random = new Random();
		
		int age = random.nextInt(50);
		if(age > 35) {
			System.out.println("No puedes pasar. La edad limite es 35 a�os y tu tienes " + age +" a�os");
		}
		else if(age>=18) {
			System.out.println("Puedes pasar, ya que tienes "+ age + " a�os.");
		} else {
			System.out.println("Eres menor de edad, no puedes pasar.");
		}
	}
}
