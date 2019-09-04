/**
 * 
 * @author Richard Pham
 * @version September 4, 2019
 *
 */
public class Rectangle
{
    private double width; 
    private double length; 
    
    public Rectangle()
    {
        this.width = 0;
        this.length = 0; 
       
    }
    
    public Rectangle(double w, double l)
    {
        this.width = w; 
        this.length = l;
    }
    
    public double getArea()
    {
        return length*width; 
    }
    
    public String toString()
    {
        String ret = "Width: ";
        ret += width + " Length: " + length; 
        ret += "\nArea: "; 
        ret += getArea(); 
        
        return ret; 
      
    }
}
