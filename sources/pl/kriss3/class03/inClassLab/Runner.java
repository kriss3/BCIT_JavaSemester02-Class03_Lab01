package pl.kriss3.class03.inClassLab;

public class Runner 
{
	public static void main(String[] args)
	{
		Run();
	}
	
	/**
	 * Executable static method
	 */
	public static void Run()
	{
		Country c = new Country();

		System.out.println("Let's display Canadian Provinces");
		System.out.println("--------------------------------");
		c.createHashMap();
		c.showAllMappings();
		
		System.out.println("Let's display Canadian Provinces AGAIN");
		System.out.println("--------------------------------------");
		c.showAllMappings2();
		
		System.out.println("Check for Substring, presence: ");
		String value = "man";
		boolean doesContainSubstring = c.doesAnyProvinceContain(value);
		System.out.println("The seach of substring: \"" + value + "\" in my HashMap returned: " + doesContainSubstring);
		
		System.out.println();
		System.out.println("Finished !!!");
	}
}
