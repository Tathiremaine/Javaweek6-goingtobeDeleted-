package week6CodeFinalAssignment;

public class App {

	public static void main(String[] args) {
		//2. Create a class called App with a main method.

		//a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		deck.shuffle();

		//b.     Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		for (int i = 0; i < 52; i++)
		{
			if (i % 2 == 0)
			{
				player1.draw(deck);
			}
			else
			{
				player2.draw(deck);
			}
		}

		//c.      Using a traditional for loop, iterate 26 times and call the flip method 
		//for each player.
		
		//run the game loop, flip cards 
		for (int i= 0; i < 26; i++)
		{
			Cards card1 = player1.flip();
			Cards card2 = player2.flip();
			
			System.out.println(player1.getName() + " flips: ");
			card1.describe();
			System.out.println(player2.getName() + " flips: ");
			card2.describe();
			
			//card compare
			
			if (card1.getValue() > card2.getValue())
			{
				player1.incrementScore();
				System.out.println(player1.getName() + " wins this round!");
			}
			
			else if(card1.getValue() < card2.getValue())
			{
				player2.incrementScore();
				System.out.println(player2.getName() + " wins this round!");
			}
			else
			{
				System.out.println("It's a tie! No Points!");
			}
		}
		//Compare the value of each card returned by the two player’s flip methods. 
		//Call the incrementScore method on the player whose card has the higher value.  
		//Print a message to say which player received a point.
		
		//*********FINAL SCORE COMPARISON**************************
		System.out.println(player1.getName() + " final score: " + player1.getScore());
		System.out.println(player2.getName() + " final score: " + player2.getScore());
		
		if (player1.getScore() > player2.getScore())
		{
			System.out.println(player1.getName() + " wins the game!");
		}
		else if (player1.getScore() < player2.getScore())
		{
			System.out.println(player2.getName() + " wins the game!");
		}
		//else
		{
			System.out.println("The game is a draw");
		}
		//Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
		//d.      After the loop, compare the final score from each player.

		//e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

		 

	}

}






























































































































