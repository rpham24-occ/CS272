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
        Scanner cin = new Scanner(System.in); 
        
        int count = cin.nextInt();
        double headOrTail = 0.0; 
        String word = ""; 
        int columnCounter = 0; 
        
        for (int i = 0; i < count; i++)
        {
            headOrTail = Math.random();
                
            if(headOrTail < 0.5)
            {
                word = "Tails"; 
                System.out.printf("%-7s", word);
            }
            else
            {
                word = "Heads";
                System.out.printf("%-7s", word);
            }
            columnCounter++; 
            if(columnCounter%10 == 0)
            {
                System.out.println(); 
            }
        }
    }

}

