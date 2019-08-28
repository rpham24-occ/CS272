/**
 * 
 * @author Richard Pham 
 * @version August 28, 2019
 *
 */

import java.util.*;

public class Flipper
{

    public static void main(String[] args)
    {
        System.out.print("How many times do you want to flip a coin: ");
        Scanner in = new Scanner(System.in); 
        
        int count = in.nextInt();
        double headOrTail = 0.0; 
        
        for (int i = 0; i < count; i++)
        {
            headOrTail = Math.random();
            
            if(headOrTail < 0.5)
                System.out.println("Tails");
            else 
                System.out.println("Heads");
        }
    }

}

