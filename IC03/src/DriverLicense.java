
public class DriverLicense extends Card
{
    private int expirationYear; 
    
    public DriverLicense()
    {
        super(); 
        expirationYear = 0; 
    }
    
    public DriverLicense(String n, int expiration)
    {
        super(n); 
        expirationYear = expiration; 
    }
}
