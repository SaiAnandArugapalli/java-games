import java.util.Scanner;
import java.util.Random;
public class rockpaperscissor {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String play="yes";
		while(play.equals("yes"))
		{
			String[] game= {"rock","paper","scissors"};
			Random choice=new Random();
			String computerchoice=game[choice.nextInt(game.length)];
			String playerchoice="null";
			while(playerchoice!=computerchoice)
			{
				System.out.println("Enter your choice (Rock, Paper or Scissors): ");
				playerchoice=in.next().toLowerCase();
				if(playerchoice.equals("rock")||playerchoice.equals("paper")||playerchoice.equals("scissors"))
				{
					break;
				}
				System.out.println(playerchoice+" is not valid");
			}
			System.out.println("Computer chose: "+computerchoice);
			if(playerchoice.equals(computerchoice))
			{
				System.out.println("It's a tie.");
			}
			else if(playerchoice.equals("rock"))
			{
				if(computerchoice.equals("paper"))
				{
					System.out.println("You lose.");
				}
				else if(computerchoice.equals("scissors"))
				{
					System.out.println("You win.");
				}
			}
			else if(playerchoice.equals("paper"))
			{
				if(computerchoice.equals("scissors"))
				{
					System.out.println("You lose.");
				}
				else if(computerchoice.equals("rock"))
				{
					System.out.println("You win.");
				}
			}
			else if(playerchoice.equals("scissors"))
			{
				if(computerchoice.equals("rock"))
				{
					System.out.println("You lose.");
				}
				else if(computerchoice.equals("paper"))
				{
					System.out.println("You win.");
				}
			}
			System.out.println("You want to play again?(Yes/No): ");
			play=in.next().toLowerCase();
			
		}
		in.close();

	}

}
