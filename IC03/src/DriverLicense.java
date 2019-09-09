
public class DriverLicense extends Card
{
    private int expirationYear; 
    
    public DriverLicense()
    {
        super(); 
    }
    
    public DriverLicense(String n, int expiration)
    {
        super(n); 
        expirationYear = expiration; 
    }
}
