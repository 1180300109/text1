
package EntryState;

public class Cancelled implements EntryState
{
	public static Cancelled instance = new Cancelled();
	private Cancelled() {}

	public void statement()
	{
		System.out.println("��ȡ��");
	}
	
	public EntryState change(String type)
	{
		System.out.println("�ѽ������޷�����״̬ת��");
		return Cancelled.instance;
	}
}
