
package EntryState;

public class Waiting implements EntryState
{
	public static Waiting instance = new Waiting();//单例模式
	private Waiting() {}
	
	public void statement()
	{
		System.out.println("未分配");
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
			System.out.println("状态转换错误");
			return Waiting.instance;
		}
	}
}
