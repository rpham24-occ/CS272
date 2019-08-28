/**
 * 
 * @author Richard Pham
 * @version August 28, 2019
 *
 */

import java.util.*;

public class ArrayWithLoops
{

    public static void main(String[] args)
    {
        int[] a = new int[100]; 
        
        for(int i = 0; i < 100; i++)
        {
            a[i] = (int)(Math.random() * ((75 - 25) + 1)) + 25;
        }
        
        int currentSize = a.length; 
        for(int j = 0; j < currentSize; j++)
        {
            if(j%20 == 0 && j != 0)
                System.out.println(); 
            System.out.print(a[j] + " "); 
        }

    }

}
