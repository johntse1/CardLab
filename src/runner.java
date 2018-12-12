public class runner
{
    public static void main(String[] args)
    {
        String[] rank = {"1", "2", "3", "4"};
        String[] suit = {"D", "Cl", "H", "S"};
        int[] pointValue = {1, 2, 3, 4};

        Deck deck1 = new Deck(rank, suit, pointValue);
        deck1.shuffle();

        System.out.println(deck1);

        while (deck1.isEmpty())
        {
            Card temp = deck1.deal();
            System.out.println(temp);
        }
        System.out.println(deck1.size());
    }
}
