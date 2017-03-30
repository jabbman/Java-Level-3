//MENU CLASS
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
		
	public class PartsMenu 
{
		private ListArray<Parts> parts;
		
		public PartsMenu()
		{
			
			parts = new ListArray<Parts>(15);
			int numParts = 0;

			Scanner inFile = null;

			//open file
			try 
			{
				inFile = new Scanner (new File( "parts.txt" ) );
			}
			catch(FileNotFoundException e )
			{
				System.out.println("The error is the file isnt found. ");
			}
			// read file and fill the array
			while(inFile.hasNext() )
			{
				String record = inFile.nextLine();
				String[] tokens = record.split(",[ ]*");


				String partNumber = tokens[0];
				String description = tokens[1];
				double price =Double.parseDouble (tokens[2]);
				String wareHouseID = tokens[3];
				int quantity =Integer.parseInt( tokens[4]);
				
			
				Parts p =  new Parts (partNumber, description, price, wareHouseID, quantity );
				parts.add(p);
		
				numParts++;
			}

			//DISPLAY PARTS IN ARRAY

			inFile.close();

		}
			//

		public void display()
		{
			int option = displayMenu();
			while( option != 0 )
			{
				//process menu selection
				switch( option )
				{
				case 1:
					printParts();
					break;
				case 2:
					addParts();	
					break;
				case 3:
					//exit
					return ;
				default:
					System.out.println("Bad selection");

				}
				option = displayMenu();
			}
			System.out.println("Goodbye!");
			
		}
		
		public int displayMenu()
		{
			System.out.println( );
			System.out.println("Employee Menu");
			System.out.println("-------------");
			
			System.out.println("	1. DISPLAY parts");
			System.out.println("	2. ADD part(to tail of list)");
			//System.out.println("	3. FIND part");
			System.out.println("	0. Exit!");
			
			System.out.println("Enter number: ");
			Scanner input = new Scanner(System.in);
			return  input.nextInt();
				
		}			

	public void printParts() {

		System.out.printf("%-12s %-35s %-15s %-15s %-15s \n", "Part Number",
				"Description", "Price", "WareHouse ID", "Quantity");
		System.out.printf("%-12s %-35s %-15s %-15s %-15s \n", "-----",
				"----------------------------", "--------", "---", "---");
		for (int i = 0; i < parts.size(); i++) {
			System.out.printf("%-12s %-35s %-15.2f %-15s %-15d\n",
					
					
					parts.get(i).getPartNumber()
					, parts.get(i).getDescription(),
					parts.get(i).getPrice(), parts.get(i).getWareHouseID(),
					parts.get(i).getQuantity());
		}
	
	}	
	//ADD PARTS METHOD INCOMPLETE
	//LAST PART MISSING besides EXIT
	public void addParts() {

		// add scanner to accept input 5 part
				//take inputs
		
			Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the PART NUMBER. (STRING) ");
			String newPartNum = scan.nextLine();
		
		System.out.println("Please enter the DESCRIPTION(up to 30 chars). ");
			String newDescript = scan.nextLine();
		
		System.out.println("Please enter the PRICE.(as a double) ");
			String newPrice = scan.nextLine();
		
		System.out.println("Please enter the WAREHOUSE ID.(3CHARS) ");
			String newID = scan.nextLine();
			
		System.out.println("Please enter the QUANTITY.(INTEGER) ");	
			String newQuantity = scan.nextLine();
			
			//create object
			
		Parts part = new Parts(newPartNum, newDescript, Double.parseDouble(newPrice), newID, Integer.parseInt(newQuantity));
		
		parts.add(part);
	
	}		// add to end of list
}