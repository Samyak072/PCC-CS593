class EmployeeController{
    private Employee model;
    private EmployeeView view;
    EmployeeController(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }
    public int getEmployeeSalary(){
        return model.getSalary();
    }
    public void setEmployeeSalary(int newSal){
        model.setSalary(newSal);
    }
    public void updateView(){
        view.printEmployeeDetails(model.getId(),model.getName(),model.getSalary());
    }
    
 }
