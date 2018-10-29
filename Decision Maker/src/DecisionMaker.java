import java.util.Scanner;

public class DecisionMaker
	{

		public static void main(String[] args)
			{
				makeDecision();

			}

		public static void makeDecision()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("How many choices would you like to consider?");
			int numberOfChoices = userInput.nextInt();
			
			String [] choices = new String[numberOfChoices];
			
			Scanner userInput1 = new Scanner(System.in);
			for (int i =0; i<choices.length; i++)
				{
					System.out.println("Input choice " + (i+1));
					String inputChoice= userInput1.nextLine();
					choices [i] = inputChoice; 
				}
			System.out.println("You should choose " + choices[(int)(Math.random()*choices.length)]);
			
		}
		
	}
