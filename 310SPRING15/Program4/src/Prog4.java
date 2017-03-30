import java.util.Stack;
import java.util.*;


/**
 * COSC 310		Assignment 4
 * Prog5.java
 * 3/5/15
 * A client class that receives a post-fix expression in the 
 * string format and returns a integer via a stack. 
 *
 *@Jabari Rodrigues
 */

public class Prog4
{
	private String newPostFixInput;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("STACK TEST...");
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(42);
		s.push(35);
		s.push(28);
		s.push(21);
		s.peek();
		
		
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ");
		String newPostFixInput = scan.nextLine();
		
	}

}
