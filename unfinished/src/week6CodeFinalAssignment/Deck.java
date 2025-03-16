package week6CodeFinalAssignment;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import week6CodeFinalAssignment.Cards;
public class Deck 
{
	
		private List<Cards> cards = new ArrayList<Cards>();
		 
		public Deck()
		{
			String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
			String[] numbers = {"Two", "Three", "Four", "Five", "Six", "seven",
					"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
			
			
			for (String suit : suits)
			{
				int count = 2;
				for(String number : numbers)
				{
					Cards card = new Cards(number, suit, count);
					this.cards.add(card);
				}
			}
		}

		public List<Cards> getCards() 
		{
			return cards;
		}

		public void setCards(List<Cards> cards) 
		{
			this.cards = cards;
		}

		public void describe()
		{
			for(Cards card : this.cards)
			{
				card.describe();
			}
		}
		
		
		public void shuffle()
		{
			Collections.shuffle(this.cards);
		}
		
		public Cards draw()
		{
			Cards card = this.cards.remove(0);
			
			return card;
		}
	
		
	}


