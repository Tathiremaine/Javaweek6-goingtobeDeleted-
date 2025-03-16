package week6CodeFinalAssignment;
import java.util.ArrayList;
import java.util.List;

public class Player 
//c. Player
		//i. Fields
	          //1. hand (List of Card)
	          //2. score (set to 0 in the constructor)
	          //3. name
//ii.    Methods

//1. describe (prints out information about the player and 
//calls the describe method for each card in the Hand List)
//2. flip (removes and returns the top card of the Hand)
//3. draw (takes a Deck as an argument and calls the draw 
//method on the deck, adding the returned Card to the hand field)
//4. incrementScore (adds 1 to the Player’s score field)
{
	//our fields for hand, score, and name
	private List<Cards> hand;
	private int score;
	private String name;
	
	public Player(String name)
	{
		this.hand = new ArrayList<>();
		this.score = 0;
		this.name = name;
	}
	
	public List<Cards> getHand()
	{
		return hand;
	}
	
	public void setHand(List<Cards> hand)
	{
		this.hand = hand;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	//calls the method for each card in the hand
	public void describe()
	{
		System.out.println(name + " has the following cards:");
		for (Cards card : hand)
		{
			card.describe();
		}
	}
//removes and returns the top card of the hand
	public Cards flip()
	{
		if (!hand.isEmpty())
		{
			return hand.remove(0);
		}
		else
		{
			return null;
		}
		
	}
	
	//adds a card to the hand
	public void draw(Deck deck)
	{
		Cards drawnCard = deck.draw();
		if (drawnCard != null)
		{
			hand.add(drawnCard);
		}
		
		
	}
	
	//adds a point to the players score
	public void incrementScore()
	{
		score++;
	}
}































