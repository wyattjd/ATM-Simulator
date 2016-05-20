/**
 * Customer
 * CSCI 150
 * @author Wyatt Davies
 * Last Revised 11/09/15
 * 
 * 
 * Customer class which contains arrival, waiting, departing, and starting times
 *
 */
public class Customer
{
	int arrTime = 0;
	int startingTime = 0;
	int timeSpent = 0;
	
	public Customer(int arrTime,int timeSpent)
	{
		this.arrTime = arrTime;
		this.timeSpent = timeSpent;
	}
	
	public int getArrTime()
	{
		return arrTime;
	}
	
	public int getDepartTime()
	{
		return startingTime+timeSpent;
	}
	
	public void setStartTime(int startingTime)
	{
		this.startingTime = startingTime;
	}
	
	public int getWait()
	{
		return getDepartTime()-arrTime;
	}
}
