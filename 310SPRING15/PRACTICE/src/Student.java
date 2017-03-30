
//public class Student implements Comparable {
	
	
// UN NEEDED
	
	
//	public Student(Student studID)
	{
		
		super();
		this.studID = studID;
	}
	
	
	public Student ( Student studID, Student fName, Student lName, Student major)
	{
		
		super();
		this.studID = studID;
		this.fName = fName;
		this.lName = lName;
		this.major = major;
	}
	
	public Student getStudID()
	{
		return studID;
	}


	public Student getfName()
	{
		return fName;
	}


	public Student getlName()
	{
		return lName;
	}


	public Student getMajor()
	{
		return major;
	}
	
	public int compareTo(Object p) {
		
		return this.studID.compareTo(((Student)p).studID);
	}


	@Override


}
