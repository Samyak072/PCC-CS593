class Employee {
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}
	
	public void setId( int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName( String name) {
		this.name=name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary( int salary) {
		this.salary=salary;
	}	
}

class EmployeeView {
	public void printEmployeeDetails(int id, String name, int salary) {
		System.out.println("Id: " + id + " | Name: " + name + " | Salary: " + salary);
	}
}

class EmployeeController
{
	private Employee model;
	private EmployeeView view;
	EmployeeController(Employee model,EmployeeView view)
	{
		this.model=model;
		this.view=view;
	}
	public int getEmployeeSalary()
	{
		return model.getSalary();
	}
	public void setEmployeeSalary(int newSal)
	{
		model.setSalary(newSal);
	}
	public void updateView()
	{
		view.printEmployeeDetails(model.getId(),model.getName(),model.getSalary());
	}
}
