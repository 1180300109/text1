
package ConcretePlanningEntry;
import PlanningEntry.*;
import Resource.*;
import EntryState.*;
import Location.Location;
import Timeslot.Timeslot;

public class FlightEntry //extends DecoratorPlanningEntry
{
	DecoratorPlanningEntry<Plane> flightplan;
	
	public FlightEntry(String name,Location startplace,Location endplace,Timeslot timeslot)
	{
		flightplan = new SingleResource<Plane>(
				          new Singletime<Plane>(
				        		 timeslot,new TwoLocation<Plane>(
				        				 startplace,endplace,new CommonPlanningEntry<Plane>(name))));
	}
	
	public String getname()
	{
		return flightplan.getname();
	}
	
	public Location getstartplace()
	{
		return ((TwoLocation<Plane>) flightplan).getstartplace();
	}
	
	public Location getendplace()
	{
		return ((TwoLocation<Plane>) flightplan).getendplace();
	}
	
	public Timeslot gettimeslot()
	{
		return ((Singletime<Plane>) flightplan).gettimeslot();
	}
	
	public Plane getresource()
	{
		return ((SingleResource<Plane>) flightplan).getsource();
	}
	
	public EntryState getstate()
	{
		return flightplan.getstate();
	}
	
	public void allocate(Plane plane)
	{
		flightplan.allocate(plane);
	}
	
	public void start()
	{
		flightplan.start();
	}
}
