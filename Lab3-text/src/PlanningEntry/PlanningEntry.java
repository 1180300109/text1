
package PlanningEntry;
import EntryState.*;

public interface PlanningEntry<R> 
{
	//������������PlanningEntry��public void createPlanningEntry(String name);
	
	/*
	 * ������Դ����Waiting��allocated
	 */
	public void allocate(R resource); 
	
	/*
	 * ��������allocated��running
	 */
	public void start();
	
	/*
	 * ȡ������waiting,allocated��cancelled����δ����ǰȡ���ƻ�
	 */
	public void cancel();
	
	/*
	 * ��������running��ended
	 */
	public void end();
	
	public String getname();
	
	public EntryState getstate();
}
