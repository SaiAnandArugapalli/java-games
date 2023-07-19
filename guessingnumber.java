import java.util.Scanner;
import java.util.Random;
public class guessingnumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String play="yes";
		while(play.equals("yes"))
		{
			Random num=new Random();
			int random=num.nextInt(100);
			int guess=-1;
			int tries=0;
			while(guess!=random)
			{
				System.out.println("Guess a number from 1 to 100:");
				guess=in.nextInt();
				tries++;
				if(guess==random)
				{
					System.out.println("You've guessed it right");
					System.out.println("You've guessed it in "+tries+" tries");
					System.out.println("Would you like to play it again?"+"\n"+"Press Yes/No: ");
					play=in.next().toLowerCase();
				}
				else if(guess>random)
				{
					System.out.println("The number you guessed is too high. Try again");
				}
				else
				{
					System.out.println("The number you guessed is too low. Try again");
				}
			}
		}
		in.close();
	}

}
