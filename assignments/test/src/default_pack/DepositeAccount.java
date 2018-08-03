package default_pack;

import java.util.Date;

public class DepositeAccount extends Account {

	
	private int depositeammount ;
	public DepositeAccount(int accountNo, int customerId, Date openingDate, int branchCode,int depositeAmmount) {
		super(accountNo, customerId, openingDate, branchCode);
		// TODO Auto-generated constructor stub
		this.depositeammount = depositeAmmount;
	}
	@Override
	public String toString() {
		return super.toString()+"DepositeAccount [depositeammount=" + depositeammount + "]";
	}

}
