
package EntryState;

public class Blocked implements EntryState
{
	public static Blocked instance = new Blocked();
	private Blocked() {}
	
	public void statement()
	{
		System.out.println("������");
	}

	public EntryState change(String type)
	{
		switch(type)
		{
		case "RUNNING": 
			return Running.instance;
		case "CANCELLED": 
			return Cancelled.instance;
		default:
			System.out.println("״̬ת������");
			return Blocked.instance;
		}
	}
}
