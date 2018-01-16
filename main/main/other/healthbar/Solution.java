package main.other.healthbar;

public class Solution
{
    public Solution()
    {    
    }

    /**
    * Calculate minimum health required to survive the postive and negative 
    * hitpoints froms passed in array.
    */
    public int calculateMinimumHealth(int[] points)
    {        
        int currentDamage = 0; 
        int maxDamage = 0;

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

