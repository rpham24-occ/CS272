/** 
 * 
 * @author Richard Pham 
 * @version September 4, 2019
 *
 */ 

public class TestShapes
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Circle c = new Circle(3.2); 
        
        System.out.println("Testing Circle");
        System.out.println(c); 
        
        double max = 0;
        double min = 0; 
        double sum = 0; 
        
        Circle[] arr = new Circle[100];
        
        for (int i = 0; i < 100; i++)
        {
            arr[i] = new Circle(Math.random()*5 + 1);
            
        }
        
        sum += arr[0].getArea();
        max = arr[0].getArea(); 
        min = arr[0].getArea();
        
        for (int j = 0; j < 100; j++)
        {
            sum += arr[j].getArea(); 
                     
            if(arr[j].getArea() > max)
                max = arr[j].getArea(); 
            if(arr[j].getArea() < min)
                min = arr[j].getArea();
        }
        
        System.out.printf("min: %.2f\nmax: %.2f\nsum: %.2f\n", min, max, sum);
        System.out.println();
        System.out.println("Testing Rectangle");
        
        Rectangle r = new Rectangle(5.2, 10);
        System.out.println(r); 
        Rectangle d = new Rectangle(20.4, 10.1);
        System.out.println(d); 
        Rectangle rect = new Rectangle(6.9, 4.2);
        System.out.println(rect + "\n"); 
        
        System.out.println("Testing Square");
        Square s = new Square(6);
        System.out.println(s);
        Square s2 = new Square(15);
        System.out.println(s2); 
        
        System.out.println("\nTesting SetArea");
        c.setArea(49);
        System.out.println("Circle: \n" + c);
        
        s.setArea(55);
        System.out.println("Square: \n" + s);
        
        
    }

}
