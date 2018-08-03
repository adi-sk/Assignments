package assignment2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount(1232,223,1000000L);
		//sa.deposit(-2000L);
		try{
			sa.withdraw(20000L);
		}
		catch(TransactionDeclinedException e){
			e.printStackTrace();
		}
		
		System.out.println(sa.balance);
	}

}
