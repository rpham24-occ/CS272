
public class IDCard extends Card
{
    private String idNumber;
    
    public IDCard()
    {
        super();
        this.idNumber = "";
    }
    
    public IDCard(String n, String id)
    {  
       super(n);
       this.idNumber = id;
    }
    
    public String format()
    {
       return super.format() + " ID Number: " + idNumber;
    }

}
