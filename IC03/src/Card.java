
public class Card
{
   protected String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
   
   public String toString()
   {
       return "Card [Name=" + name + "]";
   }

   public boolean equals(Card c)
   {
       if (this.getClass() == c.getClass() && name == c.getName())
       {
           return true; 
       }
       return false;
   }

}
