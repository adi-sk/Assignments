package assignment2;

public interface BankTransaction {

	void withdraw(double amt) throws TransactionDeclinedException;
	void deposit(double amt) throws TransactionDeclinedException;
}
