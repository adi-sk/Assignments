package assignment2;

public class SavingAccount extends Account implements BankTransaction {


	public SavingAccount(int accNo, int branchCode, double balance) {
		super(accNo, branchCode, balance);
		// TODO Auto-generated constructor stub
		
	}
	public static final long WITHDRAWAL_LIMIT = 10000;
	public static final long MIN_BALANCE = 1000;
	@Override
	public void withdraw(double amt) throws TransactionDeclinedException {
		// TODO Auto-generated method stub
		if(amt >= WITHDRAWAL_LIMIT){
			throw new TransactionDeclinedException("Amount greater than withdrawal Limit");
		}
		
		double temp = this.balance-amt;
		if(temp<MIN_BALANCE){
			throw new TransactionDeclinedException("No Sufficient Balance");
		}
		
	}
	@Override
	public void deposit(double amt) throws TransactionDeclinedException {
		// TODO Auto-generated method stub
		
		if(amt<0){
			throw new TransactionDeclinedException("Please provide valid input");
		}
		this.balance += amt;
		
	}
}
