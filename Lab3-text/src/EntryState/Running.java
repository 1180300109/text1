
package EntryState;

public class Running implements EntryState
{
	public static Running instance = new Running();
	private Running() {}
	
	public void statement()
	{
		System.out.println("ÒÑÆô¶¯");
	}

	public EntryState change(String type)
	{
		switch(type)
		{
		case "ENDED": 
			return Ended.instance;
		case "BLOCKED": 
			return Blocked.instance;
		default:
			System.out.println("×´Ì¬×ª»»´íÎó");
			return Running.instance;
		}
	}
}
