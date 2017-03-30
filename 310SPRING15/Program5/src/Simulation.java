// my program

import java.util.*;
public class Simulation {

	
	private MyQueue<Customer> arriveQue;
	private MyQueue<Customer> waitingQue;
	private int num = 0;// or num ;
	
	
	public Simulation(int n){
		
		System.out.println("******Welcome to the Queue Simulation Program *******");
		System.out.println("Below are the simulated queue customer id &  arrival time.");
		System.out.println("*************************************************************8");
		
		arriveQue = new MyQueue<Customer> (n);
		waitingQue = new MyQueue<Customer> (n);
		Random pseudoRandomNum = new Random();
		int newTime = 0;
		
		for (int i = 0; i < n; i++)
		{
			
			// gives customer psuedorandom arrival time & adds to end of
			
			newTime += pseudoRandomNum.nextInt(4); // number to base random num from
			Customer cust = new Customer(i, newTime );
			arriveQue.enqueue(cust);
			System.out.println("The customer number is " + cust.getCustomerNum());
			System.out.println("The arrival time is " + cust.getArriveTime());
			
		}
		
		System.out.println("************************************************");
	}
	
	public void run() 
	{
		int busyQue = 0;
		int newTime = 0;
		
		
		Customer temporary = arriveQue.peek();
		
		while ( !arriveQue.isEmpty() || busyQue != 0 )
		{
			if ( busyQue > 1 )
			{
				busyQue--;
				
			} 
			else if ( busyQue == 1 ) {
				
				busyQue = 0;
				
				System.out.println(" The customer number is " + temporary.getCustomerNum());
				System.out.println("The arrival time is " + newTime);
				
			}
			
			while (newTime == arriveQue.peek().getArriveTime())
			{
				System.out.println("The customer number is " + arriveQue.peek(). getCustomerNum());
				System.out.println("The arrival time is " + newTime);
				
				waitingQue.enqueue(arriveQue.dequeue());
				
			}
			
			if (!waitingQue.isEmpty() && busyQue == 0)
			{
				busyQue = 2; // default input
				temporary = waitingQue.dequeue();
				System.out.println("The customer number is " + temporary.getCustomerNum());
				System.out.println("The arrival time is " + newTime);
				
				
				
			}
			newTime++;
		}
		
	}
	
}
