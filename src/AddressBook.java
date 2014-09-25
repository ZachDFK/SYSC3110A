import java.util.ArrayList;


public class AddressBook 
{

	private ArrayList<BuddyInfo> book; 
	
	
	
	public boolean addBuddy( BuddyInfo budInfo)
	{
		boolean doesWork = true; 
		
		try
		{
			book.add(budInfo); 
		}
		catch(Exception e )
		{
			doesWork = false;
		}
		
		return doesWork;
	}
	public boolean removeBuddy(int index)
	{
		boolean doesWork = true;
		try 
		{
			book.remove(index);
		}
		catch(Exception e)
		{
			doesWork = false;
		}
		
		return doesWork;
	}
	public boolean removeBuddy(BuddyInfo budInfo)
	{
		boolean doesWork = true; 
	
		try 
		{
			book.remove(budInfo);
		}
		catch(Exception e)
		{
			doesWork = false;
		}
		
		return doesWork;
		
	}
	public AddressBook()
	{
		book = new ArrayList<BuddyInfo>();
		
	}
	public static void main(String[] args)
	{
		
		BuddyInfo buddy = new BuddyInfo("Justin","613-906-1234","666 Devil St,Hell");
		AddressBook book = new AddressBook(); 
		
		if(!book.addBuddy(buddy)){
			System.out.println("Add error"); 
		}
		if(!book.removeBuddy(buddy)){
			System.out.println("remove error"); 
		}
		
	}
}
