
public class BillFold
{
    private Card card1; 
    private Card card2; 
    
    public BillFold()
    {
        this.card1 = null; 
        this.card2 = null; 
    }
    
    public BillFold(Card card1, Card card2)
    {
        super(); 
        this.card1 = card1; 
        this.card2 = card2; 
    }
    
    public void addCard(Card c)
    {
        if(card1 == null)
        {
            card1 = c; 
        }
        else if(card2 == null)
        {
            card2 = c;
        }
    }
    
    public String formatCards()
    {
        if(card1 == null)
        {
            return ""; 
        }
        else if (card2 == null)
        {
            return "BillFold [" + card1.format() + "]";
        }
        return "BillFold [" +card1.format() + "][" + card2.format() + "]"; 
    }
}
