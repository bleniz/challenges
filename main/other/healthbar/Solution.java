package main.other.healthbar;

import java.math.*;

public class Solution
{
    public Solution()
    {    
    }

    /**
    * Calculate minimum health required to survive the postive and negative hitpoints in passed in array.
    */
    public int calculateMinimumHealth(int[] points)
    {        
        int currentDamage = maxDamage = 0;

        for (int point : points)
        {
            currentDamage= currentDamage + point;
            if (currentDamage < maxDamage)
            {
                maxDamage = currentDamage;
            }
        }    

        return (Math.abs(maxDamage) + 1);               
    }
}

