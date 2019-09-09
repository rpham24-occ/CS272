
public class CallingCard extends Card
{
    private String cardNumber;
    private String PIN;
    
    public CallingCard()
    {
        super(); 
        this.cardNumber = ""; 
        this.PIN = ""; 
    }
    
    public CallingCard(String n, String CN, String p)
    {  
       super(n);
       this.cardNumber = CN; 
       this.PIN = p;
    }
    public String format()
    {
       return super.format() + " cardNumber: " + this.cardNumber + " PIN: " + this.PIN; 
    }
}
