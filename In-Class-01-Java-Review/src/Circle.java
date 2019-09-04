/**
 * 
 * @author rpham24
 * @version September 4, 2019
 *
 */
public class Circle
{
    private double radius;
    
    public Circle()
    {
        this.radius = 0;
    }
    
    public Circle(double r)
    {
        this.setRadius(r); 
    }
    
    public double getArea()
    {
        double area = (1/2)*Math.PI*Math.pow(radius, 2); 
        return area; 
    }

    public double getRadius()
    {
        return radius;
    }



    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public String toString()
    {
        String ret = "Radius: ";
        ret += radius; 
        ret += "\nArea: "; 
        ret += getArea(); 
        
        return ret; 
      
    }

}
