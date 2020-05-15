
package EntryState;

public class Ended implements EntryState
{
	public static Ended instance = new Ended();
	private Ended() {}
	
	public void statement()
	{
		System.out.println("已完成");
	}

	public EntryState change(String type)
	{
		System.out.println("已结束，无法进行状态转化");
		return Ended.instance;
	}
}
