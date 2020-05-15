
package PlanningEntry;
import Location.Location;

public class TwoLocation<R> extends DecoratorPlanningEntry<R>
{
	Location startlocation;
	Location endlocation;
	
	public TwoLocation(Location startplace,Location endplace,PlanningEntry<R> plan) 
	{
		super(plan);
		startlocation = startplace;
		endlocation = endplace;
	}
	
	public Location getstartplace()
	{
		System.out.println("abcde");
		return startlocation;
	}
	
	public Location getendplace()
	{
		return endlocation;
	}

}
