import java.util.HashMap;


public class AddressBook extends BuddyInfo
{

	private HashMap<String, BuddyInfo> book; 
	
	
	
	public boolean addBuddy(String name, BuddyInfo budInfo)
	{
		boolean doesWork = true; 
		
		try
		{
			book.put(name,budInfo); 
		}
		catch(Exception e )
		{
			doesWork = false;
		}
		
		return doesWork;
	}
	public boolean removeBuddy(String name)
	{
		boolean doesWork = true; 
	
		try 
		{
			book.remove(name);
		}
		catch(Exception e)
		{
			doesWork = false;
		}
		
		return doesWork;
		
	}
	public static void main(String[] args)
	{
		System.out.println("Address Book");
	}
}
