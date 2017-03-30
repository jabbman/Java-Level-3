	import java.io.*;
import java.util.*;
	
public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String partNumber;// 5 spaces
		String description;// max 30
		double price; 
		String wareHouseID;
		int quantity;
		
		PartsMenu[] parts = new PartsMenu[10];
		int numParts = 0;

		Scanner inFile = null;

		//open file
		try 
		{
			inFile = new Scanner (new File( "parts.txt " ) );
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


			partNumber = tokens[0];
			description = tokens[1];
			price =Double.parseDouble (tokens[2]);
			wareHouseID = tokens[3];
			quantity =Integer.parseInt( tokens[4]);
			
			
			

			PartsMenu p =  new PartsMenu (partNumber, description, price, wareHouseID, quantity );
			parts[numParts] = p;
			numParts++;
		}

		//DISPLAY PARTS IN ARRAY

		System.out.printf( "%-12s %4s %8s\n", "Part Name", "Qty", "Price" );
		System.out.printf( "%-12s %4s %8s\n", "---- ----", "---", "-----" );
		for( int i = 0; i < numParts; i++ )
		{
			System.out.printf( "%-12s %4s %8.2f\n", parts[i].getPartNumber(),
					parts[i].getQuantity(), parts[i].getPrice() );
		}

		inFile.close();

	}

}
