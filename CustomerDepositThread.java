/**
 * 
 */
package threadSync;

/**
 * @author Nicola
 *
 */
public class CustomerDepositThread implements Runnable {
	
	BankAccount bankAccount;

	/**
	 * 
	 */
	public CustomerDepositThread() {
		
	}
	
	/**
	 * @param bankAccount
	 */
	public CustomerDepositThread(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}


	@Override
	public void run() {
		
		for (int loop = 1; loop <= 10000; loop++)	{
			System.out.println(Thread.currentThread().getName() + "making a deposit");
			this.bankAccount.deposit(10);
			System.out.println(Thread.currentThread().getName() + "balance"+this.bankAccount);
		}
	}
		
}
