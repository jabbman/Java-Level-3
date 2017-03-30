
public class Customer 
{
	private int customerNum;
	private int arriveTime;
	
	public Customer (int customerNum, int arriveTime)
	{
		
		this.customerNum = customerNum;
		this.arriveTime = arriveTime;
	}
	
	// customer class getters
	
	public int getCustomerNum()
	{
		return customerNum;
	}
	
	public int getArriveTime()
	{
		return arriveTime;
		
	}
}
