
public class Square
{
    private double width;  
    
    public Square()
    {
        this.width = 0;           
    }
    
    public Square(double w)
    {
        this.width = w; 
    }
    
    public double getArea()
    {
        return Math.pow(this.width, 2); 
    }
    
    public void setArea(double a)
    {
        this.width = Math.sqrt(a);
    }
    
    
    public String toString()
    {
        String ret = "Width: ";
        ret += width; 
        ret += "\nArea: "; 
        ret += getArea(); 
        
        return ret; 
      
    }
}
