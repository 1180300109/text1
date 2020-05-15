package test1;
//自定义类 与 继承
import java.time.LocalDate;

public class Employeetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[3];
		Manager boss;
		boss = new Manager("boss",100000,1992,1,5);
		boss.setbonus(5000);
		// 创建类
		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15); 
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1 ); 
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15); 
		//使用构造器
		for(Employee e : staff)
			e.raisesalary(5);
		for(Employee e : staff)
			System.out.println("name : " + e.Getname() + ", salary : " + e.Getsalary() + ", hireday : " + e.Gethireday());
        System.out.println("name : "+boss.Getname() + ", salary : " + boss.Getsalary() + ", hireday : " + boss.Gethireday());
	}
}
class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	//只有该类 可以修改的实例域
	public Employee(String n,double s,int year,int month,int day)//构造器
	{
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	//构造器：可以重载，无构造器自动生成无参数构造器
	public String Getname()
	{
		return name;
	}
	public double Getsalary()
	{
		return salary;
	}
	public LocalDate Gethireday()
	{
		return hireDay;
	}
	public void raisesalary(double bypercent)//隐式参数(可用this)和显示参数
	{
		double raise = salary * bypercent / 100;
		salary+=raise;
	}
}
class Manager extends Employee{ //子类继承
	private double bonus;
	public Manager(String name,double salary,int year,int month,int day)//子类构造
	{
		super(name,salary,year,month,day);  //super继承构造
		bonus = 0;
	}
	public void setbonus(double bonus) 
	{
		this.bonus = bonus;
	}
	public double Getsalary() //覆盖方法
	{
		double salary = super.Getsalary() + bonus;
		return salary;
	}
}