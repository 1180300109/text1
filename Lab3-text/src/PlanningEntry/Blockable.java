
package PlanningEntry;

import EntryState.*;

public class Blockable<R> extends DecoratorPlanningEntry<R>
{
	EntryState stateA;
	public Blockable(PlanningEntry<R> plan)
	{
		super(plan);
	}
	
	public void block()
	{
		stateA = super.plan.getstate();
		stateA = stateA.change("BLOCKED");
	}
	
	public void unblock()
	{
		stateA = super.plan.getstate();
		stateA = stateA.change("RUNNING");
	}
}
