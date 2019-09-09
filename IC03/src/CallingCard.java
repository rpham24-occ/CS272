
public class CallingCard extends Card
{
    private int cardNumber;
    private int PIN;
    
    public CallingCard()
    {
        super(); 
        cardNumber = 0; 
        PIN = 0; 
    }
    
    public CallingCard(String n, int CN, int p)
    {  
       super(n);
       cardNumber = CN; 
       PIN = p;
    }

}
