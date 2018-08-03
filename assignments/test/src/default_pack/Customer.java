package default_pack;

/**
 * 
 * Customer class is used to create customers by passing name and customer id to it 
 *
 */
public class Customer {
	private int customerId ;
	private String name ;
	private Account[] accounts;
	private int index = -1;
	private static final int MAX_ACCOUNT = 10;
	public Customer(int customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.accounts = new Account[MAX_ACCOUNT];
		
	}
	
	/**
	 * 
	 * New account can be added for specific customer and account can be of any type
	 */
	
	public void addAccount(Account account){
		if(index>= MAX_ACCOUNT){
		}
		else{
			this.accounts[++index]=account;
		}
	}
	
	/**
	 * account summary can be retrieved by this function call
	 */
	
	public void printSummary(){
		System.out.println("name:"+name);
		for(int i = 0 ; i<=index; i++){
			Account a = accounts[i];
			System.out.println(">> "+a);
		}
	}
}
