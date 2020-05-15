
package EntryState;

public class Allocated implements EntryState
{
	public static Allocated instance = new Allocated();
	private Allocated() {}
	
	public void statement()
	{
		System.out.println("ÒÑ·ÖÅä");
	}

	public EntryState change(String type)
	{
		switch(type)
		{
		case "RUNNING": 
			return Running.instance;
		case "CANCELLED": 
			return Cancelled.instance;
		case "ALLOCATED":
			return Allocated.instance;
		default:
			System.out.println("×´Ì¬×ª»»´íÎó");
			return Allocated.instance;
		}
	}
}
