package Numbers;


public class employee {

private int id;
private String name;
private double salary;
private double commision;
private String designation;


public employee(int id, String name, double salary, double commision, String designation) {
super();
this.id = id;
this.name = name;
this.salary = salary;
this.commision = commision;
this.designation = designation;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public double getSalary() {
return salary;
}


public void setSalary(double salary) {
this.salary = salary;
}


public double getCommision() {
return commision;
}


public void setCommision(double commision) {
this.commision = commision;
}


public String getDesignation() {
return designation;
}


public void setDesignation(String designation) {
this.designation = designation;
}

static double bonusCalculator(employee emp) {
if (emp.getDesignation().equals("Manager")) {
return (emp.getSalary() * 30) / 100;
} else if (emp.getDesignation().equals("Lead")) {
return (emp.getSalary() * 25) / 100;
} else {
return (emp.getSalary() * 20) / 100;
}
}

public static void main(String[] args) {
	
	employee emp1 = new employee(016, "Halashree", 80500, 2000, "Manager");
	employee emp2 = new employee(213, "Chaitra", 40100, 1760, "Lead");
	employee emp3 = new employee(607, "Sahana", 30000, 900, "Associate");

	
	{
	//System.out.println(emp1.id+" "+emp1.name+" "+emp1.salary+" "+emp1.commision+" "+emp1.designation);
	//System.out.println(emp2.id+" "+emp2.name+" "+emp2.salary+" "+emp2.commision+" "+emp2.designation);
	//System.out.println(emp3.id+" "+emp3.name+" "+emp3.salary+" "+emp3.commision+" "+emp3.designation);
	
		System.out.println(bonusCalculator(emp1)+emp1.getSalary()+emp1.getCommision());
	
	
	
	}
	}
	}


		
	























