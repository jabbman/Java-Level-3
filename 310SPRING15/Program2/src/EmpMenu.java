import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmpMenu {
		
		//WTF
		private SLList<EmpPart> list = new SLList<EmpPart>();

		public EmpMenu() 
		{
		//	int numEmployees = 0;
		
		Scanner inFile = null;
		
		// open file 
		
		try 
		{
			inFile = new Scanner (new File ("employees.txt") );
		}
		catch( FileNotFoundException e )
		{
			System.out.println("ERROR! \n The file don't exist bro. ");
			
		}
		// read file and fill array
		while (inFile.hasNext() )
		{
			
			String record = inFile.nextLine(); // reads to new line
			String[] tokens = record.split( "," );
			
				
			 String empID = tokens[0];
			 String fName = tokens[1];
			 String lName = tokens[2];
			 double salary =Double.parseDouble (tokens[3]);
			
			
			EmpPart emp = new EmpPart (empID, fName, lName, salary);
			list.add(emp);
			
			//numEmployees++;
			// change list name
		}
		
		//DISPLAY PARTS IN SL LINKED LIST
		
		inFile.close();
		//***************NEW PAGE***********************************

	}
	//
	public void display() //INITIAL DISPLAY OF MENU
	{
		
			int option = displayMenu();
			while(option != 0)
			{
				
				switch ( option ) 
				{
				case 1:
					printEmpPart();
					break;
				case 2:
					addEmpPart();
					//void add (E item )
					break;
				case 3:
					findEmpPart();
					//NEW FIND METHOD
							break;
					
					
				case 4:
					//REMOVE INDEX EMPLOYEE
					removeEmpPart();
					
				break;
					// STILL NEEDED 
				case 5:
					// exit DONE
					System.out.println("You have chosen to exit!");
					return;
			default:
				System.out.println("Poor choice bro, you're out of order. ");
				}
				
				option = displayMenu();
				
			}
			
			
	}
	
	public int displayMenu()
	{
		//HEADER
		System.out.println( );
		System.out.println(" SUPER EMPLOYEE DATABASE ");
		System.out.println("------------------------ ");
		
		//METHODS
		System.out.println("   	1. DISPLAY EMPLOYEE MENU. ");
		System.out.println("  	2. ADD NEW EMPLOYEE.  ");
		System.out.println("  	3. FIND EXISTING EMPLOYEE. ");
		System.out.println(" 	4. REMOVE EXISTING EXPLOYEE. ");
		System.out.println(	"	5. EXIT THIS AWFUL PROGRAM. ");
		
		//USER INPUT
		System.out.println("Enter number corresponding with MENU" );
		Scanner input = new Scanner(System.in);
		return input.nextInt();
		
	}
	
	public void printEmpPart() {// CHOICE 1
		
		System.out.printf("%-10s %-10s %-10s %-10s \n", 
				"EmployeeID", "FName", "LName", "Salary");
		
		System.out.printf("%-10s %-10s %-10s %-10s \n", "-----",
				"------------------", "--------", "---");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-10s %-10s %-10s %-10s \n",
					
					list.get(i).getEmpID()
					, list.get(i).getfName(),
					list.get(i).getfName(),
					list.get(i).getsalary());
					
		}
			
	}
		
		public void addEmpPart() { // CHOICE 2
			
			// add scanner to accept 4 part user input
			
			//takes inputs
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter the EMPLOYEE ID. ");
				String newID = scan.nextLine();
			
			System.out.println("Please enter the FIRST NAME . ");
				String newFName = scan.nextLine();
			System.out.println("Please enter the LAST NAME. ");
				String newLName = scan.nextLine();
			System.out.println("PLease enter the salary as a double. ");
				double newSalary = scan.nextDouble();
				
				//create object
				
				EmpPart part = new EmpPart (newID, newFName, newLName, newSalary);
				
				list.add(part);
		
		}
				public void findEmpPart(){
					
					Scanner scan = new Scanner (System.in);
					System.out.println("Enter the EmpId of the the employee to find.");
					
					String empId = scan.next();
					EmpPart search = new EmpPart(empId);
					int index= list.find(search);
					
					// GOOD UNTIL THIS POINT
						if(index >= 0)
						{
							EmpPart p = list.get(index);
							System.out.printf("%-10s %-10s %-10s %-10s \n", p.getEmpID() 
									, p.getfName() 
									, p.getfName() , p.getsalary());
						}
					
										// no matching case
										else
										{
											System.out.println("Bad entry bro, no choice found");
										}
				}
				public void removeEmpPart(){
					
					Scanner scan2 = new Scanner (System.in);
					System.out.println("Enter the EmpId of the the employee to REMOVE.");
				    //  user enters  id for search
					// if user id matches
					String empIdToRemove = scan2.next();
					
					EmpPart remove = new EmpPart(empIdToRemove);
					int index1= list.find(remove);
							
				
					if (index1 >= 0)
					{
						list.remove(index1);
					}
				
									// no matching case
						else
							{
								System.out.println("Bad entry sir, no choice found");
							}
					
					
		
			}
}