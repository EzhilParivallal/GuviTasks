package tasks_JATTask_6;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private String name;
    Employee(int id,String firstName,String lastName, int salary)
    {
    	this.id=id;
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.salary=salary;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void getName() {
		this.name = this.firstName+" "+this.lastName;
		System.out.println("Full Name : "+name);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void getAnnualSalary() {
		System.out.println("Annual Salary : "+this.salary*12);
	}
		public void raiseSalary(int percent) {
    	this.salary = this.salary+this.salary*percent/100;
    	System.out.println("Raised Salary : "+this.salary);
    }
	public String toString()
		{
			return "Employee[id="+id+",name="+name+",salary="+salary+"]";
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee(10,"Ezhil","Parivallal",10000);
		obj.raiseSalary(20);
		obj.getName();
        obj.getAnnualSalary();
        System.out.println(obj);
	}

}
