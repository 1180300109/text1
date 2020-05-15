package Client;

import ConcretePlanningEntry.FlightEntry;
import Location.Location;
import Resource.Plane;
import Timeslot.Timeslot;

public class aaa {

	public static void main(String[] args) 
	{
		Location startplace = new Location(1,1,"aaa");
		Location endplace = new Location(2,2,"bbb"); 
		Timeslot timea = new Timeslot(1,3);
		FlightEntry f = new FlightEntry("a",startplace,endplace,timea);
		Plane p = new Plane("ccc");
		
		f.getstate().statement();
		f.allocate(p);
		f.getstate().statement();
		f.getstartplace();
	}

}
