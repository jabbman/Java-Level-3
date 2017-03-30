/**
 * List student in order
 * List students in reverse order.
 * Add student to end of list.
 * Quit
 * 
 */

import java.util.Iterator;
import java.util.Scanner;

public class StudentMenu
{
	DLList<String> myList = new DLList<String>();
	
		private String studID;
		private String fName;
		private String lName;
		private String major;
	
	public StudentMenu() 
	{
		super();
		
	//	myList.add( new String( "123" ) );
				
		myList.add("studID1" + "  " + "fName" + "  " + "lName"  + "  " + "major" + "  ");
		myList.add("studID2" + "  " + "fName" + "  " + "lName"  + "  " + "major" + "  ");
		myList.add("studID3" + "  " + "fName" + "  " + "lName"  + "  " + "major" + "  ");
		myList.add("studID4" + "  " + "fName" + "  " + "lName"  + "  " + "major" + "  ");
		myList.add("studID5" + "  " + "fName" + "  " + "lName"  + "  " + "major" + "  ");
		
	
	}
	
	public void display()
	{
		int option = displayMenu();
		while(option != 0)
		{
			switch (option )
			{
			case 1:
				ListIter();

				System.out.println("The list of students in order. "); // THE STUDENTS IN ORDER ARe
				// list students in order
				break;
			case 2:
				ListIter2();
				
				System.out.println("The list of students in reverse order. ");
				//list students in reverse order
				break;
			case 3:
				System.out.println(" Add student to the end of waitlist. ");
				
				add();
				toString();
				// add student to end of waitlist
				break;
			case 4:
				// exit
				System.out.println("Goodbye!");
				return;

			default:
				System.out.println("Your choice is not accpetable. ");

			}

			option = displayMenu();

		}
	}

	public int displayMenu()
	{
		System.out.println();
		System.out.println("WELCOME TO THE COSC101 COURSE WAIT LIST APP");
		System.out.println("------------------------------------------------");


		System.out.println("  1. List students in order. " );
		System.out.println("  2. List student s in reverse order.");
		System.out.println("  3. ADD student");
		System.out.println("  4. EXIT. ");

		System.out.println("ENTER A NUMBER FROM THE MENU.");
		Scanner input = new Scanner(System.in);
		return input.nextInt();

	}

	public void ListIter() {

		Iterator<String> iter = myList.Iterator();
		System.out.println("Current COSC 101 Waitlist.\n ");

		while (iter.hasNext()) {


			String str = ( String ) iter.next();
			System.out.println( str);
		}
	}

	public void ListIter2()
	{

		Iterator<String> iter2 = myList.ReverseIterator();
		System.out.println("Reverse list.");

		while (iter2.hasNext() ){

			String str = ( String ) iter2.next();
			System.out.println(str);
		}

	}
	
	public void add() 
	
	{
		// add scanner to accept 4 part user input
		
		//takes inputs
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the STUDENT ID. ");
			String studID = scan.nextLine();
		
		System.out.println("Please enter the FIRST NAME . ");
			String fName = scan.nextLine();
		System.out.println("Please enter the LAST NAME. ");
			String lName = scan.nextLine();
		System.out.println("PLease enter the MAJOR as 4 Letters. ");
			String major = scan.nextLine();
			

			String part = new String (studID + "  " + fName + "  " + lName  + "  " + major + "  ");
			
			myList.add(part);
	}
public String toString()
	{
		// TODO Auto-generated method stub
		
	return studID + " " + fName + " " + lName  + " " + major + " "; 
	}

}



