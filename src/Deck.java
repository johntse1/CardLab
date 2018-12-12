import java.util.ArrayList;

public class Deck
{
   private ArrayList<Card> unDealt = new ArrayList<Card>();
   private ArrayList<Card> dealt = new ArrayList<Card>();
   public Deck(String[] rank, String[] suit, int[] pointValue)
   {
       unDealt = new ArrayList<Card>();
       for(int i = 0; i < rank.length; i++)
       {
           for(int j = 0; j < suit.length; j++)
           {
                   Card cardDeck = new Card(rank[i], suit[j], pointValue[i]);
                    unDealt.add(cardDeck);
           }
       }
   }
   public boolean isEmpty()
   {
       return this.size() == 0;
   }
   public int size()
   {
       return unDealt.size();
   }
   public Card deal()
   {
       if(unDealt.size()== 0)
       {
           return null;
       }
       else
       {
            Card cardnew = unDealt.get(0);
            dealt.add(cardnew);
            unDealt.remove(cardnew);
            return cardnew;
       }
   }
   public ArrayList<Card> shuffle()
   {
       Card temp;
       for(int i = 0; i <dealt.size(); i++)
       {
           temp = dealt.get(i);
           dealt.remove(temp);
           unDealt.add(temp);
       }
       return unDealt;
   }
}
