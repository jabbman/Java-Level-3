
public class EmpPart implements Comparable {

	private String empID;
	private String fName;
	private String lName;
	private double salary;

	
	
	public EmpPart(String empID){
		
		super();
		this.empID = empID;
	}

	
public EmpPart (String empID, String fName, String lName, double salary)
{
	super();
	this.empID = empID;
	this.fName = fName;
	this.lName = lName;
	this.salary = salary;

}


public String getEmpID() {
	return empID;
}

public String getfName() {
	return fName;
}

public String getlName() {
	return lName;
}

public double getsalary() {
	return salary;
	}

// NEW CODE TO COMPARE OBJECT
public int compareTo(Object p) {
	
	return this.empID.compareTo(((EmpPart)p).empID);
}

}
