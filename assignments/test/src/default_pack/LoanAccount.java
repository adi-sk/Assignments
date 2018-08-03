/**
 * 
 */
package default_pack;

import java.util.Date;

/**
 * @author aditya.kurhade
 *
 */
public  class LoanAccount extends Account {

	/**
	 * @param accountNo
	 * @param customerId
	 * @param openingDate
	 * @param branchCode
	 */
	
	private int outstandingLoan ; 
	
	private int emi;
	public LoanAccount(int accountNo, int customerId, Date openingDate, int branchCode,int outstandingLoan,int emi) {
		super(accountNo, customerId, openingDate, branchCode);
		this.outstandingLoan = outstandingLoan;
		this.emi = emi;
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"LoanAccount [outstandingLoan=" + outstandingLoan + ", emi=" + emi + "]";
	}

}
