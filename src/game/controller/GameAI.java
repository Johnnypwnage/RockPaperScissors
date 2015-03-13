package game.controller;

import java.util.Scanner;


public class GameAI
{
	private Scanner myScanner;
	public String counterPick;
	
	
	private void aiChoice()
	{
		if(Player.getFirstPlayerAnswer() == "scissors")
		{
			counterPick = "rock";
		}
		else if(Player.getFirstPlayerAnswer() == "rock")
		{
			counterPick = "paper";
		}
		else(Player.getFirstPlayerAnswer() == "paper")
		{
			counterPick = "scissors";
		}
	}
	
	public static void decideWinner()
	{
		if(Player.getFirstPlayerAnswer.equalsIgnoreCase() == Player.getSecondPlayerAnswer.equalsIgnoreCase())
		{
			System.out.println("Player one chose " +Player.getFirstPlayerAnswer() + ", player two chose" + Player.getSecondPlayerAnswer + ".");
			System.out.println("Player one and two tied");
			System.out.println("Would you like to play again?");
			if(myScanner.nextLine() == "yes")
			{
				Player.start();
			}
			else
			{
				System.exit(0);
			}
		}
		
		else if(Player.getFirstPlayerAnswer.equalsIgnoreCase() == "scissors" && Player.getSecondPlayerAnswer.equalsIgnoreCase() == "paper" || Player.getFirstPlayerAnswer() )
		{
			System.out.println("Player one chose " +Player.getFirstPlayerAnswer() + ", player two chose" + Player.getsecondPlayerAnswer + ".");
			System.out.println("Player one wins.");
			System.out.println("Would you like to play again?");
			if(myScanner.nextLine() == "yes")
			{
				Player.start();
			}
			else
			{
				System.exit(0);
			}
		}
		else

		private void checkPlayerAnswer()
		{
			if(Player.getFirstPlayerAnswer() != "scissors" || Player.getFirstPlayerAnswer() != "rock" || Player.getFirstPlayerAnswer() != "paper")
				{
				
				}
		}
}
