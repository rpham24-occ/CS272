
public class BillFoldTest
{
    public static void main(String[] args)
    {
        Card d = new DriverLicense("John Doe", "2020");
        Card c = new CallingCard("Danny Do", "01023478", "1234");
        Card id = new IDCard("Richard Pham", "17667954");
        Card id2 = new IDCard("Richard Pham", "17667954");
        
        BillFold bf = new BillFold();
        bf.addCard(c);
       
        
        System.out.println(bf.formatCards());
        
        BillFold bf2 = new BillFold();
        bf2.addCard(c);
        bf2.addCard(id);
        
        System.out.println(bf2.formatCards());
        System.out.println(c); 
        System.out.println(d); 
        System.out.println(id); 
        
        System.out.println(id.equals(id2));
    }
}
