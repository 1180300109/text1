
package PlanningEntry;

public class SingleResource<R> extends DecoratorPlanningEntry<R>
{
	R resource;
	
	public SingleResource(PlanningEntry<R> plan) 
	{
		super(plan);
	}
	
	public R getsource()
	{
		return resource;
	}
	
	@Override
	public void allocate(R resource) 
	{
		super.allocate(resource);
		this.resource = resource;
	}
}

