package PlanningEntry;

import EntryState.EntryState;

public abstract class DecoratorPlanningEntry<R> implements PlanningEntry<R>
{
	protected final PlanningEntry<R> plan;  //子类可以使用
	
	public DecoratorPlanningEntry(PlanningEntry<R> plan)
	{
		this.plan = plan;
	}

	@Override
	public void allocate(R resource) 
	{
		plan.allocate(resource);
	}

	@Override
	public void start() 
	{
		plan.start();
	}

	@Override
	public void cancel() 
	{
		plan.cancel();
	}

	@Override
	public void end() 
	{
		plan.end();
	}

	@Override
	public String getname()
	{
		return plan.getname();
	}

	@Override
	public EntryState getstate() 
	{
		return plan.getstate();
	}
	
}
