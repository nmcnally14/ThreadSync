/**
 * 
 */
package threadSync;

/**
 * @author Nicola
 *
 */
public class BankAccount {
	
	int balance = 100;

	/**
	 * 
	 */
	public BankAccount() {
	
	}

	public synchronized void deposit(long value)	{
		this.balance += value;
	}
	
	public synchronized void withdraw(long value)	{
		this.balance -= value;
	}
}
