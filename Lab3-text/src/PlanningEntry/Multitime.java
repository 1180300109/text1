
package PlanningEntry;
import java.util.List;
import Timeslot.Timeslot;

public class Multitime<R> extends DecoratorPlanningEntry<R>
{
	List<Timeslot> timeslots;
	
	public Multitime(List<Timeslot> timeslots,PlanningEntry<R> plan) 
	{
		super(plan);
		this.timeslots = timeslots;
	}
	
	public List<Timeslot> gettimeslots()
	{
		return timeslots;
	}
}
