
package EntryState;

public class Allocated implements EntryState
{
	public static Allocated instance = new Allocated();
	private Allocated() {}
	
	public void statement()
	{
		System.out.println("�ѷ���");
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
			System.out.println("״̬ת������");
			return Allocated.instance;
		}
	}
}
