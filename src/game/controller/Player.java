package game.controller;

import java.util.Scanner;

public class Player
{
	private String askPlayer;
	private String firstPlayerAnswer;
	private int randomAnswerInt;
	private String secondPlayerAnswer;
	private int questionCount;
	private String question;
	private String playerOneScore;
	private int tieCount;
	private int winCount;
	private int lossCount;
	
	Scanner myScanner = new Scanner(System.in);
	
	public void start()
	{ 
		tieCount = 0;
		winCount = 0;
		lossCount = 0;
		
		initializeGame();
	
	}
	
	private void initializeGame()
	{
		askPlayer = "Rock, Paper, or Scissors?";
		firstPlayerAnswer = "";
		
				System.out.println("Player one " +askPlayer);
				firstPlayerAnswer = myScanner.next();
				System.out.println(firstPlayerAnswer);
				
			decideRandomQuestion();
			decideWinner();
	}
	
	private void decideRandomQuestion()

	{
		randomAnswerInt = (int) (Math.random() *3);
		if(randomAnswerInt == 0)
		{
			secondPlayerAnswer = "rock";
		}
		else if(randomAnswerInt == 1)
		{
			secondPlayerAnswer = "paper";
		}
		else if(randomAnswerInt == 2)
		{
			secondPlayerAnswer = "scissors";
		}
	}
	
	private void decideWinner()
		{
				if(getFirstPlayerAnswer().equalsIgnoreCase(secondPlayerAnswer))
				{
					System.out.println("Player one chose " +getFirstPlayerAnswer() + ", player two chose" + getSecondPlayerAnswer() + ".");
					System.out.println("Player one and two tied");
					System.out.println("Would you like to play again?" + "\n");
					
					tieCount++;
					String answer = myScanner.next();
					if(answer.equalsIgnoreCase("yes"))
					{
						initializeGame();
					}
					else
					{
						playerOneScore = "Wins:" +winCount + " Losses:" + lossCount + " Ties:" + tieCount; 
						System.out.println(playerOneScore);
					}
				}
				else if((getFirstPlayerAnswer().equalsIgnoreCase("rock") && getSecondPlayerAnswer().equalsIgnoreCase("scissors")))
				{
					System.out.println("Player one chose " +getFirstPlayerAnswer() + ", player two chose" + getSecondPlayerAnswer() + ".");
					System.out.println("Player one wins");
					System.out.println("Would you like to play again?" + "\n");
					
					winCount++;
					String answer = myScanner.next();
					if(answer.equalsIgnoreCase("yes"))
					{
						initializeGame();
					}
					else
					{
						playerOneScore = "Wins:" +winCount + " Losses:" + lossCount + " Ties:" + tieCount; 
						System.out.println(playerOneScore);
					}
				}
				else if((getFirstPlayerAnswer().equalsIgnoreCase("paper") && getSecondPlayerAnswer().equalsIgnoreCase("rock")))
				{
					System.out.println("Player one chose " +getFirstPlayerAnswer() + ", player two chose" + getSecondPlayerAnswer() + ".");
					System.out.println("Player one wins");
					System.out.println("Would you like to play again?" + "\n");
					
					winCount++;
					String answer = myScanner.next();
					if(answer.equalsIgnoreCase("yes"))
					{
						initializeGame();
					}
					else
					{
						playerOneScore = "Wins:" +winCount + " Losses:" + lossCount + " Ties:" + tieCount; 
						System.out.println(playerOneScore);
					}
				}
				else if((getFirstPlayerAnswer().equalsIgnoreCase("scissors") && getSecondPlayerAnswer().equalsIgnoreCase("paper")))
				{
					System.out.println("Player one chose " +getFirstPlayerAnswer() + ", player two chose" + getSecondPlayerAnswer() + ".");
					System.out.println("Player one wins");
					System.out.println("Would you like to play again?" + "\n");
					
					winCount++;
					String answer = myScanner.next();
					if(answer.equalsIgnoreCase("yes"))
					{
						initializeGame();
					}
					else
					{
						playerOneScore = "Wins:" +winCount + " Losses:" + lossCount + " Ties:" + tieCount; 
						System.out.println(playerOneScore);
					}
				}
				else if((getFirstPlayerAnswer().equalsIgnoreCase("scissors") && getSecondPlayerAnswer().equalsIgnoreCase("rock")))
				{
					System.out.println("Player one chose " +getFirstPlayerAnswer() + ", player two chose" + getSecondPlayerAnswer() + ".");
					System.out.println("Player one wins");
					System.out.println("Would you like to play again?" + "\n");
					
					lossCount++;
					String answer = myScanner.next();
					if(answer.equalsIgnoreCase("yes"))
					{
						initializeGame();
					}
					else
					{
						playerOneScore = "Wins:" +winCount + " Losses:" + lossCount + " Ties:" + tieCount; 
						System.out.println(playerOneScore);
					}
				}
				else if((getFirstPlayerAnswer().equalsIgnoreCase("paper") && getSecondPlayerAnswer().equalsIgnoreCase("scissors")))
				{
					System.out.println("Player one chose " +getFirstPlayerAnswer() + ", player two chose" + getSecondPlayerAnswer() + ".");
					System.out.println("Player one wins");
					System.out.println("Would you like to play again?" + "\n");
					
					lossCount++;
					String answer = myScanner.next();
					if(answer.equalsIgnoreCase("yes"))
					{
						initializeGame();
					}
					else
					{
						playerOneScore = "Wins:" +winCount + " Losses:" + lossCount + " Ties:" + tieCount; 
						System.out.println(playerOneScore);
					}
				}
				else if((getFirstPlayerAnswer().equalsIgnoreCase("paper") && getSecondPlayerAnswer().equalsIgnoreCase("scissors")))
				{
					System.out.println("Player one chose " +getFirstPlayerAnswer() + ", player two chose" + getSecondPlayerAnswer() + ".");
					System.out.println("Player one wins");
					System.out.println("Would you like to play again?" + "\n");
					
					lossCount++;
					String answer = myScanner.next();
					if(answer.equalsIgnoreCase("yes"))
					{
						initializeGame();
					}
					else
					{
						playerOneScore = "Wins:" +winCount + " Losses:" + lossCount + " Ties:" + tieCount; 
						System.out.println(playerOneScore);
					}
				}
			}

	public String getAskPlayer()
	{
		return askPlayer;
	}

	public void setAskPlayer(String askPlayer)
	{
		this.askPlayer = askPlayer;
	}

	public String getFirstPlayerAnswer()
	{
		return firstPlayerAnswer;
	}

	public void setFirstPlayerAnswer(String firstPlayerAnswer)
	{
		this.firstPlayerAnswer = firstPlayerAnswer;
	}

	public String getSecondPlayerAnswer()
	{
		return secondPlayerAnswer;
	}

	public void setSecondPlayerAnswer(String secondPlayerAnswer)
	{
		this.secondPlayerAnswer = secondPlayerAnswer;
	}

	public Scanner getMyScanner()
	{
		return myScanner;
	}

	public void setMyScanner(Scanner myScanner)
	{
		this.myScanner = myScanner;
	}


	
	
	
	
}
