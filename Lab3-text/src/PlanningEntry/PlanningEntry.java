
package PlanningEntry;
import EntryState.*;

public interface PlanningEntry<R> 
{
	//工厂方法产生PlanningEntry：public void createPlanningEntry(String name);
	
	/*
	 * 分配资源：从Waiting到allocated
	 */
	public void allocate(R resource); 
	
	/*
	 * 启动：从allocated到running
	 */
	public void start();
	
	/*
	 * 取消：从waiting,allocated到cancelled，即未启动前取消计划
	 */
	public void cancel();
	
	/*
	 * 结束：从running到ended
	 */
	public void end();
	
	public String getname();
	
	public EntryState getstate();
}
