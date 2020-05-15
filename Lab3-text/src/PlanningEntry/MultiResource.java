
package PlanningEntry;
import java.util.List;

public class MultiResource<R> extends DecoratorPlanningEntry<R>
{
	List<R> resources;
	public MultiResource(PlanningEntry<R> plan) 
	{
		super(plan);
	}
	
	public List<R> getresource()
	{
		return resources;
	}
	
	@Override
	public void allocate(R resource) 
	{
		super.allocate(resource);
		this.resources.add(resource);
	}
}
