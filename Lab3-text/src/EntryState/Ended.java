
package EntryState;

public class Ended implements EntryState
{
	public static Ended instance = new Ended();
	private Ended() {}
	
	public void statement()
	{
		System.out.println("�����");
	}

	public EntryState change(String type)
	{
		System.out.println("�ѽ������޷�����״̬ת��");
		return Ended.instance;
	}
}
