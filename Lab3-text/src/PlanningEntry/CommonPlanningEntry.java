//PlanningEntry的基本实现 , 共性实现
package PlanningEntry;
import EntryState.*;

public class CommonPlanningEntry<R> implements PlanningEntry<R> 
{
	private String name;
	private EntryState state;
	
	public CommonPlanningEntry(String name)
	{
		this.name = name;
		state = Waiting.instance;
	}
	
	@Override
	public void allocate(R resource) 
	{
		state = state.change("ALLOCATED");
	}

	@Override
	public void start() 
	{
		state = state.change("RUNNING");
	}

	@Override
	public void cancel() 
	{
		state = state.change("CANCELLED");
	}

	@Override
	public void end() 
	{
		state = state.change("ENDED");
	}

	@Override
	public String getname() 
	{
		return name;
	}

	@Override
	public EntryState getstate() 
	{
		return state;
	}
	
}
