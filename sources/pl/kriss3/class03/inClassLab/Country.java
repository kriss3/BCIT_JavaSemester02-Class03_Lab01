package pl.kriss3.class03.inClassLab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Krzysztof Szczurowski
 * @since 2017 01 27
 * @see 
 */
public class Country 
{
	private String[][] provinces = new String[10][2];
	private HashMap<String, String> myProvinces;
	
	public Country()
	{
		setFirstDimention();
		setSecondDimention();
		myProvinces = new HashMap<>();
	}
	
	public void setFirstDimention()
	{
		provinces[0][0]="ab";
		provinces[1][0]="bc";
		provinces[2][0]="mb";
		provinces[3][0]="nb";
		provinces[4][0]="nl";
		provinces[5][0]="ns";
		provinces[6][0]="on";
		provinces[7][0]="pe";
		provinces[8][0]="qc";
		provinces[9][0]="sk";
	}
	
	public void setSecondDimention()
	{
		provinces[0][1]="alberta";
		provinces[1][1]="british columbia";
		provinces[2][1]="manitoba";
		provinces[3][1]="new brunswick";
		provinces[4][1]="newfoundland";
		provinces[5][1]="nova scotia";
		provinces[6][1]="ontario";
		provinces[7][1]="prince edward island";
		provinces[8][1]="quebec";
		provinces[9][1]="saskatchewan";	
	}
	
	/**
	 * Generates HashMap with values from provided 2D array, takes no parameters and returns nothing;
	 * What IS important - we are allowing to store null values for key and/or value (because WHY NOt)
	 */
	public void createHashMap()
	{
		for(int i = 0; i<provinces.length; i++)
		{
			for(int j=0;j<provinces[i].length; j++)
			{
				//ask about adding a check to make sure no NULLs are passed to HashMap?
				myProvinces.put(provinces[i][0], provinces[i][j]);
			}
		}
	}
	
	/**
	 * Iterates over a Set created from the given HashSet;
	 * Before printing results it check both: key and value for null value;
	 * This method does not return any value, prints message to console;
	 */
	public void showAllMappings()
	{
		for (Map.Entry<String, String> entry : myProvinces.entrySet())
		{
			if(entry.getKey() == null || entry.getValue() == null)
			{
				throw new IllegalArgumentException("\nKey/Value in HashMap entry is NULL, please correct !\n"
						+ "Key is: " + entry.getKey() + " Value is: " + entry.getValue());
			}
			else
			{
				System.out.println(entry.getKey() + " - " + entry.getValue().substring(0,1).toUpperCase() + entry.getValue().substring(1).toLowerCase());
			}
		}
		
		System.out.println();
	}
	
	/**
	 * This method uses keySet() method to return a Set of Key of HashSet;
	 * Before printing results checks for null values in the key and in the value;
	 * It does not return value; prints results back to the console;
	 */
			
	public void showAllMappings2()
	{
		Set<String> mySet = myProvinces.keySet();
		
		Iterator<String> itr = mySet.iterator();
		
		while(itr.hasNext())
		{
			String myKey = itr.next();
			String value = myProvinces.get(myKey);
			
			if(myKey == null || value == null)
			{
				throw new IllegalArgumentException("\nMyKey or Value is NULL, please correct !\nMyKey is: " + myKey + " Value is: " + value);
			}
			else
			{
				System.out.println(myKey + " - " + value.substring(0,1).toUpperCase() + value.substring(1).toLowerCase());
			}
		}
		System.out.println();
	}
	
	/**
	 * This method check whether supplied substring belong any of the values in the HashMap;
	 * Before operating on the passed substring, checking for null value;
	 * @param substring takes substring value as String
	 * @return boolean value whether substring found in the HashMap
	 */
	public boolean doesAnyProvinceContain(String substring) 
	{
		boolean result  = false;
		
		if(substring == null)
		{
			throw new IllegalArgumentException("\nString value passed to this method is NULL, please correct !");
		}
		
		for(String hashValue : myProvinces.values())
		{
			if(hashValue.contains(substring))
			{
				result = true;
			}
		}
		return result;
	}
}
