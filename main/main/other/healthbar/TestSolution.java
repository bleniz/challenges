package main.other.healthbar;

import org.junit.*;

public class TestSolution
{
	private Solution solution;
	
	@Before
	public void setup()
	{
		solution = new Solution();
	}
	
	@After
	public void teardown()
	{
		
	}
	
	@Test
    public void test_oneNegative()
    {
		int expected = 2;
        int[] damage = {-1, 5, 4, 0};
        
        int health = solution.calculateMinimumHealth(damage);
        
        Assert.assertEquals(expected, health);
    }
	
	@Test
	public void test_multipleNegatives()
	{
		int expected = 3;
		int[] damage = {-1, 5, -6};
		
		int health = solution.calculateMinimumHealth(damage);
		
		Assert.assertEquals(expected, health);
	}
	
	@Test
	public void test_noNegatives()
	{
		int expected = 1;
		int[] damage = {1, 2, 3};
		
		int health = solution.calculateMinimumHealth(damage);
		
		Assert.assertEquals(expected, health);
	}
	
	@Test
	public void test_allNegatives()
	{
		int expected = 7;
		int[] damage = {-1, -2, -3};
		
		int health = solution.calculateMinimumHealth(damage);
		
		Assert.assertEquals(expected, health);
	}
}