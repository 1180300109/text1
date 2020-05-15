
package EntryState;

public class Cancelled implements EntryState
{
	public static Cancelled instance = new Cancelled();
	private Cancelled() {}

	public void statement()
	{
		System.out.println("已取消");
	}
	
	public EntryState change(String type)
	{
		System.out.println("已结束，无法进行状态转化");
		return Cancelled.instance;
	}
}
