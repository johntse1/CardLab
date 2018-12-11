import java.lang.reflect.Array;
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
           for(int i = 0; i < suit.length; i++)
           {
               for(int i = 0; i < pointValue.length; i++)
               {
                   Card unsorted = new Card(rank[i], suit[i], pointValue[i]);
               }
           }
       }
   }
   public static boolean isEmpty()
   {
       return
   }
   public static int size()
   {
   }
}
