/**
 * 
 */
package threadSync;

/**
 * @author Nicola
 *
 */
public class CustomerWithdrawThread implements Runnable	{
	
	BankAccount bankAccount;

	/**
	 * 
	 */
	public CustomerWithdrawThread(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	@Override
	public void run()	{
		
		for (int loop = 1; loop <= 10000; loop++)	{
			System.out.println(Thread.currentThread().getName() + "making a withdrawal");
			this.bankAccount.withdraw(10);
			System.out.println(Thread.currentThread().getName() + "balance after withdrawal : "+this.bankAccount.balance);
		}
	}
	
	
	
	

}
