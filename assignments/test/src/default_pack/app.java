package default_pack;
import java.util.Date;

public class app {

	public static void main(String[] args) {
		long mem = Runtime.getRuntime().maxMemory();
		System.out.println("Memory="+(mem)/(1024*1024));
//		employee e = new employee("Aditya","Kurhade");
//		System.out.println("Memory="+e.getFirstName());
		
		UDate d;
		try {
			d = new UDate(32,1,2017,2);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		LoanAccount acc1 = new LoanAccount(12212,233233,new Date(),32323,2000,6767);
//		DepositeAccount acc2 = new DepositeAccount(121212, 233233, new Date(), 32323, 400000);
//		Customer c = new Customer(233232, "Aditya");
//		c.addAccount(acc1);
//		c.addAccount(acc2);
//		c.printSummary();
	
	}

}
