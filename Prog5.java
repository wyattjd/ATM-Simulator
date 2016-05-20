import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Prog 5
 * CSCI 150
 * @author Wyatt Davies
 * Last Revised 11/09/15
 * 
 * 
 * Simulates a waiting line
 *
 */
public class Prog5 {

	/**
	 * Entry point of the program
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		int customersServed = 0;
		int timeSpent = 0; //Time using the ATM
		int nextAvailTime = 0; //Next time the ATM will be available
		int remainingCustomers = 0;
		int totalWaitTime = 0;
		Queue<Customer> q = new LinkedList<Customer>();
		
		for (int time=0; time<60; time++)
		{
			Random rand = new Random();
			int prob = rand.nextInt(100);

			if (prob < 50)
			{
				//No customers Arrive
				nextAvailTime++;
			}
			else if (prob > 50 && prob < 90)
			{
				timeSpent = rand.nextInt(3)+1;
				Customer cust = new Customer(time,timeSpent);
				q.add(cust);
				cust.setStartTime(nextAvailTime);
				nextAvailTime=cust.getDepartTime();
				remainingCustomers++;
				totalWaitTime += cust.getWait();
			}
			else
			{
				//Customer 1
				timeSpent = rand.nextInt(3)+1;
				Customer cust1 = new Customer(time,timeSpent);
				q.add(cust1);
				cust1.setStartTime(nextAvailTime);
				nextAvailTime=cust1.getDepartTime();
				remainingCustomers++;
				totalWaitTime += cust1.getWait();
				
				//Customer 2
				timeSpent = rand.nextInt(3)+1;
				Customer cust2 = new Customer(time,timeSpent);
				q.add(cust2);
				cust2.setStartTime(nextAvailTime);
				nextAvailTime=cust2.getDepartTime();
				remainingCustomers++;
				totalWaitTime += cust2.getWait();
			}			
			
			if (!q.isEmpty())
			{
				if (q.peek().getDepartTime() == time)
				{
					q.remove();
					customersServed++;
					remainingCustomers--;
				}	
			}
		}
		
		System.out.println(customersServed+" customers were served.");
		System.out.println("Average wait time: " + totalWaitTime/60 + " minutes.");
		System.out.println("Customers remaining in line: " +remainingCustomers);

	}

}
