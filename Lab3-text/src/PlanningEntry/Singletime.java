
package PlanningEntry;
import Timeslot.Timeslot;

public class Singletime<R> extends DecoratorPlanningEntry<R>
{
	Timeslot timeslot;
	
	public Singletime(Timeslot timeslot,PlanningEntry<R> plan) 
	{
		super(plan);
		this.timeslot = timeslot;
	}
	
	public Timeslot gettimeslot()
	{
		return timeslot;
	}
}

