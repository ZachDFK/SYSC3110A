import java.util.HashMap;


public class AddressBook 
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
		BuddyInfo buddy = new BuddyInfo("Justin","613-906-1234","666 Devil St,Hell");
		AddressBook book = new AddressBook(); 
		if(!book.addBuddy(buddy.getName(), buddy))System.out.println("Add error"); 
		if(!book.removeBuddy(buddy.getName()))System.out.println("remove error"); 
		
	}
}
