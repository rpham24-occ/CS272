
public class DriverLicense extends Card
{
    private String expirationYear; 
    
    public DriverLicense()
    {
        super(); 
        this.expirationYear = "";
    }
    
    public DriverLicense(String n, String expiration)
    {
        super(n); 
        this.expirationYear = expiration; 
    }
}
