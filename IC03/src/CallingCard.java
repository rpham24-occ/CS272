
public class CallingCard extends Card
{
    private int cardNumber;
    private int PIN;
    
    public CallingCard()
    {
        super(); 
    }
    
    public CallingCard(String n, int CN, int p)
    {  
       super(n);
       cardNumber = CN; 
       PIN = p;
    }

}
