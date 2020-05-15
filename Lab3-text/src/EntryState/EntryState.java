
package EntryState;

public interface EntryState 
{
	public void statement();
	
	public EntryState change(String type);
	
}
//各种模式均为单例模式，只创建一个实例，不再创建新的实例
