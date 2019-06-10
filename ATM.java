/**
 * 
 */
package threadSync;

/**
 * @author Nicola
 *
 */
public class ATM {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		//create the bankaccount
		BankAccount bankAccount = new BankAccount();
		
		//create two threads to access the bank account at the same time
		CustomerDepositThread depositThread = new CustomerDepositThread(bankAccount);
		Thread threadForDeposit = new Thread(depositThread, "Deposit : ");
		
		CustomerWithdrawThread withdrawThread = new CustomerWithdrawThread(bankAccount);
		Thread threadForWithdraw = new Thread(withdrawThread, "Withdraw : ");
		
		System.out.println("Main thread balance : " + bankAccount.balance);
		
		//start both threads
		threadForDeposit.start(); // will result in 10000 * £10 deposits
		threadForWithdraw.start(); // will result in 10000 * £10 withdrawals
		
		//add a delay to ensure all other threads have finished
	
			Thread.sleep(4000);
		
		
		System.out.println("Main Thread Balance : "+bankAccount.balance);
		

	}

}
