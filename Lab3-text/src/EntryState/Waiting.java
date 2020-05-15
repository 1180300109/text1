
package EntryState;

public class Waiting implements EntryState
{
	public static Waiting instance = new Waiting();//����ģʽ
	private Waiting() {}
	
	public void statement()
	{
		System.out.println("δ����");
	}
	
	public EntryState change(String type)
	{
		switch(type)
		{
		case "ALLOCATED": 
			return Allocated.instance;
		case "CANCELLED": 
			return Cancelled.instance;
		default:
			System.out.println("״̬ת������");
			return Waiting.instance;
		}
	}
}
