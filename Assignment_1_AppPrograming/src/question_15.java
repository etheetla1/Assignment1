import java.util.Random;

public class question_15 {
	public static void main(String[] args) 
    {
        String[] Ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        Random random = new Random();
        int RankIndex = random.nextInt(Ranks.length);
        int SuitIndex = random.nextInt(Suits.length);
        String RandomRank = Ranks[RankIndex];
        String RandomSuit = Suits[SuitIndex];
        System.out.println("The picked Card is " + RandomRank + " of " + RandomSuit);
    }
}
