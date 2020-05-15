
package PlanningEntry;
import java.util.List;
import Location.Location;

public class MultiLocation<R> extends DecoratorPlanningEntry<R>
{
	List<Location> locations;
	public MultiLocation(List<Location> locations,PlanningEntry<R> plan) 
	{
		super(plan);
		this.locations = locations;
	}
	
	public List<Location> getlocations()
	{
		return locations;
	}
}
