
package PlanningEntry;
import Location.Location;

public class OneLocation<R> extends DecoratorPlanningEntry<R>
{
	Location location;
	
	public OneLocation(Location loc,PlanningEntry<R> plan) 
	{
		super(plan);
		this.location = loc;
	}
	
	public Location getlocation()
	{
		return this.location;
	}
	
}
