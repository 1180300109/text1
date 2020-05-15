
package Location;

public class Location 
{
	private int x,y;
	private String name;
	
	public Location(int x,int y,String name)
	{
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public String getname()
	{
		return name;
	}
	
}
