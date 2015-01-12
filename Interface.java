/* Class Employee */

package day1.examples;

public class Employee implements Info{
	private String name;
	private int id;
	private String managerName;
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public void assignName(String employee_name){
		name = employee_name;
	}
	public void assignId(int employee_id){
		id = employee_id;
	}
	public void assignManager(String manager_name){
		managerName = manager_name;
		//System.out.println("Employee has been assigned to " + managerName);
	}
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("The employee's name is " + name);
		System.out.println("The employee's manager is " + managerName);
	}
}

/* Class Manager */

package day1.examples;

public class Manager implements Info {
	private String managerName = "John Pan";
	private String department;
	public void assignDepartment(String department_name){
		department = department_name;
	}
	public String getDepartment(){
		return department;
	}
	public String getManagerName(){
		return managerName;
	}
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("The manager's name is " + managerName);
		System.out.println("The manager is from " + department);
	}
}


/* Interface Info */

package day1.examples;

public interface Info {
	public void getInfo();
}


/* Main Program */
package day1.examples;

public class TestCompany {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Alex = new Employee();
		Manager John = new Manager();
		John.assignDepartment("Information Technology");
		Alex.assignName("Alex Whild");
		//String department_John = John.getDepartment();
		//System.out.println(departmentJohn);
		Alex.assignId(34232);
		Alex.assignManager(John.getManagerName());
		Info info1 = John;
		Info info2 = Alex;
		info1.getInfo();
		info2.getInfo();
	}
}

