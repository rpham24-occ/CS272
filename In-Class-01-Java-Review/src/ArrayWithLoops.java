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
        
        for(int i = 0; i < 5; i++)
        {
            int maxRow = i*20+20; 
            for(int j = i*20; j < maxRow; j++)
            {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }

    }

}
