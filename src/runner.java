public class runner
{
    public static void main(String[] args)
    {
        String[] rank = {"Ace", "2", "3", "4","5", "6", "7", "8", "9" , "10", "Jack", "Queen", "King"};
        String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
        int[] pointValue = {1, 2,3,4,5,6,7,8,9,10,11,12,13};

        Deck deck1 = new Deck(rank, suit, pointValue);
        while (!deck1.isEmpty())
        {
            Card temp = deck1.deal();
            System.out.println(temp);
        }
        deck1.shuffle();
        for(int i = 0; i<52; i++)
        {
            System.out.println(deck1.deal());
        }
    }
}
